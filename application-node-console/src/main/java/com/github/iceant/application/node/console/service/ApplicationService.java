package com.github.iceant.application.node.console.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.iceant.application.node.console.dto.MenuDTO;
import com.github.iceant.application.node.console.dto.RoleDTO;
import com.github.iceant.application.node.console.mappers.BizRoleMapper;
import com.github.iceant.application.node.console.mappers.MenuMapper;
import com.github.iceant.application.node.console.storage.entity.TBizRole;
import com.github.iceant.application.node.console.storage.entity.TMenu;
import com.github.iceant.application.node.console.storage.service.ITBizRoleService;
import com.github.iceant.application.node.console.storage.service.ITMenuService;
import com.github.iceant.application.node.console.utils.Snowflake;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class ApplicationService {

    final Snowflake snowflake;
    final ITMenuService menuService;
    final ITBizRoleService roleService;

    public ApplicationService(ITMenuService menuService, ITBizRoleService roleService) {
        this.menuService = menuService;
        this.roleService = roleService;
        this.snowflake = new Snowflake();
    }

    public TMenu saveMenu(MenuDTO dto) {
        QueryWrapper<TMenu> query = new QueryWrapper<>();
        query.eq(TMenu.PATH, dto.getPath());
        TMenu menu = menuService.getOne(query);
        if(menu!=null){
            if(log.isDebugEnabled()){
                log.debug("Menu with path {} exist!", menu.getPath());
            }
            return menu;
        }

        menu = MenuMapper.INSTANCE.dtoToEntity(dto);
        menu.setId(snowflake.nextId());
        menu.setCreationDatetime(LocalDateTime.now());
        menuService.save(menu);
        return menu;
    }

    public TMenu updateMenu(MenuDTO dto){
        TMenu menu = menuService.getById(dto.getId());
        if(menu==null){
            if(log.isDebugEnabled()){
                log.debug("Menu with id {} doesn't exist!", dto.getId());
            }
            return menu;
        }

        menu = MenuMapper.INSTANCE.mergeWithDTO(dto, menu);
        menuService.updateById(menu);
        return menu;
    }

    public List<TMenu> listAll() {
        return menuService.list();
    }

    public List<TMenu> listMenu(QueryWrapper<TMenu> query) {
        return menuService.list(query);
    }

    ////////////////////////////////////////////////////////////////////////////////
    ////

    public TBizRole createRole(RoleDTO dto) {
        QueryWrapper<TBizRole> query = new QueryWrapper<>();
        query.eq(TBizRole.NAME, dto.getName());

        TBizRole role = roleService.getOne(query);
        if(role!=null){
            role = BizRoleMapper.INSTANCE.merge(dto, role);
            roleService.updateById(role);
        }else{
            role = BizRoleMapper.INSTANCE.dtoToEntity(dto);
            roleService.save(role);
        }
        return role;
    }
}

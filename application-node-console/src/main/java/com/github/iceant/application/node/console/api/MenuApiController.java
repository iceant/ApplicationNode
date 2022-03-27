package com.github.iceant.application.node.console.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.iceant.application.node.console.dto.MenuDTO;
import com.github.iceant.application.node.console.service.ApplicationService;
import com.github.iceant.application.node.console.storage.entity.TMenu;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping(path={"/api/Menu"})
public class MenuApiController {
    final ApplicationService applicationService;

    public MenuApiController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping(path={"/", ""})
    public Object create(@RequestBody MenuDTO dto){
        TMenu menu = applicationService.saveMenu(dto);
        return ApiResponse.ok(menu);
    }

    @GetMapping(path={"/", ""})
    public Object listAllByOrdinal(){
        List<TMenu> menu = applicationService.listAll();
        menu.sort(new Comparator<TMenu>() {
            @Override
            public int compare(TMenu o1, TMenu o2) {
                return o1.getOrdinal().compareTo(o2.getOrdinal());
            }
        });
        return ApiResponse.ok(menu);
    }

    @RequestMapping(path = {"/firstLevel"})
    public Object listFirstLevelMenus(){
        QueryWrapper<TMenu> query = new QueryWrapper<>();
        query.eq(TMenu.PARENT_ID, 0);
        query.orderByAsc(TMenu.ORDINAL);
        List<TMenu> menus = applicationService.listMenu(query);
        return ApiResponse.ok(menus);
    }

    @RequestMapping(path = {"/{parentId}/children"})
    public Object children(@PathVariable("parentId") Long parentId){
        QueryWrapper<TMenu> query = new QueryWrapper<>();
        query.eq(TMenu.PARENT_ID, parentId);
        query.orderByAsc(TMenu.ORDINAL);
        List<TMenu> menus = applicationService.listMenu(query);
        return ApiResponse.ok(menus);
    }
}

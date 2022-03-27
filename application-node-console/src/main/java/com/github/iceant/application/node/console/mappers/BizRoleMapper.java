package com.github.iceant.application.node.console.mappers;

import com.github.iceant.application.node.console.dto.RoleDTO;
import com.github.iceant.application.node.console.storage.entity.TBizRole;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BizRoleMapper {

    BizRoleMapper INSTANCE = Mappers.getMapper(BizRoleMapper.class);

    TBizRole dtoToEntity(RoleDTO dto);

    TBizRole merge(RoleDTO dto, @MappingTarget TBizRole role);
}

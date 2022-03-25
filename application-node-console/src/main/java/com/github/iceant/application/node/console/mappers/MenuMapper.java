package com.github.iceant.application.node.console.mappers;

import com.github.iceant.application.node.console.dto.MenuDTO;
import com.github.iceant.application.node.console.storage.entity.TMenu;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MenuMapper {
    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    TMenu dtoToEntity(MenuDTO dto);

    TMenu mergeWithDTO(MenuDTO dto, @MappingTarget TMenu menu);
}

package com.github.iceant.application.node.console.mappers;

import com.github.iceant.application.node.console.dto.MenuDTO;
import com.github.iceant.application.node.console.storage.entity.TMenu;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-27T11:07:31+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
public class MenuMapperImpl implements MenuMapper {

    @Override
    public TMenu dtoToEntity(MenuDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TMenu tMenu = new TMenu();

        tMenu.setId( dto.getId() );
        tMenu.setName( dto.getName() );
        tMenu.setDescription( dto.getDescription() );
        tMenu.setPath( dto.getPath() );
        tMenu.setIcon( dto.getIcon() );

        return tMenu;
    }

    @Override
    public TMenu mergeWithDTO(MenuDTO dto, TMenu menu) {
        if ( dto == null ) {
            return null;
        }

        menu.setId( dto.getId() );
        menu.setName( dto.getName() );
        menu.setDescription( dto.getDescription() );
        menu.setPath( dto.getPath() );
        menu.setIcon( dto.getIcon() );

        return menu;
    }
}

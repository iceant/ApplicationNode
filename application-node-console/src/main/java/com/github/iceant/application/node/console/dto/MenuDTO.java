package com.github.iceant.application.node.console.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class MenuDTO {
    Long id;
    String name;
    String path;
    String icon;
    String description;
}

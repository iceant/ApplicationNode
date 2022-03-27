package com.github.iceant.application.node.console.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class RoleDTO {
    Long id;
    String name;
    LocalDateTime createDateTime;
}

package com.github.iceant.application.node.console.storage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import com.github.iceant.application.node.console.mybatis.SqliteLocalDateTimeTypeHandler;

/**
 * <p>
 * 
 * </p>
 *
 * @author 陈鹏
 * @since 2022-03-27
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName(value="t_menu", autoResultMap = true)
public class TMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("parent_id")
    private Long parentId;

    @TableField("name")
    private String name;

    @TableField("description")
    private String description;

    @TableField("path")
    private String path;

    @TableField("icon")
    private String icon;

    @TableField("ordinal")
    private Integer ordinal;

    @TableField(value="creation_datetime", typeHandler=SqliteLocalDateTimeTypeHandler.class)
    private LocalDateTime creationDatetime;

    public static final String ID = "id";

    public static final String PARENT_ID = "parent_id";

    public static final String NAME = "name";

    public static final String DESCRIPTION = "description";

    public static final String PATH = "path";

    public static final String ICON = "icon";

    public static final String ORDINAL = "ordinal";

    public static final String CREATION_DATETIME = "creation_datetime";

}

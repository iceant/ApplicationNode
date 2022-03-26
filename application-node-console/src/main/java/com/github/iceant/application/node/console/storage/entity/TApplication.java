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
 * @since 2022-03-26
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName(value="t_application", autoResultMap = true)
public class TApplication implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("name")
    private String name;

    @TableField("description")
    private String description;

    @TableField("icon")
    private String icon;

    @TableField(value="create_datetime", typeHandler=SqliteLocalDateTimeTypeHandler.class)
    private LocalDateTime createDatetime;

    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String DESCRIPTION = "description";

    public static final String ICON = "icon";

    public static final String CREATE_DATETIME = "create_datetime";

}

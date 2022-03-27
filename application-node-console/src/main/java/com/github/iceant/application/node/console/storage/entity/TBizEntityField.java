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
@TableName(value="t_biz_entity_field", autoResultMap = true)
public class TBizEntityField implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("entity_id")
    private Long entityId;

    @TableField("logic_type_id")
    private Long logicTypeId;

    @TableField("name")
    private String name;

    @TableField("description")
    private String description;

    @TableField("defaultValue")
    private String defaultValue;

    @TableField("minValue")
    private String minValue;

    @TableField("maxValue")
    private String maxValue;

    @TableField("enumValue")
    private String enumValue;

    @TableField("is_nullable")
    private Boolean isNullable;

    @TableField("resolution")
    private String resolution;

    @TableField("offset")
    private String offset;

    @TableField(value="creation_datetime", typeHandler=SqliteLocalDateTimeTypeHandler.class)
    private LocalDateTime creationDatetime;

    public static final String ID = "id";

    public static final String ENTITY_ID = "entity_id";

    public static final String LOGIC_TYPE_ID = "logic_type_id";

    public static final String NAME = "name";

    public static final String DESCRIPTION = "description";

    public static final String DEFAULTVALUE = "defaultValue";

    public static final String MINVALUE = "minValue";

    public static final String MAXVALUE = "maxValue";

    public static final String ENUMVALUE = "enumValue";

    public static final String IS_NULLABLE = "is_nullable";

    public static final String RESOLUTION = "resolution";

    public static final String OFFSET = "offset";

    public static final String CREATION_DATETIME = "creation_datetime";

}

create table if not exists t_application
(
    id BIGINT PRIMARY KEY ,
    name TEXT,
    user_friendly_name TEXT, -- 显示名称，支持多语言显示
    description TEXT, -- 描述，支持多语言存储
    creation_datetime DATETIME,
    icon TEXT,
    unique (name)
);

create table if not exists t_menu
(
    id BIGINT PRIMARY KEY,
    application_id BIGINT,
    parent_id BIGINT,
    name TEXT,
    user_friendly_name TEXT, -- 显示名称，支持多语言显示
    description TEXT,
    path TEXT,
    icon TEXT,
    ordinal INT,
    creation_datetime DATETIME,
    unique (parent_id, name)
);


create table if not exists t_biz_role
(
  id BIGINT PRIMARY KEY ,
  application_id BIGINT,
  name TEXT,
  user_friendly_name TEXT, -- 显示名称，支持多语言显示
  description TEXT, -- 描述，支持多语言存储
  creation_datetime DATETIME,
  unique (name)
);

create table if not exists t_biz_activity
(
    id BIGINT PRIMARY KEY ,
    application_id BIGINT,
    name TEXT,
    user_friendly_name TEXT, -- 显示名称，支持多语言显示
    description TEXT, -- 描述，支持多语言存储
    creation_datetime DATETIME,
    actor_id BIGINT,
    actor_type INTEGER, -- 1: ROLE, 2:USER, 3:GROUP, 通常指ROLE
);

create table if not exists t_biz_activity_input_entity
(
    id BIGINT PRIMARY KEY ,
    activity_id BIGINT, -- 业务活动
    entity_id BIGINT, -- 使用的实体
    field_id BIGINT -- 使用的字段
);

create table if not exists t_biz_activity_output_entity
(
    id BIGINT PRIMARY KEY ,
    activity_id BIGINT, -- 业务活动
    entity_id BIGINT, -- 被改动的实体
    field_id BIGINT -- 被改动的字段
);


create table if not exists t_biz_entity
(
    id BIGINT PRIMARY KEY ,
    application_id BIGINT,
    name TEXT,
    user_friendly_name TEXT,
    description TEXT,
    creation_datetime DATETIME
);

create table if not exists t_logic_type
(
    id BIGINT PRIMARY KEY ,
    name TEXT,
    description TEXT,
    creation_datetime DATETIME
);

create table if not exists t_biz_entity_field
(
    id BIGINT PRIMARY KEY,
    application_id BIGINT,
    entity_id BIGINT, -- 对应实体
    logic_type_id BIGINT, -- 数据类型
    name TEXT, -- 字段名称(代号)
    user_friendly_name TEXT, -- 显示名称，使用LocaleString描述
    description TEXT, -- 描述，使用LocaleString描述
    field_size INTEGER, -- 字段长度
    decimal_digits INTEGER, -- 小数位数，只适合 DECIMAL 类型
    number_radix INTEGER, -- 数字进制: 2, 8, 16, 10 等进制，通常使用 2 或者 10 进制
    is_nullable BOOLEAN, -- 必填字段， 验证时标记为required
    is_auto_increment BOOLEAN, -- 是否自增字段
    is_searchable BOOLEAN, -- 是否可以搜索
    is_viewable BOOLEAN, -- 是否可以显示的字段
    is_unsigned BOOLEAN, --是否是无符号数字
    is_currency BOOLEAN, -- 是否货币
    is_primary_key BOOLEAN, -- 是否主键
    primary_key_sequence INTEGER, -- 作为复合主键时的顺序
    primary_key_name TEXT, -- 主键名称，同一个主键名称可以由多个字段构成，称为复合主键
    is_imported_key BOOLEAN, -- 是否引用字段
    is_exported_key BOOLEAN, -- 是否被引用字段
    pk_entity_id BIGINT, -- 被引用实体
    pk_field_id BIGINT, -- 被引用实体字段
    fk_entity_id BIGINT, -- 引用实体
    fk_field_id BIGINT, -- 引用实体字段
    fk_update_rule INTEGER, -- 1: IMPORTED_NO_ACTION, 2:IMPORTED_KEY_CASCADE, 3:IMPORTED_KEY_SET_NULL, 4:IMPORTED_KEY_SET_DEFAULT, 5:IMPORTED_KEY_RESTRICT
    fk_delete_rule INTEGER, -- 1: IMPORTED_NO_ACTION, 2:IMPORTED_KEY_CASCADE, 3:IMPORTED_KEY_SET_NULL, 4:IMPORTED_KEY_SET_DEFAULT, 5:IMPORTED_KEY_RESTRICT
    fk_name TEXT, -- 引用外部字段时使用，同一个名字可以包含多个字段
    fk_sequence INTEGER, -- 引用外部字段时的顺序
    default_value TEXT, -- 默认值
    min_value TEXT, -- 最小值
    max_value TEXT, -- 最大值
    enum_value TEXT, -- 枚举值
    regex_pattern TEXT, -- 正则表达式
    ordinal INTEGER, -- 排序
    accuracy DECIMAL, -- 精度
    offset DECIMAL, -- 偏移量  (实际值 = 逻辑值 * accuracy + offset)
    ux_supported_type TEXT, -- 支持的UI组件
    creation_datetime DATETIME,
    unique(entity_id, name)
);

create table if not exists t_biz_route
(
    id BIGINT PRIMARY KEY ,
    from_activity_id BIGINT,
    to_activity_id BIGINT,
    name TEXT,
    user_friendly_name TEXT, -- 显示名称，使用LocaleString描述
    description TEXT,
    creation_datetime DATETIME
);
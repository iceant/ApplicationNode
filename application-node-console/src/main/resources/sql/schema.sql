create table if not exists t_menu
(
    id BIGINT PRIMARY KEY,
    parent_id BIGINT,
    name TEXT,
    description TEXT,
    path TEXT,
    icon TEXT,
    ordinal INT,
    creation_datetime DATETIME
);

create table if not exists t_application
(
    id BIGINT PRIMARY KEY ,
    name TEXT,
    description,
    icon TEXT,
    create_datetime DATETIME
);

create table if not exists t_biz_role
(
  id BIGINT PRIMARY KEY ,
  name TEXT,
  description TEXT,
  creation_datetime DATETIME
);

create table if not exists t_biz_activity
(
    id BIGINT PRIMARY KEY ,
    name TEXT,
    description TEXT,
    creation_datetime DATETIME
);

create table if not exists t_biz_entity
(
    id BIGINT PRIMARY KEY ,
    name TEXT,
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
    entity_id BIGINT,
    logic_type_id BIGINT,
    name TEXT,
    description TEXT,
    defaultValue TEXT,
    minValue TEXT,
    maxValue TEXT,
    enumValue TEXT,
    is_nullable BOOLEAN,
    resolution TEXT,
    offset TEXT,
    creation_datetime DATETIME
);

create table if not exists t_biz_route
(
    id BIGINT PRIMARY KEY ,
    from_activity_id BIGINT,
    to_activity_id BIGINT,
    name TEXT,
    description TEXT,
    creation_datetime DATETIME
);
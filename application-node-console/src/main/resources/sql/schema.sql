create table if not exists t_menu
(
    id BIGINT PRIMARY KEY,
    name TEXT,
    description TEXT,
    path TEXT,
    icon TEXT,
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
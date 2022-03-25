create table if not exists t_menu
(
    id BIGINT PRIMARY KEY,
    name TEXT,
    description TEXT,
    path TEXT,
    icon TEXT,
    creation_datetime DATETIME
);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (1, 0, '业务配置', '业务配置', '/biz', 'icon-biz.png', CURRENT_TIMESTAMP, 1);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (2, 1, '业务角色', '业务角色配置', '/biz/role', 'icon-role.png', CURRENT_TIMESTAMP, 2);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (3, 1, '业务活动', '业务活动配置', '/biz/activity', 'icon-activity.png', CURRENT_TIMESTAMP, 3);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (4, 1, '业务实体', '业务实体配置', '/biz/entity', 'icon-entity.png', CURRENT_TIMESTAMP, 4);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (5, 1, '业务流程', '业务流程配置', '/biz/flow', 'icon-flow.png', CURRENT_TIMESTAMP, 5);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (6, 0, '基础设施', '基础设施设置', '/facility', 'icon-facility.png', CURRENT_TIMESTAMP, 6);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (7, 6, '数据库', '数据库设置', '/facility/db', 'icon-db.png', CURRENT_TIMESTAMP, 7);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (8, 0, '应用配置', '应用配置', '/app', 'icon-app.png', CURRENT_TIMESTAMP, 8);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (9, 8, '信息模型', '信息模型配置', '/app/model', 'icon-model.png', CURRENT_TIMESTAMP, 9);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (10, 8, '应用服务', '应用服务配置', '/app/service', 'icon-service.png', CURRENT_TIMESTAMP, 10);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (11, 8, '交互视图', '交互视图配置', '/app/ux', 'icon-ux.png', CURRENT_TIMESTAMP, 11);
INSERT INTO t_menu (id, parent_id, name, description, path, icon, creation_datetime, ordinal) VALUES (12, 8, '交互视流', '交互视流配置', '/app/viewflow', 'icon-viewflow.png', CURRENT_TIMESTAMP, 12);


INSERT IGNORE INTO users(username,password,enabled) VALUES ('admin', 'admin', true);

INSERT IGNORE INTO roles (username, role) VALUES ('admin', 'ROLE_OWNER_ADMIN');
INSERT IGNORE INTO roles (username, role) VALUES ('admin', 'ROLE_VET_ADMIN');
INSERT IGNORE INTO roles (username, role) VALUES ('admin', 'ROLE_ADMIN');

INSERT IGNORE INTO owners VALUES (1, 'Болат', 'Ералы', 'Абай 151', 'Алматы', '7478956523');
INSERT IGNORE INTO owners VALUES (2, 'Ерас', 'Диасұлы', 'Құрманқазы 56', 'Алматы', '7476167191');
INSERT IGNORE INTO owners VALUES (3, 'Арман', 'Құдайбергенов', 'Қазыбек би 111', 'Алматы', '7475694874');
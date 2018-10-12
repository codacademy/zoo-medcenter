INSERT IGNORE INTO users(username,password,enabled) VALUES ('admin', 'admin', true);

INSERT IGNORE INTO roles (username, role) VALUES ('admin', 'ROLE_OWNER_ADMIN');
INSERT IGNORE INTO roles (username, role) VALUES ('admin', 'ROLE_VET_ADMIN');
INSERT IGNORE INTO roles (username, role) VALUES ('admin', 'ROLE_ADMIN');
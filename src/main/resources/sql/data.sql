INSERT INTO user (username,email, password, activated) VALUES ('admin', 'admin@mail.me', '$2a$10$.R6Qp1fBMaGBK.Vufuk9TefR/jj6RrYZZ/usVBy3szeX2I5WDvL6C', true);
INSERT INTO user (username,email, password, activated) VALUES ('user', 'user@mail.me', '$2a$10$Xg35BkfNiQGLnDCG9lXWauw/8XI5rYTpqVBZ1jy46pysu.cQ783/C', true);

INSERT INTO authority (name) VALUES ('ROLE_USER');
INSERT INTO authority (name) VALUES ('ROLE_ADMIN');

INSERT INTO user_authority (username,authority) VALUES ('user', 'ROLE_USER');
INSERT INTO user_authority (username,authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO user_authority (username,authority) VALUES ('admin', 'ROLE_ADMIN');
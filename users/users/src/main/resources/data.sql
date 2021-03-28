INSERT INTO tb_user (name, email, password) VALUES ('User 1', 'user1@gmail.com', '$2a$10$s5Rav7hdRTTL0J/yTsqzmudahnJZGAEg3eMFfZeyfsm/pvOMarnqW');
INSERT INTO tb_user (name, email, password) VALUES ('User 2', 'user2@gmail.com', '$2a$10$s5Rav7hdRTTL0J/yTsqzmudahnJZGAEg3eMFfZeyfsm/pvOMarnqW');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
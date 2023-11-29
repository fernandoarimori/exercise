INSERT INTO tb_person_category(name) VALUES ('Classic');
INSERT INTO tb_person_category(name) VALUES ('212');
INSERT INTO tb_person_category(name) VALUES ('Bbdr');

INSERT INTO tb_person (name, age, gender, weight, img_url) VALUES ('F1', 1, 'F', 0, 'qwe');
INSERT INTO tb_person (name, age, gender, weight, img_url) VALUES ('F2', 30, 'M', 130.00, 'google.com');
INSERT INTO tb_person (name, age, gender, weight, img_url) VALUES ('F3', 45, 'F', 87.30, 'google.com');
INSERT INTO tb_person (name, age, gender, weight, img_url) VALUES ('F4', 45, 'F', 87.30, 'google.com');
INSERT INTO tb_person (name, age, gender, weight, img_url) VALUES ('F5', 45, 'F', 87.30, 'google.com');
INSERT INTO tb_person (name, age, gender, weight, img_url) VALUES ('F6', 45, 'F', 87.30, 'google.com');


INSERT INTO tb_position (person_id, category_id, place) VALUES (1, 1, 0);
INSERT INTO tb_position (person_id, category_id, place) VALUES (2, 1, 1);
INSERT INTO tb_position (person_id, category_id, place) VALUES (3, 1, 2);

INSERT INTO tb_position (person_id, category_id, place) VALUES (4, 2, 0);
INSERT INTO tb_position (person_id, category_id, place) VALUES (5, 2, 1);

INSERT INTO tb_position (person_id, category_id, place) VALUES (6, 3, 0);



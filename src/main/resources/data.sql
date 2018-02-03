-- Almost life-real data inserted in order to test relations more easily
INSERT INTO company (company_id, name, street_name, street_number, city, email, description) VALUES
(1, 'Atos',       'Kraszewskiego',  '1',    'Bydgoszcz',   'atos@atos_bydgoszcz.pl',   'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua'),
(2, 'QSG',        'Kolorowa',       '10',   'Poznan',      'kontakt@e-qsg.com',        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua'),
(3, 'OpusCapita', 'Grudziacka',     '46',   'Torun',       'biuro.pl@opuscapita.com',  'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua'),
(4, 'Allegro',    'Grunwaldzka',    '182',  'Poznan',      'allegro@allegro.pl',       'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua'),
(5, 'Atos',       'Wolowska',       '10',   'Wroclaw',     'atos@atos_wroclaw.pl',     'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua'),
(6, 'SDA',        'Dluga',          '2',    'Gdansk',      'info@sdacademy.pl',        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua'),
(7, 'Comarch',    'Jana Pawla II',  '39a',  'Krakow',      'comarch@comarch.pl',       'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua'),
(8, 'BlueEnergy', 'Towarowa',       '35',   'Poznan',      'biuro@grupablue.pl',       'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua');

INSERT INTO user (id, name, last_name, email, password, phone_number, role, COMPANY_ID) VALUES
(1, 'Dariusz',  'Rozanski',     'user1@domain.p1', 'dr', '111-111-111', 'ADMIN', 6),
(2, 'Natalia',  'Lewandowska',  'user2@domain.p1', 'nl', '222-222-222', 'ADMIN', 8),
(3, 'Pawel',    'Orlowski',     'user3@domain.p1', 'po', '333-333-333', 'USER', 3),
(4, 'Bartosz',  'Janczak',      'user4@domain.p1', 'bj', '444-444-444', 'USER', 7),
(5, 'Michal',   'Garos',        'user5@domain.p1', 'mg', '555-555-555', 'USER', 5),
(6, 'Mateusz',  'Deptula',      'user6@domain.p1', 'md', '666-666-666', 'USER', 3),
(7, 'Daria',    'Biernat',      'user7@domain.p1', 'db', '777-777-777', 'USER', 2),
(8, 'Marcin',   'Kroszel',      'user8@domain.p1', 'mk', '888-888-888', 'USER', 3);

-- How can we manage to assign more than one devskill into one announcement?
-- For example Junior Java Dev requires devskills nr. 1, 3 and 10?
INSERT INTO devskills (id, area, name) VALUES
(1, 'backend', 'Java'),
(2, 'backend', 'Spring'),
(3, 'backend', 'Hibernate'),
(4, 'backend', 'JPA'),
(5, 'backend', 'JDBC'),

(6, 'frontend', 'HTML'),
(7, 'frontend', 'CSS'),
(8, 'frontend', 'JavaScript'),
(9, 'frontend', 'Angular'),

(10, 'utility', 'Git'),
(11, 'utility', 'SVN'),
(12, 'utility', 'Windows'),
(13, 'utility', 'Linux'),
(14, 'utility', 'MacOS'),

(15, 'database', 'MySQL'),
(16, 'database', 'Oracle'),
(17, 'database', 'PostgreSQL'),
(18, 'database', 'H2');

-- In order to have list of all regions in Poland, these were added along with capitol cities
INSERT INTO city (id, name, region) VALUES
(1, 'Wroclaw', 'dolnoslaskie'),
(2, 'Bydgoszcz', 'kujawsko-pomorskie'),
(3, 'Lublin', 'lubelskie'),
(4, 'Zielona Gora', 'lubuskie'),
(5, 'Lodz', 'lodzkie'),
(6, 'Krakow', 'malopolskie'),
(7, 'Warszawa', 'mazowieckie'),
(8, 'Opole', 'opolskie'),
(9, 'Rzeszow', 'podkarpackie'),
(10, 'Bialystok', 'podlaskie'),
(11, 'Gdansk', 'pomorskie'),
(12, 'Katowice', 'slaskie'),
(13, 'Kielce', 'swietokrzystkie'),
(14, 'Olsztyn', 'warminsko-mazurskie'),
(15, 'Poznan', 'wielkopolskie'),
(16, 'Szczecin', 'zachodniopomorskie'),
(17, 'Zdalnie', '');

INSERT INTO announcement (id, job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID) VALUES
(1, 'Junior Java Developer', 'Description of Junior Java Developer', 2500, 3500, 2, 1, 1, 1),
(2, 'Regular Java Developer', 'Description of Regular Java Developer', 4000, 5500, 15, 2, 1, 1),
(3, 'Senior Java Developer', 'Description of Senior Java Developer', 6000, 12000, 2, 1, 1, 1),

(4, 'MySQL Database Administrator', 'Description of MySQL Database Administrator', 3000, 5000, 15, 4, 15, 8),
(5, 'Oracle Database Administrator', 'Description of Oracle Database Administrator', 3500, 4300, 2, 1, 1, 8),
(6, 'PostreSQL Database Administrator', 'Description of PostreSQL Database Administrator', 3200, 4000, 1, 5, 17, 8);
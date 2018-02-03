INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 1', 'streetCompany 1', 'streetNumberCompany 1', 'city 1', 'email 1', 'Description of company 1');
INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 2', 'streetCompany 2', 'streetNumberCompany 2', 'city 2', 'email 2', 'Description of company 2');
INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 3', 'streetCompany 3', 'streetNumberCompany 3', 'city 3', 'email 3', 'Description of company 3');
INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 4', 'streetCompany 4', 'streetNumberCompany 4', 'city 4', 'email 4', 'Description of company 4');
INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 5', 'streetCompany 5', 'streetNumberCompany 5', 'city 5', 'email 5', 'Description of company 5');
INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 6', 'streetCompany 6', 'streetNumberCompany 6', 'city 6', 'email 6', 'Description of company 6');
INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 7', 'streetCompany 7', 'streetNumberCompany 7', 'city 7', 'email 7', 'Description of company 7');
INSERT INTO company (name, street_name, street_number, city, email, description)
VALUES ('Company 8', 'streetCompany 8', 'streetNumberCompany 8', 'city 8', 'email 8', 'Description of company 8');
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 1', 'UserLastname 1', 'User email 1', 'password 1', 'phone 1', 'role user 1', 4);
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 2', 'UserLastname 2', 'User email 2', 'password 2', 'phone 2', 'role user 2', 1);
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 3', 'UserLastname 3', 'User email 3', 'password 3', 'phone 3', 'role user 3', 2);
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 4', 'UserLastname 4', 'User email 4', 'password 4', 'phone 4', 'role user 4', 3);
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 5', 'UserLastname 5', 'User email 5', 'password 5', 'phone 5', 'role user 5', 8);
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 6', 'UserLastname 6', 'User email 6', 'password 6', 'phone 6', 'role user 6', 2);
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 7', 'UserLastname 7', 'User email 7', 'password 7', 'phone 7', 'role user 7', 6);
INSERT INTO user (name, last_name, email, password, phone_number, role, COMPANY_ID)
VALUES ('UserName 8', 'UserLastname 8', 'User email 8', 'password 8', 'phone 8', 'role user 8', 4);
INSERT INTO devskills (area, name) VALUES ('devskills area 1', 'devskills Name 1');
INSERT INTO devskills (area, name) VALUES ('devskills area 2', 'devskills Name 2');
INSERT INTO devskills (area, name) VALUES ('devskills area 3', 'devskills Name 3');
INSERT INTO devskills (area, name) VALUES ('devskills area 4', 'devskills Name 4');
INSERT INTO devskills (area, name) VALUES ('devskills area 5', 'devskills Name 5');
INSERT INTO devskills (area, name) VALUES ('devskills area 6', 'devskills Name 6');
INSERT INTO devskills (area, name) VALUES ('devskills area 7', 'devskills Name 7');
INSERT INTO devskills (area, name) VALUES ('devskills area 8', 'devskills Name 8');
INSERT INTO devskills (area, name) VALUES ('devskills area 9', 'devskills Name 9');
INSERT INTO city (name, region) VALUES ('city Name 1', 'city region 1');
INSERT INTO city (name, region) VALUES ('city NAME 2', 'city region 2');
INSERT INTO city (name, region) VALUES ('city Name 3', 'city region 3');
INSERT INTO city (name, region) VALUES ('city NAME 4', 'city region 4');
INSERT INTO city (name, region) VALUES ('city Name 5', 'city region 5');
INSERT INTO city (name, region) VALUES ('city NAME 6', 'city region 6');
INSERT INTO city (name, region) VALUES ('city Name 7', 'city region 7');
INSERT INTO city (name, region) VALUES ('city NAME 8', 'city region 8');
INSERT INTO city (name, region) VALUES ('city Name 9', 'city region 9');
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 1', 'jobDescription 1', 500, 2000, 1, 2, 3, 4,20160102);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 2', 'jobDescription 2', 1500, 2000, 2, 5, 8, 3,20170522);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 3', 'jobDescription 3', 2000, 3000, 2, 2, 5, 2,20150512);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 4', 'jobDescription 4', 1500, 5000, 3, 6, 8, 3,20170107);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 5', 'jobDescription 5', 5500, 7000, 1, 6, 8, 8,20170114);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 6', 'jobDescription 6', 10000, 14000, 7, 4, 6, 2,20130729);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 7', 'jobDescription 7', 200, 1500, 5, 7, 3, 5,20140807);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 8', 'jobDescription 8', 3000, 4000, 2, 6, 8, 4,20000105);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 9', 'jobDescription 9', 7000, 8000, 2, 6, 7, 4,19851007);
INSERT INTO annoucement (job_position, job_description, min_salary, max_salary, city_id, company_id, devskills_id, RECRUITER_ID,date)
VALUES ('jobPosition 10', 'jobDescription 10', 9000, 12000, 7, 2, 4, 5,19670518);

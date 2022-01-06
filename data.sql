create database StudentCollegeRegistration;
Use StudentCollegeRegistration;
create table Student (id int primary key auto_increment, name varchar(50), department varchar(50), country varchar(50));
select * from StudentCollegeRegistration.Student;
Insert into StudentCollegeRegistration.Student values (1, 'Mayur','B.Tech', 'India');
insert into StudentCollegeRegistration.Student values (2, 'Vaibhav', 'B.Arch', 'Russia');

create table Roles (role_id int , role_name varchar(50));
select * from StudentCollegeRegistration.Roles;
Insert into StudentCollegeRegistration.Roles values (1, 'admin');
insert into StudentCollegeRegistration.Roles values (2, 'user');

create table Users (user_id int , username varchar(50), password varchar(256));
select * from StudentCollegeRegistration.Users;
Insert into StudentCollegeRegistration.Users values (1, 'admin', '$2a$12$oIVLV3x.OcdkfFEjrLoTt.ghcg95EEWhtxgk56l.a0I9ErZaGNym6');
insert into StudentCollegeRegistration.Users values (2, 'user','$2a$12$lUCqCzYK1HAMKOGTm1.iXeZ1Fyvg8ONFutkKSYrLq9OWrBflw07v.');

create table User_roles (user_id int, role_id int);
select * from StudentCollegeRegistration.User_roles;
Insert into StudentCollegeRegistration.User_roles values (1, 1);
insert into StudentCollegeRegistration.User_roles values (2, 2);

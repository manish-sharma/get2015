CREATE DATABASE employee;
USE employee;
CREATE TABLE employeeDetails(
id integer unsigned not null auto_increment,
name VARCHAR(100) not null,
dateOfBirth VARCHAR(100) not null,
email_id VARCHAR(100) not null,
address VARCHAR(100) not null,
PRIMARY KEY(id)
);

INSERT INTO employeeDetails VALUES("1","Shishir Pareek","07/06/1993","shishirpareek07@gmail.com","Jaipur");
INSERT INTO employeeDetails VALUES("2","Shubham Sharma","02/11/1993","sshubham3314@gmail.com","Jaipur");
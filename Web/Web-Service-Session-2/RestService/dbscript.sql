CREATE DATABASE ems;
use ems;
CREATE TABLE employee ( id varchar(20) PRIMARY KEY,name varchar(30), date_of_birth varchar(10), adress varchar(80));
INSERT INTO employee values('emp001','Rahul Goyal','09-12-1993','Pragati Vihar,Gwalior');
SELECT * FROM employee;
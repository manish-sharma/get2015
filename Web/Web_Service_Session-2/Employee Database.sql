create database EmployeeDatabase;
use EmployeeDatabase;
create table employee(
id int Auto_INCREMENT,
name varchar(100),
email varchar(100),
primary key(id)
);

insert into employee (name,email) values ('sumitra','sumitra@gmail.com');

select * from employee where id=2;

select * from employee;

delete from employee where id=1;
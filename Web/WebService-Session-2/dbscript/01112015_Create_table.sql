create database if not exists EMPLOYEEMGMT;

use EMPLOYEEMGMT;

create admin employeemgmt identified by 'employeemgmt';

grant usage on *.* to employeemgmt@localhost identified by 'employeemgmt';
grant all privileges on employeemgmt.* to employeemgmt@localhost;

drop table if exists EMPLOYEE;

create table EMPLOYEE (
  ID integer unsigned not null auto_increment,
  NAME varchar(45) not null,
  DESIGNATION varchar(45) not null,
  EMAIL varchar(45) not null,
  ADDRESS varchar(45) not null,
  SALARY integer unsigned not null,
  primary key (ID)
)ENGINE=INNODB;

insert into EMPLOYEE values(1,"Manish","SE","m@gmail.com","Jaipur, Rajasthan",20000);
insert into EMPLOYEE values(2,"Chetna","ASE","c@gmail.com","Jaipur, Rajasthan",19000);
insert into EMPLOYEE values(3,"Anjita","SSE","a@gmail.com","Ajmer, Rajasthan",18000);
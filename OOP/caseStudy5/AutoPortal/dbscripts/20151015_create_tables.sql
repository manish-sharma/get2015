create database if not exists METAHRM;

use METAHRM; 

create user metahrm identified by 'metahrm';

grant usage on *.* to metahrm@localhost identified by 'metahrm'; 
grant all privileges on metahrm.* to metahrm@localhost; 

drop table if exists SALES_PERSON;

drop table if exists EMPLOYEE;

create table EMPLOYEE (
  ID integer unsigned not null auto_increment,
  FIRST_NAME varchar(45) not null,
  LAST_NAME varchar(45) not null,
  EMAIL_ID varchar(100) not null,
  SALARY decimal(10.2) unsigned not null,
  CREATED_BY varchar(45) not null,
  CREATED_TIME timestamp not null,
  primary key (ID)
)ENGINE=INNODB;

create table SALES_PERSON (
  ID integer unsigned not null auto_increment,
  EMPLOYEE_ID integer unsigned,
  BONUS_PER_CLIENT integer unsigned,
  CREATED_BY varchar(45) not null,
  CREATED_TIME timestamp not null,
  primary key (ID),
  foreign key (EMPLOYEE_ID) 
  	references EMPLOYEE(ID)
)ENGINE=INNODB;

//

USE vehicle_management_system;

CREATE TABLE USER(
 userId INT PRIMARY KEY AUTO_INCREMENT,
 userName VARCHAR(50) UNIQUE,
 password VARCHAR(50)
);



INSERT INTO `vehicle_management_system`.`user` (`userId`, `userName`, `password`) VALUES (1, 'riddhi@gmail.com', 'riddhi');

INSERT INTO `vehicle_management_system`.`user` (`userId`, `userName`, `password`) VALUES (2, 'kajal@gmail.com', 'kajal');

ALTER TABLE `vehicle_management_system`.`vehicle` ADD COLUMN `image` BLOB NULL DEFAULT NULL  AFTER `created_time` ;

ALTER TABLE vehicle MODIFY image VARCHAR(50);
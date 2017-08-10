CREATE DATABASE if not exists speedster;

USE speedster;

CREATE TABLE admin(
id integer unsigned not null auto_increment,
first_name VARCHAR(100) not null,
last_name VARCHAR(100) not null,
email_id VARCHAR(100) not null,
password VARCHAR(100) not null,
PRIMARY KEY(id)
);
DROP TABLE admin;

INSERT INTO admin VALUES("1","Shishir","Pareek","shishirpareek07@gmail.com","password");

create table VEHICLE (
  ID integer unsigned not null auto_increment,
  MAKE varchar(45) not null,
  MODEL varchar(45) not null unique,
  ENGINE_IN_CC integer not null,
  FUEL_CAPACITY integer not null,
  MILAGE integer not null,
  IMAGE_URL varchar(45) not null,
  PRICE decimal(10,2) unsigned not null,
  ROAD_TAX decimal (10,2) unsigned not null,
  ON_ROAD_PRICE decimal (10,2) unsigned not null,
  CREATED_BY varchar(45) not null,
  CREATED_TIME timestamp not null,
  primary key (ID)
)ENGINE=INNODB;

create table CAR (
  ID integer unsigned not null auto_increment,
  VEHICLE_ID integer unsigned,
  AC varchar(10) not null,
  POWER_STEERING varchar(10) not null,
  ACCESSORY_KIT varchar(100) not null,
  CREATED_BY varchar(45) not null,
  CREATED_TIME timestamp not null,
  primary key (ID),
  foreign key (VEHICLE_ID) 
  	references VEHICLE(ID)
)ENGINE=INNODB;
/*Creating Database*/
CREATE DATABASE vehicle;

USE vehicle;

/*Creating Table vehicle*/
CREATE TABLE vehicle (
  ID VARCHAR(100),
  created_by VARCHAR(100),
  created_time VARCHAR(100),
  make VARCHAR(100),
  model VARCHAR(100),
  engine_in_CC int,
  fuel_capacity int,
  milage int,
  price int,
  roadtax int,
  PRIMARY KEY(ID)
);

/*Creating Table car*/
CREATE TABLE car(
  AC VARCHAR(100),
  power_steering VARCHAR(100),
  ID VARCHAR(100),
  CONSTRAINT freign_key1 FOREIGN KEY(ID) REFERENCES vehicle(ID) ON DELETE CASCADE ON UPDATE CASCADE 
);

/*Creating Table bike*/
CREATE TABLE bike(
  self_start VARCHAR(100),
	helmet_price int,
	ID VARCHAR(100),
  CONSTRAINT freign_key2 FOREIGN KEY(ID) REFERENCES vehicle(ID) ON DELETE CASCADE ON UPDATE CASCADE
);

/*DROP DATABASE vehicle;*/


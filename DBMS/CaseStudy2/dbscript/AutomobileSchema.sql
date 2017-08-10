CREATE DATABASE automobile;

Use automobile;
CREATE TABLE vehicle (vehicleid INT,make VARCHAR(100),model VARCHAR(100),enginecc INT,fuelcapacity INT,
mileage DOUBLE,price DOUBLE,roadtax DOUBLE,PRIMARY KEY(vehicleid));

CREATE TABLE car(vehicleid INT,isACAvilabel BOOLEAN,powersteering BOOLEAN,accessorykit
VARCHAR(100),FOREIGN KEY(vehicleid) REFERENCES vehicle(vehicleid));

CREATE TABLE bike(vehicleid INT,selfstart BOOLEAN,helmetprice DOUBLE,FOREIGN KEY 
(vehicleid) REFERENCES vehicle(vehicleid)); 

Drop DATABASE automobile;

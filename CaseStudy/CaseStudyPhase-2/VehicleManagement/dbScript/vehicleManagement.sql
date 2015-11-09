CREATE DATABASE vehiclemanagement;
USE vehiclemanagement;


CREATE TABLE vehicle (
 vehicle_ID VARCHAR(100),
 make VARCHAR(100),
 model VARCHAR(100),
 engine_in_CC VARCHAR(100),
 fuel_capacity DOUBLE,
 milage DOUBLE,
 price DOUBLE,
 road_tax DOUBLE,
 created_by VARCHAR(100),
 created_time TIMESTAMP DEFAULT NOW(),
 PRIMARY KEY(vehicle_ID)
);

DROP TABLE vehicle;

CREATE TABLE car(
 vehicle_ID VARCHAR(100),
 AC VARCHAR(100) CHECK(AC IN ('True','False')),
 power_stearing VARCHAR(100),
 CHECK(power_stearing IN ('True','False')),
 accessory_Kit VARCHAR(20),
 CONSTRAINT freign_key1 FOREIGN KEY(vehicle_ID) REFERENCES vehicle(vehicle_ID) 
 ON DELETE CASCADE ON UPDATE CASCADE 
);




CREATE TABLE bike(
vehicle_ID VARCHAR(100),
self_start VARCHAR(100) CHECK(self_start IN ('True','False')),
helmet_price int,
CONSTRAINT freign_key2 FOREIGN KEY(vehicle_ID) REFERENCES vehicle(vehicle_ID)
ON DELETE CASCADE ON UPDATE CASCADE
);



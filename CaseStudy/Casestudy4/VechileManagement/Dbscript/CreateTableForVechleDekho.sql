CREATE DATABASE vehicleManagement;

USE vehicleManagement;

CREATE TABLE vehicle
                (  vehicleId INT unsigned NOT NULL auto_increment,
                   make VARCHAR (50),
                   model VARCHAR (50),
                   engineInCC INT,
                   fuelCapacity INT,
                   mileage INT,
                   price FLOAT,
                   roadTax FLOAT,
                   createdBy VARCHAR (50),
                   createdTime TIMESTAMP  DEFAULT CURRENT_TIMESTAMP,
                   primary key (vehicleId)
                   );
	    		
CREATE TABLE car 
               (vehicleId INT unsigned NOT NULL,
                ac VARCHAR(10),
                powerSteering VARCHAR(10),
                accessoryKit VARCHAR(100),
                FOREIGN KEY(vehicleId) 
                REFERENCES vehicle (vehicleId)
                ON DELETE CASCADE ON UPDATE CASCADE
                );
                
                
CREATE TABLE bike 
                (vehicleId INT unsigned NOT NULL,
                selfStart VARCHAR (10),
                helmetPrice INT,
	    		FOREIGN KEY(vehicleId) 
	    		REFERENCES vehicle (vehicleId)
	    		ON DELETE CASCADE ON UPDATE CASCADE
	    		);
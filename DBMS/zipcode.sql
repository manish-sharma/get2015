Drop DATABASE Zipcode;
CREATE DATABASE Zipcode;
USE Zipcode;


CREATE TABLE ZipCode(
    zipcode int PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE CityName(
    zipcode int PRIMARY KEY AUTO_INCREMENT,
    cityName varchar(20),
    FOREIGN KEY (zipcode)
        REFERENCES ZipCode (zipcode)
);

CREATE TABLE StateName(
    zipcode int PRIMARY KEY AUTO_INCREMENT,
    stateName varchar(20),
    FOREIGN KEY (zipcode)
        REFERENCES ZipCode (zipcode)
);
 

INSERT INTO ZipCode(zipcode)  VALUES (1001);
INSERT INTO ZipCode(zipcode)  VALUES (1002);
INSERT INTO ZipCode(zipcode)  VALUES (1003);
INSERT INTO ZipCode(zipcode)  VALUES (1004);
 
 
INSERT INTO CityName(zipcode,cityName) VALUES (1001,'patna');
INSERT INTO CityName(cityName) VALUES ('jaipur');
INSERT INTO CityName(cityName) VALUES ('delhi');
INSERT INTO CityName(cityName) VALUES ('indore');
 
INSERT INTO StateName(zipcode,stateName) VALUES (1001,'bihar');
INSERT INTO StateName(stateName) VALUES ('rajasthan');
INSERT INTO StateName(stateName) VALUES ('delhi');
INSERT INTO StateName(stateName) VALUES ('mp');
 
 
SELECT 
    z.zipcode, cityName, stateName
from
    ZipCode z,
    CityName c,
    StateName s
where
    ((z.zipcode = c.zipcode) && (z.zipcode = s.zipcode))
ORDER BY stateName asc ,cityName asc;
DROP DATABASE IF EXISTS zipcode;

CREATE DATABASE zipcode;

USE zipcode;

CREATE TABLE zipcodeNumber(
    zipcode INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE cityInfo(
    zipcode INT PRIMARY KEY AUTO_INCREMENT,
    cityName VARCHAR(20),
    FOREIGN KEY (zipcode)
        REFERENCES zipcodeNumber (zipcode)
);

CREATE TABLE stateInfo(
    zipcode INT PRIMARY KEY,
    stateName VARCHAR(20),
    FOREIGN KEY (zipcode)
        REFERENCES zipcodeNumber(zipcode)
);
 
INSERT INTO zipcodeNumber(zipcode) VALUES (123456);
INSERT INTO zipcodeNumber(zipcode) VALUES (123457);
INSERT INTO zipcodeNumber(zipcode) VALUES (123458);
 
INSERT INTO cityInfo(zipcode, cityName) VALUES (123456, 'Jaipur');
INSERT INTO cityInfo(cityName) VALUES ('Delhi');
INSERT INTO cityInfo(cityName) VALUES ('Mumbai');
 
INSERT INTO stateInfo(zipcode, stateName) VALUES (123456, 'Rajasthan');
INSERT INTO stateInfo(zipcode, stateName) VALUES (123457, 'Delhi');
INSERT INTO stateInfo(zipcode, stateName) VALUES (123458, 'Maharashtra');


SELECT 
    z.zipcode, cityName, stateName
FROM
    zipcodeNumber z,
    cityInfo c,
    stateInfo s
WHERE
    ((z.zipcode = c.zipcode) && (z.zipcode = s.zipcode))
ORDER BY stateName, cityName;
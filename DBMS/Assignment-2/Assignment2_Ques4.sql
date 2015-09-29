-- Creating Database zipcodeInfo
CREATE DATABASE zipcodeInfo;
USE zipcodeInfo;
DROP DATABASE zipcodeInfo;
-- creating table Zipcode
 CREATE TABLE zipcodeNumber
(
	zipcode int PRIMARY KEY AUTO_INCREMENT
);
-- Creating table cityInfo
CREATE TABLE cityInfo
(
	-- To store zip code and name
	zipcode int PRIMARY KEY AUTO_INCREMENT,
	cityName varchar(20),
	FOREIGN KEY (zipcode) REFERENCES zipcodeNumber(zipcode) 
);
-- Creating table stateInfo
CREATE TABLE stateInfo
(
	-- to store zipcode and stateName
	zipcode int PRIMARY KEY AUTO_INCREMENT,
	stateName varchar(20),
	FOREIGN KEY (zipcode) REFERENCES zipcodeNumber(zipcode) 
);

-- Inserting values in zipcodeNumber table
 INSERT INTO zipcodeNumber(zipcode) VALUES (302001);
 INSERT INTO zipcodeNumber(zipcode) VALUES (302002);
 INSERT INTO zipcodeNumber(zipcode) VALUES (302003);
 SELECT * from zipcodeNumber;
-- Inserting values in cityInfo table
 INSERT INTO cityInfo(zipcode,cityName) VALUES (302001,'Jaipur');
 INSERT INTO cityInfo(cityName) VALUES ('Alwar');
 INSERT INTO cityInfo(cityName) VALUES ('Udaipur');
 
 -- Inserting values in stateInfo table
 INSERT INTO stateInfo(zipcode,stateName) VALUES (302001,'Rajasthan');
 INSERT INTO stateInfo(stateName) VALUES ('Maharastra');
 INSERT INTO stateInfo(stateName) VALUES ('Kerela');
 

 
 -- Query to find the zip code city name and stateName
 SELECT z.zipcode,cityName,stateName from zipcodeNumber z, 
 cityInfo c, stateInfo s where 
 ((z. zipcode=c.zipcode)&&(z.zipcode=s.zipcode)) ORDER BY stateName asc , cityName asc;


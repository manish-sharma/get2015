-- Creating Database zipcodeInfo
CREATE DATABASE zipcodeInfo;
USE zipcodeInfo;

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
 INSERT INTO zipcodeNumber(zipcode) VALUES (800001);
 INSERT INTO zipcodeNumber(zipcode) VALUES (800002);
 INSERT INTO zipcodeNumber(zipcode) VALUES (800003);
 
 -- Inserting values in cityInfo table
 INSERT INTO cityInfo(zipcode,cityName) VALUES (800001,'patna');
 INSERT INTO cityInfo(cityName) VALUES ('jaipur');
 INSERT INTO cityInfo(cityName) VALUES ('delhi');
 
 -- Inserting values in stateInfo table
 INSERT INTO stateInfo(zipcode,stateName) VALUES (800001,'bihar');
 INSERT INTO stateInfo(stateName) VALUES ('rajasthan');
 INSERT INTO stateInfo(stateName) VALUES ('delhi');
 
 
 -- Query to find the zip code city name and stateName
 SELECT z.zipcode,cityName,stateName from zipcodeNumber z, cityInfo c, stateInfo s where ((z. zipcode=c.zipcode)&&(z.zipcode=s.zipcode)) ORDER BY stateName asc , cityName asc;

 
 
 
 

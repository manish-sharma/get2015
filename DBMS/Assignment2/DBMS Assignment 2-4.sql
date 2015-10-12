-- Creating Database zipcode_info
CREATE DATABASE zipcode_info;

-- Using zipcode_info database
USE zipcode_info;

-- Creating table zipcodeNumber
 CREATE TABLE zipcodeNumber
(
  zip_id INT PRIMARY KEY AUTO_INCREMENT,
  zip_code INT
);

-- Creating table cityInfo
CREATE TABLE cityInfo
(
	-- To store city_id,zip_id and city_name
    city_id INT PRIMARY KEY AUTO_INCREMENT,
    city_name VARCHAR (50),
    zip_id INT, 
	  FOREIGN KEY (zip_id) REFERENCES zipcodeNumber(zip_id) 
);

-- Creating table stateInfo
CREATE TABLE stateInfo
(
	-- To store city_id and state_name
    	state_name VARCHAR(50),
	    city_id INT,
      FOREIGN KEY (city_id) REFERENCES cityInfo(city_id) 
);
 
 -- Inserting values in zipcodeNumber table
INSERT INTO zipcodeNumber(zip_id,zip_code) VALUES (1,302001);
INSERT INTO zipcodeNumber(zip_code) VALUES (302002);
INSERT INTO zipcodeNumber(zip_code) VALUES (302003);
 
 -- Inserting values in cityInfo table
INSERT INTO cityInfo(city_id,city_name,zip_id) VALUES (101,'Gurgaon',1);
INSERT INTO cityInfo(city_name,zip_id) VALUES ('jaipur',2);
INSERT INTO cityInfo(city_name,zip_id) VALUES ('delhi',3);
INSERT INTO cityInfo(city_name,zip_id) VALUES ('Faridabad',1);
 
 -- Inserting values in stateInfo table
INSERT INTO stateInfo(city_id,state_name) VALUES (101,'Gujrat');
INSERT INTO stateInfo(city_id,state_name) VALUES (102,'rajasthan');
INSERT INTO stateInfo(city_id,state_name) VALUES (103,'delhi');
INSERT INTO stateInfo(city_id,state_name) VALUES (105,'Gujrat');
 
 
 -- Query to find the zip code city name and stateName set
 SELECT z.zip_code,c.city_name,s.state_name FROM zipcodeNumber z INNER JOIN cityInfo c  ON c.zip_id=z.zip_id
 INNER JOIN stateInfo s ON s.city_id=c.city_id WHERE z.zip_code='302001' ORDER BY state_name,city_name;
 
 
 
 
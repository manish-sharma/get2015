
-- create a datbase which have information of cities and correspondace zip code and state
CREATE DATABASE zipinfo;
USE zipinfo;


-- create state table
CREATE TABLE state(
	      state_id INT AUTO_INCREMENT,
	      state_name VARCHAR(30),
	      PRIMARY KEY(state_id)
);

-- create city table
CREATE TABLE city(
	city_id INT AUTO_INCREMENT,
	city_name CHAR(30),
	state_id INT,
	PRIMARY KEY (city_id),
	FOREIGN KEY(state_id) REFERENCES state (state_id) ON DELETE CASCADE ON UPDATE CASCADE
);

-- create zipcode table
CREATE TABLE zipcode(
	zipcode INT,
	city_id INT,
	PRIMARY KEY ( zipcode, city_id),
	FOREIGN KEY(city_id) REFERENCES city(city_id) ON DELETE CASCADE ON UPDATE CASCADE
);

-- set auto_increment state_id
ALTER TABLE state AUTO_INCREMENT=1;
-- insert into state
INSERT INTO state(state_name) VALUES
	('Maharastra'),('Chhattisgarh'),('Rajsthan'),('Bihar'),
	('Punjab'),('Uttarakhand'),('Madhay Pradesh'),('Tripura');
    
    select * from state;
-- set auto_incement city_id	
ALTER TABLE city AUTO_INCREMENT=1;	
-- insert into city
INSERT INTO city(city_name,state_id) VALUES 
	('Mumbai',1),('Pune',1),('Nagpur',1),('Thane',1),
  ('Bilaspur',2),('Jagdalpur',2),('Ambikapur',2),
	('Jiapur',3),('Kota',3),('Udaipur',3),('Baran',3),('Badmer',3),
	('Patna',4),('Bhagalpur',4),('Darbhanga',4),('Chhapra',4),
	('Amritsar',5),('Jalandhar',5),('Patiyala',5),
	('Haridwar',6),('Roorkee',6),('Dehradun',6),('Nainital',6),
	('Bhopal',7),('Jabalpur',7),('Gwalior',7),('Indore',7),
	('Sabroom ',8),('Agartala',8),('Sabroom',8),('Jirania',8);

-- insert into city
INSERT INTO zipcode(zipcode,city_id) VALUES
   (471890,1),(471321,2),(471890,3),(471870,4),
   (321970,5),(321871,6),(321370,7),
   (671270,8),(671373,9),(671371,10),(671390,11),(672270,12),
   (391119,13),(395454,14),(399988,15),(391101,16),
   (122227,17),(122570,18),(120008,19),
   (302270,20),(308193,21),(305674,22),(309930,23),
   (902221,24),(903276,25),(902101,26),(905555,27),
   (769970,28),(762272,29),(762540,30),(76222,31);


-- Display zipcode city and state 
SELECT z.zipcode "ZIP CODE", c.city_name CITY, s.state_name STATE 
FROM city AS c   JOIN state AS s   ON c.state_id=s.state_id  JOIN zipcode AS z   ON z.city_id = c.city_id 
ORDER BY s.state_name ,c.city_name ;






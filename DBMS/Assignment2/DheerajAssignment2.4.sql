/*create a table system which has city and state associated with zip code*/
CREATE DATABASE zipcode;
USE zipcode;

/*create state table*/
CREATE TABLE states(
	state_id INT(10) PRIMARY KEY AUTO_INCREMENT,
	state_name VARCHAR(30)
);


/*create city table*/
CREATE TABLE cities(
	city_id INT PRIMARY KEY AUTO_INCREMENT,
	city_name VARCHAR(30),
	state_id INT(10) ,
    FOREIGN KEY (state_id) REFERENCES states(state_id) ON DELETE CASCADE
);



/*create ziptocity table*/
CREATE TABLE ziptocity(
	zipcode INT(6) PRIMARY KEY AUTO_INCREMENT,
	city_id INT(10),
    FOREIGN KEY (city_id) REFERENCES cities(city_id) ON DELETE CASCADE
);


INSERT INTO states(state_name) VALUES
("Uttar Pradesh"),
("Rajsthan"),
("Haryana"),
("Punjab"),
("Goa"),
("Madhay Pradesh"),
("Bihar"),
("Maharastra");

INSERT INTO cities(city_name,state_id) VALUES 
("Mathura",1),
("Agra",1),
("Allahabad",1),
("Hathras",1),
("Jaipur",2),
("Bikaner",2),
("Ajmer",2),
("Chittorgarh",2),
("Patna",7),
("Gaya",7),
("Hajipur",7),
("Sonpur",7), 
("Gurgaon",3),
("Badshahpur",3),
("Behrampur",3),
("Ghata",3);

INSERT INTO ziptocity(zipcode,city_id) VALUES
(281001,1),
(281003,1),
(281002,1),
(282001,2),
(535218,2),
(522004,2),
(385340,3),
(456015,3),
(211003,3),
(204101,4),
(204102,4),
(261208,5),
(221406,5),
(303301,5),
(305002,7),
(382728,7),
(360055,7),
(503245,9),
(530052,9),
(754140,9),
(228145,11),
(855105,11),
(276122,11),
(122225,13),
(12210,13),
(12234,13),
(721102,14),
(443201,14),
(736206,14);

/*Display cities, states , zip to cities table*/
select * from cities;
select * from  ziptocity;
select * from states;
	
    
/*Display all zipcode order by state and city*/

SELECT z.zipcode as "Zip Code" , s.state_name as "State Name " ,c.city_name as "City Name" FROM  STATES S JOIN CITIES C ON S.STATE_ID= C.STATE_ID 
JOIN ziptocity z ON  c.city_id = z.city_id order by s.state_name ,c.city_name;
 
SELECT c.city_name CITY, s.states_name "State Name" FROM cities AS c 
JOIN states AS s ON c.states_id=s.states_id JOIN 
ziptocity AS z ON z.city_id = c.city_id WHERE z.zipcode = "281001";

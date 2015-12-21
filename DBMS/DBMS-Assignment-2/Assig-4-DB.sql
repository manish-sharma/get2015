CREATE DATABASE ZipCode;

USE ZipCode;

CREATE TABLE States(
State_id VARCHAR(100),
State_name VARCHAR(100),
PRIMARY KEY(State_id)
);

CREATE TABLE City(
City_id VARCHAR(100),
City_name VARCHAR(100),
State_id VARCHAR(100),
PRIMARY KEY(City_id),
FOREIGN KEY(State_id) REFERENCES States(State_id) ON DELETE CASCADE ON UPDATE CASCADE
);


CREATE TABLE ZipCode(
Zipcode VARCHAR(100),
City_id VARCHAR(100),
PRIMARY KEY(Zipcode),
FOREIGN KEY(City_id) REFERENCES City(City_id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO States VALUES('1','RAJASTHAN'),('2','UP'),('3','GUJRAT');

INSERT INTO City VALUES('101','JAIPUR','1'),('102','AGRA','2'),('103','GANDHINAGAR','3');

INSERT INTO ZipCode VALUES('302018','101'),('112012','102'),('000860','103');
 
 
SELECT z.ZipCode, c.City_name, s.State_name
FROM ZipCode z
INNER JOIN
City c
ON
z.City_id = c.City_id
INNER JOIN
States s
ON
c.State_id = s.State_id
ORDER BY c.City_name, s.State_name; 


/*Consider a form where providing a Zip Code populates associated City and State. 
Create appropriate tables and relationships*/

CREATE DATABASE getzip;
USe getzip;
CREATE TABLE state(
	state_id INT AUTO_INCREMENT PRIMARY KEY,
	state_name VARCHAR(100)
);

CREATE TABLE city(
	city_id INT AUTO_INCREMENT PRIMARY KEY,
	city_name VARCHAR(100),
  state_id INT,
  FOREIGN KEY (state_id)  REFERENCES state (state_id) on update cascade on delete cascade  
);

CREATE TABLE zipcode(
    city_id INT,
    zip_code VARCHAR(100),
    FOREIGN KEY (city_id)  REFERENCES city (city_id) on update cascade on delete cascade
);

INSERT INTO state(
   state_name)
    VALUES ('Rajasthan'
);

INSERT INTO state(
   state_name)
    VALUES ('Punjab'
);

INSERT INTO state(
    state_name)
    VALUES ('Bihar'
);

INSERT INTO city(
    city_name,state_id)
    VALUES ('Jaipur',1
);

INSERT INTO city(
    city_name,state_id)
    VALUES ('Ajmer',1
);

INSERT INTO city(
    city_name,state_id)
    VALUES ('Amritsar',2
);

INSERT INTO city(
    city_name,state_id)
    VALUES ('Chandighar',2
);

INSERT INTO city(
    city_name,state_id)
    VALUES ('Gaya',3
);

INSERT INTO city(
    city_name,state_id)
    VALUES ('Patna',3
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (1,'102007'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (1,'102087'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (2,'202007'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (2,'202089'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (3,'302007'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (3,'302567'
);INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (4,'402007'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (4,'402567'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (5,'502007'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (5,'502567'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (6,'602007'
);
INSERT INTO zipcode(
    city_id,zip_code)
    VALUES (6,'602567'
);

/* write a SQL query for that returns a Resultset containing Zip Code, City Names and States ordered by State Name and City Name.*/
select z.zip_code,c.city_name,s.state_name from zipcode z, city c,state s 
where z.city_id=c.city_id and c.state_id = s.state_id
order by state_name,city_name;
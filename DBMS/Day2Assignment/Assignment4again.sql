/*Consider a form where providing a Zip Code populates associated City and State. 
Create appropriate tables and relationships*/

CREATE DATABASE getzip;
USe getzip;
CREATE TABLE state(
	state_id INT AUTO_INCREMENT PRIMARY KEY,
	state_name VARCHAR(100)
);

CREATE TABLE city(
	zip_code VARCHAR(100) NOT NULL,
	city_name VARCHAR(100),
  state_id INT,
  FOREIGN KEY (state_id)  REFERENCES state (state_id) on update cascade on delete cascade  
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
    city_name,state_id,zip_code)
    VALUES ('Jaipur',1,'102007'
);

INSERT INTO city(
    city_name,state_id,zip_code)
    VALUES ('Ajmer',1,'202007'
);

INSERT INTO city(
    city_name,state_id,zip_code)
    VALUES ('Amritsar',2,'302007'
);

INSERT INTO city(
    city_name,state_id,zip_code)
    VALUES ('Chandighar',2,'402007'
);

INSERT INTO city(
    city_name,state_id,zip_code)
    VALUES ('Gaya',3,'502007'
);

INSERT INTO city(
    city_name,state_id,zip_code)
    VALUES ('Patna',3,'602007'
);

/* write a SQL query for that returns a Resultset containing Zip Code, City Names and States ordered by State Name and City Name.*/
select s.state_name ,c.city_name,c.zip_code from  city c,state s 
where c.state_id = s.state_id
order by state_name,city_name;
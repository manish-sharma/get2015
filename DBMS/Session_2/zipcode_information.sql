 /*
  * Display a form which provide a ZIP CODE populates 
  * associated City and State
  */
 CREATE DATABASE zipcode_information;
 
 USE zipcode_information;
 
 
 /*
  * Creating Table Zip_info
  */
 CREATE TABLE Zip_info
 (
   zip_code INT PRIMARY KEY,
   city_id INT
   
 );
 
 /*
  * Creating Table city_info
  */
 CREATE TABLE city_info
 (
   city_id INT PRIMARY KEY,
   city_nm VARCHAR(30)
   
 );
 
 /*
  * Creating Table state_info
  */
 CREATE TABLE state_info
 (
   state_id INT ,
   state_nm VARCHAR(30),
   city_id INT
   
 );
 
 
 
 /*
  * Inserting data in Zip_info
  */
 INSERT INTO Zip_info
 VALUES
 (3021,1001),
 (3022,1002),
 (3023,1003),
 (3024,1004),
 (3025,1005),
 (3026,1006),
 (3027,1007),
 (3028,1008),
 (3029,1009);
 
 /*
  * Inserting data in city_info
  */
 INSERT INTO city_info(city_nm,city_id)
 VALUES
 ("Ahmedabad",1001),
 ("Gandhinagar",1002),
 ("Vadodara",1003),
 ("Jaipur" ,1004),
 ("Bikaner",1005),
 ("Ajmer",1006),
 ("Gwalior",1007),
 ("Indore",1008),
 ("Bhopal" ,1009);
 
 /*
  * Inserting data in state_info
  */
 INSERT INTO state_info(state_id,state_nm,city_id)
 VALUES
 (1,"Gujarat",1001),
 (1,"Gujarat",1002),
 (1,"Gujarat",1003),
 (2,"Rajasthan",1004),
 (2,"Rajasthan",1005),
 (2,"Rajasthan",1006),
 (3,"Madhya Pradesh",1007),
 (3,"Madhya Pradesh",1008),
 (3,"Madhya Pradesh",1009);
 
 
 
 
 /*
  * Displaying resultset Containing Zip Code, 
  * City Names and States ordered by State Name and City Name
  */
 SELECT zip_code,city_nm,state_nm
 FROM Zip_info
 INNER JOIN city_info
 ON Zip_info.city_id=city_info.city_id
 INNER JOIN state_info
 ON city_info.city_id=state_info.city_id
 ORDER BY State_nm,city_nm;
 
 
 
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
   city_nm VARCHAR(30),
   state_id INT
   
 );
 
 /*
  * Creating Table state_info
  */
 CREATE TABLE state_info
 (
   state_id INT PRIMARY KEY,
   state_nm VARCHAR(30)
   
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
 INSERT INTO city_info(city_nm,city_id,state_id)
 VALUES
 ("Ahmedabad",1001,1),
 ("Gandhinagar",1002,1),
 ("Vadodara",1003,1),
 ("Jaipur" ,1004,2),
 ("Bikaner",1005,2),
 ("Ajmer",1006,2),
 ("Gwalior",1007,3),
 ("Indore",1008,3),
 ("Bhopal" ,1009,3);
 
 /*
  * Inserting data in state_info
  */
 INSERT INTO state_info(state_id,state_nm)
 VALUES
 (1,"Gujarat"),
 (2,"Rajasthan"),
 (3,"Madhya Pradesh");
 
 
 
 
 /*
  * Displaying resultset Containing Zip Code, 
  * City Names and States ordered by State Name and City Name
  */
 SELECT zip_code,city_nm,state_nm
 FROM Zip_info
 INNER JOIN city_info
 ON Zip_info.city_id=city_info.city_id
 INNER JOIN state_info
 ON city_info.state_id=state_info.state_id
 ORDER BY State_nm,city_nm;
 
 
 
 

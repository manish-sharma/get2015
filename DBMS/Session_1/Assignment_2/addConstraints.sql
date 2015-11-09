/*Alter definitions of LIS table book_issue to 
provide the default constraints:*/


/*Set the default value of issue_dt as current date  */
ALTER TABLE book_issue 
MODIFY COLUMN issue_dt TIMESTAMP not NULL DEFAULT NOW();


/*Set the default value of due_dt as current date + 15 days */

DELIMITER //

CREATE TRIGGER Book
BEFORE INSERT ON book_issue
FOR EACH ROW 
BEGIN
SET NEW.Due_dt = now() + INTERVAL 15 day;
END; //

DELIMITER ;



/*
 * Remove Members table of the LIS database.
 */
 
 DROP TABLE members;
 
 
 
 /*
  * Creating the members table again.
  */
  
CREATE TABLE members( 
member_id INT NOT NULL PRIMARY KEY,
member_nm VARCHAR(20) , 
addressline1 VARCHAR(50) ,
addressline2 VARCHAR(50) ,
category VARCHAR(20)
);

  

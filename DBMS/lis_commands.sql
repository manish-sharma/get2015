/* this query is used to alter the book issue_date by default current date*/
ALTER TABLE BOOK_ISSUE MODIFY COLUMN issue_date  TIMESTAMP NOT NULL DEFAULT NOW();

/* this query is used to alter the book due date by 15 days more than the issue date */
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON book_issue FOR EACH ROW
BEGIN
 SET NEW.due_date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;

/* this query is used to delete the table  member*/
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE MEMBER;
SET FOREIGN_KEY_CHECKS=1;

/* this query is used to create the member table again*/

CREATE TABLE MEMBER(
member_id INT NOT NULL,
member_name VARCHAR(50),
address_line1 VARCHAR(50),
address_line2 VARCHAR(50),
category VARCHAR(50),
PRIMARY KEY(member_id));


UPDATE MEMBER SET address_line2 = 'jaipur';

UPDATE MEMBER SET address_line1 = 'EPIP-SITAPURA' WHERE category = 'f';



DELETE FROM TITLE WHERE pub_id = '1';


DELETE FROM PUBLISHER;


/*INSERT INTO PUBLISHER(pub_id,pub_name,city) VALUES (&pub,_id,'&pub,_name','&city');*/
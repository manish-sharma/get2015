-- to add a default date to column issue_date in book_issue table
ALTER TABLE `book_issue` MODIFY COLUMN `issue_date` TIMESTAMP NOT NULL DEFAULT NOW();


-- to create a trigger to add 15 days in issue_date for due_date column
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON book_issue FOR EACH ROW
BEGIN
   SET NEW.due_date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;


-- to drop members table so wu have to drop all the tables which has a reference of members table
DROP TRIGGER book_due_date;
DROP TABLE book_issue;
DROP TABLE book_return;
DROP TABLE members;


-- to show tables in library
SHOW TABLES IN library;


-- again create all the tables which we have deleted
CREATE TABLE members(
member_id int NOT NULL AUTO_INCREMENT,
member_name varchar(30),
addressline1 varchar(30),
addressline2 varchar(30),
category varchar(30),
PRIMARY KEY(member_id));


CREATE TABLE book_issue(
issue_date DATE NOT NULL,
accession_no int NOT NULL,
member_id int NOT NULL,
due_date DATE,
PRIMARY KEY(issue_date,accession_no,member_id),
FOREIGN KEY (accession_no) REFERENCES books(accession_no) ON DELETE CASCADE,
FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE); 


CREATE TABLE book_return(
return_date DATE NOT NULL,
accession_no int NOT NULL,
member_id int NOT NULL,
issue_date DATE,
PRIMARY KEY(return_date,accession_no,member_id),
FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE,
FOREIGN KEY (accession_no) REFERENCES books(accession_no) ON DELETE CASCADE);

SHOW TABLES IN library;


ALTER TABLE `book_issue` MODIFY COLUMN `issue_date` TIMESTAMP NOT NULL DEFAULT NOW();

-- again create trigger
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON book_issue FOR EACH ROW
BEGIN
   SET NEW.due_date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;


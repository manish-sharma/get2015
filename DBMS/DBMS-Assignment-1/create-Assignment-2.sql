
/* Creating Databse*/
CREATE DATABASE LIS;

use LIS;

/*Creating member table */
CREATE TABLE member(
   member_id VARCHAR(100),
   member_name VARCHAR(100),
   address1 VARCHAR(100),
   address2 VARCHAR(100),
   category VARCHAR(100),
   PRIMARY KEY(member_id)
   );

/*Creating books table */
CREATE TABLE books(
  accession_no INT,
  title_id VARCHAR(100),
  purchase_date DATE,
  price DOUBLE,
  status VARCHAR(100),
  PRIMARY KEY(accession_no)
  );

/*Creating book_issue table */
CREATE TABLE book_issue(
   issue_date DATE,
   accession_no INT ,
   member_id VARCHAR(100),
   due_date DATE NOT NULL,
   PRIMARY KEY(issue_date,accession_no,member_id), 
   FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
   FOREIGN KEY(member_id) REFERENCES member(member_id) ON DELETE CASCADE ON UPDATE CASCADE
   );

/*Creating subjects table */
CREATE TABLE subjects(
   subject_id VARCHAR(100),
   subject_name VARCHAR(100),
   PRIMARY KEY(subject_id)
   );

/*Creating publishers table */
CREATE TABLE publishers(
   publisher_id VARCHAR(100),
   publisher_name VARCHAR(100),
   PRIMARY KEY(publisher_id)
   );

/*Creating book_return table */
CREATE TABLE book_return(
   return_date DATE,
   accession_no INT ,
   member_id VARCHAR(100) ,
   issue_date DATE NOT NULL,
   PRIMARY KEY(return_date,accession_no,member_id), 
   FOREIGN KEY(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
   FOREIGN KEY(member_id) REFERENCES member(member_id) ON DELETE CASCADE ON UPDATE CASCADE
   );
   
/*Creating author table */   
CREATE TABLE authors(
   author_id VARCHAR(100),
   author_name VARCHAR(100),
   PRIMARY KEY(author_id)
   );

/*Creating titles table */
CREATE TABLE titles(
   title_id VARCHAR(100),
   title_name VARCHAR(100),
   subject_id VARCHAR(100),
   publisher_id VARCHAR(100) ,
   PRIMARY KEY(title_id), 
   FOREIGN KEY(subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE ON UPDATE CASCADE,
   FOREIGN KEY(publisher_id) REFERENCES publishers(publisher_id) ON DELETE CASCADE ON UPDATE CASCADE
   );

/*Creating title_author table */
CREATE TABLE title_author(
   title_id VARCHAR(100),
   author_id VARCHAR(100),
   PRIMARY KEY(title_id,author_id), 
   FOREIGN KEY(title_id) REFERENCES titles(title_id) ON DELETE CASCADE ON UPDATE CASCADE,
   FOREIGN KEY(author_id) REFERENCES authors(author_id) ON DELETE CASCADE ON UPDATE CASCADE
);

/*Show all tables of database */
SHOW tables;

/*Alter issue_date field by default value current date */
ALTER TABLE book_issue MODIFY COLUMN issue_date TIMESTAMP not NULL DEFAULT NOW();

/*Alter due_date field by default value (current date+15) */

/*Alter issue_date field by default value (current date+15) using Adddate function*/
/*ALTER TABLE book_issue MODIFY COLUMN due_date TIMESTAMP not NULL DEFAULT Adddate('2015-09-23', interval 15 day);*/


/*Alter issue_date field by default value (current date+15) by using trigger*/
DELIMITER //

CREATE TRIGGER book
BEFORE INSERT ON book_issue
FOR EACH ROW 
BEGIN
SET NEW.due_date = now() + INTERVAL 15 day;
END; //

DELIMITER ;

/*Deleting table member */
DROP TABLE member;

/*Again creating table member */
CREATE TABLE member(
   member_id VARCHAR(100),
   member_name VARCHAR(100),
   address1 VARCHAR(100),
   address2 VARCHAR(100),
   category VARCHAR(100),
   PRIMARY KEY(member_id)
   );
   
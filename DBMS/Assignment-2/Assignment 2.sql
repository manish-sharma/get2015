CREATE DATABASE LIS;

DROP DATABASE LIS;

USE LIS;

CREATE TABLE members(member_id VARCHAR(100) NOT NULL,
member_nm VARCHAR(100),addressline1 VARCHAR(100),
addressline2 VARCHAR(100),
category VARCHAR(100),PRIMARY KEY(member_id));


CREATE TABLE subjects(subject_id VARCHAR(100),
subject_nm VARCHAR(100),PRIMARY KEY(subject_id));

CREATE TABLE authors(author_id VARCHAR(100),
author_nm VARCHAR(100),PRIMARY KEY(author_id));

CREATE TABLE publishers(publishers_id VARCHAR(100),publisher_nm 
VARCHAR(100),PRIMARY KEY(publishers_id));

CREATE TABLE book_issue(issue_dt TIMESTAMP,accession_no VARCHAR(100),member_id VARCHAR(100),
due_dt TIMESTAMP,PRIMARY KEY(issue_dt,accession_no,member_id),
CONSTRAINT member_id_1 FOREIGN KEY(member_id) 
REFERENCES members(member_id) ON DELETE CASCADE,
CONSTRAINT accession_no_1 FOREIGN KEY(accession_no) 
REFERENCES books(accession_no) ON DELETE CASCADE);

CREATE TABLE books(accession_no VARCHAR(100),title_id VARCHAR(100),
purchase_dt VARCHAR(100),
price INT,status VARCHAR(100),PRIMARY KEY(accession_no),FOREIGN KEY(title_id)
REFERENCES titles(title_id));

CREATE TABLE titles(title_id VARCHAR(100),title_nm VARCHAR(500),
subject_id VARCHAR(100),publishers_id VARCHAR(100),
PRIMARY KEY(title_id),FOREIGN KEY(publishers_id) 
REFERENCES publishers(publishers_id) ON DELETE CASCADE,FOREIGN KEY(subject_id) 
REFERENCES subjects(subject_id) ON DELETE CASCADE);


CREATE TABLE title_author(title_id VARCHAR(100),author_id VARCHAR(100),
Primary Key(title_id,author_id),CONSTRAINT title_id_1 FOREIGN KEY(title_id) 
REFERENCES titles(title_id) ON DELETE CASCADE,
CONSTRAINT author_id_1 FOREIGN KEY(author_id) 
REFERENCES authors(author_id) ON DELETE CASCADE);

CREATE TABLE book_return(return_dt TIMESTAMP,accession_no 
VARCHAR(100),member_id VARCHAR(100),issue_dt TIMESTAMP,
PRIMARY KEY(return_dt,accession_no,member_id),
CONSTRAINT acccession_no_2 FOREIGN KEY(accession_no) 
REFERENCES books(accession_no),CONSTRAINT member_id_2 
FOREIGN KEY(member_id) REFERENCES members(member_id));


SHOW TABLES;

ALTER TABLE book_issue MODIFY COLUMN issue_dt TIMESTAMP NOT NULL DEFAULT NOW();


DELIMITER //

CREATE TRIGGER book
BEFORE INSERT ON book_issue 
FOR EACH ROW 
BEGIN
SET NEW.due_dt = NOW() + INTERVAL 15 day;
END; //

DELIMITER ;

ALTER TABLE book_issue DROP FOREIGN KEY member_id_1;
ALTER TABLE book_return DROP FOREIGN KEY member_id_2;

DROP TABLE members;

CREATE TABLE members(member_id VARCHAR(100) NOT NULL,
member_nm VARCHAR(100),addressline1 VARCHAR(100),addressline2 VARCHAR(100),
category VARCHAR(100),PRIMARY KEY(member_id));

ALTER TABLE book_issue ADD CONSTRAINT member_id_1 FOREIGN KEY(member_id) 
REFERENCES members(member_id) ON DELETE CASCADE;

ALTER TABLE book_return ADD CONSTRAINT member_id_2 FOREIGN KEY(member_id) 
REFERENCES members(member_id) ON DELETE CASCADE;


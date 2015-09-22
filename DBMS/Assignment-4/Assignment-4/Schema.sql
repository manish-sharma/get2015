-- Query to create database --
CREATE DATABASE libraryInformationSystem;

-- Query to use database -- 
USE libraryInformationSystem;

-- Creating table memebrs having member_id as primary key -- 
CREATE TABLE members(member_id VARCHAR(100) NOT NULL,
member_nm VARCHAR(100),addressline1 VARCHAR(100),
addressline2 VARCHAR(100),
category VARCHAR(100),PRIMARY KEY(member_id));

-- Creating table subject having subject_id as primary key -- 
CREATE TABLE subjects(subject_id VARCHAR(100),
subject_nm VARCHAR(100),PRIMARY KEY(subject_id));

-- Creating table authors having primary key author_id -- 
CREATE TABLE authors(author_id VARCHAR(100),
author_nm VARCHAR(100),PRIMARY KEY(author_id));

-- Creating table publishers having primary key publisher_id -- 
CREATE TABLE publishers(publishers_id VARCHAR(100),publisher_nm 
VARCHAR(100),PRIMARY KEY(publishers_id));

-- Creating table titles having title_id as primary key and publishers_id and subject_id as primary key -- 
CREATE TABLE titles(title_id VARCHAR(100),title_nm VARCHAR(500),
subject_id VARCHAR(100),publishers_id VARCHAR(100),
PRIMARY KEY(title_id),FOREIGN KEY(publishers_id) 
REFERENCES publishers(publishers_id) ON DELETE CASCADE,FOREIGN KEY(subject_id) 
REFERENCES subjects(subject_id) ON DELETE CASCADE);

-- Creating table books having accession _id as primary key and title_id as foreign key -- 
CREATE TABLE books(accession_no VARCHAR(100),title_id VARCHAR(100),
purchase_dt VARCHAR(100),
price INT,status VARCHAR(100),PRIMARY KEY(accession_no),FOREIGN KEY(title_id)
REFERENCES titles(title_id));

-- Creating table book_issue having composite primary key of issue_Dt,accession_no,member_id and member_id and accession_no as foreign key
CREATE TABLE book_issue(issue_dt TIMESTAMP,accession_no VARCHAR(100),member_id VARCHAR(100),
due_dt TIMESTAMP,PRIMARY KEY(issue_dt,accession_no,member_id),
CONSTRAINT member_id_1 FOREIGN KEY(member_id) 
REFERENCES members(member_id) ON DELETE CASCADE,
CONSTRAINT accession_no_1 FOREIGN KEY(accession_no) 
REFERENCES books(accession_no) ON DELETE CASCADE);

-- Creating title_author where composite primary key is title _id and author_is as well as foreign key --
CREATE TABLE title_author(title_id VARCHAR(100),author_id VARCHAR(100),
Primary Key(title_id,author_id),CONSTRAINT title_id_1 FOREIGN KEY(title_id) 
REFERENCES titles(title_id) ON DELETE CASCADE,
CONSTRAINT author_id_1 FOREIGN KEY(author_id) 
REFERENCES authors(author_id) ON DELETE CASCADE);

-- Creating book_retrun where return_dt,accession_no,member_id is composite primary key whereas accession_no and member_id is primary key -- 
CREATE TABLE book_return(return_dt TIMESTAMP,accession_no 
VARCHAR(100),member_id VARCHAR(100),issue_dt TIMESTAMP,
PRIMARY KEY(return_dt,accession_no,member_id),
CONSTRAINT acccession_no_2 FOREIGN KEY(accession_no) 
REFERENCES books(accession_no),CONSTRAINT member_id_2 
FOREIGN KEY(member_id) REFERENCES members(member_id));

-- Query to shoe table -- 
SHOW TABLES;

-- Query to insert current time stamp in issue_dt -- 
ALTER TABLE book_issue MODIFY COLUMN issue_dt TIMESTAMP NOT NULL DEFAULT NOW();

-- Trigger to insert due_dt 2 months from issue date -- 
DELIMITER //

CREATE TRIGGER book
BEFORE INSERT ON book_issue 
FOR EACH ROW 
BEGIN
SET NEW.due_dt = NOW() + INTERVAL 60 day;
END; //

DELIMITER ;
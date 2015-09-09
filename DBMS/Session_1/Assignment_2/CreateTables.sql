/*Here we are creating all tables of Library Information System*/

CREATE DATABASE library;

USE library;



/* Creating Table members*/
 
CREATE TABLE members( 
member_id INT NOT NULL PRIMARY KEY,
member_nm VARCHAR(20) , 
addressline1 VARCHAR(50) ,
addressline2 VARCHAR(50) ,
category VARCHAR(20)
);

DESCRIBE members;



/* Creating Table book_issue*/

 CREATE TABLE book_issue(
 issue_dt DATE NOT NULL ,
 accession_no INT,
 member_id INT,
 due_dt DATE,
 PRIMARY KEY (issue_dt,accession_no,member_id)
 );
 
 DESCRIBE book_issue;
 
 
 /* Creating Table books*/
 
 CREATE TABLE books(
 accession_no INT NOT NULL PRIMARY KEY,
 title_id INT,
 purchase_dt DATE,
 price INT,
 status VARCHAR(20)
 );
 
 DESCRIBE books;
 
 
 
 /* Creating Table titles*/
 
CREATE TABLE titles(
title_id INT NOT NULL PRIMARY KEY,
title_nm VARCHAR(50),
subject_id INT,
publisher_id INT
);

DESCRIBE titles;

/* Creating Table titles_author*/

 CREATE TABLE title_author(
 title_id INT,
 author_id INT,
 PRIMARY KEY(title_id,author_id)
 );
 
 DESCRIBE title_author;
 
 
 /* Creating Table book_return*/
 
 CREATE TABLE book_return(
return_dt DATE,
accession_no INT,
member_id INT,
issue_dt DATE,
PRIMARY KEY (return_dt,accession_no,member_id)
);

DESCRIBE book_return;


/* Creating Table sunjects*/

 CREATE TABLE subjects(
 subject_id INT NOT NULL PRIMARY KEY,
 subject_nm VARCHAR(30)
 );
 
 DESCRIBE subjects;
 
 /* Creating Table publishers*/

 CREATE TABLE publishers(
 publisher_id INT NOT NULL PRIMARY KEY,
 publisher_nm VARCHAR(50)
 );
 
 DESCRIBE publishers;
 
 
 /* Creating Table authors*/
 
 CREATE TABLE authors(
 author_id INT NOT NULL PRIMARY KEY,
 author_nm VARCHAR(50)
 );
 
 DESCRIBE authors;
 
 
 
 /*ITt will display all the table names present in LIS.*/
 
 SHOW TABLES;

CREATE DATABASE LIS;
USE LIS;
CREATE TABLE authors (author_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
author_lname VARCHAR(10),
author_fname VARCHAR(10) NOT NULL,
address VARCHAR(50),
city VARCHAR(30) NOT NULL,
state VARCHAR(30) );

CREATE TABLE publishers (publisher_id INTEGER PRIMARY KEY AUTO_INCREMENT,
publisher_name VARCHAR(50) NOT NULL,
city VARCHAR(30) NOT NULL);

CREATE TABLE subjects (subject_id INTEGER PRIMARY KEY AUTO_INCREMENT,
subject_name VARCHAR(30));

CREATE TABLE titles (title_id INTEGER PRIMARY KEY AUTO_INCREMENT,
title_name VARCHAR(30),
publisher_id INTEGER ,
subject_id INTEGER,
FOREIGN KEY (subject_id) REFERENCES subjects (subject_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (publisher_id) REFERENCES publishers (publisher_id) ON DELETE CASCADE ON UPDATE CASCADE);

CREATE TABLE title_author(author_id INTEGER,
title_id INTEGER, 
FOREIGN KEY (title_id) REFERENCES titles (title_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (author_id) REFERENCES authors (author_id) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY(author_id,title_id));

CREATE TABLE books (accession_no INTEGER PRIMARY KEY,
title_id INTEGER,
FOREIGN KEY (title_id) REFERENCES titles (title_id) ON DELETE CASCADE ON UPDATE CASCADE,
purchase_date DATE,
price INTEGER,
status VARCHAR(20)
);

CREATE TABLE members (member_id INTEGER PRIMARY KEY,
member_name VARCHAR(30),
address_line1 VARCHAR(50),
address_line2 VARCHAR(50),
category VARCHAR(30));

CREATE TABLE book_issue(issue_date DATE NOT NULL,
accession_no INTEGER,
member_id INTEGER,
constraint book_issue_1 FOREIGN KEY (accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
constraint book_issue_2 FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
due_date DATE,
PRIMARY KEY(issue_date,accession_no,member_id));

CREATE TABLE book_return(return_date DATE NOT NULL,
accession_no INTEGER,
member_id INTEGER,
constraint book_return_1 FOREIGN KEY (accession_no) REFERENCES books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
constraint book_return_2 FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE,
issue_date DATE NOT NULL,
PRIMARY KEY(return_date,accession_no,member_id));

SHOW TABLES;

SELECT * FROM authors;
SELECT * FROM book_issue;
SELECT * FROM book_return;
SELECT * FROM books;
SELECT * FROM members;
SELECT * FROM publishers;
SELECT * FROM subjects;
SELECT * FROM title_author;
SELECT * FROM titles;
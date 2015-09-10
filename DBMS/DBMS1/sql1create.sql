-- Create a database named library
CREATE DATABASE library;
USE library;

-- create a member table
CREATE TABLE members(
member_id int NOT NULL AUTO_INCREMENT,
member_name varchar(30),
addressline1 varchar(30),
addressline2 varchar(30),
category varchar(30),
PRIMARY KEY(member_id)
);

-- create a subjects table
CREATE TABLE subjects(
subject_id int NOT NULL AUTO_INCREMENT,
subject_name varchar(30),
PRIMARY KEY(subject_id)
);

-- create a publisher table
CREATE TABLE publisher(
publisher_id INT NOT NULL AUTO_INCREMENT,
publisher_name varchar(30),
PRIMARY KEY(publisher_id) 
);

-- create a authors table
CREATE TABLE authors(
author_id int NOT NULL AUTO_INCREMENT,
author_name varchar(30),
PRIMARY KEY(author_id)
);

-- create a titles table
CREATE TABLE titles(
title_id int NOT NULL AUTO_INCREMENT,
title_name varchar(30),
subject_id int,
publisher_id int,
PRIMARY KEY(title_id),
FOREIGN KEY (subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE,
FOREIGN KEY (publisher_id) REFERENCES publisher(publisher_id) ON DELETE CASCADE
);


-- create a books table
CREATE TABLE books(
accession_no int NOT NULL AUTO_INCREMENT,
title_id int,
purchase_date DATE,
price int,
status varchar(30),
PRIMARY KEY(accession_no),
FOREIGN KEY (title_id) REFERENCES titles(title_id) ON DELETE CASCADE);


-- create a book_issue table
CREATE TABLE book_issue(
issue_date DATE NOT NULL,
accession_no int NOT NULL,
member_id int NOT NULL,
due_date DATE,
PRIMARY KEY(issue_date,accession_no,member_id),
FOREIGN KEY (accession_no) REFERENCES books(accession_no) ON DELETE CASCADE,
FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE); 


-- create a book_return table
CREATE TABLE book_return(
return_date DATE NOT NULL,
accession_no int NOT NULL,
member_id int NOT NULL,
issue_date DATE,
PRIMARY KEY(return_date,accession_no,member_id),
FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE,
FOREIGN KEY (accession_no) REFERENCES books(accession_no) ON DELETE CASCADE);


-- create a title_author table
CREATE TABLE title_author(
title_id int ,
author_id int,
PRIMARY KEY(title_id,author_id),
FOREIGN KEY (author_id) REFERENCES authors(author_id) ON DELETE CASCADE,
FOREIGN KEY (title_id) REFERENCES titles(title_id) ON DELETE CASCADE
);


USE library;

-- to show all the table name
SHOW TABLES;







CREATE DATABASE library;
USE library;

CREATE TABLE members(
member_id int NOT NULL AUTO_INCREMENT,
member_name varchar(30),
addressline1 varchar(30),
addressline2 varchar(30),
category varchar(30),
PRIMARY KEY(member_id)
);

CREATE TABLE subjects(
subject_id int NOT NULL AUTO_INCREMENT,
subject_name varchar(30),
PRIMARY KEY(subject_id)
);


CREATE TABLE publisher(
publisher_id INT NOT NULL AUTO_INCREMENT,
publisher_name varchar(30),
PRIMARY KEY(publisher_id) 
);


CREATE TABLE authors(
author_id int NOT NULL AUTO_INCREMENT,
author_name varchar(30),
PRIMARY KEY(author_id)
);

CREATE TABLE titles(
title_id int NOT NULL AUTO_INCREMENT,
title_name varchar(30),
subject_id int,
publisher_id int,
PRIMARY KEY(title_id),
FOREIGN KEY (subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE,
FOREIGN KEY (publisher_id) REFERENCES publisher(publisher_id) ON DELETE CASCADE
);

CREATE TABLE books(
accession_no int NOT NULL AUTO_INCREMENT,
title_id int,
purchase_date DATE,
price int,
status varchar(30),
PRIMARY KEY(accession_no),
FOREIGN KEY (title_id) REFERENCES titles(title_id) ON DELETE CASCADE);

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



CREATE TABLE title_author(
title_id int ,
author_id int,
PRIMARY KEY(title_id,author_id),
FOREIGN KEY (author_id) REFERENCES authors(author_id) ON DELETE CASCADE,
FOREIGN KEY (title_id) REFERENCES titles(title_id) ON DELETE CASCADE
);


USE library;


SHOW TABLES;


ALTER TABLE `book_issue` MODIFY COLUMN `issue_date` TIMESTAMP NOT NULL DEFAULT NOW();

DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON book_issue FOR EACH ROW
BEGIN
   SET NEW.due_date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;


DROP TRIGGER book_due_date;
DROP TABLE book_issue;
DROP TABLE book_return;
DROP TABLE members;


SHOW TABLES IN library;



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


DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON book_issue FOR EACH ROW
BEGIN
   SET NEW.due_date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;



INSERT INTO members(member_name,addressline1,addressline2,category)VALUES('AVINASH BAROLA','AJMER','RAJ','F');
INSERT INTO members(member_name,addressline1,addressline2,category)VALUES('ASHOK BAROLA','PRTAPNAGAR','RAJ','M');
INSERT INTO members(member_name,addressline1,addressline2,category)VALUES('ROHIT JAIN','PRTAPNAGAR','ASAM','M');
INSERT INTO members(member_name,addressline1,addressline2,category)VALUES('BABALU','SANGANER','RAJ','F');

SELECT * FROM members;


INSERT INTO publisher(publisher_id,publisher_name)VALUES(1001,'ROV');
INSERT INTO publisher(publisher_name)VALUES('NEGI');
INSERT INTO publisher(publisher_name)VALUES('SHARMA');
INSERT INTO publisher(publisher_name)VALUES('SHARMA-PATEL');

SELECT * FROM publisher;

INSERT INTO subjects(subject_id,subject_name)VALUES(111,'SOCAIL');
INSERT INTO subjects(subject_name)VALUES('BIO');
INSERT INTO subjects(subject_name)VALUES('Physics');
INSERT INTO subjects(subject_name)VALUES('Soil');

SELECT * FROM subjects;

INSERT INTO authors(author_id,author_name)VALUES(10001,'A.K.ROV');
INSERT INTO authors(author_name)VALUES('K.K.ROV');
INSERT INTO authors(author_name)VALUES('L.K.MISHRA');
INSERT INTO authors(author_name)VALUES('ARUN SHARMA');

SELECT * FROM authors;

INSERT INTO titles(title_id,title_name,subject_id,publisher_id)VALUES(11,'Horror',111,1001);
INSERT INTO titles(title_name,subject_id,publisher_id)VALUES('Horror',112,1002);
INSERT INTO titles(title_name,subject_id,publisher_id)VALUES('Social',113,1001);
INSERT INTO titles(title_name,subject_id,publisher_id)VALUES('Social',114,1004);

SELECT * FROM titles;

INSERT INTO books(accession_no,title_id,purchase_date,price,status)VALUES(101,12,'2004-06-04',1000,'AVAILABEL');
INSERT INTO books(title_id,purchase_date,price,status)VALUES(12,'2009-06-17',1000,'NOT AVAILABEL');
INSERT INTO books(title_id,purchase_date,price,status)VALUES(14,'2002-07-04',1000,'AVAILABEL');
INSERT INTO books(title_id,purchase_date,price,status)VALUES(11,'2007-01-24',1000,'NOT AVAILABEL');

SELECT * FROM books;

INSERT INTO book_issue(accession_no,member_id)VALUES(101,2);
INSERT INTO book_issue(accession_no,member_id)VALUES(103,3);
INSERT INTO book_issue(accession_no,member_id)VALUES(102,4);
INSERT INTO book_issue(accession_no,member_id)VALUES(102,1);


SELECT * FROM book_issue;

INSERT INTO book_return(return_date,accession_no,member_id,issue_date)VALUES('2015-09-23',101,2,'2015-09-08');
INSERT INTO book_return(return_date,accession_no,member_id,issue_date)VALUES('2015-09-23',103,1,'2015-09-08');
INSERT INTO book_return(return_date,accession_no,member_id,issue_date)VALUES('2015-09-23',102,4,'2015-09-08');

SELECT * FROM book_return;

INSERT INTO title_author(title_id,author_id)VALUES(11,10001);
INSERT INTO title_author(title_id,author_id)VALUES(12,10002);
INSERT INTO title_author(title_id,author_id)VALUES(13,10002);
INSERT INTO title_author(title_id,author_id)VALUES(14,10004);

SELECT * FROM title_author;

UPDATE members SET addressline2="JAIPUR";

SELECT * FROM members;

UPDATE members SET addressline1="EPIP Sitapura" where category='F';

SELECT * FROM members;

DELETE FROM publisher;

SELECT * FROM publisher;

SET @publication1:='SHARMA';
SET @publication2:='JAIN';
SET @publication3:='MITTAL';
SET @publication4:='PANDIT'; 

SET @pblisherID1:=1001;
SET @pblisherID2:=1002;
SET @pblisherID3:=1003;
SET @pblisherID4:=1004;

INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID1,@pblisherID1);
INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID2,@pblisherID2);
INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID3,@pblisherID3);
INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID4,@pblisherID4);

SELECT * FROM publisher;
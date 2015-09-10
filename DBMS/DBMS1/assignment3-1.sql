-- in this assignment I insert values in all tables
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

INSERT INTO book_return(accession_no,member_id,issue_date)VALUES(101,2,'2015-09-08');
INSERT INTO book_return(accession_no,member_id,issue_date)VALUES(103,1,'2015-09-08');
INSERT INTO book_return(accession_no,member_id,issue_date)VALUES(102,4,'2015-09-08');

SELECT * FROM book_return;

INSERT INTO title_author(title_id,author_id)VALUES(11,10001);
INSERT INTO title_author(title_id,author_id)VALUES(12,10002);
INSERT INTO title_author(title_id,author_id)VALUES(13,10002);
INSERT INTO title_author(title_id,author_id)VALUES(14,10004);

SELECT * FROM title_author;
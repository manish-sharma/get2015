use LIS;

/*Inserting values in table member*/
INSERT INTO member VALUES('m1','SUMAN','GOPAL PURA','JAIPUR','F');
INSERT INTO member VALUES('m2','NIDHI','GANDHI NAGAR','KARAULI','F');
INSERT INTO member VALUES('m3','RICHA','GOPAL PURA','SIKER','F');
INSERT INTO member VALUES('m4','CHETALI','SITAPURA','UDAIPUR','F');
INSERT INTO member VALUES('m5','NEHA','LAKSHMI MANDIR','AJMER','S');
INSERT INTO member VALUES('m6','ANJI','JUHU','MUMBAI','F');
INSERT INTO member VALUES('m7','MANISH','PRATAP NAGAR','JAIPUR','S');

/*Inserting values in table books*/
INSERT INTO books VALUES(1234,'1','2005-06-20',23.5,'ISSUED');
INSERT INTO books VALUES(2235,'2','2005-06-20',21.5,'ISSUED');
INSERT INTO books VALUES(3236,'3','2005-06-20',30.5,'ISSUED');
INSERT INTO books VALUES(4237,'1','2005-06-20',20.5,'ISSUED');
INSERT INTO books VALUES(5238,'4','2005-06-20',23.5,'SSUED');
INSERT INTO books VALUES(61239,'5','2005-06-20',40.5,'ISSUED');

/*Inserting values in table book_issue */
/*Inserting mannualy*/
/*
INSERT INTO book_issue VALUES (NOW(),1234,'m1','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),2235,'m1','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),3236,'m2','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),4237,'m2','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),5238,'m1','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),61239,'m1','2015-09-23');
*/

/*Inserting by trigger in book_issue*/
INSERT INTO book_issue (accession_no,member_id) VALUES (1239,'m1');
INSERT INTO book_issue (accession_no,member_id) VALUES (2235,'m2');
INSERT INTO book_issue (accession_no,member_id) VALUES (3236,'m3');
INSERT INTO book_issue (accession_no,member_id) VALUES (4237,'m4');
INSERT INTO book_issue (accession_no,member_id) VALUES (5238,'m5');
INSERT INTO book_issue (accession_no,member_id) VALUES (61239,'m6');
INSERT INTO book_issue (accession_no,member_id) VALUES (61239,'m1');


/*Inserting values in table subjects*/
INSERT INTO subjects VALUES ('101','JAVA');
INSERT INTO subjects VALUES ('102','C');
INSERT INTO subjects VALUES ('103','C++');
INSERT INTO subjects VALUES ('104','DS');
INSERT INTO subjects VALUES ('105','DBMS');

/*Inserting values in table publishers*/
INSERT INTO publishers VALUES ('201','Macmillan Publishers');
INSERT INTO publishers VALUES ('202','Penguin Books');
INSERT INTO publishers VALUES ('203','HarperCollins Publishers');
INSERT INTO publishers VALUES ('204','Wiley Publishers');
INSERT INTO publishers VALUES ('205','Random House');

/*Inserting values in table book_return*/
INSERT INTO book_return VALUES ('2015-12-29',1234,'m1',NOW());
INSERT INTO book_return VALUES ('2015-12-28',2235,'m2',NOW());
INSERT INTO book_return VALUES ('2015-10-08',3236,'m3',NOW());
INSERT INTO book_return VALUES ('2015-12-22',4237,'m4',NOW());
INSERT INTO book_return VALUES ('2015-09-28',5238,'m5',NOW());
INSERT INTO book_return VALUES ('2015-09-18',61239,'m6',NOW());
INSERT INTO book_return VALUES ('2015-12-30',61239,'m1',NOW());

/*Inserting values in table author*/
INSERT INTO authors VALUES ('301','N. prakash');
INSERT INTO authors VALUES ('302','G.K. GUPTA');
INSERT INTO authors VALUES ('303','JOE');
INSERT INTO authors VALUES ('304','S. SAMATHI');
INSERT INTO authors VALUES ('305','P.N. YADAV');

/*Inserting values in table titles*/
INSERT INTO titles VALUES('1','JAVA BOOK','101','201');
INSERT INTO titles VALUES('2','C ','102','202');
INSERT INTO titles VALUES('3','C++ ','103','203');
INSERT INTO titles VALUES('4','DS','104','204');
INSERT INTO titles VALUES('5','DBMS','105','205');

/*Inserting values in table title_author*/
INSERT INTO title_author VALUES ('1','301');
INSERT INTO title_author VALUES ('2','302');
INSERT INTO title_author VALUES ('3','303');
INSERT INTO title_author VALUES ('4','304');
INSERT INTO title_author VALUES ('5','305');

/*Update address2 field of table member to jaipur */
UPDATE member SET address2='JAIPUR';

/*Update address1 field of table member with where clause */
UPDATE member SET address1='EPIP, SITAPURA' WHERE category='F';

/*Insert the sample data back in Publishers table using substitution*/

/*creating copying data of publishers and title table to temporary tables */
CREATE TEMPORARY TABLE tempPublisher ENGINE=MEMORY  AS (SELECT * FROM publishers);
CREATE TEMPORARY TABLE tempTitle ENGINE=MEMORY  AS (SELECT * FROM titles);

/*Delete rows from publishers */
DELETE FROM publishers;

/*copying data of temporary tables to  publishers and title table  */
INSERT INTO publishers SELECT * FROM tempPublisher;
INSERT INTO titles SELECT * FROM tempTitle;

/*Delete those rows of Titles table belonging to Publisher with publisher_id = '201'
 */
DELETE FROM titles WHERE publisher_id='201';

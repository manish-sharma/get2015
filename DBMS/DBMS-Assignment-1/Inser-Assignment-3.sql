use LIS;

/*Inserting values in table member*/
INSERT INTO member VALUES('m1','SUMAN','GOPAL PURA','JAIPUR','F');
INSERT INTO member VALUES('m2','NIDHI','GANDHI NAGAR','KARAULI','F');
INSERT INTO member VALUES('m3','RICHA','GOPAL PURA','SIKER','F');
INSERT INTO member VALUES('m4','CHETALI','SITAPURA','UDAIPUR','F');
INSERT INTO member VALUES('m5','NEHA','LAKSHMI MANDIR','AJMER','F');
INSERT INTO member VALUES('m6','ANJI','JUHU','MUMBAI','F');
INSERT INTO member VALUES('m7','MANISH','PRATAP NAGAR','JAIPUR','M');

/*Inserting values in table books*/
INSERT INTO books VALUES(1234,'JAVA','2005-06-20',23.5,'NOT ISSUED');
INSERT INTO books VALUES(2235,'C','2005-06-20',21.5,'NOT ISSUED');
INSERT INTO books VALUES(3236,'C++','2005-06-20',30.5,'NOT ISSUED');
INSERT INTO books VALUES(4237,'J2EE','2005-06-20',20.5,'NOT ISSUED');
INSERT INTO books VALUES(5238,'DS','2005-06-20',23.5,'NOT SSUED');
INSERT INTO books VALUES(61239,'DBMS','2005-06-20',40.5,'NOT ISSUED');

/*Inserting values in table book_issue*/
INSERT INTO book_issue VALUES (NOW(),1234,'m1','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),2235,'m1','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),3236,'m2','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),4237,'m2','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),5238,'m1','2015-09-23');
INSERT INTO book_issue VALUES (NOW(),61239,'m1','2015-09-23');

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
INSERT INTO book_return VALUES (NOW(),1234,'m1','2015-09-08');
INSERT INTO book_return VALUES (NOW(),2235,'m1','2015-09-08');
INSERT INTO book_return VALUES (NOW(),3236,'m2','2015-09-08');
INSERT INTO book_return VALUES (NOW(),4237,'m2','2015-09-08');
INSERT INTO book_return VALUES (NOW(),5238,'m1','2015-09-08');
INSERT INTO book_return VALUES (NOW(),61239,'m1','2015-09-08');

/*Inserting values in table author*/
INSERT INTO authors VALUES ('301','N. prakash');
INSERT INTO authors VALUES ('302','G.K. GUPTA');
INSERT INTO authors VALUES ('303','JOE');
INSERT INTO authors VALUES ('304','S. SAMATHI');
INSERT INTO authors VALUES ('305','P.N. YADAV');

/*Inserting values in table titles*/
INSERT INTO titles VALUES('JAVA','JAVA BOOK','101','201');
INSERT INTO titles VALUES('C','C ','102','202');
INSERT INTO titles VALUES('C++','C++ ','103','203');
INSERT INTO titles VALUES('DS','DS','104','204');
INSERT INTO titles VALUES('DBMS','DBMS','105','205');

/*Inserting values in table title_author*/
INSERT INTO title_author VALUES ('JAVA','301');
INSERT INTO title_author VALUES ('C','302');
INSERT INTO title_author VALUES ('C++','303');
INSERT INTO title_author VALUES ('DS','304');
INSERT INTO title_author VALUES ('DBMS','305');

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

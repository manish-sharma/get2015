--select database
USE lib_info_sys;
 --set auto increment 
 ALTER TABLE members AUTO_INCREMENT=1;
 -- insert into members table
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ( 1 ,'Ramesh' , 'Gole Ka Mandir' , 'Gwalior' , 'GENERAL' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Bhupendra' , 'Ahnuman square' , 'Indore' , 'OBC' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Deepak' , 'Station raod' , 'Bangalore' , 'SC' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Rakesh' , 'Palasia' , 'Indore' , 'GENERAL' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Garvita' , 'Snaganer' , 'Jaipur' , 'ST' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Divya' , 'Focus' , 'Dehli' , 'OBC' );
 
 
 -- insert into books table
 INSERT INTO books VALUES ( 'SC23435', 1 , '2014-2-8' , 200, 'Y');
 INSERT INTO books VALUES ( 'SC67463', 3 , '2015-4-23' , 400, 'Y');
 INSERT INTO books VALUES ( 'SC23235', 4 , '2015-2-1' , 600, 'Y');
 INSERT INTO books VALUES ( 'SC67555', 2 , '2013-1-31' , 230, 'Y');
 INSERT INTO books VALUES ( 'SC99999', 5 , '2015-9-11' , 450, 'Y');
 INSERT INTO books VALUES ( 'SC12121', 2 , '2014-12-28' , 290, 'Y');
 INSERT INTO books VALUES ( 'SC76399', 3 , '2015-2-18' , 100, 'Y');
 
 
 --insert into authors table 
 INSERT INTO authors values ( 1 , 'Shivnandan' );
 INSERT INTO authors values ( 2 , 'Kavita Bala' );
 INSERT INTO authors values ( 4 , 'Conway' );
 INSERT INTO authors values ( 5 , 'David' );
 INSERT INTO authors values ( 6 , 'Gries' );
 INSERT INTO authors values ( 7 , 'Conway' );
 INSERT INTO authors values ( 8 , 'DK jain' );
 INSERT INTO authors values ( 9 , 'Kundar' );
 INSERT INTO authors values ( 10 , 'Vedant' );
 
 
 --insert into publishers table  
 INSERT INTO publishers values ( 1 , 'Jai prakashan' );
 INSERT INTO publishers values ( 2 , 'Shivani prakshan' );
 INSERT INTO publishers values ( 3 , 'Soni Prakashan' );
 INSERT INTO publishers values ( 4 , 'Keshav publikeshion' );
 
 
 --insert into subjects table 
 INSERT INTO subjects values ( 1 , 'DBMS' );
 INSERT INTO subjects values ( 2 , 'DS' );
 INSERT INTO subjects values ( 3 , 'TOC' );
 INSERT INTO subjects values ( 4 , 'OS' );
 INSERT INTO subjects values ( 5 , 'Compiler' );
 INSERT INTO subjects values ( 6 , 'MATH1' );
 INSERT INTO subjects values ( 7 , 'JAVA' );
 INSERT INTO subjects values ( 8 , 'CPP' );
 
 
 --insert into titels table 
 INSERT INTO titles VALUES(1,'Data Commun.', 5,1);
 INSERT INTO titles VALUES(2,'Data archesim.', 3,3);
 INSERT INTO titles VALUES(3,'Semicond.', 2,3);
 INSERT INTO titles VALUES(4,'Architectre of com.', 3,2);
 INSERT INTO titles VALUES(5,'Machine thoery', 2,1);
 INSERT INTO titles VALUES(6,'Thoery of auto.',2,2);
 INSERT INTO titles VALUES(7,'Auta meta.', 3,4);
 

 --insert into title_author table 
 INSERT INTO title_author values ( 5, 7 );
 INSERT INTO title_author values ( 6, 4 );
 INSERT INTO title_author values ( 7, 1 );
 INSERT INTO title_author values ( 2, 10 );
 INSERT INTO title_author values ( 6, 6 );
 INSERT INTO title_author values ( 3, 2 );
 INSERT INTO title_author values ( 4, 10);
 INSERT INTO title_author values ( 2, 5 );
 INSERT INTO title_author values ( 3, 8 );
 INSERT INTO title_author values ( 4, 9 );
 
 
 --insert into book_issue table
 INSERT INTO book_issue VALUES ('2015-8-29','SC23435',2,'2015-9-21'); 
 INSERT INTO book_issue VALUES ('2015-8-29','SC67463',2,'2015-11-29'); 
 INSERT INTO book_issue VALUES ('2015-9-4','SC23235',3,'2015-10-15'); 
 INSERT INTO book_issue VALUES ('2015-8-28','SC67555',4,'2015-12-12'); 
 INSERT INTO book_issue VALUES ('2015-9-7','SC76399',4,'2015-9-22'); 


 --insert into book_return table
 INSERT INTO book_return VALUES ('2015-9-15','SC23435',2,'2015-8-29'); 
 INSERT INTO book_return VALUES ('2015-11-23','SC67463',2,'2015-8-29'); 
 INSERT INTO book_return VALUES ('2015-10-16','SC23235',3,'2015-9-4'); 
 INSERT INTO book_return VALUES ('2015-12-22','SC67555',4,'2015-8-28'); 
 INSERT INTO book_return VALUES ('2015-9-29','SC76399',4,'2015-9-7'); 


 --update addressline2
 UPDATE members SET addressline2 = 'Jaipur' where member_id = 2;


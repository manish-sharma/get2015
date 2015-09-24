 USE lib_info_sys2;

 -- set autoincrement with 1
 ALTER TABLE members AUTO_INCREMENT=1;
 -- insert into members table
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Ramesh' , 'Gole Ka Mandir' , 'Gwalior' , 'Faculty' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Bhupendra' , 'Ahnuman square' , 'Indore' , 'Student' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Deepak' , 'Station raod' , 'Bangalore' , 'Faculty' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Rakesh' , 'Palasia' , 'Indore' , 'Student' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Garvita' , 'Snaganer' , 'Jaipur' , 'Faculty' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Divya' , 'Focus' , 'Dehli' , 'Faculty' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Nagesh' , 'Gole Ka Mandir' , 'Gwalior' , 'Faculty' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Suraj' , 'Ahnuman square' , 'Indore' , 'Student' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Krishna' , 'Station raod' , 'Bangalore' , 'Student' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Gaurav' , 'Palasia' , 'Indore' , 'Student' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Sunil' , 'Snaganer' , 'Jaipur' , 'Faculty' );
 INSERT INTO  members (member_nm , addressline1, addressline2 , category) VALUES ('Ankita' , 'mahor' , 'Dehli' , 'Faculty' );
 
 select * from members;
 
 -- insert into subjects
 INSERT INTO subjects values ( 1 , 'DBMS' );
 INSERT INTO subjects values ( 2 , 'DS' );
 INSERT INTO subjects values ( 3 , 'TOC' );
 INSERT INTO subjects values ( 4 , 'OS' );
 INSERT INTO subjects values ( 5 , 'Compiler' );
 INSERT INTO subjects values ( 6 , 'CSO' );
 INSERT INTO subjects values ( 7 , 'JAVA' );
 INSERT INTO subjects values ( 8 , 'CPP' );
 
 
 
 -- insert into authors
 INSERT INTO authors values ( 1 , 'Shivnandan' );
 INSERT INTO authors values ( 2 , 'Kavita Bala' );
 INSERT INTO authors values ( 3 , 'Conway' );
 INSERT INTO authors values ( 4 , 'David' );
 INSERT INTO authors values ( 5 , 'Gries' );
 INSERT INTO authors values ( 6 , 'Conway' );
 INSERT INTO authors values ( 7 , 'DK jain' );
 INSERT INTO authors values ( 8 , 'Kundar' );
 INSERT INTO authors values ( 9 , 'Vedant' );
 
 
 -- insert into publishers
 INSERT INTO publishers values ( 1 , 'Jai prakashan' );
 INSERT INTO publishers values ( 2 , 'Shivani prakshan' );
 INSERT INTO publishers values ( 3 , 'Soni Prakashan' );
 INSERT INTO publishers values ( 4 , 'Keshav Prakashan' );
 
 
 -- insert into titles
 INSERT INTO titles VALUES(1,'Data Communication System', 3,1);
 INSERT INTO titles VALUES(2,'Data Architecture', 1,3);
 INSERT INTO titles VALUES(3,'Semiconductor Elements Structure', 2,3);
 INSERT INTO titles VALUES(4,'Architectre of communication', 3,2);
 INSERT INTO titles VALUES(5,'Machine thoery', 2,1);
 INSERT INTO titles VALUES(6,'Thoery of automation.',2,2);
 INSERT INTO titles VALUES(7,'Software analysys and design', 3,4);
 INSERT INTO titles VALUES(8,'Mathematics-1', 5,4);
 INSERT INTO titles VALUES(9,'Algirithm Thoery', 5,3);
 INSERT INTO titles VALUES(10,'Data Theory', 1,3);
 INSERT INTO titles VALUES(11,'Semiconductor Communication', 2,3);
 INSERT INTO titles VALUES(12,'Basic Computer Architecture', 3,2);
 INSERT INTO titles VALUES(13,'Network Analysys', 2,1);
 INSERT INTO titles VALUES(14,'Software Engineering',6,4);
 INSERT INTO titles VALUES(15,'Database Design and Load', 1,4);
 INSERT INTO titles VALUES(16,'Mathematics-2', 3,4);
 INSERT INTO titles VALUES(18,'Mathematics-4', 3,1);
 INSERT INTO titles VALUES(19,'Memory System', 6,3);
 INSERT INTO titles VALUES(20,'Compiler Phase', 5,3);
 INSERT INTO titles VALUES(21,'Java Fundamental', 7,2);
 INSERT INTO titles VALUES(22,'CPP Reference', 8,1);
 INSERT INTO titles VALUES(23,'Complete Reference',7,1);
 INSERT INTO titles VALUES(24,'Desinig Theory', 7,4);
 
 
 -- insert into title_author
 INSERT INTO title_author values ( 1, 7 );
 INSERT INTO title_author values ( 1, 4 );
 INSERT INTO title_author values ( 1, 1 );
 INSERT INTO title_author values ( 2, 10 );
 INSERT INTO title_author values ( 2, 6 );
 INSERT INTO title_author values ( 3, 2 );
 INSERT INTO title_author values ( 3, 10);
 INSERT INTO title_author values ( 3, 5 );
 INSERT INTO title_author values ( 3, 8 );
 INSERT INTO title_author values ( 4, 9 );
 INSERT INTO title_author values ( 4, 7 );
 INSERT INTO title_author values ( 4, 3 );
 INSERT INTO title_author values ( 4, 1 );
 INSERT INTO title_author values ( 5, 6 );
 INSERT INTO title_author values ( 5, 2 );
 INSERT INTO title_author values ( 6, 10);
 INSERT INTO title_author values ( 6, 5 );
 INSERT INTO title_author values ( 6, 8 );
 INSERT INTO title_author values ( 7, 9 );
 INSERT INTO title_author values ( 7, 3 );
 INSERT INTO title_author values ( 7, 4 );
 INSERT INTO title_author values ( 8, 1 );
 INSERT INTO title_author values ( 9, 10 );
 INSERT INTO title_author values ( 10, 6 );
 INSERT INTO title_author values ( 10, 2 );
 INSERT INTO title_author values ( 11, 10);
 INSERT INTO title_author values ( 12, 5 );
 INSERT INTO title_author values ( 12, 8 );
 INSERT INTO title_author values ( 13, 9 );
 INSERT INTO title_author values ( 13, 7 );
 INSERT INTO title_author values ( 14, 4 );
 INSERT INTO title_author values ( 14, 1 );
 INSERT INTO title_author values ( 16, 3 );
 INSERT INTO title_author values ( 16, 6 );
 INSERT INTO title_author values ( 17, 2 );
 INSERT INTO title_author values ( 18, 10);
 INSERT INTO title_author values ( 19, 5 );
 INSERT INTO title_author values ( 20, 8 );
 INSERT INTO title_author values ( 21, 9 );
 INSERT INTO title_author values ( 22, 4 );
 INSERT INTO title_author values ( 22, 1 );
 INSERT INTO title_author values ( 23, 10 );
 INSERT INTO title_author values ( 23, 3 );
 INSERT INTO title_author values ( 23, 2 );
 INSERT INTO title_author values ( 24, 10);
 INSERT INTO title_author values ( 24, 5 );
 INSERT INTO title_author values ( 24, 8 );
 INSERT INTO title_author values ( 24, 3 );
 
 
 -- insert into table books 
 INSERT INTO books VALUES ( 'SC1201', 1 , '2014-2-8' , 200, 'Y');
 INSERT INTO books VALUES ( 'SC1202', 16 , '2015-4-23' , 400, 'Y');
 INSERT INTO books VALUES ( 'SC1203', 4 , '2015-2-1' , 600, 'Y');
 INSERT INTO books VALUES ( 'SC1204', 22 , '2013-1-31' , 230, 'Y');
 INSERT INTO books VALUES ( 'SC1205', 15 , '2015-9-11' , 950, 'Y');
 INSERT INTO books VALUES ( 'SC1206', 22 , '2014-12-28' , 290, 'Y');
 INSERT INTO books VALUES ( 'SC1207', 8 , '2015-2-18' , 120, 'Y');
 INSERT INTO books VALUES ( 'SC1209', 21 , '2014-2-8' , 200, 'Y');
 INSERT INTO books VALUES ( 'SC1210', 3 , '2015-4-23' , 400, 'Y');
 INSERT INTO books VALUES ( 'SC1211', 14 , '2015-2-1' , 640, 'Y');
 INSERT INTO books VALUES ( 'SC1212', 20 , '2013-1-31' , 230, 'Y');
 INSERT INTO books VALUES ( 'SC1213', 5 , '2015-9-11' , 650, 'Y');
 INSERT INTO books VALUES ( 'SC1214', 7 , '2014-12-28' , 190, 'Y');
 INSERT INTO books VALUES ( 'SC1215', 3 , '2015-2-18' , 900, 'Y');
 INSERT INTO books VALUES ( 'SC1216', 9 , '2014-2-8' , 200, 'Y');
 INSERT INTO books VALUES ( 'SC1217', 23 , '2015-4-23' , 400, 'Y');
 INSERT INTO books VALUES ( 'SC1218', 8 , '2015-2-1' , 600, 'Y');
 INSERT INTO books VALUES ( 'SC1219', 2 , '2013-1-31' , 230, 'Y');
 INSERT INTO books VALUES ( 'SC1220', 19 , '2015-9-11' , 950, 'Y');
 INSERT INTO books VALUES ( 'SC1221', 5 , '2014-12-28' , 290, 'Y');
 INSERT INTO books VALUES ( 'SC1222', 3 , '2015-2-18' , 120, 'Y');
 INSERT INTO books VALUES ( 'SC1223', 21 , '2014-2-8' , 200, 'Y');
 INSERT INTO books VALUES ( 'SC1224', 13 , '2015-4-23' , 400, 'Y');
 INSERT INTO books VALUES ( 'SC1225', 14 , '2015-2-1' , 640, 'Y');
 INSERT INTO books VALUES ( 'SC1226', 12 , '2013-1-31' , 230, 'Y');
 INSERT INTO books VALUES ( 'SC1227', 15 , '2015-9-11' , 650, 'Y');
 INSERT INTO books VALUES ( 'SC1228', 12 , '2014-12-28' , 190, 'Y');
 INSERT INTO books VALUES ( 'SC1229', 24 , '2015-2-18' , 900, 'Y');
 INSERT INTO books VALUES ( 'SC1230', 16 , '2014-12-28' , 290, 'Y');
 INSERT INTO books VALUES ( 'SC1231', 24 , '2015-2-18' , 120, 'Y');
 INSERT INTO books VALUES ( 'SC1232', 11 , '2014-2-8' , 200, 'Y');
 INSERT INTO books VALUES ( 'SC1233', 18 , '2015-4-23' , 400, 'Y');
 
 
 -- inssert into book_issue
 INSERT INTO book_issue VALUES ('2015-6-29','SC1212',2,'2015-9-21'); 
 INSERT INTO book_issue VALUES ('2015-8-29','SC1221',2,'2015-11-29'); 
 INSERT INTO book_issue VALUES ('2015-9-4','SC1211',3,'2015-10-15'); 
 INSERT INTO book_issue VALUES ('2015-6-28','SC1201',4,'2015-12-12'); 
 INSERT INTO book_issue VALUES ('2015-9-7','SC12002',5,'2015-9-22'); 
 INSERT INTO book_issue VALUES ('2015-8-29','SC1213',2,'2015-9-21'); 
 INSERT INTO book_issue VALUES ('2015-2-29','SC1209',2,'2015-11-29'); 
 INSERT INTO book_issue VALUES ('2015-9-4','SC1218',3,'2015-10-15'); 
 INSERT INTO book_issue VALUES ('2015-7-28','SC1203',4,'2015-12-12'); 
 INSERT INTO book_issue VALUES ('2015-9-7','SC1222',4,'2015-9-22'); 
 INSERT INTO book_issue VALUES ('2016-1-1','SC1213',3,'2016-4-1');


 -- insert into book_return
 INSERT INTO book_return VALUES ('2015-12-15','SC1212',2,'2015-6-29'); 
 INSERT INTO book_return VALUES ('2015-11-23','SC1213',2,'2015-8-29'); 
 INSERT INTO book_return VALUES ('2015-10-16','SC1218',3,'2015-9-4'); 
 INSERT INTO book_return VALUES ('2015-12-22','SC1203',4,'2015-8-28'); 
 INSERT INTO book_return VALUES ('2015-9-29','SC1222',4,'2015-9-7'); 



CREATE
INSERT INTO members VALUES("1","Shishir Pareek","Civil Lines","Delhi","F");
INSERT INTO members VALUES("2","Shreerath Nair","200 ft bypass","Kerela","S");
INSERT INTO members VALUES("3","Sumit Chaudhary","Khatipura","Banglore","S");
INSERT INTO members VALUES("4","Shubham Sharma","Shastri Nagar","Agra","O");
INSERT INTO members VALUES("5","Rashmi Vijay","Sanganer","Jaipur","F");


INSERT INTO books(accession_no,title_id,purchase_dt,price,status) VALUES
("1","10","24-05-2013",1500,"Unissued"),
("2","20","25-05-1947",10,"Issued"),
("3","30","26-07-2015",2500,"Unissued"),
("4","40","03-05-2014",1000,"Issued"),
("5","50","24-05-2013",1500,"Unissued");

INSERT INTO titles(title_id,title_nm,subject_id,publishers_id) VALUES
("10","Herbert Shield","1","1"),
("20","Head First Java","1","12"),
("30","Computer Networks","3","15"),
("40","Lets us C","2","20"),
("50","DATA MINING ","4","10");

INSERT INTO publishers(publishers_id,publisher_nm) VALUES
("1","Oxford University Press"),
("12","O'Rilley Publication"),
("15","Pearson Publication"),
("20","Owl India"),
("10","Diamond Publicatons");

INSERT INTO subjects(subject_id,subject_nm) VALUES
("1","JAVA"),
("2","C Programming"),
("3","Networking"),
("4","Database"),


INSERT INTO authors(author_id,author_nm) VALUES 
("1","Herbert Shield"),
("2","Steve Jobs"),
("3","George R.R Martin"),
("4","Tanen Baum"),
("5","Yashwant Kanetkar");

INSERT INTO book_issue(accession_no,member_id) VALUES 
("1","1"),
("2","2"),
("3","3"),
("4","4"),
("5","5");

SELECT * from book_issue;

SELECT * from title_author;

INSERT INTO title_author(title_id,author_id) VALUES ("10","1");
INSERT INTO title_author(title_id,author_id) VALUES ("20","2");
INSERT INTO title_author(title_id,author_id) VALUES ("30","3");
INSERT INTO title_author(title_id,author_id) VALUES ("40","4");
INSERT INTO title_author(title_id,author_id) VALUES ("50","5");

INSERT INTO book_return(return_dt,accession_no,member_id,issue_dt) VALUES
("2015-09-23 16:38:05","1","1","2015-09-08 16:38:05"),
("2015-09-23 16:39:04", "2", "2","2015-09-08 16:39:04"),
("2015-09-23 16:39:28", "3", "3","2015-09-08 16:39:28"),
("2015-09-23 16:39:50", "4", "4",  "2015-09-08 16:39:50"),
("2015-09-23 16:43:09", "5", "5",  "2015-09-08 16:43:09");

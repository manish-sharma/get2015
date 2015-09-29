INSERT INTO members VALUES("M12768","Shishir Pareek","Civil Lines","Delhi","M");
INSERT INTO members VALUES("M14867","Shreerath Nair","200 ft bypass","Kerela","M");
INSERT INTO members VALUES("M12567","Sumitra Chaudhary","Khatipura","Banglore","F");
INSERT INTO members VALUES("M14234","Shubham Sharma","Shastri Nagar","Agra","M");
INSERT INTO members VALUES("M27995","Rashmi Vijay","Sanganer","Jaipur","F");
INSERT INTO members VALUES("M235490","Keshav Sharma","Sitapura","Jaipur","M");

INSERT INTO books(accession_no,title_id,purchase_dt,price,status) VALUES
("A12469","TITLE198789","24-05-2013",1500,"Unissued"),
("A1296778","TITLE166789","25-05-1947",10,"Issued"),
("A2343490","TITLE1221454","26-07-2015",2500,"Unissued"),
("A11267908","TITLE1983446","03-05-2014",1000,"Issued"),
("A1246347","TITLE198789","24-05-2013",1500,"Unissued");

INSERT INTO titles(title_id,title_nm,subject_id,publishers_id) VALUES

("TITLE198789","The Song of Ice and Fire","Fiction Novel","1"),
("TITLE166789","Head First Java","Programming books","12"),
("TITLE1221454","Computer Networks","Technical","15"),
("TITLE1983446","Shiva Triology","Fiction","20"),
("TITLE1980000","MillionDollar Hippy","Reality","10");

INSERT INTO publishers(publishers_id,publisher_nm) VALUES
("1","Oxford University Press"),
("12","O'Rilley Publication"),
("15","Pearson Publication"),
("20","Owl India"),
("10","Diamond Comics");

INSERT INTO subjects(subject_id,subject_nm) VALUES
("Fiction Novel","NOVEL"),
("Programming Books","JAVA"),
("Technical","Networking"),
("Fiction","Novel"),
("Reality","Biography");

Insert INTO authors(author_id,author_nm) VALUES 
("author1278","Amish Tirpathi"),
("author1908","Steve Jobs"),
("author1478","George R.R Martin"),
("author1098","Tanen Baum"),
("author1247","Herbet Shield");

INSERT INTO book_issue(accession_no,member_id) VALUES 
("A12469","M12768"),
("A1296778","M14867"),
("A11267908","M12567"),
("A2343490","M14234"),
("A1246347","M27995");

INSERT INTO title_author(title_id,author_id) VALUES ("TITLE198789","author1478");
INSERT INTO title_author(title_id,author_id) VALUES ("TITLE166789","author1247");
INSERT INTO title_author(title_id,author_id) VALUES ("TITLE1221454","author1098");
INSERT INTO title_author(title_id,author_id) VALUES ("TITLE1983446","author1278");
INSERT INTO title_author(title_id,author_id) VALUES ("TITLE1980000","author1908");

INSERT INTO book_return(return_dt,accession_no,member_id,issue_dt) VALUES ("2015-09-23 16:38:05","A12469","M12768","2015-09-08 16:38:05");
INSERT INTO book_return(return_dt,accession_no,member_id,issue_dt) VALUES ("2015-09-23 16:39:28","A11267908","M12567","2015-09-08 16:39:28");

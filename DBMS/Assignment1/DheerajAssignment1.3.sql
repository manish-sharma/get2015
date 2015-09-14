
/*Insert values in Members tables*/
INSERT INTO members(member_name,addressline1,addressline2,category) VALUES
("Dheeraj","Kishangarh","Ajmer","M"),
("Babalu","Jalabarh","Jalabarh","M"),
("Anurag Anand","Chai Ki Mandi","Patna","M"),
("Sumitra","Madhav Nagar","Chittorgarh","F"),
("Girdhari","HOli Gate","Mathura","M");


/*Insert values in Authors table*/
INSERT INTO authors(author_name) VALUES
("Sandeep Sopankar"),
("Chetan Bhagat"),
("Kathy Sierra"),
("James Gosling"),
("Yashwant Kanetkar"),
("Dennies Ritchie");


/*Insert values in  publishers table*/
INSERT INTO publishers(publisher_name) VALUES
("Pearson Hall"),
("Tata McGraw Hill"),
("Oracle Publications"),
("Pegvin"),
("BPB Publications"),
("Wiley Publications");

/*Insert values in subjects table*/
INSERT INTO subjects(subject_name) VALUES
("DBMS"),
("C Programming"),
("Nobles"),
("AI"),
("JAVA"),
("Mathematics");

/*Insert values in titles table*/
INSERT INTO titles(title_name, subject_id, publisher_id) VALUES
("Head First DATABASE",1,6),
("Let Us C",2,5),
("Few Things Left Unsaid",3,4),
("AI- A Practicle Approach",4,2),
("JAVA - Documentation",5,3),
("Mathematics - Easy Way",6,1);

/*Insert values in books table*/
INSERT INTO books(title_id,purchase_date, price, status) VALUES
(2,'2015-04-30',11, "Y"),
(3,'2015-04-30',101,"Y"),
(4,'2015-04-30',21, "Y"),
(5,'2015-04-30',51, "Y"),
(6,'2015-04-30',221,"Y");

/*Insert values in title_author table*/
INSERT INTO title_author(title_id, author_id) VALUES
(1,1),(2,5),(3,1),(4,6),(5,3),(6,2);


/*Insert values in book_issue table*/
INSERT INTO book_issue(accession_no, member_id) VALUES
(1,5),(2,4),(3,3),(4,2),(5,1);


/*Insert value  Book Return table */
INSERT INTO book_return(return_Date, accession_No, member_Id, issue_Date) VALUES
('2015-09-06', 1, 5, '2015-08-23'),
('2015-09-07', 2, 4, '2015-08-24'),
('2015-09-04', 3, 3, '2015-08-21'),
('2015-08-25', 4, 2, '2015-08-10'),
('2015-08-31', 5, 1, '2015-08-16');

/*Insert values in book_return table
INSERT INTO book_return ()*/

/* update addressline1*/
UPDATE members SET addressline1 = "EPIP, Sitapura" WHERE category ="F";

/*Show members table*/
SELECT * FROM members;

/*update addressline2*/
UPDATE members SET addressline2 = "Jaipur";	

/*Show members table*/
SELECT * FROM members;


/*Delete those which has publisher_id=1 in titles table*/
DELETE FROM titles WHERE publisher_id=1;

/*Show members table*/
SELECT * FROM members;

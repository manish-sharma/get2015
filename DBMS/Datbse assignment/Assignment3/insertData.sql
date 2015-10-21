USE lis;

/*Insert data into members table*/

INSERT INTO members (`member_id`,
	 `member_name`, `address_line1`, `address_line2`, `category`)
 	VALUES ('1','nikhil', 'EPIP', 'jaipur, rajasthan', 'student'
);

INSERT INTO members (`member_id`,
	 `member_name`, `address_line1`, `address_line2`, `category`)
 	VALUES ('2','rohit', 'Malviya nagar', 'jaipur, rajasthan', 'teacher'
);

INSERT INTO members (`member_id`,
	 `member_name`, `address_line1`, `address_line2`, `category`)
 	VALUES ('3', 'jignesh', 'EPIP', 'kota', 'student'
);

INSERT INTO members (`member_id`,
 `member_name`, `address_line1`, `address_line2`, `category`)
 	VALUES ('4', 'prakash', 'Civil lines', 'delhi', 'teacher'
);


/*Insert data into subjects table*/

INSERT INTO subjects (
	`subject_name`)
	 VALUES ( 'dbms'
);

INSERT INTO subjects (
	`subject_name`)
	 VALUES ( 'java'
);

INSERT INTO subjects (
	`subject_name`)
	 VALUES ( 'DSA'
);
INSERT INTO subjects (
	`subject_name`)
	 VALUES ( 'c++'
);

/*Insert data into publishers table*/
INSERT INTO publishers (
	`publisher_name`, `city`)
	 VALUES ('jaipur books','jaipur'
);

INSERT INTO publishers (
	`publisher_name`, `city`)
	 VALUES ('delhi books', 'delhi'
);

INSERT INTO publishers (
	`publisher_name`, `city`)
	 VALUES ('Ajmer books', 'Ajmer'
);



/*Insert into authors table*/

INSERT INTO authors (
	`author_fname`, `author_lname`,`address`,`city`,`state`)
	 VALUES ( 'mehul','sharma','sanganer','jaipur','Rajasthan'
);

INSERT INTO authors (
	`author_fname`, `author_lname`,`address`,`city`,`state`)
	 VALUES ( 'rahul','sharma','chaura rasta','jaipur','Rajasthan'
);

INSERT INTO authors (
	`author_fname`, `author_lname`,`address`,`city`,`state`)
	 VALUES ( 'akshat','mathur','sanganer','jaipur','Rajasthan'
);
INSERT INTO authors (
	`author_fname`, `author_lname`,`address`,`city`)
	 VALUES ( 'ravi','sharma','sanganer','delhi'
);


/*insert data into titles*/

INSERT INTO titles (
	 `title_name`, `purchase_date`)
	 VALUES ( 'dbms', '2015-03-12'
);
INSERT INTO titles (
	 `title_name`, `purchase_date`)
	 VALUES ( 'java', '2015-06-15'
);
INSERT INTO titles (
	 `title_name`, `purchase_date`)
	 VALUES ( 'C++', '2015-04-12'
);

/*Insert into books*/

INSERT INTO books (`accession_no`,
	`purchase_date`, `price`, `status`)
	VALUES ('10','2013-05-12', 320, 'Booked'
);
INSERT INTO books (`accession_no`,
	`purchase_date`, `price`, `status`)
	VALUES ('20','2015-08-10', 550, 'UNBooked'
);
INSERT INTO books (`accession_no`,
	`purchase_date`, `price`, `status`)
	VALUES ('30','2014-07-12', 880, 'Booked'
);

/*Insert into book_issue*/

INSERT INTO book_issue (`accession_no`,`member_id`,
	`issue_date`, `due_date`) 
	VALUES ('10','1','2015-08-01', '2016-08-16'
);
INSERT INTO book_issue (`accession_no`,`member_id`,
	`issue_date`, `due_date`) 
	VALUES ('20','2','2013-05-01', '2016-08-16'
);
/*Insert into book_return*/
INSERT INTO book_return (`accession_no`,`member_id`,
	`return_date`,`issue_date`) 
	VALUES ('10','1','2015-07-3','2013-08-15'
);
INSERT INTO book_return (`accession_no`,`member_id`,
	`return_date`,`issue_date`) 
	VALUES ('20','2','2015-04-3','2012-04-14'
);



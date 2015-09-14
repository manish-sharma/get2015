
INSERT INTO authors
(author_id, author_lname, author_fname, address, city, state)
VALUES
("1", "bhagat", "chetan", "102, Bank Colony, Laxmi Nagar", "New Delhi", "Delhi");
INSERT INTO authors
(author_id, author_lname, author_fname, address, city, state)
VALUES
("2", "tripathi", "amish", "103, Bank Colony, Laxmi Nagar", "New Delhi", "Delhi");
INSERT INTO authors
(author_id, author_lname, author_fname, address, city, state)
VALUES
("3", "khan", "salim", "102, Bank Colony, Laxmi Nagar", "Mumbai", "Maharastra");
INSERT INTO authors
(author_id, author_lname, author_fname, address, city, state)
VALUES
("4", "korth", "G N", "105, Bank Colony, Laxmi Nagar", "Jaipur", "Rajasthan");
INSERT INTO authors
(author_id, author_lname, author_fname, address, city, state)
VALUES
("5", "nehru", "J L", "1, Bank Colony, Laxmi Nagar", "New Delhi", "Delhi");

INSERT INTO publishers
(publisher_id, publisher_name, city)
VALUES
("1001", "TATA McGRAW HILL", "Mumbai");
INSERT INTO publishers
(publisher_id, publisher_name, city)
VALUES
("1002", "GENIUS", "Jaipur");
INSERT INTO publishers
(publisher_id, publisher_name, city)
VALUES
("1003", "ASHIRWAAD", "Jaipur");

INSERT INTO subjects
(subject_id, subject_name)
VALUES
("901", "Fiction");
INSERT INTO subjects
(subject_id, subject_name)
VALUES
("902", "Nowel");
INSERT INTO subjects
(subject_id, subject_name)
VALUES
("903", "TextBook");
INSERT INTO subjects
(subject_id, subject_name)
VALUES
("904", "Biography");

INSERT INTO titles
(title_id, title_name, publisher_id)
VALUES
("401", "2-States", "1001");
INSERT INTO titles
(title_id, title_name, publisher_id)
VALUES
("402", "Shiva", "1001");
INSERT INTO titles
(title_id, title_name, publisher_id)
VALUES
("403", "Database", "1003");
INSERT INTO titles
(title_id, title_name, publisher_id)
VALUES
("404", "Operating System", "1002");
INSERT INTO titles
(title_id, title_name, publisher_id)
VALUES
("405", "India A Growing Economy", "1001");
INSERT INTO titles
(title_id, title_name, publisher_id)
VALUES
("406", "Colombus", "1002");

INSERT INTO title_author
(author_id, title_id)
VALUES
("1", "401");
INSERT INTO title_author
(author_id, title_id)
VALUES
("2", "402");
INSERT INTO title_author
(author_id, title_id)
VALUES
("4", "403");
INSERT INTO title_author
(author_id, title_id)
VALUES
("4", "404");
INSERT INTO title_author
(author_id, title_id)
VALUES
("5", "405");
INSERT INTO title_author
(author_id, title_id)
VALUES
("3", "406");

INSERT INTO books
(accession_no, title_id, purchase_date, price, status)
VALUES
("1001", "401", "2015/08/02", "499", "available");
INSERT INTO books
(accession_no, title_id, purchase_date, price, status)
VALUES
("1002", "402", "2015/07/02", "599", "available");
INSERT INTO books
(accession_no, title_id, purchase_date, price, status)
VALUES
("1003", "403", "2015/09/02", "599", "un-available");
INSERT INTO books
(accession_no, title_id, purchase_date, price, status)
VALUES
("1004", "404", "2014/07/01", "699", "available");
INSERT INTO books
(accession_no, title_id, purchase_date, price, status)
VALUES
("1005", "405", "1964/08/02", "499", "available");
INSERT INTO books
(accession_no, title_id, purchase_date, price, status)
VALUES
("1006", "406", "1857/08/02", "499", "available");

INSERT INTO members
(member_id, member_name, address_line1, address_line2, category)
VALUES
("501", "Akshat Mathur", "5/210, malviya nagar, ", "jaipur, rajasthan", "m");
INSERT INTO members
(member_id, member_name, address_line1, address_line2, category)
VALUES
("502", "Nikhil Tinkar", "4/210, malviya nagar, ", "jaipur, rajasthan", "m");
INSERT INTO members
(member_id, member_name, address_line1, address_line2, category)
VALUES
("503", "Khemanshu Rao", "6/210, malviya nagar, ", "jaipur, rajasthan", "m");

INSERT INTO book_issue
(accession_no, member_id)
VALUES
("1001", "501");
INSERT INTO book_issue
(accession_no, member_id)
VALUES
("1002", "502");
INSERT INTO book_issue
(accession_no, member_id)
VALUES
("1003", "503");
INSERT INTO book_issue
(accession_no, member_id)
VALUES
("1004", "503");
SELECT * FROM book_issue;
UPDATE  members SET address_line2 = "Jaipur";
Update  members set address_line1 = "EPIP, Sitapura"
where category = "m";
CREATE TEMPORARY TABLE publisher_temp(SELECT * FROM publishers);
CREATE TEMPORARY TABLE title_temp(SELECT * from titles);
SET SQL_SAFE_UPDATES = 0;
DELETE FROM publishers;
INSERT INTO publishers (SELECT * FROM publisher_temp);
SELECT * FROM publishers;
INSERT INTO titles (SELECT * from title_temp);
SELECT * FROM publishers;

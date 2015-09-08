--create dtabase
CREATE DATABASE lib_info_sys;
--select database
USE lib_info_sys;

-- members table
CREATE TABLE members
(
member_id int NOT NULL AUTO_INCREMENT,
member_nm varchar( 30) NOT NULL,
addressline1 varchar(100),
addressline2 varchar(100),
category varchar(100),
PRIMARY KEY (member_id)
);


--books table
CREATE TABLE books
(
  accession_no varchar(20),
  title_id int,
  purchase_dt DATE,
  price int,
  status ENUM ('Y','N'),
  PRIMARY KEY (accession_no),
  FOREIGN KEY fk_titles(title_id) REFERENCES titles(title_id) ON DELETE CASCADE  ON UPDATE CASCADE
);


--book_issue table
CREATE TABLE book_issue
(
  issue_dt DATE,
  accession_no varchar(20),
  member_id int,
  due_dt DATE,
  PRIMARY KEY (issue_dt,accession_no,member_id),
  FOREIGN KEY fk_books(accession_no) REFERENCES books(accession_no) ON DELETE CASCADE  ON UPDATE CASCADE,
  FOREIGN KEY fk_members(member_id) REFERENCES members(member_id) ON DELETE CASCADE  ON UPDATE CASCADE  
);


--subjects table
CREATE TABLE subjects 
(
  subject_id int,
  subject_nm varchar(20),
  PRIMARY KEY (subject_id)
);


--publishers table
CREATE TABLE publishers 
(
  publisher_id int,
  publisher_nm varchar(20),
  PRIMARY KEY (publisher_id)
);


--authors table
CREATE TABLE authors 
(
  author_id int,
  author_nm varchar(20),
  PRIMARY KEY (author_id)
);


--book_return table
CREATE TABLE book_return 
(
  return_dt DATE,
  accession_no varchar(20),
  member_id int,
  issue_dt DATE,
  PRIMARY KEY (return_dt,accession_no,member_id),
  FOREIGN KEY fk_books (accession_no) REFERENCES books(accession_no) ON DELETE CASCADE  ON UPDATE CASCADE ,
  FOREIGN KEY fk_members (member_id) REFERENCES members(member_id) ON DELETE CASCADE  ON UPDATE CASCADE
);


--titles table
CREATE TABLE titles
(
  title_id int,
  title_nm varchar(20),
  subject_id int,
  publisher_id int,
  PRIMARY KEY (title_id),
  FOREIGN KEY fk_publishers (publisher_id) REFERENCES publishers(publisher_id) ON DELETE CASCADE  ON UPDATE CASCADE ,
  FOREIGN KEY fk_subjects (subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE  ON UPDATE CASCADE
);


--title_author table
CREATE TABLE title_author
(
  title_id int,
  author_id int,
  PRIMARY KEY (title_id,author_id),
  FOREIGN KEY fk_titles (title_id) REFERENCES titles(title_id) ON DELETE CASCADE  ON UPDATE CASCADE ,
  FOREIGN KEY fk_authors (author_id) REFERENCES authors(author_id) ON DELETE CASCADE  ON UPDATE CASCADE
);


--display all tables names
show tables;


-- set default issue date as current date
ALTER TABLE book_issue MODIFY issue_dt TIMESTAMP DEFAULT NOW();


--set default due date as next 15 days to currenr issue date
DELIMITER ;;
CREATE TRIGGER book_due_dt AFTER INSERT ON book_issue FOR EACH ROW
BEGIN
UPDATE book_issue SET issue_dt = DATE_ADD(CURDATE(),INTERVAL 15 DAY) WHERE issue_dt = NOW();
END;;




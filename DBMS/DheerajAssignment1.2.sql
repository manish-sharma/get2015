/*Created By Dheeraj Kumar*/


create database library_management_system;
/*use database library_management_system*/

use library_management_system;

/*create table members*/
create TABLE `members` (
`member_id` INT(10) AUTO_INCREMENT ,
`member_name` VARCHAR(30),
`addressline1` VARCHAR(30) ,
`addressline2` VARCHAR(30) ,
`category` CHAR(1) ,
PRIMARY KEY ( `member_id`)
);

/*create table authors*/
create TABLE `authors` (
`author_id` INT(10) AUTO_INCREMENT ,
`author_name` VARCHAR(30) ,
PRIMARY KEY (`author_id`)
);

/*create table publishers*/
create TABLE `publishers` (
`publisher_id` INT(10) AUTO_INCREMENT ,
`publisher_name` VARCHAR(30),
PRIMARY KEY (`publisher_id`)
);

/*create table subjects*/
create TABLE `subjects` (
`subject_id` INT(10) AUTO_INCREMENT,
`subject_name` VARCHAR(30),
PRIMARY KEY (`subject_id`)
);

/*create table titles*/
create TABLE `titles` (
`title_id` INT(10) AUTO_INCREMENT ,
`title_name` VARCHAR(30) ,
`subject_id` INT(10) ,
`publisher_id` INT(10) ,
PRIMARY KEY (`title_id`),
FOREIGN KEY (`subject_id`) REFERENCES `subjects` (`subject_id`) ON DELETE CASCADE,
FOREIGN KEY (`publisher_id`) REFERENCES `publishers` (`publisher_id`) ON DELETE CASCADE
);

/*create table books*/
create TABLE `books` (
`accession_no` INT(10) AUTO_INCREMENT ,
`title_id` INT(10) ,
`purchase_date` DATE ,
`price` REAL ,
`status` CHAR(1) ,
PRIMARY KEY (`accession_no`),
FOREIGN KEY (`title_id`) REFERENCES `titles` (`title_id`) ON DELETE CASCADE
);

/*create table title_author*/
create TABLE `title_author` (
`title_id` INT(10),
`author_id` INT(10),
PRIMARY KEY(`title_id`,`author_id`),
FOREIGN KEY (`title_id`) REFERENCES `titles` (`title_id`) ON DELETE CASCADE,
FOREIGN KEY (`author_id`) REFERENCES `authors` (`author_id`) ON DELETE CASCADE
);


/*create table book_issue*/
create TABLE `book_issue` (
`issue_date` DATE  ,
`accession_no` INT(10),
`member_id` INT(10) ,
`due_date` DATE ,
PRIMARY KEY (`issue_date`,`accession_no`,`member_id`),
FOREIGN KEY (`accession_no`) REFERENCES `books` (`accession_no`) ON DELETE CASCADE,
FOREIGN KEY (`member_id`) REFERENCES `members` (`member_id`) ON DELETE CASCADE
);


/*create table book_return*/
create TABLE `book_return` (
`return_date` DATE,
`accession_no` INT(10),
`member_id` INT(10) ,
`issue_date` DATE ,
PRIMARY KEY (`return_date`,`accession_no`,`member_id`),
FOREIGN KEY (`accession_no`) REFERENCES `books` (`accession_no`) ON DELETE CASCADE,
FOREIGN KEY (`member_id`) REFERENCES `members` (`member_id`) ON DELETE CASCADE
);

/*Show all tables*/
SHOW TABLES;

/*Add default value to current date on issue date*/
ALTER TABLE `book_issue` MODIFY `issue_date` TIMESTAMP  DEFAULT NOW();

/*Add default value to current date +15 days on due date*/
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON `book_issue` FOR EACH ROW
BEGIN
      SET NEW.`due_date` = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;


/*TO Drop Table*/
DROP TRIGGER book_due_date;
DROP TABLE `book_return`;
DROP TABLE `book_issue`;
DROP TABLE `members`;

/*Recreate Tables book_issue book_return and members*/

/*create table members*/
create TABLE `members` (
`member_id` INT(10) AUTO_INCREMENT ,
`member_name` VARCHAR(30),
`addressline1` VARCHAR(30) ,
`addressline2` VARCHAR(30) ,
`category` CHAR(1) ,
PRIMARY KEY ( `member_id`)
);

/*create table book_issue*/
create TABLE `book_issue` (
`issue_date` DATE  ,
`accession_no` INT(10),
`member_id` INT(10) ,
`due_date` DATE ,
PRIMARY KEY (`issue_date`,`accession_no`,`member_id`),
FOREIGN KEY (`accession_no`) REFERENCES `books` (`accession_no`) ON DELETE CASCADE,
FOREIGN KEY (`member_id`) REFERENCES `members` (`member_id`) ON DELETE CASCADE
);


/*create table book_return*/
create TABLE `book_return` (
`return_date` DATE,
`accession_no` INT(10),
`member_id` INT(10) ,
`issue_date` DATE ,
PRIMARY KEY (`return_date`,`accession_no`,`member_id`),
FOREIGN KEY (`accession_no`) REFERENCES `books` (`accession_no`) ON DELETE CASCADE,
FOREIGN KEY (`member_id`) REFERENCES `members` (`member_id`) ON DELETE CASCADE
);

/*Create Trigger again*/

/*Add default value to current date on issue date*/
ALTER TABLE `book_issue` MODIFY `issue_date` TIMESTAMP  DEFAULT NOW();

/*Add default value to current date +15 days on due date*/
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON `book_issue` FOR EACH ROW
BEGIN
      SET NEW.`due_date` = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;





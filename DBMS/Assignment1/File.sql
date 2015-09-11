SHOW DATABASES;

CREATE DATABASE library_information_system;

USE library_information_system;

CREATE TABLE Publishers(
Publisher_id INT PRIMARY KEY AUTO_INCREMENT,
Publisher_name VARCHAR(50)
);

CREATE TABLE Subjects(
Subject_id INT PRIMARY KEY,
Subject_name VARCHAR(50)
);

CREATE TABLE Titles(
Subject_id INT,
Title_id INT,
Title_name VARCHAR(50),
Publisher_id INT,
PRIMARY KEY(Title_id),
CONSTRAINT Subject_id_second FOREIGN KEY(Subject_id) REFERENCES Subjects(Subject_id) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT Publisher_id_second FOREIGN KEY(Publisher_id) REFERENCES Publishers(Publisher_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Authors(
Author_id Int PRIMARY KEY,
Author_name VARCHAR(50)
);

CREATE TABLE Title_Author(
Title_id Int,
Author_id INT,
CONSTRAINT Title_is_second FOREIGN KEY(Title_id) REFERENCES Titles(Title_id) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT Author_id_second FOREIGN KEY(Author_id) REFERENCES Authors(Author_id) ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY(Title_id,Author_id)
);

CREATE TABLE Members(
Member_id INT PRIMARY KEY AUTO_INCREMENT,
Member_name VARCHAR(15),
AddressLine1 VARCHAR(50),
AddressLine2 VARCHAR(50),
Category VARCHAR(1)
);

CREATE TABLE Books(
Accession_no INT PRIMARY KEY AUTO_INCREMENT,
Title_id INT(50),
Purchase_Date DATE,
Price INT,
Status VARCHAR(10)
);

CREATE TABLE Book_issue(
Accession_no INT ,
Member_id INT,
Issue_date DATE,
Due_date DATE,
PRIMARY KEY(Accession_no,Issue_date,Member_id),
CONSTRAINT Accession_id_second FOREIGN KEY(Accession_no) REFERENCES Books(Accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT Member_id_second FOREIGN KEY(Member_id) REFERENCES Members(Member_id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Book_return(
Accession_no INT ,
Member_id INT,
Issue_date DATE,
Return_date DATE,
PRIMARY KEY(Accession_no,Return_date,Member_id),
CONSTRAINT Accession_id_third FOREIGN KEY(Accession_no) REFERENCES Books(Accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT Member_id_third FOREIGN KEY(Member_id) REFERENCES Members(Member_id) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT Issue_date_second FOREIGN KEY(Issue_date) REFERENCES Book_issue(Issue_date) ON DELETE CASCADE ON UPDATE CASCADE
);

SHOW TABLES;


ALTER TABLE Book_issue
MODIFY COLUMN Issue_date TIMESTAMP DEFAULT NOW();


DELIMITER //

CREATE TRIGGER Book
BEFORE INSERT ON Book_issue
FOR EACH ROW 
BEGIN
SET NEW.Due_date = NOW() + INTERVAL 15 day;
END; //

DELIMITER ;



ALTER TABLE Book_issue DROP FOREIGN KEY Member_id_second;

ALTER TABLE Book_return DROP FOREIGN KEY Member_id_third;

DROP TABLE Members;


SHOW TABLES;


CREATE TABLE Members(
Member_id INT PRIMARY KEY AUTO_INCREMENT,
Member_name VARCHAR(15),
AddressLine1 VARCHAR(50),
AddressLine2 VARCHAR(50),
Category VARCHAR(5)
);

ALTER TABLE Book_issue
ADD CONSTRAINT Member_id_second FOREIGN KEY(Member_id) REFERENCES Members(Member_id);

ALTER TABLE Book_issue
ADD CONSTRAINT Member_id_third FOREIGN KEY(Member_id) REFERENCES Members(Member_id);






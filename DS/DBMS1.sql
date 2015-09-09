
create database Library;
 
USE Library;

CREATE TABLE Author(
author_id INT PRIMARY KEY AUTO_INCREMENT,
author_Name VARCHAR(50)
);

CREATE TABLE Publishers(
publisher_Id INT PRIMARY KEY AUTO_INCREMENT,
publisher_Name VARCHAR(50)
);

CREATE TABLE Subjects(
subject_Id INT PRIMARY KEY AUTO_INCREMENT,
subject_Name varchar(50)
);

CREATE TABLE Members(
member_Id INT PRIMARY KEY AUTO_INCREMENT,
member_Name VARCHAR(50),
addressLine1 VARCHAR(50),
addressLine2 VARCHAR(50),
category CHAR(1)
);

CREATE TABLE Title(
title_Id INT PRIMARY KEY AUTO_INCREMENT,
title_Name VARCHAR(50),
subject_Id INT,
publisher_Id INT,
FOREIGN KEY (subject_Id) REFERENCES Subjects(subject_Id) ON DELETE CASCADE,
CONSTRAINT First
FOREIGN KEY (publisher_Id) REFERENCES Publishers(publisher_Id) ON DELETE CASCADE
);

CREATE TABLE Title_Author(
title_Id INT,
author_Id INT,
PRIMARY KEY(title_Id, author_Id),
FOREIGN KEY (title_Id) REFERENCES Title(title_Id) ON DELETE CASCADE,
FOREIGN KEY (author_Id) REFERENCES Author(author_Id) ON DELETE CASCADE
);

CREATE TABLE Books(
accession_No INT PRIMARY KEY AUTO_INCREMENT,
title_Id INT,
purchase_Date DATE,
price REAL,
status INT 
CHECK (status IN('0','1'))
);

CREATE TABLE Book_Issue(
issue_Date DATE,
accession_No INT,
member_Id INT,
due_Date DATE,
PRIMARY KEY(issue_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No) ON DELETE CASCADE,
FOREIGN KEY(member_Id) REFERENCES Members(member_Id) ON DELETE CASCADE
);

CREATE TABLE Book_Return(
return_Date DATE,
accession_No INT,
member_Id INT,
issue_Date DATE,
PRIMARY KEY(return_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No) ON DELETE CASCADE,
FOREIGN KEY(member_Id) REFERENCES Members(member_Id) ON DELETE CASCADE
);


SHOW TABLES;

ALTER TABLE Book_Issue MODIFY COLUMN issue_Date TIMESTAMP NOT NULL DEFAULT NOW();
DELIMITER ;;
CREATE TRIGGER book_due_date AFTER INSERT ON Book_Issue FOR EACH ROW
BEGIN
    UPDATE Book_Issue SET due_Date = DATE_ADD(NOW(), INTERVAL 15 DAY) where issue_Date = NOW();
END;;
DELIMITER ;

DESCRIBE Book_Issue;

DROP TRIGGER book_due_date;
DROP TABLE Book_Issue;
DROP TABLE Book_Return;
DROP TABLE Members;

CREATE TABLE Members(
member_Id INT PRIMARY KEY AUTO_INCREMENT,
member_Name VARCHAR(50),
addressLine1 VARCHAR(50),
addressLine2 VARCHAR(50),
category CHAR(1)
);

CREATE TABLE Book_Issue(
issue_Date DATE,
accession_No INT,
member_Id INT,
due_Date DATE,
PRIMARY KEY(issue_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No),
FOREIGN KEY(member_Id) REFERENCES Members(member_Id)
);

CREATE TABLE Book_Return(
return_Date DATE,
accession_No INT,
member_Id INT,
issue_Date DATE,
PRIMARY KEY(return_Date, accession_No, member_Id),
FOREIGN KEY(accession_No) REFERENCES Books(accession_No),
FOREIGN KEY(member_Id) REFERENCES Members(member_Id)
);

ALTER TABLE Book_Issue MODIFY COLUMN issue_Date TIMESTAMP NOT NULL DEFAULT NOW();
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON Book_Issue FOR EACH ROW
BEGIN
    SET NEW.due_Date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;

INSERT INTO Author(author_Id, author_Name) VALUES(101, "Amit")
INSERT INTO Author(author_Name) VALUES("Ankit"),("Banwari"),("Gaurav"),("Rohit"),("Ankur");

SELECT * FROM Author;

INSERT INTO Publishers(publisher_Id, publisher_Name) VALUES(201, "Katha Books");
INSERT INTO Publishers(publisher_Name) VALUES("Jaico Publishing House"),("India Book House"),("NeelKanth Publication"),("Genius Publication");
INSERT INTO Publishers(publisher_Name) VALUES("Ashirwaad Publication");
INSERT INTO Publishers(publisher_Name) VALUES("College Book House");

SELECT * FROM Publishers;

INSERT INTO Subjects(subject_Id, subject_Name) VALUES(301, "Java");
INSERT INTO Subjects(subject_Name) VALUES("Data Structures"),("DBMS");
INSERT INTO Subjects(subject_Name) VALUES("C++"),("C");
INSERT INTO Subjects(subject_Name) VALUES("English");
INSERT INTO Subjects(subject_Name) VALUES("Mathematics");

SELECT * FROM Subjects;

ALTER TABLE Members ADD CHECK(category = 'M' OR category = 'F');

INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Amit Natani", "Jhotwara", "Jodhpur", "M");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Gaurav Saini", "Pratap Nagar", "Alwar", "M");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Rohini Sharma", "Malviya Nagar", "Kota", "F");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Ankur Gupta", "Sitapura", "Jaipur", "M");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Ruhani Singh", "Vishali Nagar", "Tonk", "F");
INSERT INTO Members(member_name, addressLine1, addressLine2, category) VALUES("Mark Thomson", "Vidhyadhar Nagar", "Jaipur", "M");

SELECT * FROM Members;

INSERT INTO Title(title_Id, title_Name, subject_Id, publisher_Id) VALUES(1001, "C++ Complete Reference", 304, 202);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Standard Edition Java", 301, 201);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Basics Of C", 305, 206);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Learning Data Structure", 302, 204);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Learn English Perfect", 306, 203);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Formula Of Mathematics", 307, 205);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES("Database Concepts", 303, 207);

SELECT * FROM Title;

INSERT INTO Title_Author(title_Id, author_Id) values(1002, 101);
INSERT INTO Title_Author(title_Id, author_Id) values(1001, 102);
INSERT INTO Title_Author(title_Id, author_Id) values(1003, 104);
INSERT INTO Title_Author(title_Id, author_Id) values(1004, 101);
INSERT INTO Title_Author(title_Id, author_Id) values(1007, 102);
INSERT INTO Title_Author(title_Id, author_Id) values(1002, 105);
INSERT INTO Title_Author(title_Id, author_Id) values(1006, 103);
INSERT INTO Title_Author(title_Id, author_Id) values(1001, 103);
INSERT INTO Title_Author(title_Id, author_Id) values(1005, 104);
INSERT INTO Title_Author(title_Id, author_Id) values(1003, 102);

SELECT * FROM Title_Author;

INSERT INTO Books(accession_No, title_id, purchase_Date, price, status) VALUES(2001, 1001, "2014-09-23", 500.0, 0),(2002, 1001, "2014-09-23", 500.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2014-01-17", 700.0, 1);
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1004, "2013-03-06", 400.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1007, "2014-02-10", 350.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2015-07-24", 280.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1005, "2014-09-29", 370.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1006, "2014-08-16", 250.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2015-07-03", 700.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2013-10-19", 280.0, 0); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1006, "2013-12-24", 250.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1001, "2015-11-08", 500.0, 1); 
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1002, "2015-04-13", 700.0, 1);
INSERT INTO Books(title_id, purchase_Date, price, status) VALUES(1003, "2015-02-12", 280.0, 0);

SELECT * FROM Books;

INSERT INTO Book_Issue(accession_No, member_id) VALUES(2001, 1);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2004, 2);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2006, 3);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2007, 4);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2009, 5);
INSERT INTO Book_Issue(accession_No, member_id) VALUES(2013, 6);

SELECT * FROM Book_Issue;

INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-09-06", 2004, 2, "2015-09-09 13:12:02");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-09-07", 2002, 1, "2015-08-24");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-09-04", 2003, 3, "2015-08-21");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-08-25", 2008, 4, "2015-08-10");
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES("2015-08-31", 2005, 6, "2015-08-16");

SELECT * FROM Book_Return;

UPDATE Members SET addressLine2 = "Jaipur";

SELECT * FROM Members;

UPDATE Members SET addressLine1 = "EPIP Sitapura" WHERE category = "F";

SELECT * FROM Members;

Alter table Title DROP FOREIGN KEY First;

TRUNCATE TABLE Publishers;

SET @name = 'Katha Books';
SET @Id = 201;

INSERT INTO Publishers(publisher_Id, publisher_Name)
VALUES(@Id, @name);

SET @name = 'Jaico Publishing House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'India Book House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'NeelKanth Publication';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'Genius Publication';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'Ashirwaad Publication';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

SET @name = 'College Book House';
INSERT INTO Publishers(publisher_Name)
VALUES(@name);

DELETE FROM Title WHERE publisher_Id = 201;

SELECT * FROM Title;

SELECT * FROM Publishers;

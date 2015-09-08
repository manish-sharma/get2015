CREATE DATABASE LIS;

USE LIS;

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
FOREIGN KEY (subject_Id) REFERENCES Subjects(subject_Id),
FOREIGN KEY (publisher_Id) REFERENCES Publishers(publisher_Id)
);

CREATE TABLE Title_Author(
title_Id INT,
author_Id INT,
PRIMARY KEY(title_Id, author_Id),
FOREIGN KEY (title_Id) REFERENCES Title(title_Id),
FOREIGN KEY (author_Id) REFERENCES Author(author_Id)
);

CREATE TABLE Books(
accession_No INT PRIMARY KEY AUTO_INCREMENT,
title_Id INT,
purchase_Date DATE,
price REAL,
status INT 
CHECK (status = 0 OR status = 1)
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

CREATE TRIGGER book_due_date AFTER INSERT ON Book_Issue FOR EACH ROW
BEGIN
    UPDATE Book_Issue SET due_Date = DATE_ADD(NOW(), INTERVAL 15 DAY) where issue_Date = NOW();
END;;
DELIMITER ;

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


INSERT INTO Author(author_Id, author_Name) values(101, "Gaurav");
INSERT INTO Author(author_Name) values("Amit");
INSERT INTO Author(author_Name) values("Sanjay");
INSERT INTO Author(author_Name) values("Banwari");
INSERT INTO Author(author_Name) values("Rohit");
INSERT INTO Author(author_Name) values("Ankur");

SELECT * FROM Author;

INSERT INTO Publishers(publisher_Id, publisher_Name) values(201, "CBC");
INSERT INTO Publishers(publisher_Name) values("NK");
INSERT INTO Publishers(publisher_Name) values("TMH");
INSERT INTO Publishers(publisher_Name) values("Pearson");
INSERT INTO Publishers(publisher_Name) values("Jai Bhawani Publications");

INSERT INTO Subjects(subject_Id, subject_Name) values(301, "Java");
INSERT INTO Subjects(subject_Name) values("C++");
INSERT INTO Subjects(subject_Name) values("DBMS");
INSERT INTO Subjects(subject_Name) values("Linux");
INSERT INTO Subjects(subject_Name) values("Data Structures");

ALTER TABLE members ADD CHECK (category = 'm' OR category = 'f');

INSERT INTO members(member_Id, member_Name, addressLine1, addressLine2, category) VALUES(401, 'Gaurav', 'Pratap Nagar', 'Jaipur', 'm');
INSERT INTO members(member_Name, addressLine1, addressLine2, category) VALUES('Amit', 'Jhotwara', 'Jaipur', 'm');
INSERT INTO members(member_Name, addressLine1, addressLine2, category) VALUES('Arushi', 'Malviya Nagar', 'Jaipur', 'f');
INSERT INTO members(member_Name, addressLine1, addressLine2, category) VALUES('Deepali', 'Raja Park', 'Jaipur', 'f');
INSERT INTO members(member_Name, addressLine1, addressLine2, category) VALUES('Ankur', 'Pratap Nagar', 'Jaipur', 'm');

INSERT INTO Title(title_Id, title_Name, subject_Id, publisher_Id) VALUES(501, 'Java The complete reference', 301, 204);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES('Let Us C++', 302, 203);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES('Data Structures & Algorithms', 305, 201);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES('Red Hat Linux System Administration', 304, 202);
INSERT INTO Title(title_Name, subject_Id, publisher_Id) VALUES('DBMS The Complete Reference', 303, 204);

INSERT INTO Books(accession_No, title_Id, purchase_Date, price, status) values(901, 501, '2011-5-15', 500, 0);
INSERT INTO Books(title_Id, purchase_Date, price, status) values(502, '2012-6-14', 300, 1);
INSERT INTO Books(title_Id, purchase_Date, price, status) values(505, '2010-11-22', 650, 1);
INSERT INTO Books(title_Id, purchase_Date, price, status) values(503, '2014-5-4', 520, 1);
INSERT INTO Books(title_Id, purchase_Date, price, status) values(504, '2015-5-5', 200, 0);

INSERT INTO Title_Author(title_Id, author_Id) VALUES(501, 103);
INSERT INTO Title_Author(title_Id, author_Id) VALUES(502, 101);
INSERT INTO Title_Author(title_Id, author_Id) VALUES(503, 105);
INSERT INTO Title_Author(title_Id, author_Id) VALUES(504, 104);
INSERT INTO Title_Author(title_Id, author_Id) VALUES(505, 102);

INSERT INTO Book_Issue(accession_No, member_Id) VALUES(901, 401);
INSERT INTO Book_Issue(accession_No, member_Id) VALUES(903, 402);
INSERT INTO Book_Issue(accession_No, member_Id) VALUES(902, 403);
INSERT INTO Book_Issue(accession_No, member_Id) VALUES(905, 404);
INSERT INTO Book_Issue(accession_No, member_Id) VALUES(904, 405);

INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-16', 901, 401, '2015-09-08');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-17', 903, 402, '2015-09-08');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-11', 902, 403, '2015-09-08');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-12', 905, 404, '2015-09-08');
INSERT INTO Book_Return(return_Date, accession_No, member_Id, issue_Date) VALUES('2015-09-12', 904, 405, '2015-09-08');

UPDATE Members SET addressLine2 = "Jaipur";

SELECT * FROM Members;

UPDATE Members SET addressLine1 = "EPIP Sitapura" WHERE category = "f";

SELECT * FROM Members;

Alter table Title DROP FOREIGN KEY First;

TRUNCATE TABLE Publishers;

SET @name = 'Genius Publications';
SET @Id = 201;

INSERT INTO Publishers(publisher_Id, publisher_Name)
VALUES(@Id, @name);

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
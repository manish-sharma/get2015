-- Query to use library database
USE Library;
-- Query to create Members table in library database
CREATE TABLE Members(
memberId INT not NULL,
memberName VARCHAR(100),
addressLine1 VARCHAR(100),
addressLine2 VARCHAR(100),
gender char(1),
category VARCHAR(100),
PRIMARY KEY(memberId)
);
-- Query to create Publishers table in library database
CREATE TABLE Publishers(
publisherId INT not NULL,
publisherName VARCHAR(100),
PRIMARY KEY(publisherId)
);
-- Query to create Subjects table in library database
CREATE TABLE Subjects(
subjectId INT not NULL,
subjectName VARCHAR(100),
PRIMARY KEY(subjectId)
);
-- Query to create Title table in library database
CREATE TABLE Title(
titleId INT,
titleName VARCHAR(100),
subjectId INT,
publisherID INT,
FOREIGN KEY(publisherID) REFERENCES Publishers(publisherID)  ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY(subjectId) REFERENCES Subjects(subjectId)  ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(titleId)
);
-- Query to create Books table in library database
CREATE TABLE Books(
accessionNo INT not null,
titleId INT,
purchaseDate DATE,
price INT,
status VARCHAR(100),
FOREIGN KEY(titleId) REFERENCES Title(titleId)  ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(accessionNo)
);
-- Query to create Books_Issue table in library database
CREATE TABLE Books_Issue(
issueDate DATE not NULL,
accessionNo INT not NULL,
memberId INT not null,
dueDate DATE,
FOREIGN KEY(memberId) REFERENCES Members(memberId)  ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo)  ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(issueDate,accessionNo,memberId)
);
-- Query to create Books_Return table in library database
CREATE TABLE Books_Return(
returnDate DATE not NULL,
accessionNo INT not NULL,
memberId INT not NULL,
issueDate DATE,
FOREIGN KEY(memberId) REFERENCES Members(memberId)  ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo)  ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(returnDate,accessionNo,memberId)
);
-- Query to create Authors table in library database
CREATE TABLE Authors(
authorId INT not NULL,
authorName VARCHAR(100),
PRIMARY KEY(authorId)
);
-- Query to create Title_Author table in library database
CREATE TABLE Title_Author(
titleId INT not NULL,
authorId INT not NULL,
FOREIGN KEY(titleId) REFERENCES Title(titleId)  ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY(authorId) REFERENCES Authors(authorId)  ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY(titleId,authorId)

);
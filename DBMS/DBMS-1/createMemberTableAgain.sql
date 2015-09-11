-- Query to use library database
USE Library;
-- Query to create Members table in library database
CREATE TABLE Members(
memberId INT not NULL,
userName VARCHAR(100),
addressLine1 VARCHAR(100),
addressLine2 VARCHAR(100),
gender char(1),
category VARCHAR(100),
PRIMARY KEY(memberId)
);

SHOW TAbles;
-- Query to create Books_Issue table in library database
CREATE TABLE Books_Issue(
issueDate DATE not NULL,
accessionNo INT not NULL,
memberId INT not null,
dueDate DATE,
FOREIGN KEY(memberId) REFERENCES Members(memberId) ON DELETE CASCADE,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo) ON DELETE CASCADE,
PRIMARY KEY(issueDate,accessionNo,memberId)
);
-- Query to create Books_Return table in library database
CREATE TABLE Books_Return(
returnDate DATE not NULL,
accessionNo INT not NULL,
memberId INT not NULL,
issueDate DATE,
FOREIGN KEY(memberId) REFERENCES Members(memberId) ON DELETE CASCADE,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo) ON DELETE CASCADE,
PRIMARY KEY(returnDate,accessionNo,memberId)
);


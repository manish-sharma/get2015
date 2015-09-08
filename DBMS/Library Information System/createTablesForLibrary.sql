USE Library;

CREATE TABLE Users(
userId INT not NULL,
userName VARCHAR(100),
addressLine1 VARCHAR(100),
addressLine2 VARCHAR(100),
gender char(1),
PRIMARY KEY(userId)
);

CREATE TABLE Publishers(
publisherId INT not NULL,
publisherName VARCHAR(100),
PRIMARY KEY(publisherId)
);

CREATE TABLE Subjects(
subjectId INT not NULL,
subjectName VARCHAR(100),
PRIMARY KEY(subjectId)
);

CREATE TABLE Title(
titleId INT,
titleName VARCHAR(100),
subjectId INT,
publisherID INT,
FOREIGN KEY(publisherID) REFERENCES Publishers(publisherID)  ON UPDATE CASCADE ON DELETE CASCADE,

FOREIGN KEY(subjectId) REFERENCES Subjects(subjectId) ON DELETE CASCADE,
PRIMARY KEY(titleId)
);

CREATE TABLE Books(
accessionNo INT not null,
titleId INT,
purchaseDate DATE,
price INT,
status VARCHAR(100),
FOREIGN KEY(titleId) REFERENCES Title(titleId) ON DELETE CASCADE,
PRIMARY KEY(accessionNo)
);

CREATE TABLE Books_Issue(
issueDate DATE not NULL,
accessionNo INT not NULL,
userId INT not null,
dueDate DATE,
FOREIGN KEY(userId) REFERENCES Users(userId) ON DELETE CASCADE ,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo) ON DELETE CASCADE,
PRIMARY KEY(issueDate,accessionNo,userId)
);

CREATE TABLE Books_Return(
returnDate DATE not NULL,
accessionNo INT not NULL,
userId INT not NULL,
issueDate DATE,
FOREIGN KEY(userId) REFERENCES Users(userId) ON DELETE CASCADE,
FOREIGN KEY(accessionNo) REFERENCES Books(accessionNo) ON DELETE CASCADE,
PRIMARY KEY(returnDate,accessionNo,userId)
);

CREATE TABLE Authors(
authorId INT not NULL,
authorName VARCHAR(100),
PRIMARY KEY(authorId)
);

CREATE TABLE Title_Author(
titleId INT not NULL,
authorId INT not NULL,
FOREIGN KEY(titleId) REFERENCES Title(titleId) ON DELETE CASCADE,
FOREIGN KEY(authorId) REFERENCES Authors(authorId) ON DELETE CASCADE,
PRIMARY KEY(titleId,authorId)

);
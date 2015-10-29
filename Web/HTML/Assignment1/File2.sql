

INSERT INTO Members (Member_id,Member_name,AddressLine1,AddressLine2,Category) VALUES (1,"Riddhi","Chaura","Rasta","F");
INSERT INTO Members (Member_name,AddressLine1,Category) VALUES ("Rajat","Ajmer","M");
INSERT INTO Members (Member_name,AddressLine1,Category) VALUES ("Pankhuri","Jaipur","F");

SELECT * FROM Members;

INSERT INTO Books (Accession_no,Title_id,Purchase_Date,Price,Status) VALUES (10,1,NOW(),100,"A");
INSERT INTO Books (Title_id,Purchase_Date,Price,Status) VALUES (2,NOW(),120,"N A");
INSERT INTO Books (Title_id,Purchase_Date,Price,Status) VALUES (3,NOW(),170,"A");
INSERT INTO Books (Title_id,Purchase_Date,Price,Status) VALUES (4,NOW(),200,"A");

SELECT * FROM Books;

INSERT INTO Subjects(Subject_id,Subject_name) VALUES (401,'C');
INSERT INTO Subjects(Subject_id,Subject_name) VALUES (402,'Java');

SELECT * FROM Subjects;

INSERT INTO Publishers(Publisher_id,Publisher_name) VALUES(101,'Raghav');
INSERT INTO Publishers(Publisher_name) VALUES('Paras');

SELECT * FROM Publishers;

INSERT INTO Authors(Author_id,Author_name) VALUES (201,'Jayati');
INSERT INTO Authors(Author_id,Author_name) VALUES (202,'Shainee');

SELECT * FROM Authors;

INSERT INTO Titles (Subject_id,Title_id,Title_name,Publisher_id) VALUES ((SELECT Subject_id FROM Subjects WHERE Subject_name='C'),1,'Ansi C',(SELECT Publisher_id FROM Publishers WHERE Publisher_name='Raghav'));
INSERT INTO Titles (Subject_id,Title_id,Title_name,Publisher_id) VALUES ((SELECT Subject_id FROM Subjects WHERE Subject_name='Java'),2,'Complete Reference',(SELECT Publisher_id FROM Publishers WHERE Publisher_name='Paras'));

SELECT * FROM Titles;


INSERT INTO Title_Author (Title_id, Author_id) VALUES ((SELECT Title_id FROM Titles WHERE Title_name='Ansi C'), (SELECT Author_id FROM Authors WHERE Author_name='Jayati'));
INSERT INTO Title_Author (Title_id, Author_id) VALUES ((SELECT Title_id FROM Titles WHERE Title_name='Complete Reference'), (SELECT Author_id FROM Authors WHERE Author_name='Shainee'));

SELECT * FROM Title_Author;

INSERT INTO Book_issue (Accession_no,Member_id) VALUES ((SELECT Accession_no FROM Books WHERE Title_id=(SELECT Title_id FROM Titles where Title_name='Ansi C')), (SELECT Member_id FROM Members WHERE Member_name="Riddhi") );
INSERT INTO Book_issue (Accession_no,Member_id) VALUES ((SELECT Accession_no FROM Books WHERE Title_id=(SELECT Title_id FROM Titles where Title_name='Complete Reference')), (SELECT Member_id FROM Members WHERE Member_name="Rajat") );

SELECT * FROM Book_issue;


INSERT INTO Book_return (Accession_no,Member_id,Issue_date,Return_date) VALUES ((SELECT Accession_no FROM Books WHERE Title_id=(SELECT Title_id FROM Titles where Title_name='Ansi C')), (SELECT Member_id FROM Members WHERE Member_name="Riddhi") , (SELECT Issue_date FROM Book_issue WHERE Member_id=1),CURDATE());
INSERT INTO Book_return (Accession_no,Member_id,Issue_date,Return_date) VALUES ((SELECT Accession_no FROM Books WHERE Title_id=(SELECT Title_id FROM Titles where Title_name='Complete Reference')), (SELECT Member_id FROM Members WHERE Member_name="Rajat") , (SELECT Issue_date FROM Book_issue WHERE Member_id=2),CURDATE());

SELECT * FROM Book_return;
 
 
 
SET SQL_SAFE_UPDATES = 0;
 
UPDATE Members SET AddressLine2='Jaipur' ;
 
 
 
UPDATE Members SET AddressLine1="EPIP,Sitapura" WHERE Category='F';
 
 
 
ALTER TABLE Titles
DROP FOREIGN KEY Publisher_id_second;
 
TRUNCATE TABLE Publishers;
 
 
 
SET @publisher1 = 'Raghav';
INSERT INTO publishers (Publisher_name)
VALUES(@publisher1);


SET @publisher2 = 'Paras';
INSERT INTO publishers (Publisher_name)
VALUES(@publisher2);


 
DELETE FROM Titles WHERE Publisher_id=101;
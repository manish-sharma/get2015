/*Change value of addressLine2 column of Members table with “Jaipur”*/
UPDATE  members SET addressline2 = "Jaipur";

/*Change value of addressLine1 column of Members table with value “EPIP, Sitapura” for the members belonging to category “Student”.*/
Update  members set addressline1 = "EPIP, Sitapura"
where catagory = "student";

CREATE TEMPORARY TABLE publisher(SELECT * FROM publishers);

CREATE TEMPORARY TABLE title(SELECT * from titles);

DELETE FROM publishers;

INSERT INTO publishers (SELECT * FROM publisher);

INSERT INTO titles (SELECT * from title);

SELECT * FROM publishers;
DELETE FROM titles 
where publishers_id=1;
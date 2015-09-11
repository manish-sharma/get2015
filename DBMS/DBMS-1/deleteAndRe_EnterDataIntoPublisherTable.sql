-- Query to use Publishers table
Use Library;
-- Query to delete complete data of Publishers table 
DELETE FROM Publishers;
-- Query to set values of substitution variables
SET @name = 'Shyam Books';
SET @Id = 502;
-- Query to Insert the sample data back in Publishers table using substitution variables.
INSERT INTO Publishers(publisherId, publisherName) VALUES(@Id, @name);
-- Query to set values of substitution variables
SET @name = ' Cbc House';
SET @Id = 501;
-- Query to Insert the sample data back in Publishers table using substitution variables.
INSERT INTO Publishers(publisherId,publisherName) VALUES(@Id,@name);
-- Query to set values of substitution variables
SET @name = 'A M Publishers';
SET @Id = 503;
-- Query to Insert the sample data back in Publishers table using substitution variables.
INSERT INTO Publishers(publisherId,publisherName) VALUES(@Id,@name);
-- Query to display all rows of Publishers table
SELECT * FROM Publishers;

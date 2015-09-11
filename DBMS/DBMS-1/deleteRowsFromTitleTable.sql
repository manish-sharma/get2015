-- Query to use library database
USE Library;
-- Query to delete rows from Title table where publisherId=501
DELETE FROM Title WHERE publisherId=501;
-- Query to display data ofTitle table
select* from Title;
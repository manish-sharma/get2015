-- Query to use library database
USE Library;
-- Query to display those members who belong to the category as to which member 'raju' belongs
SELECT * FROM Members WHERE category=(SELECT category FROM Members WHERE memberName='raju');
-- Query to display those members who belong to the category as to which member 'rajshree' belongs
SELECT * FROM Members WHERE category IN (SELECT category FROM Members WHERE memberName='rajshree'); 

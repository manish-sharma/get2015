-- Query to use library database
USE Library;
-- Query to update addressLine2 Column value with 'Jaipur' in Members table
UPDATE Members SET addressLine2 = 'Jaipur';
-- Query to display  data of Members table
select* from Members;
-- Query to update addressLine1 Column value with 'EPIP, Sitapura' in Members table where category is 'Faculty'
UPDATE Members set addressLine1 = 'EPIP, Sitapura' where category ='Faculty';
select* from Members;
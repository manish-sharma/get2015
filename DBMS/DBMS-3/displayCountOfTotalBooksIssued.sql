-- Query to use library database 
USE Library;
-- Query to display total count of books issued
SELECT COUNT(userId) as Total_Books_Issued FROM Books_Issue;
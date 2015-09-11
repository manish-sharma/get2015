-- Query to use library database
USE Library;
-- Query to display the information from Books_Issue table for the books which can be returned after 2 months
SELECT* FROM Books_Issue 
WHERE PERIOD_DIFF(DATE_FORMAT(dueDate, '%Y%m'), DATE_FORMAT(issueDate, '%Y%m'))>2;
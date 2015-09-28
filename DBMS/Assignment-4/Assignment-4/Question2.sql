-- Query for Assignment 2 Question 1
Create VIEW book_issue_details AS 
SELECT m1.member_nm, b1.issue_dt,b1.accession_no,b1.member_id,b1.due_dt
from members m1 INNER JOIN book_issue b1 ON m1.member_id = b1.member_id;
-- Query for Assignment 2 Question 2
Create VIEW member_details AS
SELECT member_nm,member_id,IF(category = "F","FACULTY",
IF(category = "S","STUDENTS",IF (category = "O","OTHERS",NULL))) from members; 
-- Query for Assignment 2 Question 3
CREATE VIEW v3 AS SELECT s1.subject_nm,t1.title_nm,t1.title_id,m1.member_nm,m1.category,
b1.issue_dt,b1.due_dt,b2.return_dt AS Return_date from subjects s1 
INNER JOIN titles t1 ON s1.subject_id = t1.subject_id 
INNER JOIN books ON books.title_id = t1.title_id 
INNER JOIN book_issue b1 ON books.accession_no = b1.accession_no
INNER JOIN members m1 ON m1.member_id = b1.member_id
LEFT OUTER JOIN book_return b2 ON b2.member_id = b1.member_id;


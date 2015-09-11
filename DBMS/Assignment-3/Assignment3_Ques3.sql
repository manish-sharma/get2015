-- Assignment 3 - Sub Assignment 2 --
-- 2-1 Query to return the subject nd title details of all the book purchaes and their count --
SELECT s.subject_id,s.subject_nm,COUNT(t.title_id) AS Number_Of_Books_Purchased 
FROM subjects s JOIN titles t ON s.subject_id = t.subject_id GROUP BY(subject_nm); 

-- 2-2 Query to show the details of book issues for more than 2 months --
SELECT * from book_issue b1 where (FLOOR((DATEDIFF(b1.due_dt,b1.issue_dt))/30))>2;

-- 2-3 Query to retun all the rows whose price is greater than minimum price of book -- 
SELECT * from books where price > ( SELECT MIN(price) from books);
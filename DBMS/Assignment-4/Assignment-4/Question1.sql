-- Assignment 1 Question 1 -- 
SELECT member_nm from members where category = 
(SELECT category FROM members where member_nm = "Shishir Pareek") AND member_nm != "Shishir Pareek";

-- Query for Assignment 1 Question 2 -- 
SELECT b1.issue_dt,m1.member_nm,m1.member_id,t1.title_nm,t1.title_id,b1.due_dt from book_issue b1
INNER JOIN books b2 ON b2.accession_no = b1.accession_no 
INNER JOIN titles t1 ON t1.title_id = b2.title_id 
INNER JOIN members m1 ON m1.member_id = b1.member_id 
where NOT EXISTS (SELECT br.member_id, br.issue_dt, br.accession_no FROM
book_return br WHERE br.issue_dt = b1.issue_dt AND br.member_id = b1.member_id 
AND br.accession_no = b1.accession_no);

-- Query for Assignment 1 Question 3 -- 
SELECT b1.issue_dt,m1.member_nm,m1.member_id,t1.title_nm,t1.title_id,b1.due_dt from book_issue b1
INNER JOIN books b2 ON b2.accession_no = b1.accession_no 
INNER JOIN titles t1 ON t1.title_id = b2.title_id 
INNER JOIN members m1 ON m1.member_id = b1.member_id 
where EXISTS (SELECT br.member_id, br.issue_dt, br.accession_no FROM
book_return br WHERE br.issue_dt = b1.issue_dt AND br.member_id = b1.member_id 
AND br.return_dt > b1.due_dt);

-- Query for Assignment 1 Question 4 -- 
SELECT * from books where price = (SELECT MAX(price) FROM Books);

-- Query for Assignment 1 Question 5 --
SELECT price
FROM books
WHERE price = (SELECT MAX(price) FROM books WHERE price < (SELECT MAX(price) FROM books));
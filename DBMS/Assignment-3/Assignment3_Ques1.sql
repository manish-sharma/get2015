Use lis;
SELECT * from book_issue;
UPDATE book_issue SET due_dt = "2015-11-11" where member_id = "1";
UPDATE book_issue SET due_dt = "2015-12-10" where member_id = "2";
UPDATE book_issue SET due_dt = "2015-10-13" where member_id = "3";
UPDATE book_issue SET due_dt = "2015-12-12" where member_id = "5";
SELECT m1.member_nm,m1.member_id,t1.title_nm,b1.accession_no,b1.issue_dt,
b1.due_dt,FLOOR(DATEDIFF(b1.due_dt,b1.issue_dt)/30) AS Months FROM members m1 JOIN book_issue b1 ON
m1.member_id = b1.member_id JOIN books b2 ON b1.accession_no = b2.accession_no JOIN titles t1
ON t1.title_id = b2.title_id ORDER BY t1.title_nm,m1.member_nm where = FLOOR(DATEDIFF(b1.due_dt,b1.issue_dt)/30) > 2;
SELECT m1.member_nm,MAX(LENGTH(m1.member_nm)) AS Maximum_Length FROM members m1;
SELECT COUNT(b1.status) AS No_Of_Book_issued FROM books b1 where b1.status = "Issued";

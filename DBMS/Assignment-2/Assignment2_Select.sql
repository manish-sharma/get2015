SELECT * FROM book_issue;

SELECT member_nm,member_id,category FROM members;

SELECT DISTINCT category FROM members;

SELECT member_nm,member_id,category FROM members where category = "F";

SELECT member_nm,category FROM members Order BY member_nm DESC;

SELECT subjects.subject_id,subjects.subject_nm,titles.title_id,titles.title_nm,
publishers.publishers_id,publishers.publisher_nm 
FROM subjects join titles ON subjects.subject_id = titles.subject_id
join publishers ON publishers.publishers_id = titles.publishers_id;

SELECT category, COUNT(*) FROM members GROUP BY category;

SELECT  m1.member_nm FROM members m1 INNER JOIN members m2 ON m1.category = m2.category AND m2.member_nm = "Keshav Sharma"
AND m1.member_nm != m2.member_nm;
TRUNCATE TABLE book_return;

SELECT book_issue.issue_dt AS Issue_Date,book_issue.accession_no AS Access_Number,book_issue.member_id,IFNULL(book_return.return_dt,"") as Return_Date 
FROM book_issue LEFT OUTER Join book_return ON book_issue.accession_no = book_return.accession_no AND book_issue.member_id= book_return.member_id;


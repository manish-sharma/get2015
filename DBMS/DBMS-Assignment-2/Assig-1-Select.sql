USE lis;

SELECT * FROM member;

SELECT member_id,member_name,category FROM member;

SELECT member_name,member_id,category FROM member WHERE category='F';

SELECT DISTINCT category from member;

SELECT member_name,category 
FROM member 
ORDER BY  member_name DESC; 

SELECT title_id,title_name,s.subject_name,p.publisher_name 
FROM titles,subjects s,publishers p 
WHERE titles.subject_id=s.subject_id 
AND titles.publisher_id=p.publisher_id;

SELECT category,COUNT(category) 
FROM member GROUP BY category;

SELECT m1.member_name,m1.category FROM member m1 
LEFT JOIN member m2 
ON m1.category= m2.category WHERE m2.member_name='SUMAN';

SELECT i.issue_date,i.accession_no,i.member_id,r.return_date
FROM book_issue i LEFT JOIN book_return r
ON i.accession_no=r.accession_no;

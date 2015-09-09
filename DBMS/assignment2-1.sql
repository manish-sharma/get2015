use LIS;

SELECT * FROM MEMBER;

SELECT member_id,member_name,category FROM MEMBER;

SELECT member_id,member_name,category FROM MEMBER WHERE category="F";

SELECT DISTINCT category FROM MEMBER as Category;

SELECT member_name,category FROM MEMBER ORDER BY member_name DESC;

SELECT title,e.pub_name, sub_id FROM Title t , Publisher e WHERE t.pub_id=e.pub_id;

SELECT distinct category ,COUNT(member_name) FROM MEMBER GROUP BY category  ;


SELECT m.member_name FROM MEMBER m 
JOIN  MEMBER mem 
ON m.category =mem.category
where mem.member_name='keshav';

select  issue_date as issuedOn, IF(due_date>curdate(),null,due_date) as returnOn  ,accession_no as BookAccessionNo,member_id as issuedBy  from BOOK_ISSUE;

select  issue_date as issuedOn, IF(due_date>curdate(),null,due_date) as returnOn  ,accession_no as BookAccessionNo,member_id as issuedBy  from BOOK_ISSUE order by issue_date asc ;




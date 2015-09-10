--to create and use the database
CREATE DATABASE lis;
USE lis;
-- Query to find the columns of table members
SELECT 
    *
FROM
    MEMBER;
-- Query to find the member id,member name,category of table members
SELECT 
    member_id, member_name, category
FROM
    MEMBER;
	
-- Query to find the member id,member name,category of table members whose category = "f"
SELECT 
    member_id, member_name, category
FROM
    MEMBER
WHERE
    category = 'f';
	
-- Query to find distinct category of table members
SELECT DISTINCT
    category
FROM
    MEMBER as Category;

-- Query to find the member id,member name of table members order by desc

SELECT 
    member_name, category
FROM
    MEMBER
ORDER BY member_name DESC;

-- Query to find the title name,publisher name, subject id of table
SELECT 
    t.title, p.pub_name, s.sub_id
FROM
    TITLE t,
    PUBLISHER p,
    SUBJECTS s
WHERE
    t.pub_id = p.pub_id;
	
-- Query to find the count of members of category
SELECT distinct
    category, COUNT(member_name)
FROM
    MEMBER
GROUP BY category  ;

-- Query to find name of members to which amit belongs
SELECT 
    m.member_name
FROM
    MEMBER m
        JOIN
    MEMBER mem ON m.category = mem.category
where
    mem.member_name = 'ankur';

-- Query to find the status of return book and if returned  then place blank
select 
    issue_date as issuedOn,
    IF(due_date > curdate(), null, due_date) as returnOn,
    accession_no as BookAccessionNo,
    member_id as issuedBy
from
    BOOK_ISSUE;


-- Assignment 2
-- Query to  display results in ascending order of issue date and within issue date in ascending order of members name.
select 
    b.issue_date as issuedOn,
    IF(b.due_date > curdate(),
        null,
        b.due_date) as returnOn,
    b.accession_no as BookAccessionNo,
    b.member_id as issuedBy,
    m.member_name AS name
from
    BOOK_ISSUE b,
    member m
where
    m.member_id = b.member_id
order by issue_date asc
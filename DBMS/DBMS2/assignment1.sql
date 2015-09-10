-- to use library database
USE library;

-- to select all rows from members
SELECT * FROM members;

-- to select name, id, category from members table
SELECT member_name,member_id,category FROM members;

-- to select name, id, category from members table where category is F
SELECT member_name,member_id,category FROM members WHERE category='F';

-- to select distinct category from members
SELECT DISTINCT category FROM members;

-- to select name, category in descending order
SELECT member_name,category FROM members ORDER BY member_name DESC;

-- to display all the titles subject and publishers
SELECT t.title_name,s.subject_name,p.publisher_name 
FROM titles t,subjects s,publisher p 
WHERE t.subject_id=s.subject_id AND t.publisher_id=p.publisher_id;

-- count numbers of members present in category
SELECT category, COUNT(*) FROM members GROUP BY category;

-- to insert a row 
INSERT INTO members(member_name,addressline1,addressline2,category)
VALUES('KESHAV SHARMA','METACUBE','JAIPUR','M');

-- to get all the member information from members which has category similar to KESHAV SHARMA
SELECT m.member_name,m.category FROM members m 
JOIN members m1 ON m1.category = m.category AND m1.member_name='KESHAV SHARMA';

-- to select all the information of book issued
SELECT issue_date,accession_no,member_id, IF(due_date<NOW(),due_date,NULL) FROM book_issue;
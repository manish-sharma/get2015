
USE LIS;

/*1. Create a View which can be used to display member name and
all issue details of the member using a simple SELECT command.
*/

CREATE VIEW MembeIssueDetails
AS
SELECT m.member_name,bi.member_id,bi.accession_no,bi.issue_date,bi.due_date 
FROM member m,book_issue bi 
WHERE m.member_id=bi.member_id;

/*show view MembeIssueDetails*/

SELECT * FROM MembeIssueDetails;

/*2. Create a View which contains three columns, member name,
member id and full description of category, i.e., Faculty, Students
and Others instead of F,S and O.
*/

CREATE VIEW MemberDetails
AS
SELECT member_id,member_name,
if (category = 'O' ,'OTHER',if (category = 'S' ,'STUDENT',if (category = 'F' ,'FACULTY',category)))  AS category
FROM member;

/*show view MemberDetails*/

SELECT * FROM MemberDetails;

/*3. Create a View which contains the information – subject name,
title, member name, category, issue date, due date and return
date. If the books have not been returned, NULL should be
displayed instead of return date.
*/

CREATE VIEW Information
AS
SELECT m.member_name,m.category,s.subject_name,t.title_name,bi.issue_date,bi.due_date,br.return_date
FROM book_issue  bi
LEFT JOIN book_return br
ON (bi.accession_no=br.accession_no) AND (bi.member_id=br.member_id)
INNER JOIN member m
ON bi.member_id=m.member_id
INNER JOIN books b
ON bi.accession_no=b.accession_no
INNER JOIN titles t
ON b.title_id=t.title_id
INNER JOIN subjects s
ON t.subject_id=s.subject_id;

/*show view Information*/

SELECT * FROM Information;

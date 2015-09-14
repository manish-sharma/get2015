-- View  used to display member name and
-- all issue details of the member using a simple SELECT command.
CREATE VIEW BookIssueInfo
AS
SELECT m.member_id, m.member_name, bi.issue_date,bi.due_date,bi.accession_no
FROM members m,book_issue bi
WHERE m.member_id = bi.member_id ;
SELECT * FROM BookIssueInfo;




-- View which contains three columns, member name,
-- member id and full description of category, i.e., Faculty, Students
-- and Others instead of F,S and O.
CREATE VIEW MemberInfo
AS
SELECT member_id,member_name,IF(category='F','Faculty',IF(category='S','Student','Others'))AS category
FROM members ;
SELECT * FROM MembertInfo;




-- View which contains the information – subject name,
-- title, member name, category, issue date, due date and return
-- date. If the books have not been returned, NULL should be
-- displayed instead of return date
-- to take all rows from book return
CREATE VIEW CompleteInformation
AS
SELECT s.subject_name,t.title_name ,m.member_name,m.category,bi.issue_date,bi.due_date,br.return_date  
FROM titles t,subjects s,members m,books b,book_issue bi
LEFT JOIN
book_return br 
on 
bi.accession_no=br.accession_no 
AND bi.member_id=br.member_id 
AND bi.issue_date=br.issue_date
WHERE bi.accession_no=b.accession_no 
AND bi.member_id=m.member_id 
AND b.title_id=t.title_id 
AND t.subject_id=s.subject_id
ORDER BY s.subject_name;
SELECT * FROM CompleteInfo;
-- question 1
CREATE VIEW MemberName 
AS 
SELECT M.member_name,M.member_id,T.title_Name,T.title_id,B.accession_No,B.issue_Date,B.due_Date , DATEDIFF(due_Date,issue_Date ) AS diffdate  
from members M,book_issue B,titles T, books BK
WHERE (M.member_id = B.member_id && T.title_id = BK.title_id && BK.accession_No = B.accession_No) 
order By member_name ,title_Name;

SELECT member_name, member_id, title_name as book_issued, accession_no, issue_date, due_date
FROM MemberName;

-- question 2
CREATE VIEW MEMBER
AS
SELECT member_name, member_id, if(category = 'm', 'student',if(category = 'f', 'faculty', 'other')) as category 
FROM members;
select * from MEMBER;

-- question 3
CREATE VIEW book_information
AS
SELECT M.member_name, T.title_name, S.subject_name AS category, BI.issue_date, BI.due_date, 
if(BR.return_date = '', 'NULL', BR.return_date) AS return_date
FROM subjects S, titles T, members M, books BK, book_issue BI
LEFT JOIN book_return BR
ON (BI.accession_no = BR.accession_no && BI.member_id = BR.member_id)
WHERE M.member_id = BI.member_id && T.title_id = BK.title_id && BK.accession_No = BI.accession_No && S.subject_id = T.subject_id
ORDER BY M.member_name;

select * from book_information;

-- to get information about issued books in ascending order firs on issue date then members name

SELECT b.issue_date ,b.accession_no,b.member_id,m.member_name,
IF(due_date<NOW(),due_date,NULL) FROM book_issue b,members m
WHERE b.member_id=m.member_id ORDER BY b.issue_date ASC,m.member_name ASC; 
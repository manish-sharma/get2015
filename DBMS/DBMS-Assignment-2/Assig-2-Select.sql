USE lis;

SELECT i.issue_date,i.accession_no,i.member_id,r.return_date
FROM book_issue i LEFT JOIN book_return r
ON i.accession_no=r.accession_no 
ORDER BY i.issue_date,i.member_id,(SELECT member_name FROM member where i.member_id=member.member_id) ASC;
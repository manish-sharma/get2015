-- to display book information of those books issued more than two months
SELECT m.member_name,m.member_id,t.title_name,bi.accession_no,bi.issue_date,bi.due_date
FROM book_issue bi,members m,titles t,books b
WHERE m.member_id=bi.member_id AND bi.accession_no=b.accession_no AND b.title_id=t.title_id
AND DATEDIFF(bi.due_date,bi.issue_date)>60;


-- to display those member information that has same or greater length than maximum name length
SELECT member_id,member_name,LENGTH(member_name) AS length
FROM members
WHERE LENGTH(member_name) = (SELECT MAX(LENGTH(member_name)) FROM members);


-- to display total number of books issued
SELECT COUNT(*),issue_date FROM book_issue 
GROUP BY(issue_date);
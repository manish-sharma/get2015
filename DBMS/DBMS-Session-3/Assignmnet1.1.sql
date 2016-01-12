-- Display information of iisued book more than 2 month 
SELECT  m.member_nm , bi.member_id,t.title_nm, bi.accession_no , bi.issue_dt,bi.due_dt, DATEDIFF(bi.due_dt, bi.issue_dt) AS DateDiff
FROM  book_issue bi JOIN members m ON bi.member_id = m.member_id
JOIN books b ON bi.accession_no = b.accession_no
JOIN titles t ON b.title_id = t.title_id
WHERE DATEDIFF(bi.due_dt, bi.issue_dt) > 59 ;

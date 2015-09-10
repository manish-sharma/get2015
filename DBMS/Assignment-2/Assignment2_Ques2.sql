SELECT book_issue.issue_dt AS Issue_Date,
book_issue.accession_no AS Access_Number,book_issue.member_id,
IFNULL(book_return.return_dt,"") as Return_Date ,m.member_nm AS Member_Name
FROM book_issue
LEFT OUTER Join book_return ON 
book_issue.accession_no = book_return.accession_no AND 
book_issue.member_id= book_return.member_id  
JOIN members m ON m.member_id = book_issue.member_id ORDER BY m.member_nm , issue_date; 


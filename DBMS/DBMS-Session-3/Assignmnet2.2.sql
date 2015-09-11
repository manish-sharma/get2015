  -- Display the record of book-issue table which will be returned after to months from the date of issue
  SELECT issue_dt AS "Issue Date", accession_no AS "Accession Number", member_id AS "Member ID" , due_dt AS "Due Date"
  FROM book_issue 
  where DATEDIFF( due_dt , issue_dt) > 60;  
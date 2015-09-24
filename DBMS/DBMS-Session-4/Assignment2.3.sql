  -- Create view which contains the information subject name, title name, member name,  category , issue date, due date and return date
   CREATE VIEW issue_book_info AS 
   SELECT s.subject_nm AS "Subject", t.title_nm AS "Title", m.member_nm AS "Member", m.category AS "Member's Category",
   bi.issue_dt AS "Issue Date", bi.due_dt "Due Date", br.return_dt "Return Date"  
   FROM book_issue bi JOIN members m ON bi.member_id = m.member_id
        left JOIN book_return br ON bi.accession_no = br.accession_no
        JOIN books b ON b.accession_no = bi.accession_no
        JOIN titles t ON b.title_id = t.title_id 
        JOIN subjects s ON s.subject_id = t.subject_id;
        
   
   -- Display view
   
   SELECT * FROM issue_book_info;
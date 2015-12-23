  USE lib_info_sys2;
  -- Display the information of books that have not been returned till date   
  SELECT bi.issue_dt AS "Issue DATE", t.title_nm AS "Title Name", m.member_nm AS "Member Name", bi.due_dt AS "Due Date"
  FROM book_issue bi 
  JOIN members m ON m.member_id = bi.member_id
  JOIN books b ON b.accession_no = bi.accession_no
  JOIN titles t ON t.title_id = b.title_id
  WHERE bi.accession_no NOT IN 
                            (
                              SELECT br.accession_no
                              FROM book_return  br                          
                            );
  -- Display informations on book issued for all Categories ecxepts Faculty 
  SELECT t.title_nm  AS "Title of books", bi.accession_no AS "Accession Number"
  FROM books b JOIN book_issue bi ON b.accession_no = bi.accession_no
  JOIN members m ON bi.member_id = m.member_id
  JOIN titles t ON b.title_id = t.title_id
  WHERE category <> 'Faculty';  
  
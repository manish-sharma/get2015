  -- Display information of titles in which book is purchased more than two times
  SELECT DISTINCT t.title_id AS "Title Id", t.title_nm AS "Title Name"
  FROM titles t JOIN books b ON t.title_id = b.title_id
  JOIN book_issue bi ON b.accession_no = bi.accession_no
  GROUP BY t.title_id
  HAVING COUNT(bi.accession_no) > 2;
  
  
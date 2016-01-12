  -- Display The Detail of books having Price greater than the book which have minimum price purchesed so far
  SELECT title_nm  AS "Title of books", accession_no AS "Accession Number", price  
  FROM books JOIN titles ON books.title_id = titles.title_id
  WHERE price > (SELECT MIN(price) FROM books);  
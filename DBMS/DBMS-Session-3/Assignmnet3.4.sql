  -- Display information of authors whose at least one book has been purchased  
  SELECT DISTINCT a.author_id AS "Author id", a.author_nm AS "Author's Name" 
  FROM authors a JOIN title_author ta ON a.author_id = ta.author_id
                 JOIN books b ON b.title_id = ta.title_id;
  
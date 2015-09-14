  USE lib_info_sys2;
  -- Display the information of books that have price maximum  
  SELECT t.title_nm AS "Title Name", b.accession_no AS "Accession No",purchase_dt "Purchase Date" , price "Price"
  FROM books b JOIN titles t ON t.title_id = b.title_id
  WHERE b.price =  
                           (
                              SELECT MAX(price)
                              FROM books
                            );
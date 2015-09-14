  USE lib_info_sys2;
  -- Display the the 2nd maximum price of purchased books 
  SELECT DISTINCT price AS "2nd Maximum Price"
  FROM books 
  ORDER BY price DESC
  LIMIT 1 OFFSET 1;
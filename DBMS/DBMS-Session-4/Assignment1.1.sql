  USE lib_info_sys2;
  -- Display the name of members whose category same as to keshav sharma  
  SELECT member_nm AS "Member Name" 
  FROM members 
  WHERE category IN (
                            SELECT category
                            FROM members 
                            WHERE member_nm = 'Keshav Sharma'
                          
                    );
  USE lib_info_sys2;
  -- Create view of members table contaning member name , member id and detailed category  
  CREATE VIEW member_view AS
  SELECT member_nm AS "Member Name", member_id AS "Member ID", category AS "Category"
  FROM members;
  
  
  -- Display view
  SELECT * FROM member_view;
  
  -- Create view of members table contaning member name , member id and short category 
  CREATE VIEW member_view1 AS
  SELECT member_nm AS "Member Name", member_id AS "Member ID", 
                                                              CASE category 
                                                                WHEN 'Faculty' THEN 'F' 
                                                                WHEN 'Student' THEN 'S'
                                                                ELSE 'O'
                                                              END   AS "Category"
  FROM members;
  
  
  -- Display view
  SELECT * FROM member_view1;

  USE lib_info_sys2;
  -- Create view of members table contaning member name , member id and detailed category  
  CREATE VIEW member_view AS
  SELECT member_nm AS "Member Name", member_id AS "Member ID", category AS "Category"
  FROM members;
  
  
  -- Display view
  SELECT * FROM member_view;
  USE lib_info_sys2;
  -- Create view of members table contaning member name and all book issued details  \
  CREATE VIEW member_issue_detail AS
  SELECT member_nm AS "Member Name", count(member_nm) AS "Number of book issues"
  FROM members m JOIN book_issue bi ON  m.member_id = bi.member_id
  GROUP BY member_nm;
  
  -- Display view
  SELECT * FROM member_issue_detail;
  
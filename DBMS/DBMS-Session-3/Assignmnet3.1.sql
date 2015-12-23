  -- Display The count of total numbres of students and then faculty and the
  
  SELECT SUM(IF(category = 'Faculty', 1, 0)) AS "Faculty",
         SUM(IF(category = 'Student', 1, 0)) AS "Student",
         SUM(IF(category NOT IN ('Faculty' , 'Student'), 1, 0)) AS "Other" 
  FROM members;
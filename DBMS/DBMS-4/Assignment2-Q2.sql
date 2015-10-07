-- Query to use library database
USE Library;
-- Query to Create a View which contains three columns, member name, member id and full description of category, 
-- i.e., Faculty, Students and Others instead of F,S and O
CREATE VIEW View_For_Members_Table
AS (SELECT memberId,memberName,CASE WHEN category='Faculty' THEN 'Faculty1' WHEN category='Student' THEN 'Student1' ELSE 'Other1' END
AS category FROM Members);
-- Query to display data of view View_For_Members_Table
SELECT * FROM View_For_Members_Table ;




 
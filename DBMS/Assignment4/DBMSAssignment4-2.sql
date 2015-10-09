
-- question 1
CREATE VIEW issueDetailsOfBooks AS SELECT m.Member_name,bi.Member_id,t.Title_name,bi.Issue_date,bi.Due_date
FROM Members m INNER JOIN Book_issue bi ON 
bi.Member_id=m.Member_id 
INNER JOIN Books b ON b.Accession_no=bi.Accession_no 
INNER JOIN Titles t ON t.Title_id=b.Title_id ;


-- question 2
CREATE VIEW fullDescriptionOfCategory AS SELECT Member_id,Member_name,IF(Category='F','Faculty',
IF(Category='M','Mentor',IF(Category='O','Others',NULL))) AS Category FROM Members;


-- question 3
CREATE VIEW returnDetailsOfBooks AS SELECT s.Subject_name,t.Title_id,m.Member_name,
m.Category,bi.Issue_date,bi.Due_date,br.Return_date 
FROM  Book_return br RIGHT OUTER JOIN
Book_issue bi ON br.Member_id=bi.Member_id
INNER JOIN Members m ON bi.Member_id=m.Member_id 
INNER JOIN Books b ON b.Accession_no=bi.Accession_no 
INNER JOIN Titles t ON b.Title_id=t.Title_id 
INNER JOIN Subjects s ON s.Subject_id=t.Subject_id ;


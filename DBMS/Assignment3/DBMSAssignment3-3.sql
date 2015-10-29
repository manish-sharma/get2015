

-- Select command to display total number of g=faculty mentors and others in a single row
SELECT COUNT(IF(Category='F',Category,NULL)) AS TotalNoOfFaculty, COUNT(IF(Category='M',Category,NULL)) AS TotalNoOfMentors,
COUNT(IF(Category='_',Category,NULL)) AS TotalNoOfOthers FROM Members;

-- Select command to display information of those titles issued for more than 2 times
SELECT Title_name FROM Titles t INNER JOIN Books b ON t.Title_id=b.Title_id
INNER JOIN Book_issue bi ON bi.Accession_no=b.Accession_no GROUP BY(b.Accession_no) HAVING COUNT(b.Accession_no)>2;

-- Select command to display information on books issued to members of category f
SELECT * FROM Book_issue WHERE Member_id IN (SELECT Member_id FROM Members WHERE Category!='F');

-- command to display information of those authors for which atleast one book has been purchased
SELECT DISTINCT Author_name FROM Authors a INNER JOIN Title_author ta ON ta.Author_id=a.author_id
INNER JOIN Titles t ON t.Title_id=ta.Title_id 
INNER JOIN Books b ON b.Title_id=t.Title_id;
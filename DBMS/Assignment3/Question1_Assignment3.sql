-- question 1
SELECT M.member_name,M.member_Id,T.title_Name,T.title_Id,B.accession_No,B.issue_Date,B.due_Date , DATEDIFF(due_Date,issue_Date ) AS diffdate  
from members M,book_issue B,titles T, books BK
WHERE (M.member_id = B.member_id && T.title_id = BK.title_id && BK.accession_No = B.accession_No) &&( DATEDIFF(B.due_Date,B.issue_Date )) > 60 
order By member_name ,title_Name;

-- question 2
select member_name, length( member_name ) from Members where length( member_name ) = ( select max( length( member_name ) ) 
from Members );

-- question 3
SELECT COUNT(*) from Book_Issue GROUP BY (issue_Date);


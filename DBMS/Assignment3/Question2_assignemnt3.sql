SELECT subject_name, S.subject_Id, count(t.title_id) as "Number Of books purchased" FROM subjects S, titles T 
where T.subject_id = S.subject_Id GROUP BY(subject_id);

-- Question -2
SELECT M.member_name,M.member_Id,T.title_Name,T.title_Id,B.accession_No,B.issue_Date,B.due_Date , DATEDIFF(due_Date,issue_Date ) AS DiffDate  
from members M,Book_Issue B,titles T, books BK
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) &&( DATEDIFF(b.due_Date,b.issue_Date )) > 60 ;

-- Question -3
SELECT accession_No,title_Id, purchase_Date, price, status from books WHERE price > (SELECT MIN(price) FROM books);

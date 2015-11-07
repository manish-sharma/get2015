-- question 1
select count(if(category="m",member_name,null))as number_of_faculty ,count(if(category="f",member_name,null)) as number_of_other 
from members ;

-- question 2
select T.title_name as TitleName,count(B.accession_no) as number 
from book_issue B, titles  T,books BK 
where BK.accession_no = B.accession_no and T.title_id = BK.title_id
group by T.title_Name HAVING count(T.title_Name) ;

-- question 3
select M.member_name as Name,M.category as Category,B.member_id as ID,T.title_name as Title, BK.accession_no as AccessionNumber,B.issue_date as IssuedON, B.due_date as SubmittedON
from book_issue B,members M,titles T ,books BK where M.member_id = B.member_id and BK.accession_no = B.accession_no and T.title_id = BK.title_id and
M.category NOT IN("F");

-- question 4
select distinct A.author_id as ID,concat(A.author_fname," ", A.author_lname) as Name from authors A,books B,title_author TA
where TA.title_id = B.title_id and A.author_id = TA.author_id;
desc authors;
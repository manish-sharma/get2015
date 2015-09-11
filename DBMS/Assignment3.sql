-- Question 1
select count(if(category = 'f',category,null)) as teacher_count, count(if(category = 's',category,null)) as student_count ,
count(if(category = 'f',category,null)) as others_count
from members;

-- question 2
select title.title_Id,title_Name 
from title,books,book_issue
where book_issue.accession_No = books.accession_No and books.title_Id = title.title_Id
group by title.title_Id
having count(title.title_Id) >= 2;

-- Question 3
select distinct books.title_id,title.title_name
from books,book_issue,title,members
where book_issue.accession_no = books.accession_no and books.title_Id = title.title_Id and book_issue.member_Id = members.member_Id
and members.category not In ('f');
-- Question 4
select distinct author.author_Name, author.author_Id from author,title_author,books where author.author_Id = title_author.author_Id
and title_author.title_Id = books.title_Id;

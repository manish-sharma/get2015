
select member_Name 
from members 
where category in (select category from members where member_Name = 'amit natani');


select book_issue.issue_date,member_books.member_name,title_name,book_issue.due_date
from book_issue,(select member_id,member_name,title_name,accession_No
from members,(select title.title_Name,books.accession_no
    from title,books where title.title_id = books.title_id)as book_title) as member_books
where (book_Issue.member_Id,book_issue.accession_no,book_Issue.issue_date)not in 
(select member_Id,accession_No,issue_date from book_return)
and member_books.member_Id =book_Issue.member_Id and member_books.accession_no = book_Issue.accession_No;



select book_issue.issue_date,member_books.member_name,title_name,book_issue.due_date
from book_issue,book_return ,(select member_id,member_name,title_name,accession_No
from members,(select title.title_Name,books.accession_no
    from title,books where title.title_id = books.title_id)as book_title) as member_books
where book_Issue.member_Id=book_return.member_Id and book_issue.accession_no = book_return.accession_No and 
member_books.member_Id =book_Issue.member_Id and member_books.accession_no = book_Issue.accession_No
and book_Issue.issue_date=book_return.issue_date
and datediff(book_return.return_date,book_issue.due_date) > 0;

select * 
from books
 where price = (select max(price) from books);

select * from books where price < (select max(price) from books) limit 1; 

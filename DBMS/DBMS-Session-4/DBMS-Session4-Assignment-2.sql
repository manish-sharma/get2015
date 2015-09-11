
select member_Name 
from members 
where category in (select category from members where member_Name = 'amit natani');


select book_issue.issue_date,book_issue.member_id,book_issue.accession_no,book_issue.due_date 
from book_issue 
where (book_Issue.member_Id,book_issue.accession_no) not in (select book_return.member_id,book_return.accession_No from book_return);


select issued_data.member_id,issued_data.accession_no,issued_data.issue_date,issued_data.due_date ,
datediff(book_return.return_date,issued_data.due_date),return_date 
from issued_data,book_return 
where issued_data.member_id=book_return.member_Id and issued_data.accession_no = book_return.accession_No 
and datediff(book_return.return_date,issued_data.due_date) > 0; 

select * 
from books
where price = (select max(price) from books);

select * from books where price < (select max(price) from books) limit 1; 
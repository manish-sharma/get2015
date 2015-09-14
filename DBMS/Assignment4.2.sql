
create or replace view books_member as select * from books,members;
create or replace view issued_data as 
 select books_member.member_name, books_member.member_Id,book_Issue.accession_No,book_Issue.Issue_Date,book_Issue.due_date 
 from book_Issue ,books_member 
 where book_Issue.accession_No = books_member.accession_no and books_member.member_Id = book_Issue.member_Id;

select * from issued_data;

create or replace view member_category as 
select member_name,member_id,if(category = 's','student',if(category = 'f','faculty',if(category = 'o','others',null))) as category 
from members;

create or replace view books_title 
as select books.accession_No,books.title_id ,subject_id 
from books,title where books.title_id = title.title_id;

create or replace view title_issued_data as select books_title.accession_No,books_title.title_id,subject_id,member_id,issue_date,due_date
from books_title,issued_data where books_title.accession_No = issued_data.accession_No;

create or replace view subject_information as select title_issued_data.subject_id,subject_Name,title_id 
from title_issued_data,subjects where title_issued_data.subject_id = subjects.subject_id;

/*
create or replace view member_info as select member_name,category,member_id 
from members 

where member_Id in (select member_id from issued_data);
*/

select subject_name,members.member_name,category,title_issued_data.issue_date,due_date,IFNULL(null,return_Date) as return_Date
from subject_information,members,title_issued_data left join book_return on
title_issued_data.member_Id= book_return.member_Id and title_issued_data.accession_No = book_return.accession_No 
and title_issued_data.issue_date = book_return.issue_date
where subject_information.title_Id = title_issued_data.title_Id 
and members.member_id = title_issued_data.member_Id;

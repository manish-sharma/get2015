-- Assignment 1
-- Question 1
create or replace view issued_data as 
 select books.title_Id, members.member_Id,book_Issue.accession_No,book_Issue.Issue_Date,book_Issue.due_date 
 from members,book_Issue ,books 
 where book_Issue.accession_No = books.accession_no and members.member_Id = book_Issue.member_Id;


select members.member_Name, members.member_Id, title.title_name, issued_data.accession_no, issued_data.issue_date,
 issued_data.due_date,datediff(issued_data.due_date,issued_data.issue_date) as DateDifference
 from members,issued_data,title
 where members.member_Id = issued_data.member_id and title.title_Id = issued_data.title_id 
 having DateDifference > 60 
 order by members.member_name,title.title_Name; 
 
 -- Question 2
 select max(length(member_Name)),member_name from members;
 
  -- Question 3
 select count(accession_No) as "issued books" from book_issue; 

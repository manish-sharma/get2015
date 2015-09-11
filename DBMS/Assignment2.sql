-- assignment 2
-- Question 1
select subjects.subject_Name,subjects.subject_Id, count(subjects.subject_Id) as "number of books purchased" 
 from subjects,books,title 
 where subjects.subject_Id = title.subject_Id and books.title_id = title.title_Id
 group by subjects.subject_Id;
 
 -- Question 2
 select * from book_Issue where datediff(due_date,issue_date) > 60;
 
 
  -- Question 3
  select title_id,accession_no from books where price > (select Min(Price) from books);

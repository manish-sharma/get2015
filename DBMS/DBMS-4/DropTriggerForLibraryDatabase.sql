-- Query to drop trigger bbok_due_date which was created to alter default value of dueDate in  Books_Issue table
DROP TRIGGER book_due_date;
-- Query to display data of Books_Issue table after removing trigger on dueDate
select* from Books_Issue;
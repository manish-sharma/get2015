-- Assignment 3 Question 3 --
-- 3-1 Query to find total faculty,students and others category -- 
SELECT count(if(category = "F",category,null)) as Total_Faculty,
count(if(category = "S",category,null)) as Total_Student,
count(if(category = "O",category,null)) as Others from members;

-- 3-2 Query to find the book issued more than two times
select titles.title_id,title_nm 
from titles,books,book_issue
where book_issue.accession_no = books.accession_no and books.title_id = titles.title_id
group by titles.title_id
having count(titles.title_id) >= 2;

-- 3-3 Query to get book information issued to category other than Faculty ot F
select distinct books.title_id,titles.title_nm
from books,book_issue,titles,members
where book_issue.accession_no = books.accession_no and books.title_id = titles.title_id and book_issue.member_id = members.member_id
and members.category not In ('F');
-- 3-4 Query to get details of author whose book has purchased atleast -- 
select distinct authors.author_nm, authors.author_id from authors,title_author,books where authors.author_id = title_author.author_id
and title_author.title_id = books.title_id;
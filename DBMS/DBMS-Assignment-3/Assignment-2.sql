
USE lis;

/*1. display the bookwise information  include 
subject name, subject id, accession no of book*/
SELECT s.subject_id,s.subject_name,count(b.accession_no)
FROM books b
INNER JOIN  titles t 
ON b.title_id=t.title_id
INNER JOIN subjects s 
ON t.subject_id=s.subject_id
GROUP BY s.subject_id;

/*2. Display those rows from book issue table where difference between issue
date and due date is greater than 2 */
SELECT bi.issue_date,bi.due_date,bi.accession_no,bi.member_id,(DATEDIFF(bi.due_date, bi.issue_date)/30)
FROM book_issue bi
WHERE ((DATEDIFF(bi.due_date, bi.issue_date))>60);

/*3. display the name of books have price greater then
minimum price book*/
SELECT b.title_id,t.title_name,b.price
FROM books b
INNER JOIN titles t
ON  b.title_id= t.title_id
WHERE (b.price > (SELECT MIN(price) FROM  books));


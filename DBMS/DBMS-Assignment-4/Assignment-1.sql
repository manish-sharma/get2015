
USE lis;

/*1. Write a SELECT command to display name of those members
 who belong to the category as to which member
“SUMAN” belongs.
*/

SELECT member_name,category FROM member WHERE category=(SELECT category FROM member WHERE member_name='SUMAN');

/*2. Write a SELECT command to display information on the books
that have not been returned till date. The information should
include book issue date, title, member name and due date.
*/

SELECT bi.issue_date,t.title_name,m.member_name,bi.due_date 
FROM book_issue bi,titles t,member m,books b
WHERE (bi.accession_no,bi.member_id ) 
NOT IN (SELECT br.accession_no,br.member_id FROM book_return br) 
AND (bi.member_id=m.member_id) 
AND (bi.accession_no=b.accession_no) 
AND (b.title_id=t.title_id);

/*3. Write a SELECT command to display information on the books
that have been returned after their due dates. The information
should include book issue date, title, member name and due
date.
*/

SELECT bi.issue_date,t.title_name,m.member_name,bi.due_date 
FROM book_issue bi,titles t,member m,books b
WHERE ((DATEDIFF((SELECT br.return_date FROM book_return br WHERE br.accession_no= bi.accession_no AND bi.member_id=br.member_id),bi.due_date)) > 0)
AND (bi.member_id=m.member_id) 
AND (bi.accession_no=b.accession_no) 
AND (b.title_id=t.title_id);

/*4. Write a SELECT command to display information of those books
whose price is equal to the most expensive book purchase so far*/

SELECT * FROM books WHERE price=(SELECT MAX(price) FROM books);

/*5. Write a SELECT command to display the second maximum price
of a book.
*/

SELECT accession_no,b.title_id,MAX(price),title_name 
FROM books b,titles t WHERE (price NOT IN (SELECT MAX(price) 
FROM books)) AND (b.title_id=t.title_id);

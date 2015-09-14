-- to get all the member name whose category is same as category of KESHAV SHARMA
SELECT member_name FROM members WHERE category = (SELECT category FROM members WHERE member_name = 'KESHAV SHARMA');



-- SELECT command to display information on the books
-- that have not been returned till date. The information should
-- include book issue date, title, member name and due date.
USE library;
SELECT bi.issue_date, m.member_name,bi.due_date,t.title_name,bi.accession_no,m.member_id
FROM book_issue bi,book_return br,members m,titles t,books b
WHERE m.member_id=bi.member_id 
AND b.accession_no=bi.accession_no 
AND b.title_id=t.title_id 
AND(bi.member_id,bi.issue_date,bi.accession_no) 
NOT IN (
SELECT member_id,issue_date,accession_no 
FROM book_return br 
GROUP BY br.member_id,br.accession_no,br.issue_date)
GROUP BY bi.member_id,bi.accession_no,bi.issue_date; 




-- SELECT command to display information on the books
-- that have been returned after their due dates. The information
-- should include book issue date, title, member name and due date.
SELECT br.issue_date, m.member_name,bi.due_date,t.title_name
FROM book_issue bi,book_return br,members m,titles t,books b
WHERE m.member_id=bi.member_id 
AND b.accession_no=bi.accession_no 
AND b.title_id=t.title_id 
AND bi.due_date < (SELECT return_date FROM book_return br
WHERE bi.member_id=br.member_id AND bi.accession_no=br.accession_no AND bi.issue_date=br.issue_date 
GROUP BY br.member_id,br.accession_no,br.issue_date)
GROUP BY bi.member_id,bi.accession_no,bi.issue_date; 




-- SELECT command to display information of those books
-- whose price is equal to the most expensive book purchase so far.
SELECT accession_no,title_id,purchase_date,price 
FROM books WHERE price = (SELECT MAX(price) FROM books);




-- SELECT command to display the second maximum price of a book.
SELECT MAX(price) FROM books WHERE price NOT IN(SELECT MAX(price) FROM books);
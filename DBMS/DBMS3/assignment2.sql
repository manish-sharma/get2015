-- to display subjectwise information of purchased books
SELECT s.subject_id,s.subject_name,COUNT(s.subject_id) as NUMBER
FROM books b,titles t,subjects s
WHERE b.title_id=t.title_id
AND s.subject_id=t.subject_id
GROUP BY s.subject_id;


-- to show all the books which can be returned after two months
SELECT * FROM book_issue b
WHERE DATEDIFF(b.due_date,b.issue_date)>60;


-- to display list of books having greater price then the minimum price of book purchased so far
SELECT accession_no,price,purchase_date
FROM books b
HAVING price > (SELECT MIN(price) FROM books HAVING MAX(purchase_date));



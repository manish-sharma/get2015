
/*Assignment 3.2.1 no of books purchased by subject and its id  */
SELECT  titles.subject_id, subjects.subject_name,COUNT(titles.title_id) AS "no of book purchased" 
FROM books, titles , subjects   WHERE titles.subject_id = subjects.subject_id AND books.title_id=titles.title_id 
group by subject_id, subject_name;



/*Assignment 3.2.2 List of books which can be return after two months with member name and id */
SELECT m.member_name ,bi.member_id  ,DATEDIFF(due_date, DATE(issue_date)) AS "No of due day" 
FROM book_issue bi, Members m WHERE bi.member_id = m.member_id AND DATEDIFF(due_date, DATE(issue_date))>60;

/*Assignment 3.2.3 list of all books has price which is greater than the minimam price which is purchased*/
SELECT accession_no , title_id , purchase_date , price , status from books 
WHERE price > ( SELECT  MIN( price) FROM books) ;




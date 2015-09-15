/*----------------------------ASSIGNMENT-1---------------------------*/
/* 1.
 * Displaying name of those members who belong to the category as to 
 * which member “Keshav Sharma” belongs.(Using subquery)
 */
SELECT member_nm
FROM members
WHERE category = 
  (SELECT category FROM members where member_nm='Keshav Sharma');

/* 2.
 * Displaing information on the books that have not been returned 
 * till date. Here the information include book issue date, title, 
 * member name and due date.(Using Correlated Subquery)
 */
SELECT issue_dt,title_nm,member_nm,i.due_dt
FROM book_issue i,members m,books b,titles t
WHERE NOT EXISTS 
 (SELECT * from book_return r WHERE i.issue_dt=r.issue_dt and 
  i.accession_no=r.accession_no AND i.member_id=r.member_id
 )
 AND i.member_id=m.member_id 
 AND i.accession_no=b.accession_no
 AND b.title_id=t.title_id;
 


/* 3.
 * Display information on the books that have been returned after 
 * their due dates. The information include book issue date, title,
 * member name and due date.
 */  
 SELECT issue_dt,title_nm,member_nm,i.due_dt
 FROM book_issue i,members m,books b,titles t
 WHERE EXISTS 
 (SELECT * from book_return r WHERE i.issue_dt=r.issue_dt and 
  i.accession_no=r.accession_no AND i.member_id=r.member_id 
  AND r.return_dt > i.due_dt
 )
 AND i.member_id=m.member_id 
 AND i.accession_no=b.accession_no
 AND b.title_id=t.title_id;
 
 
 
/* 4.
 * Displaying information of those books whose price is equal to the 
 * most expensive book purchase so far.
 */
 
 SELECT title_id,price
 FROM books
 WHERE price = (SELECT MAX(price) FROM books);
 
 
 /* 5.
  * displaying the second maximum price of a book.
  */
  SELECT MAX(price) FROM books
  WHERE price < (SELECT MAX(price) FROM books);
 
 
 
 /*----------------------------ASSIGNMENT-2--------------------------*/
/* 1.
 * Creating a View which can be used to display member name and
 * all issue details of the member using a simple SELECT command.
 */
 
 CREATE VIEW MEMBER_ISSUE_DETAILS
 AS
 SELECT issue_dt,title_nm,member_nm,i.due_dt,i.accession_no
 FROM book_issue i,members m,books b,titles t
 WHERE NOT EXISTS 
 (SELECT * from book_return r WHERE i.issue_dt=r.issue_dt and 
  i.accession_no=r.accession_no AND i.member_id=r.member_id
 )
 AND i.member_id=m.member_id 
 AND i.accession_no=b.accession_no
 AND b.title_id=t.title_id;
 
 
 SELECT * from MEMBER_ISSUE_DETAILS;
 
 
/* 2.
 * Creating a View which contains three columns, member name,member id 
 * and full description of category, i.e., Faculty, Students and Others
 * instead of F,S and O.
 */
 
 
 CREATE VIEW MEMBER_INFO 
 AS
 SELECT member_nm,member_id,
 (
   CASE category
      WHEN "S" THEN "STUDENT"
      WHEN "F" THEN "FACULTY"
      ELSE "OTHER" END
 ) AS CategoryOfMember
 FROM members;
 
 
/* 3.
 * Creating a View which contains the information – subject name,
 * title, member name, category, issue date, due date and return
 * date. If the books have not been returned, NULL is 
 * displaying instead of return date.
 */
 
 
CREATE VIEW INFO 
AS
SELECT s.subject_nm,t.title_nm,m.member_nm,category,i.issue_dt,
i.due_dt,return_dt
FROM book_issue i
LEFT JOIN book_return r
ON i.accession_no=r.accession_no and i.member_id=r.member_id
INNER JOIN members m
ON i.member_id=m.member_id
INNER JOIN books b
ON i.accession_no= b.accession_no
INNER JOIN titles t
ON b.title_id=t.title_id
INNER JOIN subjects s
ON s.subject_id=t.subject_id;

SELECT * from INFO;


 
 
 
 
 
 
 
 
 
/*----------------------------ASSIGNMENT-1----------------------------------*/


/* 1.
 * Displaying information on books issued more then two months.
 * This information include member_nm,member_id,accession_no,issue_dt,due_dt,
 * title_nm,return_dt and issued for how many months and also it is sorted on 
 * member_nm and with member_nm on title_nm
 */
SELECT m.member_nm,i.member_id,i.accession_no,i.issue_dt,i.due_dt,t.title_nm,
return_dt,
IFNULL(TIMESTAMPDIFF(MONTH, r.issue_dt,return_dt),
TIMESTAMPDIFF(MONTH,i.issue_dt,now())) as issuedForMonths
FROM book_issue i
LEFT JOIN book_return r
ON i.accession_no=r.accession_no and i.member_id=r.member_id
INNER JOIN members m
ON i.member_id=m.member_id
INNER JOIN books b
ON i.accession_no= b.accession_no
INNER JOIN titles t
ON b.title_id=t.title_id
where r.issue_dt<DATE_SUB(return_dt,INTERVAL 2 MONTH)
OR now()>DATE_ADD(i.issue_dt,INTERVAL 2 MONTH)
ORDER BY member_nm,title_nm
;


/* 2.
 * Displaying those row from members table having maximum length for 
 * member_nm.It contain member_nm and length of member_nm
 */

SELECT member_nm,LENGTH(member_nm) AS LengthOfMemberName
FROM members
WHERE LENGTH(member_nm)=(select max(LENGTH(member_nm)) from members);


/* 3.
 * Diaplying the count the no of books issued so far.
 */
SELECT count(*)
FROM book_issue;


/*----------------------------ASSIGNMENT-2----------------------------------*/


/* 1.
 * Dispaying subjectwise information on no of books purchased.It contain 
 * subject_nm,subject_id and no of books purchased.
 */


SELECT subject_nm,s.subject_id,count(*) AS NoOfBooks
FROM books
INNER JOIN titles t
ON t.title_id= books.title_id
INNER JOIN subjects s
ON s.subject_id=t.subject_id
GROUP BY s.subject_id;

/* 2.
 * Displaying those rows from book issue table where books can be retured after
 * two months.That is difference  between due_dt and issue_dt is greater 
 * than two months.
 */
SELECT * 
FROM book_issue
WHERE TIMESTAMPDIFF(MONTH,issue_dt,due_dt) > 2;

/* 3.
 * Displaying list of books having price greater than minimum price of book 
 * purchased so far.
 */
SELECT title_nm,price
FROM books b
INNER JOIN titles t
ON b.title_id=t.title_id
WHERE price >(SELECT MIN(price) FROM books);

/*----------------------------ASSIGNMENT-3----------------------------------*/


/* 1.
 * Diaplaying total no of students,total no of faculty and total no of 
 * others in library information system.
 */
 SELECT category,COUNT(*) AS NoOfMembers
 FROM members
 GROUP BY category;
 
 
/* 2.
 * Displaying information of those titles have been issued more than 
 * two times
 */
 SELECT title_nm,COUNT(t.title_nm) AS count
 FROM book_issue i
 INNER JOIN books b
 ON i.accession_no=b.accession_no
 INNER JOIN titles t
 ON b.title_id=t.title_id
 GROUP BY title_nm
 HAVING  count > 2;
 
 
/* 3.
 * Diaplaying  information on books issued to members of category other
 * than faculty("F").
 */
 SELECT accession_no,issue_dt,due_dt
 FROM book_issue b
 INNER JOIN members m
 ON b.member_id=m.member_id
 and m.category NOT IN ("F");
 
 
/* 4.
 * Displaying information on those authors for which at least one book
 * have been purchased.
 */
 SELECT author_nm,a.author_id
 FROM authors a
 INNER JOIN title_author t
 ON a.author_id = t.author_id
 INNER JOIN books b
 ON b.title_id=t.title_id
 GROUP BY author_nm
 HAVING  count(accession_no) >=1;
 
 
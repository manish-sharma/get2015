/*ASSIGNMENT 1-1  */

SELECT m.member_name, bi.member_id, t.title_name, bi.accession_no, bi.issue_date, bi.due_date, 
PERIOD_DIFF(date_format(curdate(),'%Y%m'),date_format(bi.issue_date,'%Y%m')) As Issued_Months
from book_issue bi
INNER JOIN members m
ON  bi.member_id = m.member_id
INNER JOIN books b
ON bi.accession_no = b.accession_no
INNER JOIN titles t
ON b.title_id = t.title_id
Where(PERIOD_DIFF(date_format(curdate(),'%Y%m'),date_format(bi.issue_date,'%Y%m'))>=2);


/*ASSIGNMENT 1-2  */
SELECT member_name,LENGTH(member_name) as maximum_length FROM members
WHERE LENGTH(member_name)=(SELECT MAX(LENGTH(member_name))   from members);

SELECT m1.member_name,m1.LENGTH(member_name) as maximum_length FROM members m1 inner join members m2 on
 LENGTH(m1.member_name)= MAX(LENGTH(m2.member_name));

/*ASSIGNMENT 1-3  */
SELECT count(accession_no) as number_of_book_issued FROM book_issue;






/*ASSIGNMENT 2-1 */

SELECT s.subject_name,s.subject_id ,count(s.subject_name) as no_of_books FROM subjects s inner join titles t on
s.subject_id=t.subject_id inner join books b on t.title_id = b.title_id
WHERE b.status = 'Booked'
group by s.subject_name;

/*ASSIGNMENT 2-2 */
SELECT bi.accession_no ,bi.issue_date,bi.member_id,bi.due_date
FROM book_issue bi 
WHERE (period_diff(date_format(bi.due_date, '%Y%m'), date_format(bi.issue_date, '%Y%m'))) > 2;


/*ASSIGNMENT 2-3 */
SELECT distinct(s.subject_name) as subject_name  FROM subjects s inner join titles t on
s.subject_id=t.subject_id inner join books b on t.title_id = b.title_id
WHERE b.price >(SELECT min(price) from books);



/*ASSIGNMENT 3-1 */
SELECT category,count(category) As total_no from members group by category;


/*ASSIGNMENT 3-2 */
SELECT t.title_name, bi.accession_no, s.subject_name FROM book_issue bi
INNER JOIN books b
ON b.accession_no = bi.accession_no
INNER JOIN titles t
ON b.title_id = t.title_id
INNER JOIN subjects s
ON s.subject_id = t.subject_id
GROUP BY (bi.accession_no)
having count(bi.accession_no) >= 2;


/*ASSIGNMENT 3-3 */
SELECT bi.issue_date,bi.accession_no,bi.member_id,bi.due_date
FROM book_issue bi Inner Join members m on bi.member_id=m.member_id
WHERE m.category='student';


/*ASSIGNMENT 3-4 */

SELECT a.author_fname, ta.author_id, b.title_id FROM books b
INNER JOIN title_author ta
ON b.title_id = ta.title_id
INNER JOIN authors a
ON a.author_id = ta.author_id
where b.status = "Booked";

use lis;
select * from members;
/*Assignment1 -1
 Write a SELECT command to display name of those members who belong to the category as to which member
“Keshav Sharma” belongs.
Note: Solve the problem using subquery.

*/
SELECT  member_name  FROM members  
where category = (select category from members WHERE member_name='Keshav Sharma');

/*Assignment1 -2
 Write a SELECT command to display information on the books
that have not been returned till date. The information should
include book issue date, title, member name and due date.
Note: Use Correlated Subquery.

*/
 
 select m.member_name,bi.issue_date,bi.due_date,t.title_name from members m,book_issue bi,titles t ,books b
  where m.member_id =bi.member_id and  b.title_id=t.title_id and bi.accession_no=b.accession_no and
 (bi.accession_no,bi.member_id) not in(select accession_no,member_id from book_return);



/*Assignment1 -3
Write a SELECT command to display information on the books
that have been returned after their due dates. The information
should include book issue date, title, member name and due
date.
Note: Use Correlated Subquery.
*/
select  m.member_name,t.title_name,bi.issue_date,bi.due_date
from members m,titles t,book_issue bi ,books b
where t.title_id=b.title_id and b.accession_no=bi.accession_no
and m.member_id = bi.member_id and (bi.member_id,bi.accession_no) in (Select member_id,accession_no from book_return
where (PERIOD_DIFF(date_format(bi.due_date,'%Y%m%d'),date_format(return_date,'%Y%m%d'))>0) and return_date<>'0000-00-00');
 

/*Assignment1 -4
Write a SELECT command to display information of those books
whose price is equal to the most expensive book purchase so far.

*/

SELECT * from books
where price = (SELECT MAX(price) FROM books WHERE status = 'booked');


/*Assignment1 -5

Write a SELECT command to display the second maximum price
of a book.
*/
SELECT price
FROM books
WHERE price = (SELECT MAX(price) FROM books WHERE price < (SELECT MAX(price) FROM books));



/*Assignment2 -1
 Create a View which can be used to display member name and
all issue details of the member using a simple SELECT command.
*/
CREATE VIEW members_detail as
select m.member_name,bi.issue_date,bi.due_date,bi.accession_no from members m inner join book_issue bi
on  m.member_id = bi.member_id; 

SELECT * from members_detail;

/*Assignment2 -2
 Create a View which contains three columns, member name,
member id and full description of category, i.e., Faculty, Students
and Others instead of F,S and O.
*/

CREATE VIEW members_description as
select member_name,member_id,if(category ='teacher','t',if(category = 'student','s','o')) as category from members;

SELECT * from members_description;

/*Assignment2 -3*/

CREATE VIEW description as
select s.subject_name, t.title_name,m.member_name,m.category,bi.issue_date,bi.due_date,
if(br.return_date='0000-00-00',null,br.return_date) as return_date
from subjects s,members m,titles t,book_issue bi,book_return br, books b
where s.subject_id=t.subject_id and t.title_id = b.title_id and b.accession_no = bi.accession_no and b.accession_no=br.accession_no
and bi.member_id=m.member_id and br.member_id = br.member_id;

SELECT * from description;

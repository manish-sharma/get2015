USE new_library;

-- Assignment-1
/*  Write a SELECT command to display name of those members
    who belong to the category as to which member
    “Keshav Sharma” belongs.
*/
SELECT 
    member_name
FROM
    members
WHERE
    category = (SELECT 
        category
    FROM
        members
    WHERE
        member_name = 'Keshav Sharma');


/*  Write a SELECT command to display information on the books
    that have not been returned till date. The information should
    include book issue date, title, member name and due date.
*/
SELECT 
    m.member_name, br.due_date, br.issue_date, t.title_name
FROM
    members m,
    book_issue br,
    title t
WHERE
    m.member_id = br.member_id AND br.accession_no = (SELECT 
        accession_no
    FROM
        book_issue
    WHERE
        accession_no NOT IN (SELECT 
            Accession_No
        FROM
            BOOK_return)) AND t.title_id = (SELECT 
        title_id
    FROM
        books
    WHERE
        br.accession_No = Books.accession_No);


/*  Write a SELECT command to display information on the books
    that have been returned after their due dates. The information
    should include book issue date, title, member name and due
    date.
*/
SELECT 
    m.member_name, br.issue_Date, t.title_name, due_date
FROM
    Book_Issue bi,
    Book_return br,
    Members m,
    Title t,
    Books b
WHERE
    bi.member_Id = m.member_Id AND br.accession_No = b.accession_No AND br.member_id = bi.member_id AND b.title_Id = t.title_Id AND m.member_id IN (SELECT 
        bi.member_id
    FROM
        book_issue bi
    WHERE
        EXISTS( SELECT DISTINCT
            br.member_id
        FROM
            book_return br
        WHERE
            br.member_id = bi.member_id AND DATEDIFF(br.return_date, bi.due_date) > 0)) ;


/*  Write a SELECT command to display information of those books
    whose price is equal to the most expensive book purchase so far.
*/
SELECT 
    *
FROM
    Books
WHERE
    price >= (SELECT 
        Max(price)
    FROM
        Books);


/*  Write a SELECT command to display the second maximum price
    of a book.
*/
SELECT 
    price
FROM
    books
WHERE
    price < (SELECT 
        max(price)
    FROM
        books)
ORDER BY price DESC
LIMIT 1;
        

-- Assignment -2

/*  Create a View which can be used to display member name and
    all issue details of the member using a simple SELECT command.
*/
CREATE VIEW member_Details
AS
 SELECT member_name , issue_date, due_date ,title_name FROM members m,book_issue bk,books b , title t WHERE m.member_id = bk.member_id AND bk.accession_no = b.accession_no AND b.title_id = t.title_id;


/*  Create a View which contains three columns, member name,
    member id and full description of category, i.e., Faculty, Students
    and Others instead of F,S and O.
*/
CREATE VIEW category_Description 
 AS
 SELECT member_name,member_id, IF(category NOT IN ('m','f'),"OTHER",IF(category='f',"FACULTY","STUDENT")) AS category FROM members;


/*  Create a View which contains the information – subject name,
    title, member name, category, issue date, due date and return
    date. If the books have not been returned, NULL should be
    displayed instead of return date.
*/
CREATE VIEW full_Description
As
 SELECT s.subject_name,t.title_name,m.member_name,m.category,bi.issue_Date,bi.due_date,IF(br.return_date < now(),NULL,br.return_date) AS "book return" FROM members m,books b, subjects s, book_return br, book_issue bi, title t WHERE m.member_id=bi.member_id 
 AND bi.accession_no = b.accession_no AND b.title_id=t.title_id AND t.subject_id = s.subject_id AND m.member_id=br.member_id;
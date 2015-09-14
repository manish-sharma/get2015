use LIS;
-- Assignment 1.1
-- Query to display name of those members who belong to the category as to which member “Keshav” belongs
SELECT 
    m1.member_name AS Name,
    m1.member_id AS ID,
    m1.category AS Category
FROM
    member m1,
    (SELECT 
        member_name, member_id, category
    FROM
        member
    WHERE
        member_name = 'keshav') AS m2
WHERE
    m1.category = m2.category;

-- Assignment 1.2
-- Query to to display information on the books that have not been returned till date
SELECT 
    bi.accession_no AS 'Accession No',
    bi.issue_date AS 'Issue Date',
    bi.due_date AS 'Due Date',
    m.member_name AS 'Name',
    t.title AS 'Title'
FROM
    book_issue bi,
    member m,
    title t,
    books b
WHERE
    ((bi.accession_no,bi.issue_date, bi.member_id) not in (SELECT 
        br.accession_no, br.issue_date, br.member_id
    FROM
        book_return br)) AND m.member_id = bi.member_id AND t.title_id = b.title_id AND b.accession_No = bi.accession_No;

-- Assignment 1.3
-- Query to to display information on the books that have been returned after their due dates
SELECT 
    br.accession_no AS 'Accession No',
    br.issue_date AS 'Issue Date',
    bi.due_date AS 'Due Date',
    br.return_date AS 'Return Date',
    m.member_name AS 'Name',
    t.title AS 'Title'
FROM
    book_issue bi,
    member m,
    title t,
    books b,
    book_return br
WHERE
    (DATEDIFF(br.return_date, bi.due_date) > 0) AND m.member_id = bi.member_id AND t.title_id = b.title_id AND b.accession_No = bi.accession_No AND bi.member_id = br.member_id AND br.accession_no = bi.accession_no AND br.issue_date = bi.issue_date;

-- Assignment 1.4
-- Query to to display information of those books whose price is equal to the most expensive book purchase so far
SELECT 
    accession_no, title_id, price
FROM
    books
WHERE
    price = (SELECT 
        max(price)
    FROM
        books);

-- Assignment 1.5
-- Query to to display the second maximum price of a book
SELECT 
    accession_no, title_id, price
FROM
    books
WHERE
    price = (SELECT 
        max(price)
    FROM
        books
    WHERE
        price not in (SELECT 
            max(price)
        FROM
            books));

-- Assignment 2.1
-- Query to create view which can be used to display member name and all issue details of the member
create view member_AND_issue_book_detail AS (SELECT m.member_name AS "Name",
bi.issue_date AS "Issued On" , 
bi.accession_no AS "Accession No",
bi.due_date AS "Due Date",
t.title AS "Title" 
FROM book_issue bi,
member m,
title t,
books b
WHERE m.member_id = bi.member_id AND t.title_id = b.title_id AND b.accession_no = bi.accession_no);

SELECT 
    *
FROM
    member_AND_issue_book_detail;
DROP VIEW member_AND_issue_book_detail;

-- Assignment 2.2
-- Query to create view full description of category
CREATE VIEW category_Description 
AS
SELECT member_name,member_id,if(category not in ('s','f'),"OTHER",IF(category='f',"FACULTY","STUDENT")) AS category  FROM member;
SELECT 
    *
FROM
    category_Description;
DROP VIEW category_Description;


-- Assignment 2.3
-- Query to create view which contains the information of book issued and If the books have not been returned, NULL should be displayed instead of return date
CREATE VIEW return_date_detail 
AS
SELECT 
 bi.accession_no ,bi.issue_date,bi.member_id
 FROM 
book_issue bi 
WHERE (( bi.accession_no ,bi.issue_date,bi.member_id)
not in 
(SELECT br.accession_no ,br.issue_date,br.member_id FROM book_return br));


CREATE VIEW category_Description 
AS
SELECT m.member_name AS "Name",
t.title AS "Title", 
bi.accession_no AS "Accession No",
bi.issue_date AS "Issue Date", 
bi.due_date AS "Due Date",
s.sub_name AS "Subject",
m.category,
if((( bi.accession_no ,bi.issue_date,bi.member_id) in 
(SELECT * FROM return_date_detail)),null,(SELECT br.return_date FROM book_return br WHERE
bi.accession_no=br.accession_no AND bi.issue_date = br.issue_date AND bi.member_id=br.member_id)) 
AS "Return Date"

FROM book_issue bi,
member m,
title t,
books b,
subjects s
WHERE m.member_id = bi.member_id AND t.title_id = b.title_id AND b.accession_No = bi.accession_No AND t.sub_id =s.sub_id;



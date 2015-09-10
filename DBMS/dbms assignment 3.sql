-- ASSIGNMENT 1
-- query to find all the information of book issued for more than two months
SELECT 
    *
FROM
    BOOK_ISSUE
WHERE
    DATE_ADD(issue_date, interval 60 day) < due_date;

-- query to display those rows from members table having maximum length for member name
SELECT 
    member_name, LENGTH(member_name) As LengthOfName
FROM
    member
WHERE
    Length(member_name) = (SELECT Max(Length(member_name)) FROM member);
    
-- query to find number of books issued so far
SELECT 
    count(accession_no) As Total_Books_Issued
FROM
    BOOK_ISSUE;

-- ASSIGNMENT 2
-- query to display subjectwise information on number of books purchased
SELECT 
    sub_id As Subject_Id,
    sub_name As Subject_Name,
    COUNT(sub_name) As No_of_books_purchased
FROM
    SUBJECTS
GROUP BY sub_name;

-- query to diaplay book issued information which can be returned after two months
SELECT 
    *
FROM
    BOOK_ISSUE
WHERE
    DATEDIFF(due_date, issue_date) > 60;

-- query to get information of books whose price is greater than min imum price book
SELECT 
    *
FROM
    BOOKS
WHERE
    price > (SELECT 
        Min(price)
    FROM
        BOOKS);

-- ASSIGNMENT 3
-- query to get total number of students,faculty and others in a single row
SELECT 
    count(if(category = 'f', member_name, null)) as number_of_faculty,
    count(if(category = 'o', member_name, null)) as number_of_other,
    count(if(category = 's', member_name, null)) as number_of_student
FROM
    MEMBER ;

-- query information of titles issued more than two
SELECT 
    a.title as TitleName, count(b.accession_no) as number
FROM
    book_issue b,
    title a,
    books bs
WHERE
    bs.accession_no = b.accession_no and a.title_id = bs.title_id
GROUP BY a.title
HAVING count(b.accession_no) > 2;

-- query to get information on books issued to members of category than "f"
SELECT 
    m.member_name as Name,
    m.category as Category,
    b.member_id as ID,
    t.title as Title,
    bs.accession_no as AccessionNumber,
    b.issue_date as IssuedON,
    b.due_date as SubmittedON
FROM
    book_issue b,
    member m,
    title t,
    books bs
WHERE
    m.member_id = b.member_id and bs.accession_no = b.accession_no and t.title_id = bs.title_id and m.category <> 'f';

-- query to get information f author whose book is to be purchased once
SELECT distinct
    a.au_id as ID, concat(a.au_fname, a.au_lname) as Name
FROM
    author a,
    books b,
    author_title at
WHERE
    at.title_id = b.title_id and a.au_id = at.au_id;
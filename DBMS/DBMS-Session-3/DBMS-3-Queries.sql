-- Assignment - 1

USE new_library;


/*  Question 1 : display information on books issued for more than two months
    The Information should include member_Name, member_Id, title_Name, accession_No, issue_Date,
    due_Date, and Issued for how many months and be sorted on member_Name, and within member_Name on title_Name
*/
SELECT 
    m.member_name,
    m.member_Id,
    t.title_Name,
    t.title_Id,
    b.accession_No,
    b.issue_Date,
    b.due_Date,
    ROUND(DATEDIFF(due_Date, issue_Date)/30) AS 'Issued for months'
FROM
    Members m,
    Book_Issue b,
    Title t,
    Books bk
WHERE
    (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) && (DATEDIFF(b.due_Date, b.issue_Date)) > 60
ORDER BY member_name,title_Name;


/*   Question 2 : display those rows from members table having maximum length for member_Name
    Information should contain member_Name and length of member_Name 
*/
SELECT 
    member_name, length(member_name)
FROM
    Members
WHERE
    length(member_name) = (SELECT 
        max(length(member_name))
    FROM
        Members);


/*  Question 3 : display count of numebr of books issued so far.
*/
SELECT 
    COUNT(*) AS 'No. of Books Issued'
FROM
    Book_Issue;


-- Assignment-2


/*  Question 1 : display subject_wise information on numebr of books purchased.
    The information should include subject_Name, subject_id, number of books purchased.
*/
SELECT 
    subject_name,
    s.subject_Id,
    count(t.title_id) AS 'No. of books purchased'
FROM
    Subjects s,
    Title t
WHERE
    t.subject_id = s.subject_Id
GROUP BY (subject_id);


/*  Question 2 : display those rows from the book_issue table where a book can be returned after two months.
    That is the difference in due_date and issue_Date is greater than two months
*/
SELECT 
    m.member_name,
    m.member_Id,
    t.title_Name,
    t.title_Id,
    b.accession_No,
    b.issue_Date,
    b.due_Date,
    DATEDIFF(due_Date, issue_Date) AS DiffDate
FROM
    Members m,
    Book_Issue b,
    Title t,
    Books bk
WHERE
    (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_No = b.accession_No) && (DATEDIFF(b.due_Date, b.issue_Date)) > 60 ;


/*  Question 3 : select the lsit of books having price greater than the minimum price of books purchased so far
*/
SELECT 
    accession_No, title_Id, purchase_Date, price, status
FROM
    Books
WHERE
    price > (SELECT 
        MIN(price)
    FROM
        Books);
        

-- Assignment-3


/*  Question 1 : Query to display total number of students, total number of faculty
    and total number of others in library information system in a single row.
*/
SELECT 
    count(if(category = 'm', member_name, NULL)) AS number_of_faculty,
    count(if(category = 'f', member_name, NULL)) AS number_of_other
FROM
    members ;


/*  Question 2: Query to display the information of those titles that have been issued more than 2 times
*/
SELECT 
    t.title_name AS TitleName, count(bi.accession_no) AS number
FROM
    book_issue bi,
    title t,
    books bk
WHERE
    bk.accession_no = bi.accession_no AND t.title_id = bk.title_id
GROUP BY t.title_Name
HAVING count(t.title_Name) >= 2;


/*  Question 3: Query to display information on books issued to members of category other than "F"
*/
SELECT 
    m.member_name AS Name,
    m.category AS Category,
    b.member_id AS ID,
    t.title_name AS Title,
    bs.accession_no AS 'Accession Number',
    b.issue_date AS 'Issue Date',
    b.due_date AS 'Due Date'
FROM
    book_issue b,
    members m,
    title t,
    books bs
WHERE
    m.member_id = b.member_id AND bs.accession_no = b.accession_no AND t.title_id = bs.title_id AND m.category NOT IN ('F');


/*  Question 4: Query to display information on those authors for which
    at leASt one book hAS been purchased
*/
SELECT DISTINCT
    a.author_id AS ID, CONCAT(a.author_Name) AS Name
FROM
    author a,
    books b,
    Title_Author ta
WHERE
    ta.title_id = b.title_id AND a.author_id = ta.author_id;
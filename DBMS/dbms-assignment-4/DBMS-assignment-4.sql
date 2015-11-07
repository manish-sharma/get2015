USE lis;
-- Assignment-1
-- Question-1
SELECT 
    member_name
FROM
    members
where
    category = (SELECT 
        category
    FROM
        members
    WHERE
        member_name = 'Amit Natani');


-- Question -2
SELECT 
    m.member_name, br.due_date, br.issue_date, t.title_name
FROM
    members m,
    book_issue br,
    title t
WHERE
    m.member_id = br.member_id AND br.accession_no = (select 
        accession_no
    from
        book_issue
    where
        accession_no not in (SELECT 
            Accession_No
        from
            BOOK_return)) AND t.title_id = (SELECT 
        title_id
    FROM
        books
    WHERE
        br.accession_No = Books.accession_No);

-- Question -3
SELECT 
    m.member_name, br.issue_Date, t.title_name, due_date
FROM
    Book_Issue bi,
    Book_return br,
    Members m,
    Title t,
    Books b
WHERE
    bi.member_Id = m.member_Id AND br.accession_No = b.accession_No AND br.member_id = bi.member_id AND b.title_Id = t.title_Id And m.member_id IN (SELECT 
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

-- Question-4
SELECT 
    *
from
    Books
WHERE
    price >= (SELECT 
        Max(price)
    FROM
        Books);

-- Question-5
select 
    price
from
    books
where
    price < (select 
        max(price)
    from
        books);






-- Assignment -2
-- Question-1
CREATE VIEW member_Details
As
 select member_name , issue_date, due_date ,title_name from members m,book_issue bk,books b , title t where m.member_id=bk.member_id and bk.accession_no=b.accession_no and b.title_id = t. title_id ;

-- Question-2
CREATE VIEW category_Description 
 As
 SELECT member_name,member_id,if(category not in ('m','f'),"OTHER",IF(category='f',"FACULTY","STUDENT")) as category  from members;

-- Question -3
CREATE VIEW full_Description
As
 SELECT s.subject_name,t.title_name,m.member_name,m.category,bi.issue_Date,bi.due_date,if(br.return_date < now(),null,br.return_date) as "book return" from members m,books b, subjects s, book_return br, book_issue bi, title t where m.member_id=bi.member_id 
 and bi.accession_no = b.accession_no and b.title_id=t.title_id and t.subject_id = s.subject_id and m.member_id=br.member_id;
 
 
 
 
 
 

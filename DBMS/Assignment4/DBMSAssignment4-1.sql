USE library_information_system;

-- question 1
SELECT 
    Member_name
FROM
    Members
WHERE
    Category = (SELECT 
        Category
    FROM
        Members
    WHERE
        Member_name = 'Riddhi') AND Member_name != 'Riddhi';
        
        
-- question 2
SELECT 
    bi.Issue_date, t.Title_name, m.Member_name, bi.Due_date
FROM
    Book_Issue bi
        INNER JOIN
    Books b ON b.Accession_no = bi.Accession_no
        INNER JOIN
    Titles t ON t.Title_id = b.Title_id
        INNER JOIN
    Members m ON m.Member_id = bi.Member_id
WHERE
    NOT EXISTS(SELECT 
        br.member_id, br.issue_date, br.accession_no
    FROM
        book_return br
    WHERE
        br.issue_date = DATE(bi.issue_date) AND br.member_id = bi.member_id AND br.accession_no = bi.accession_no) ;



-- question 3
SELECT 
    bi.Issue_date, t.Title_name, m.Member_name, bi.Due_date
FROM
    Book_Issue bi
        INNER JOIN
    Books b ON b.Accession_no = bi.Accession_no
        INNER JOIN
    Titles t ON t.Title_id = b.Title_id
        INNER JOIN
    Members m ON m.Member_id = bi.Member_id
WHERE
    EXISTS( SELECT 
        br.member_id, br.issue_date, br.accession_no
    FROM
        book_return br
    WHERE
        br.issue_date = DATE(bi.issue_date) AND br.member_id = bi.member_id 
        AND br.accession_no = bi.accession_no 
        AND br.Return_date > bi.Due_Date);


-- question 4
SELECT 
    *
FROM
    Books
WHERE
    Price < (SELECT 
        MAX(PRICE)
    FROM
        Books);
        

-- question 5
SELECT 
    *
FROM
    Books
WHERE
    Price < (SELECT 
        MAX(PRICE)
    FROM
        Books)
ORDER BY Price DESC
Limit 0,1;
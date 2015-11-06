-- command to display information of books issued for more than 2 months
SELECT 
    m.Member_name,
    m.Member_id,
    t.Title_name,
    bo.Accession_no,
    b.Issue_date,
    b.due_date,
    period_diff(date_format(b.due_date, '%Y%m'),
            date_format(b.issue_date, '%Y%m')) AS Month
FROM
    Book_issue b
        INNER JOIN
    Members m ON m.Member_id = b.Member_id
        INNER JOIN
    Books bo ON bo.accession_no = b.accession_no
        INNER JOIN
    Titles t ON bo.title_id = t.title_id
WHERE (period_diff(date_format(b.due_date, '%Y%m'),date_format(b.issue_date, '%Y%m')))>2
ORDER BY m.Member_name,t.Title_name;
            


-- display those names having members name having maximum length
SELECT 
    Member_name, LENGTH(Member_name) AS Length
FROM
    Members
WHERE
    Length(Member_name) = (SELECT 
        MAX(LENGTH(Member_name))
    FROM
        Members);


-- to display count of number of books
SELECT 
    COUNT(Accession_no)
FROM
    Book_issue;
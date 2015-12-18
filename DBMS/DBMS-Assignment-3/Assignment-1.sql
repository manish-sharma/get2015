
USE LIS;


/*1. Display information on books issued for more than two months.
the information should include member_nm, member_id, title-nm, 
accession_no, issue_dt, due_dt, and issued for how many months
and be sorted on member_nm and within member_nm on title-nm*/

SELECT bi.issue_date,bi.due_date,bi.accession_no,bi.member_id,m.member_name,(DATEDIFF(br.return_date, bi.issue_date)/30),t.title_name
FROM book_issue bi
LEFT JOIN  book_return br 
ON br.issue_date=DATE(bi.issue_date) AND br.member_id=bi.member_id AND br.accession_no=bi.accession_no
INNER JOIN member AS m 
ON  bi.member_id=m.member_id
INNER JOIN books AS b
ON bi.accession_no=b.accession_no 
INNER JOIN titles AS t 
ON b.title_id=t.title_id
WHERE ((DATEDIFF(br.return_date, bi.issue_date))>60) OR (br.return_date=NULL)
ORDER BY m.member_name,t.title_name;

/*2. Display those rows from members table having max length for member_nm.
Information should contain member_nm and length of member_nm.*/
SELECT member_name,CHAR_LENGTH(member_name) AS Length_Of_Name 
FROM member 
WHERE CHAR_LENGTH(member_name) IN (SELECT MAX(CHAR_LENGTH(member_name)) FROM member);

/*3. Display count of number of books issued so far.*/
SELECT accession_no,COUNT(accession_no) FROM book_issue GROUP BY accession_no;
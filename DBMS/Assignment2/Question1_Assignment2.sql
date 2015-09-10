use lis;

SELECT member_id, member_name, address_line1, address_line2, category FROM members;

SELECT member_name, member_id, category FROM members;

SELECT member_name, member_id, category FROM members WHERE category = "f";

SELECT DISTINCT category FROM members;

SELECT member_name, category FROM members ORDER BY member_name DESC;

SELECT T.title_name, P.publisher_name, S.subject_name FROM titles T
INNER JOIN publishers P
ON T.publisher_id = P.publisher_id
INNER JOIN subjects S
ON T.subject_id = S.subject_id;

SELECT  DISTINCT category, COUNT(DISTINCT member_name) FROM members GROUP BY category;

SELECT  M.member_name FROM members M
LEFT JOIN members MEM
ON M.category = MEM.category WHERE MEM.member_name = "Keshav Sharma";

SELECT BI.issue_date, BI.accession_no, BI.member_id, IFNULL(BR.return_date, "") AS return_date
FROM book_issue BI
LEFT JOIN book_return BR
ON BI.accession_no = BR.accession_no AND BI.member_id = BR.member_id;







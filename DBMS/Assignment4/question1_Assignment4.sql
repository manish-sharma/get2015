-- question 1
SELECT member_name FROM members
WHERE category = (SELECT category FROM members WHERE member_name = "Keshav Sharma");

-- question 2

select  B.issue_date, T.title_name, M.member_name, B.due_date 
from book_issue B, titles T, members M, books BK
where (M.member_id = B.member_id && T.title_id = BK.title_id && BK.accession_no = B.accession_no) &&
(B.accession_no,B.member_id) not in (select accession_no, member_id from book_return);

-- question 3
select  B.issue_date, T.title_name, M.member_name, B.due_date, BR.return_date
from book_issue B, titles T, members M, books BK, book_return BR
where (M.member_id = B.member_id && T.title_id = BK.title_id && BK.accession_no = B.accession_no) &&
(B.accession_no = BR.accession_no && b.member_id = br.member_id) &&
(B.accession_no,B.member_id) in (select BR.accession_no, BR.member_id from book_return BR WHERE DATEDIFF(BR.return_date, B.due_date ) > 0);

-- question 4

select * from books
where price = (select max(price) from books);

-- question 5
select * from books
where price  = (select max(price) from books
                where price < (select max(price) from books));
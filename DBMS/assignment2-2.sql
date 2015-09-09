USE LIS;

select  b.issue_date as issuedOn, IF(b.due_date>curdate(),null,b.due_date) as returnOn  ,b.accession_no as BookAccessionNo,b.member_id as issuedBy ,m.member_name  AS name from BOOK_ISSUE b ,member m where m.member_id=b.member_id order by issue_date asc;

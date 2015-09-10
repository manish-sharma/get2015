use LIS;
INSERT INTO MEMBER VALUES(109,"sumitra","123","456","Student"),(110,"sushila godara","123","456","other"),(111,"shiva","123","456","faculty");

INSERT INTO BOOK_ISSUE VALUES(36,109,curdate(),Date_ADD(curdate(),interval 65 DAY)),(36,110,curdate(),Date_ADD(curdate(),interval 80 DAY));use librarySecond;
-- Assignment 1.1
select m.member_name as Name,
b.member_id as ID,t.title as Title,
bs.accession_no as AccessionNumber,
b.issue_date as IssuedON,
b.due_date as SubmittedON
, DATEDIFF(due_date,issue_date)  as  IssuedFORDAYS 
from 
book_issue b,
member m,
title t ,
books bs 
where 
m.member_id=b.member_id and
bs.accession_no=b.accession_no and
t.title_id = bs.title_id and
DATE_ADD(issue_date,interval 60 day) < due_date
order by member_name, title;

-- Assignment 1.2
select member_name, length( member_name ) from member where length( member_name ) = ( select max( length( member_name ) ) from member );

-- Assignment 1.3
SELECT COUNT(*) as Total_book_issued from book_issue GROUP BY (issue_date);

-- Assignment 2.1
SELECT sub_name, s.sub_id, count(t.title_id) as "Number Of books purchased" FROM Subjects s, Title t where t.sub_id = s.sub_id GROUP BY(sub_id);

-- Assignment 2.2
SELECT m.member_name,m.member_id,t.title,t.title_id,b.accession_no,b.issue_date,b.due_date , DATEDIFF(due_date,issue_date ) AS DiffDate  from Member m,Book_issue b,Title t, Books bk
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_no = b.accession_no) &&( DATEDIFF(b.due_date,b.issue_date )) > 60 ;

-- Assignment 2.3
SELECT accession_no,title_id, purchase_id, price, status from Books WHERE price > (SELECT MIN(price) FROM Books);


-- Assignment 3.1
select count(if(category="faculty",member_name,null))as number_of_faculty ,
count(if(category="other",member_name,null)) as number_of_other,
count(if(category="Student",member_name,null)) as number_of_student
from
member ;

-- Assignment 3.2
select a.title as TitleName,
count(b.accession_no) as number
from book_issue b,
title  a,
books bs 
where 
bs.accession_no=b.accession_no and 
a.title_id =bs.title_id
group by a.title 
having count(b.accession_no)>2
;

-- Assignment 3.3
select m.member_name as Name,
m.category as Category,
b.member_id as ID,t.title as Title,
bs.accession_no as AccessionNumber,
b.issue_date as IssuedON,
b.due_date as SubmittedON
from 
book_issue b,
member m,
title t ,
books bs 
where 
m.member_id=b.member_id and
bs.accession_no=b.accession_no and
t.title_id = bs.title_id and
m.category <>"faculty";


-- Assignment 3.4
select distinct a.au_id as ID,
concat(a.au_fname,a.au_lname) as Name
from author a,books b,
author_title at
where 
at.title_id= b.title_id and
a.au_id= at.au_id;

use LIS;
-- Assignment 1.1
select m1.member_name as Name,m1.member_id as ID , m1.category  as Category
from member m1 ,(select member_name ,member_id,category from member  where member_name= "keshav") as m2
where m1.category = m2.category;

-- Assignment 1.2
select bi.accession_no as "Accession No",
bi.issue_date as "Issue Date", 
bi.due_date as "Due Date",
m.member_name as "Name",
t.title as "Title" 
from book_issue bi,
member m,
title t,
books b
where (( bi.accession_no ,bi.issue_date,bi.member_id)
not in 
(select br.accession_no ,br.issue_date,br.member_id from book_return br)) and
m.member_id = bi.member_id and t.title_id = b.title_id and b.accession_No = bi.accession_No;

-- Assignment 1.3
select bi.accession_no as "Accession No",
bi.issue_date as "Issue Date", 
bi.due_date as "Due Date",
m.member_name as "Name",
t.title as "Title" 
from book_issue bi,
member m,
title t,
books b,
book_return br
where  (DATEDIFF(br.return_date,bi.due_date)>0 )and m.member_id = bi.member_id 
and t.title_id = b.title_id and b.accession_No = bi.accession_No;

-- Assignment 1.4
select accession_no,title_id, price from books 
where price = ( select max( price ) from books );

-- Assignment 1.5
select accession_no,title_id, price from books 
where price = (select max(price) from books 
where
price not in( select max( price ) from books));

-- Assignment 2.1
create view member_and_issue_book_detail as (select m.member_name as "Name",
bi.issue_date as "Issued On" , 
bi.accession_no as "Accession No",
bi.due_date as "Due Date",
t.title as "Title" 
from book_issue bi,
member m,
title t,
books b
where m.member_id = bi.member_id and t.title_id = b.title_id and b.accession_no = bi.accession_no);

-- Assignment 2.2
CREATE VIEW category_Description 
As
SELECT member_name,member_id,if(category not in ('m','f'),"OTHER",IF(category='f',"FACULTY","STUDENT")) as category  from member;
select * from category_Description;

-- Assignment 2.3
CREATE VIEW return_date_detail 
As
select 
 bi.accession_no ,bi.issue_date,bi.member_id
 from 
book_issue bi 
where (( bi.accession_no ,bi.issue_date,bi.member_id)
not in 
(select br.accession_no ,br.issue_date,br.member_id from book_return br));

drop view category_Description ;
CREATE VIEW category_Description 
As
select m.member_name as "Name",
t.title as "Title", 
bi.accession_no as "Accession No",
bi.issue_date as "Issue Date", 
bi.due_date as "Due Date",
s.sub_name as "Subject",
m.category,
if((( bi.accession_no ,bi.issue_date,bi.member_id) in 
(select * from return_date_detail)),null,(select br.return_date from book_return br where
bi.accession_no=br.accession_no and bi.issue_date = br.issue_date and bi.member_id=br.member_id)) 
as "Return Date"
from book_issue bi,
member m,
title t,
books b,
subjects s
where m.member_id = bi.member_id and t.title_id = b.title_id and b.accession_No = bi.accession_No and t.sub_id =s.sub_id;

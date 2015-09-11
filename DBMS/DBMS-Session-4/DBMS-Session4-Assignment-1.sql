select * from issued_data;
select * from title;
select * from members where member_Id in (select member_id from issued_data);
select * from members;
select member_name,member_id,if(category = 's','student',if(category = 'f','faculty',if(category = 'o','others',null))) as category from members;


create or replace view subject_information as select title.subject_id,subject_Name,title_id 
from title,subjects where title_id in (select title_id from issued_data) and title.subject_id = subjects.subject_id;


create or replace view member_info as select member_name,category,member_id from members where member_Id in (select member_id from issued_data);
select * from subject_information;


select subject_name,member_name,category,issued_data.issue_date,due_date,IFNULL(null,return_Date) as return_Date
from subject_information,member_info,issued_data left join book_return on
issued_data.member_Id= book_return.member_Id and issued_data.accession_No = book_return.accession_No
where subject_information.title_Id = issued_data.title_Id 
and member_info.member_id = issued_data.member_Id;
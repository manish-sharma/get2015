-- select datbase
USE lib_info_sys;
--Diplay all the columns of members table
SELECT * FROM members;  

-- Display Member name , id and category
SELECT member_nm "NAME" ,member_id "ID" , category "CATEGORY" from members; 

-- Display Member name , id  whose category should be professor
SELECT member_nm "NAME" ,member_id "ID", category "CATEGORY" from members
WHERE category = 'F' ; 

-- Display all categoris name
SELECT DISTINCT category from members;

-- Display Member name and category
-- Name will in descending order  
SELECT member_nm "MEMBER NAME", category from members 
ORDER BY member_nm DESC;

-- Display All titles and their publishers and Subjects
SELECT title_nm "BOOK TITLE", sb.subject_nm "SUBJECT NAME", pb.publisher_nm 
FROM titles tt , subjects sb, publishers pb 
WHERE tt.subject_id = sb.subject_id AND tt.publisher_id = pb.publisher_id;

-- Display number of members present in particular Category
SELECT category ", count(*) "total_type" FROM members
GROUP BY category;


-- Diplay Members name whose category same to Keshav Sharma
SELECT m1.member_nm
FROM members m1 JOIN members m2 ON m1.category = m2.category
WHERE m2.member_nm = 'Keshav Sharma';
                   
 
 -- Display  the information of all issued book
 SELECT bi.issue_dt , bi.accession_no , bi.member_id , br.return_dt 
 FROM book_issue bi LEFT JOIN book_return br
 ON bi.accession_no = br.accession_no;
 


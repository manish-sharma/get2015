show databases;

USE lib_info_sys;

SELECT * FROM members;  

SELECT member_nm ,member_id , category from members; 

SELECT member_nm ,member_id , category from members
WHERE category = 'professor' ; 

SELECT DISTINCT category from members;

SELECT member_nm , category from members 
ORDER BY member_nm DESC;

SELECT title_nm , sb.subject_nm, pb.publisher_nm 
FROM titles tt , subjects sb, publishers pb 
WHERE tt.subject_id = sb.subject_id AND tt.publisher_id = pb.publisher_id;


SELECT category, count(*) AS total_type FROM members
GROUP BY category;

SELECT member_nm from members
where category IN 
                  (
                    SELECT category from members
                    WHERE member_nm = 'Deepak'
                  );
                  
 
 SELECT bi.issue_dt , bi.accession_no , bi.member_id , br.return_dt 
 FROM book_issue bi LEFT JOIN book_return br
 ON bi.accession_no = br.accession_no;
 


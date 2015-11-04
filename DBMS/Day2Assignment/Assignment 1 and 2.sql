use lis;
SELECT * FROM members;

SELECT  member_name,member_id,category FROM members;

SELECT  member_name,member_id,category FROM members WHERE category = 'teacher';

SELECT  DISTINCT category FROM members;

SELECT  member_name,category FROM members ORDER BY member_name DESC ;

SELECT  category,COUNT(category) AS number_Of_members FROM members GROUP BY category;

SELECT  t.title_name,p.publisher_name,s.subject_name  FROM titles t , publishers p,subjects s where t.publisher_id = p.publisher_id and t.subject_id=s.subject_id;

SELECT  m1.member_name  FROM members m1 inner Join members m2 on m1.category = m2.category WHERE m2.member_name='Keshav Sharma';

SELECT m.member_name ,bi.issue_date,bi.accession_no,bi.member_id,IFNULL(br.return_date,"") AS Return_date 
FROM book_issue bi LEFT OUTER JOIN book_return br ON bi.accession_no=br.accession_no AND bi.member_id=br.member_id ,members m 
WHERE m.member_id=bi.member_id;


SELECT m.member_name ,bi.issue_date,bi.accession_no,bi.member_id,IFNULL(br.return_date,"") AS Return_date 
FROM book_issue bi LEFT OUTER JOIN book_return br ON bi.accession_no=br.accession_no AND bi.member_id=br.member_id ,members m 
WHERE m.member_id=bi.member_id
ORDER BY bi.issue_date ,member_name ASC;




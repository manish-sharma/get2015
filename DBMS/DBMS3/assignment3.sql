USE library;


-- to display total number of different category
SELECT COUNT(category),category FROM members GROUP BY category;


-- to display those titles that issued more then two times
SELECT * FROM book_issue;
SELECT b.accession_no,t.title_id,t.title_name,t.subject_id,t.publisher_id
from titles t ,books b,book_issue bi
WHERE bi.accession_no=b.accession_no AND b.title_id=t.title_id
GROUP BY bi.accession_no
HAVING COUNT(bi.accession_no)>2;


-- to display those information of member and books which has category other then member category F
SELECT m.member_id,m.member_name,bi.accession_no,t.title_name,t.title_id 
FROM members m,book_issue bi,titles t,books b
WHERE m.member_id=bi.member_id AND b.accession_no=bi.accession_no 
AND b.title_id=t.title_id AND m.category!='F';


-- to display those information on those authors for which at least one book has been purchased
SELECT DISTINCT a.author_id,a.author_name 
FROM authors a,books b,title_author ta
WHERE b.title_id=ta.title_id AND a.author_id=ta.author_id;
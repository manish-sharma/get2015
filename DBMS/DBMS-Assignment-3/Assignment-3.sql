USE lis;

/*1. Display total no of students and total no of teachers in a single row*/
SELECT Category,COUNT(category) FROM member GROUP BY category;

/*2. Display the information of those titles that have been issed more than 2 times */
SELECT t.title_id,t.title_name, COUNT(bi.accession_no) AS NoOfTimesIssued
FROM book_issue bi
INNER JOIN books b
ON bi.accession_no=b.accession_no
INNER JOIN  titles t 
ON b.title_id=t.title_id
GROUP BY bi.accession_no
HAVING (SELECT COUNT(bi.accession_no)>2);

/*3. Display information on books issued to members 
of catagory other than teacher*/
SELECT  m.member_name, m.member_id, t.title_name, bi.accession_no
FROM book_issue bi
INNER JOIN  member m
ON bi.member_id = m.member_id AND m.category NOT IN("F")
INNER JOIN books b
ON b.accession_no = bi.accession_no
INNER JOIN titles t
ON b.title_id = t.title_id;

/*4. Display information on those authors for which 
at least one book has been purchaged*/
SELECT DISTINCT a.author_name
FROM authors a
INNER JOIN 
title_author ta
ON 
a.author_id=ta.author_id
WHERE 
ta.title_id IN (SELECT title_id FROM titles);

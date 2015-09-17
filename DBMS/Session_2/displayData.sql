use Library;
/* Assignment 1*/
/* Diaplay all columns of member table*/
SELECT * 
FROM members;

/* Display member_nm,member_id,category of member table*/
SELECT member_nm,member_id,category
FROM members;

/* 
 * Display member_nm,member_id,category of member table
 * where category of member is 'F'
 */
 
SELECT member_nm,member_id,category
FROM members
WHERE category = "F";

/* 
 *Display various category of members
 */
 
SELECT DISTINCT category
FROM members;

/*
 * Display member name and their category in 
 * descending of members name
 */
 
SELECT member_nm,category
FROM members
ORDER BY member_nm DESC;


/* 
 * Display all the titles,their subjects and publishers
 */                                                  

SELECT title_nm,subject_nm,publisher_nm
FROM titles t
INNER JOIN subjects s
ON t.subject_id=s.subject_id
INNER JOIN publishers p
ON t.publisher_id=p.publisher_id;

/*
 * Display no of members in each category
 */
 
SELECT COUNT(*) as noOfMembers,category
FROM members
GROUP BY category;

/*
 * Dispay name of those members who belongs to the category as to which 
 * members "Nidhi" is belongs
 */
 
SELECT DISTINCT e1.member_nm
FROM members e1
INNER JOIN members e2
ON e1.category = (select category from members where member_nm="Nidhi");
 
/*
 * Dispaying information on all book issued.It include issue date
 * accession no,member_id and return date.if the book has not returned
 * then tha coloumn return date contain blank 
 */
 
SELECT i.issue_dt,i.accession_no,i.member_id,return_dt
FROM book_issue i
LEFT JOIN book_return r
ON i.member_id = r.member_id
AND i.accession_no=r.accession_no;


/* Assignment 2*/

/*
 * Display above result ascending order of issue date
 * and within issue date in ascending order of member name.
 */
 


SELECT i.issue_dt,i.accession_no,i.member_id,return_dt,member_nm
FROM book_issue i
LEFT JOIN book_return r
ON i.member_id = r.member_id
AND i.accession_no=r.accession_no
INNER JOIN members
ON i.member_id = members.member_id
ORDER BY i.issue_dt,member_nm;

 



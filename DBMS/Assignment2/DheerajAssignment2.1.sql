/*TO display all columns of members table*/

SELECT * FROM members;

/*To Select member_name, member_id and category*/

SELECT member_id , member_name , category FROM  members;

/*Select from members table where member is Faculty */

SELECT member_id , member_name, category FROM members WHERE category = "F";

/*To select various categories of members*/

SELECT DISTINCT(category)  FROM members;

/*To Select member name and category in descending order of member name*/

SELECT member_name, category FROM members ORDER BY member_name DESC;

/*select to display all title,their subject and publishers*/

SELECT titles.title_name, subjects.subject_name, publishers.publisher_name FROM titles JOIN subjects
ON subjects.subject_id = titles.subject_id JOIN publishers ON titles.publisher_id = publishers.publisher_id;

/*select to display number of members present in each category*/

SELECT category , count(category) "Number of members" FROM members GROUP BY category;

/*select to display those member which belongs to same category "Babalu" belongs*/

SELECT m1.member_name FROM members AS m1 JOIN members AS m2 ON m1.category = m2.category AND m1.member_name not in("Babalu") WHERE m2.member_name ="Babalu";

/*Select to display information of all books issued show(issue date, accssion no, member id and return date)*/

SELECT bi.issue_date "Issued Date", bi.accession_no "Accession Number", bi.member_id "Issued To", return_date "Returned Date" 
FROM book_issue AS bi JOIN book_return AS br ON bi.accession_no = br.accession_no;
	

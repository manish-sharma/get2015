-- use database library_information_system
USE library_information_system;

-- query to display all columns of memebr table
SELECT * FROM Members;

-- query to display only member name and member id column
SELECT Member_name,Member_id,Category FROM Members;

-- query to display member name, meber id and category where category is equal to F
SELECT Member_name,Member_id,Category FROM Members WHERE Category='F';

-- query to display various category of members
SELECT DISTINCT category FROM Members;

-- query to display member name and category in descending order of member name
SELECT Member_name,Category FROM Members ORDER BY Member_name DESC;

-- query to display all titles , subjects and publishers name
SELECT Subject_name,Title_name,Publisher_name FROM Titles t INNER JOIN Subjects s INNER JOIN Publishers p ON t.Subject_id=s.Subject_id AND t.Publisher_id=p.Publisher_id;

-- query to display the number of members in each category 
SELECT Category, COUNT(Category) from Members group by Category;

--  query to display names of those members who belong to the same category as riddhi
SELECT m.Member_name FROM Members m INNER JOIN Members m1 ON m.Category=m1.Category AND m1.Member_name="Riddhi" AND m.Member_name!=m1.Member_name;

-- query to display information of all books issued
SELECT Accession_no AS Acc_no ,Member_id AS Mem_id,Issue_date AS Iss_d,Return_date AS Ret_d FROM Book_return;

-- query to display information of all books issued in ascending order of issue date and within isssue date members name
SELECT b.Accession_no AS Acc_no ,b.Member_id AS Mem_id, b.Issue_date AS Iss_d,b.Return_date AS Ret_d FROM Book_return b INNER JOIN Members m  ON m.Member_id = b.Member_id ORDER BY Issue_date , m.Member_name;



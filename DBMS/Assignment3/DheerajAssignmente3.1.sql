
/*Adding values to tables*/

use library_management_system;

drop trigger book_due_date;
TRUNCATE book_issue;

TRUNCATE book_return;

TRUNCATE members;

select * from members;
UPDATE members SET category="O" WHERE member_name="Dheeraj";


INSERT INTO members(member_name,addressline1,addressline2,category) VALUES
("Dheeraj","Kishangarh","Ajmer","O"),
("Babalu","Jalabarh","Jalabarh","O"),
("Anurag Anand","Chai Ki Mandi","Patna","S"),
("Sumitra","Madhav Nagar","Chittorgarh","F"),
("Girdhari","HOli Gate","Mathura","F");

INSERT INTO book_issue(issue_Date, accession_No, member_Id, due_Date) VALUES
('2015-09-23', 1, 5, '2015-10-08'),
('2015-09-24', 2, 4, '2015-10-09'),
('2015-09-21', 3, 3, '2015-10-06'),
('2015-09-10', 4, 2, '2015-09-25'),
('2015-09-16', 5, 1, '2015-10-01');


/*Insert value  Book Return table */
INSERT INTO book_return(return_Date, accession_No, member_Id, issue_Date) VALUES
('2015-09-25', 1, 5, '2015-09-23'),
('2015-11-12', 2, 4, '2015-09-24'),
('2015-10-10', 3, 3, '2015-09-21'),
('2016-02-28', 4, 2, '2015-09-10'),
('2015-12-30', 5, 1, '2015-09-16');


INSERT INTO books(title_id,purchase_date, price, status) VALUES
(2,'2015-04-30',11, "Y"),
(3,'2015-05-30',101,"Y"),
(3,'2015-06-30',21, "Y"),
(2,'2015-07-30',51, "Y"),
(4,'2015-08-30',221,"Y"),
(3,'2015-09-30',21, "Y"),
(2,'2015-10-30',51, "Y"),
(2,'2015-11-30',221,"Y");

INSERT INTO book_issue(issue_Date, accession_No, member_Id, due_Date) VALUES
('2015-09-24', 6, 5, '2015-10-08'),
('2015-10-24', 7, 4, '2015-10-09'),
('2015-11-21', 8, 3, '2015-10-06'),
('2015-09-10', 9, 2, '2015-09-25'),
('2015-12-16', 12,1, '2015-10-01');



/*Insert value  Book Return table */
INSERT INTO book_return(return_Date, accession_No, member_Id, issue_Date) VALUES
('2015-10-25', 6, 5, '2015-09-24'),
('2015-11-12', 7, 4, '2015-10-24'),
('2015-12-10', 8, 3, '2015-11-21'),
('2016-02-28', 9, 2, '2015-09-10'),
('2015-12-30', 12, 1, '2015-12-16');

INSERT INTO book_issue(issue_Date, accession_No, member_Id, due_Date) VALUES
('2015-09-25', 6, 5, '2015-12-08'),
('2015-09-28', 7, 4, '2015-11-30');

/*Insert values in titles table*/
INSERT INTO titles(title_name, subject_id, publisher_id) VALUES
("DATABASE Management System",1,6),
("C programing",2,5),
("Artifical Approach",4,2),
("Maths Easy",6,1);


/*Assignment 3.1.1 display all the member with name which has due date more than 60 days*/
SELECT m.member_name , m.member_id , t.title_name , t.title_id, b.accession_no , b.issue_date , b.due_date , DATEDIFF(due_Date,issue_Date ) AS "Date Difference"
from members m,book_issue b,titles t, books bk
WHERE (m.member_id = b.member_id && t.title_id = bk.title_id && bk.accession_no = b.accession_no) &&( DATEDIFF(b.due_date,b.issue_date )) > 60 
order By member_name ,title_name;



/*Assignment 3.1.2 max length of member name */
SELECT member_name, length(member_name) Max_Length FROM members WHERE length(member_name)= (SELECT max(length(member_name)) from  members);

/*Assignment 3.1.3 Total no of book issue*/
SELECT COUNT(member_id) No_Of_Book_Issue from book_issue;

















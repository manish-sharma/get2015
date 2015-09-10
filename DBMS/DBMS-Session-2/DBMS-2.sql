USE LIS;

SELECT * FROM members;

SELECT member_Id, member_Name, category FROM members;

SELECT member_Id, member_Name, category FROM members WHERE category = 'f';

SELECT DISTINCT category FROM members;

SELECT member_Name, category FROM members ORDER BY member_Name DESC;

SELECT t.title_Name, s.subject_Name, p.publisher_Name FROM title t, subjects s, publishers p
        WHERE t.subject_Id = s.subject_Id AND t.publisher_Id = p.publisher_Id;
        
SHOW TABLES;

SELECT category, COUNT(member_Id) AS number_of_members FROM members GROUP BY category;

INSERT INTO members(member_Name, addressLine1, addressLine2, category) VALUES('Keshav Sharma', 'Bani Park', 'Jaipur', 'm');

SELECT DISTINCT m.member_Name FROM members m
        INNER JOIN members m2 ON m.category = (SELECT category FROM members WHERE member_Name = 'Keshav Sharma');
        
SELECT issue_Date, return_Date, accession_No, member_Id FROM book_Return;
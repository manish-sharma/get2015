USE Library;
-- Query to find all the columns of table Users
SELECT* FROM Users;
-- Query to find the user id,user name,gender of table Users
SELECT userName,userId,gender FROM Users;
-- Query to find the user id,user name,gender of table Users whose gender = 'f'
SELECT userName,userId,gender FROM Users WHERE gender='F';
-- Query to find distinct genders of table Users
SELECT DISTINCT gender FROM Users;
-- Query to find the user id,user name of table Users order by descending order of user name
SELECT userName,gender FROM  Users ORDER BY userName DESC;
-- Query to find the title name,publisher name, subject id of table
SELECT titleName,P.publisherName, subjectId FROM Title T , Publishers P WHERE T.publisherId=P.publisherId;
-- Query to find the count of members of category
SELECT gender,COUNT(*) From Users GROUP BY gender;
-- Query to find name of users belongs to gender to which raju belongs
SELECT M1.userName FROM Users AS M1 JOIN Users AS M2 ON M1.gender = M2.gender WHERE M2.userName ="raju";
-- Query to find the status of return book and if returned  then place blank
SELECT issueDate,userId,B.accessionNo, IF( status = 0 , returnDate," " ) as Books_Return FROM Books B,Books_Return BR WHERE B. accessionNo = BR.accessionNo;


-- Assignment 2
-- Query to  display results in ascending order of issue date and within issue date in ascending order of users name.

SELECT BR.issueDate, BR.userId,BR.accessionNo,IF( B.status =0 , returnDate," " ) as Books_Return from Books B,Books_Return BR, Users U WHERE ((B. accessionNo = BR.accessionNo )&&(BR.userId=BR.userId)) ORDER BY issueDate asc , userName asc;

-- Query to insert data into Books_Issue table
INSERT INTO Books_Issue VALUES ('2015-09-13',101,1001,'2015-09-28'),
                               ('2015-09-13',102,1001,'2015-09-28'),
							   ('2015-09-13',101,1003,'2015-09-28');
-- Query to insert data into Books_Issue table
INSERT INTO Books_Issue VALUES ('2015-08-30',101,1001,'2015-09-14'),
                               ('2015-09-01',102,1001,'2015-09-16'),
							   ('2015-08-15',102,1001,'2015-08-30'),
								('2015-08-15',101,1001,'2015-08-30');
-- Query to display data of Books_Issue table
 SELECT * FROM Books_Issue ORDER BY issueDate;
Use library;
DELETE FROM B Using Books AS B WHERE( 
PERIOD_DIFF(
DATE_FORMAT(CURDATE(), '%Y%m'),
DATE_FORMAT((SELECT BI.issueDate FROM Books_Issue BI WHERE BI.accessionNo=B.accessionNo ORDER BY BI.issueDate DESC LIMIT 0,1), '%Y%m'))>12

OR 
PERIOD_DIFF(
DATE_FORMAT(CURDATE(), '%Y%m'),
DATE_FORMAT(B.purchaseDate, '%Y%m')
 )>12

);
 
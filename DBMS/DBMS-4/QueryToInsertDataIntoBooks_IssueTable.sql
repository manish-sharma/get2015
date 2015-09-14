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

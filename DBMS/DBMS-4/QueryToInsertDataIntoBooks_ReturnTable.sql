-- Query to insert data into Books_Return table
INSERT INTO Books_Return VALUES ('2015-09-13',101,1001,'2015-09-13'),
                                  ('2015-09-13',102,1001,'2015-09-13'),
								   ('2015-09-11',101,1001,'2015-08-30'),
								   ('2015-09-05',102,1001,'2015-08-15'),
								   ('2015-09-01',101,1001,'2015-08-15');
                                   
-- Query to display data of Books_Return table       
SELECT* FROM Books_Return ORDER BY returnDate ;


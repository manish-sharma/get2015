USE Library;


delete from Title_Author;
delete from Authors;
delete from Books_Return;
delete from Books_Issue;
delete from Books;
delete from Title;
delete from Subjects;
delete from Publishers;
delete from Users;

INSERT INTO Users VALUES ( 1001, 'raju','sector-8','sector-10','m'),
                        ( 1002, 'rani','malviyanager','sitapura','f'),
                       ( 1003, 'ram','jagatpura','mansroavar','m'),
                        ( 1004, 'rajshree','india gate','goner','f');
						
INSERT INTO Publishers VALUES (501,'Tata'),
                               (502,'New world'),
							   (503,'big rock');

INSERT INTO Subjects VALUES (51,'arts'),
                             (52,'science'),
							 (53,'agriculture');
							   
INSERT INTO Title VALUES (201,'love of Arts', 51,501),
                         (202,'science world', 52,501),
						 (203,'agriculture for you', 51,502);
						
INSERT INTO Books VALUES (101,201, '2013-01-01',500,'available'),
                           (102,202, '2014-01-01',600,'available'),
						   (103,201, '2015-01-01',700,'available');					


INSERT INTO Books_Issue (accessionNo,userId) VALUES (101,1001),
                                                    ( 102,1001),
							                                      ( 101,1003);
							
INSERT INTO Books_Return VALUES (curdate(),101,1001,DATE_SUB(curdate(),INTERVAL 15 day)),
                                  (curdate(),102,1001,DATE_SUB(curdate(),INTERVAL 15 day)),
								  (curdate(),101,1003,DATE_SUB(curdate(),INTERVAL 15 day));
							
INSERT INTO Authors VALUES ( 1, 'pooja'),
                           ( 2, 'manu'),
                           ( 3, 'dheeraj');

INSERT INTO Title_Author VALUES (201,1),
                                 (202,1),
								                 (201,3);
			
select* from Users;
select* from Publishers;
select* from Subjects;
select* from Title;
select* from Books;
select* from Books_Issue;
select* from Books_Return;
select* from Authors;
select* from Title_Author;
























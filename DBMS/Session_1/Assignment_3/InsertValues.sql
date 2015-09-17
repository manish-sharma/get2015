/*
 *Insert sample data in LIS tables by using SQL files.
 */


/*
 * Insert data in memebers table 
 */
INSERT INTO members
(member_id,member_nm,addressline1,addressline2,category)
VALUES
(1,"Neha","Gopalpura","JODHPUR","F"),	
(2,"Nidhi","Sanganer","Kota","F"),
(3,"Richa","Sitapura","Udaipur","F"),
(4,"Chetna","Jotwada","Jaipur","F"),
(5,"Suman","Mansarovar","Jaipur","F"),
(6,"Aditya","Pratapnagar","Kota","M"),
(7,"Nikhil","Sodala","Udaipur","M");


/*
 * Insert data in publishers table 
 */
INSERT INTO publishers
VALUES 
(30001, 'ABC Journals'),
(30105, 'Academe Research Journals'),
(30115, 'Academia Publishing'),
(30005, 'Academia Scholarly Journals (ASJ)'),
(30018, 'British Journal');


/*
 * Insert data in sunjects table 
 */
INSERT INTO subjects  VALUES 
(1, 'Science'),
(2, 'Math'),
(3, 'Social;_Science'),
(4, 'General_Knowledge'),
(5, 'Emglish');


/*
 * Insert data in titles table 
 */
INSERT INTO titles  
VALUES 
(1001, "Title1", 1, 30115),
(1003, "Title2", 2, 30001),
(1006, "Title3", 5, 30018),
(1015, "Title4", 3, 30105),
(1008, "Title5", 4, 30005);


/*
 * Insert data in title_author table 
 */
INSERT INTO title_author
VALUES
(1001, 100108),
(1006, 100112),
(1015, 100105),
(1008, 100106),
(1003, 100110);


/*
 * Insert data in books table 
 */
INSERT INTO books 
VALUES 
(3023012, 1006, '2004-07-05', 500, 'Not_Issued'),
(1034835, 1003, '2004-07-05', 500, 'Not_Issued'),
(9873492, 1015, '2006-11-12', 500, 'Issued'),
(7874365, 1008, '2005-01-02', 500, 'Not_Issued'),
(0935482, 1001, '2003-11-23', 500, 'Not_Issued');

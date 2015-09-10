/*Insert query is used to insert the data in the table*/
INSERT INTO AUTHOR VALUES(1,"gupta","ankur","123","jaipur"),(2,"gupta","ankur","123","jaipur"),(3,"sharma","vaibhav","b24","jaipur"),(4,"nainani","sanjay","rajapark","jaipur");
INSERT INTO PUBLISHER VALUES(1,"willy_publication","jaipur"),(2,"nk","jaipur"),(3,"cbc","kota");
INSERT INTO MEMBER VALUES(01,"ankur","71","shastrinagar","s"),(02,"sanju","b56","shastrinagar","f"),(03,"priyagupta","35","chotichaupar","o"),(04,"amit","s46","shastrinagar","s");
INSERT INTO SUBJECTS VALUES(1,"science"),(2,"maths"),(3,"physics"),(4,"maths");
INSERT INTO TITLE VALUES(15,"Run","story",125,2),(16,"harry porter","story",300,1);
INSERT INTO AUTHOR_TITLE VALUES(15,1),(16,3);
INSERT INTO BOOKS VALUES(34,15,'2001-11-02',200,"Available"),(35,16,'2010-12-23',625,"Available"),(36,16,'2010-09-23',625,"Available"),(37,16,'2010-01-23',925,"Available");


INSERT INTO BOOK_ISSUE VALUES(34,01,curdate(),Date_ADD(curdate(),interval 15 DAY)),(35,02,curdate(),Date_ADD(curdate(),interval 15 DAY));
INSERT INTO BOOK_RETURN VALUES(34,01,DATE_SUB(curdate(),INTERVAL 15 DAY ),curdate()),(35,02,DATE_SUB(curdate(),INTERVAL 15 DAY ),curdate());
INSERT INTO BOOK_ISSUE VALUES(36,03,curdate(),Date_ADD(curdate(),interval 70 DAY)),(37,02,curdate(),Date_ADD(curdate(),interval 15 DAY));
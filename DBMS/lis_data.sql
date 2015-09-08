/*Insert query is used to insert the data in the table*/
INSERT INTO AUTHOR VALUES(1,"gupta","ankur","123","jaipur"),(2,"gupta","ankur","123","jaipur"),(3,"sharma","vaibhav","b24","jaipur"),(4,"nainani","sanjay","rajapark","jaipur");
INSERT INTO PUBLISHER VALUES(1,"willy_publication","jaipur"),(2,"nk","jaipur"),(3,"cbc","kota");
INSERT INTO MEMBER VALUES(01,"ankur","71","shastrinagar","m"),(02,"sanju","b56","shastrinagar","f"),(03,"priya","35","chotichaupar","f");
INSERT INTO SUBJECTS VALUES(1,"science"),(2,"maths"),(3,"physics");
INSERT INTO TITLE VALUES(15,"Run","story",125,2),(16,"harry porter","story",300,1);
INSERT INTO AUTHOR_TITLE VALUES(15,1),(16,3);
INSERT INTO BOOKS VALUES(34,15,161,200,"Available"),(35,16,162,625,"Available");
INSERT INTO BOOK_ISSUE VALUES(34,01,now(),(now()+15)),(35,02,now(),(now()+15));
INSERT INTO BOOK_RETURN VALUES(34,01,now(),(curdate()+15)),(35,02,now(),(curdate()+15);
INSERT INTO AUTHOR VALUES(1,"gupta","ankur","123","jaipur"),(2,"gupta","sanjay","123","jaipur"),(3,"garg","amit","123","jaipur"),(4,"goyal","shiva","123","jaipur");

INSERT INTO PUBLISHER VALUES(5,"willy_publication","jaipur"),(6,"person_publication","jaipur"),(7,"arihent_publication","jaipur"),(8,"Diamond_publication","jaipur");

INSERT INTO MEMBER VALUES(9,"ankur","123","456","f"),(10,"gaurav","123","456","f"),(11,"pulkit","123","456","s");
INSERT INTO MEMBER VALUES(12,"keshav","123","456","o");
INSERT INTO SUBJECTS VALUES(12,"science"),(13,"maths"),(14,"English");
INSERT INTO TITLE VALUES(15,"Run","story",123,12,5),(16,"harry porter","story",123,13,6);
INSERT INTO AUTHOR_TITLE VALUES(15,1),(16,3);
-- INSERT INTO BOOKS VALUES(34,15,161,123,"Available"),(35,16,163,321,"Available"),(36,16,163,123,"Available");
INSERT INTO BOOKS VALUES(34,15,'2010-08-09',123,"Available"),(35,16,'2004-08-09',123,"Available"),(36,16,'2015-08-09',321,"Available");
INSERT INTO BOOKS VALUES(37,15,'2004-08-09',123,"Available"),(38,16,'2015-08-09',123,"Available"),(39,16,'2003-08-09',321,"Available");
INSERT INTO BOOK_ISSUE VALUES(34,9,'2015-08-09','2015-08-24'),(35,10,'2015-08-19','2015-09-04');
INSERT INTO BOOK_ISSUE VALUES(35,9,'2015-09-09','2015-09-24'),(34,10,'2015-09-09','2015-09-24');
INSERT INTO BOOK_ISSUE VALUES(36,9,'2015-08-09','2015-09-24'),(36,10,'2015-10-09','2015-10-24');
INSERT INTO BOOK_RETURN VALUES(34,9,'2015-08-09','2015-08-24'),(35,10,'2015-08-19','2015-09-06'),(34,10,'2015-09-09','2015-09-25'),(36,9,'2015-08-09','2015-09-24');
                              
select * from author;
select * from PUBLISHER ;
select * from MEMBER ;
select * from SUBJECTS;
select * from TITLE ;
select * from AUTHOR_TITLE;
select * from BOOKS;
select * from BOOK_ISSUE;
select * from BOOK_RETURN;
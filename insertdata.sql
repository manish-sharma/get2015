INSERT INTO AUTHOR VALUES(1,"godara","sumitra","123","jaipur"),(2,"godara","sushila","123","jaipur"),(3,"godara","suman","123","jaipur"),(4,"godara","shiva","123","jaipur");

INSERT INTO PUBLISHER VALUES(5,"willy_publication","jaipur"),(6,"person_publication","jaipur"),(7,"arihent_publication","jaipur"),(8,"Diamond_publication","jaipur");

INSERT INTO MEMBER VALUES(9,"sumitra","123","456","F"),(10,"sushila","123","456","F"),(11,"shiva","123","456","M");

INSERT INTO SUBJECTS VALUES(12,"science"),(13,"maths"),(14,"English");
INSERT INTO TITLE VALUES(15,"Run","story",123,5),(16,"harry porter","story",123,6);
INSERT INTO AUTHOR_TITLE VALUES(15,1),(16,3);
INSERT INTO BOOKS VALUES(34,15,161,123,"Available"),(35,16,163,123,"Available");
INSERT INTO BOOK_ISSUE VALUES(34,9,curdate(),Date_ADD(curdate(),interval 15 DAY)),(35,10,curdate(),Date_ADD(curdate(),interval 15 DAY));
INSERT INTO BOOK_RETURN VALUES(34,9,DATE_SUB(curdate(),INTERVAL 15 DAY ),curdate()),
                              (35,10,DATE_SUB(curdate(),INTERVAL 15 DAY ),curdate());

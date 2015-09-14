-- Query to use library database
USE Library;
-- Query to alter default value of issueDate in Books_Issue table by current date
ALTER TABLE `Books_issue` MODIFY COLUMN `issueDate` TIMESTAMP NOT NULL DEFAULT NOW();
-- Query to create Trigger to alter default value of dueDate in  Books_Issue table by (current date+15 days)
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON Books_Issue FOR EACH ROW
BEGIN
  IF  NEW.dueDate IS NULL THEN
    SET NEW.dueDate = DATE_ADD(NOW(), INTERVAL 15 DAY);
  END IF;
END;;
DELIMITER ;
-- Query to display data of Books_Issue Table
select* from Books_Issue;
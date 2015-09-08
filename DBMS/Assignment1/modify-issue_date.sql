ALTER TABLE Book_Issue MODIFY COLUMN issue_Date TIMESTAMP NOT NULL DEFAULT NOW();
DELIMITER ;;
CREATE TRIGGER book_due_date BEFORE INSERT ON Book_Issue FOR EACH ROW
BEGIN
    SET NEW.due_Date = DATE_ADD(NOW(), INTERVAL 15 DAY);
END;;
DELIMITER ;
desc book_issue;
select issue_date, due_date from book_issue;
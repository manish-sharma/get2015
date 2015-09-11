-- Query to use library database
USE Library;
-- Query to display Books Information for which price is greater than minimum price
SELECT * FROM Books  WHERE price>(SELECT min(price) FROM Books);
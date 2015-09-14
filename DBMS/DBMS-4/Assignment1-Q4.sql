-- Query to use library database
USE Library;
-- Query to display information of those books whose price is equal to the most expensive book purchase so far.
SELECT* FROM Books WHERE price=(SELECT max(price) FROM Books);
-- Query to use library database
USE Library;
-- Query  to display the second maximum price of a book.
SELECT* FROM Books 
WHERE price=((SELECT MAX(price) FROM Books WHERE price<((SELECT MAX(price) FROM Books))));
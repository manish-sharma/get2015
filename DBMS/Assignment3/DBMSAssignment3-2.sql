
-- display subjectwise information 
SELECT s.Subject_id, s.Subject_name, COUNT(bi.Accession_no) AS TotalBooksPurchased FROM Subjects s 
INNER JOIN Titles t ON t.Subject_id=s.Subject_id 
INNER JOIN Books b ON t.Title_id=b.Title_id
INNER JOIN Book_issue bi ON bi.Accession_no=b.Accession_no
GROUP BY(bi.Accession_no) ;

-- display those rows where a book can be returned after two months
SELECT * FROM Book_issue b WHERE (period_diff(date_format(b.due_date, '%Y%m'), date_format(b.issue_date, '%Y%m')))>2;

-- display the number of books having price greater than the minimum price of book purchased so far
SELECT t.Title_name, b.Price FROM Titles t,Books b 
WHERE b.Price >( SELECT MIN(Price) FROM Books 
WHERE t.Title_id=b.Title_id);










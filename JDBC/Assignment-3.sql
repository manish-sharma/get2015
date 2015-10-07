Use library;
DELETE FROM B Using Books AS B WHERE( 
PERIOD_DIFF(
DATE_FORMAT(CURDATE(), '%Y%m'),
DATE_FORMAT((SELECT BI.issueDate FROM Books_Issue BI WHERE BI.accessionNo=B.accessionNo ORDER BY BI.issueDate DESC LIMIT 0,1), '%Y%m'))>12

OR (
PERIOD_DIFF(
DATE_FORMAT(CURDATE(), '%Y%m'),
DATE_FORMAT(B.purchaseDate, '%Y%m')
 )>12
 AND 
 NOT EXISTS(SELECT BI.issueDate FROM Books_Issue BI WHERE BI.accessionNo=B.accessionNo ORDER BY BI.issueDate DESC LIMIT 0,1)
 )

);
 select * FROM Books;
 
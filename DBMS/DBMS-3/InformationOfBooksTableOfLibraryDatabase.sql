-- Query To use library database
USE Library;
-- Query to display Books Information issued by Members of category other than Faculty 
SELECT 
    B.accessionNo, B.titleId, B.purchaseDate, B.price, B.status
FROM
    Books B,
    Books_Issue BI,
    Members M
WHERE
   M.memberId = BI.memberId AND M.category != 'Faculty' AND B.accessionNo = BI.accessionNo;
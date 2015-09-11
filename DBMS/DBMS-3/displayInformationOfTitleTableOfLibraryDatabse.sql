-- Query to use library database
USE Library;
-- Query to display the information of title table that are issued more than 2 times
SELECT COUNT(T.titleId) AS total_issued,T.titleId,T.titleName FROM Title T,Books B,Books_Issue BI 
WHERE B.accessionNo=BI.accessionNo AND B.TitleId=T.titleId  GROUP BY T.TitleId HAVING COUNT(T.titleId)>2;



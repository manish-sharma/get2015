-- Query to open library databse
USE Library;
-- Query to display informations from various tables on book issue which is issued for more than 2 months
SELECT PERIOD_DIFF(DATE_FORMAT(BI.dueDate, '%Y%m'), DATE_FORMAT(BI.issueDate, '%Y%m')) AS
issued_for_months,B.accessionNo, M.memberId,M.memberName,T.titleName,BI.issueDate,BI.dueDate
FROM Books_Issue BI,Members M,Title T,Books B
WHERE PERIOD_DIFF(DATE_FORMAT(BI.dueDate, '%Y%m'), DATE_FORMAT(BI.issueDate, '%Y%m'))>2 AND
BI.memberId=M.memberId AND
B.titleId=T.titleId AND
B.accessionNo=BI.accessionNo
ORDER BY M.memberName,T.titleName;


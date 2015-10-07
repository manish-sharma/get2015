-- Query to use library database
USE Library;
-- Query  to display information on the books that have been returned after their due dates.
SELECT M.memberId,M.memberName,B.accessionNo,T.titleId,T.titleName,BI.issueDate,BI.dueDate 
FROM Members M,Books B,Title T,Books_Issue BI
WHERE M.memberId=BI.memberId AND B.accessionNo=BI.accessionNo AND T.titleId=B.titleId AND
(DATEDIFF((SELECT BR.returnDate FROM Books_Return BR WHERE BR.accessionNo=B.accessionNo
 AND BI.memberId=BR.memberId AND DATEDIFF(BI.issueDate,BR.issueDate)=0),BI.dueDate)>0)
ORDER BY BI.issueDate; 
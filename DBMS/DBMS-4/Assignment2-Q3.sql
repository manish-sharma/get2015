-- Query to use library database
USE Library;
-- Query to  Create a View which contains the information – subject name,title, member name, category, issue date, due date and
-- return date. If the books have not been returned, NULL should be stored instead of return date.
CREATE OR REPLACE VIEW View_For_Multiple_Tables
AS 
(
SELECT S.subjectId,S.subjectName,T.titleId,T.titleName,M.memberId,M.memberName,M.category,BI.issueDate,BI.dueDate,
 BR.returnDate
FROM Members M,Books B,Title T,Subjects S,Books_Issue BI LEFT JOIN Books_Return BR on BR.accessionNo=BI.accessionNo
 AND BR.memberId=BI.memberId AND DATEDIFF(BI.issueDate,BR.issueDate)=0
 
WHERE M.memberId=BI.memberId  AND B.accessionNo=BI.accessionNo AND T.titleId=B.titleId AND S.subjectId=T.subjectId);
-- Query to display data of view View_For_Multiple_Tables
select * FROM View_For_Multiple_Tables;


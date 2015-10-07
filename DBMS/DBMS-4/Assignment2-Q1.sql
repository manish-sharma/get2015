-- Query to use library database
USE Library;
-- Query to Create a View which can be used to display member name and all issue details of the member 
CREATE VIEW Issue_Details_Of_Memeber 
AS SELECT M.memberId,M.memberName,BI.issueDate,BI.dueDate,B.accessionNo,T.titleId FROM Members M,Books_Issue BI, Books B, Title T
WHERE M.memberId=BI.memberId AND B.accessionNo=BI.accessionNo AND T.titleId=B.titleId;
-- Query to display the data of View Issue_Details_Of_Memeber 
SELECT * FROM Issue_Details_Of_Memeber ;




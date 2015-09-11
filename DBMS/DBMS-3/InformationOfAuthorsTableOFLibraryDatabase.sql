-- Query To open library databse
USE Library;
-- Query TO display Author information for which atleast one book has been purchased
SELECT DISTINCT A.authorId,A.authorName
FROM Authors A,Books B,Title T ,Title_Author TA
WHERE A.authorId=TA.authorId AND T.titleId=TA.titleId AND T.titleID=B.titleId ;




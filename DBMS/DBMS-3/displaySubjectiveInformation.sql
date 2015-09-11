-- Query to use library databse
USE Library;
-- Query to display subjective information of books and total purchased count
SELECT COUNT(S.subjectId) AS total_Purchased ,S.subjectId,S.subjectName FROM Subjects S,Books B,Title T
WHERE
T.titleId=B.titleId AND S.subjectId=T.subjectId GROUP BY S.subjectId;

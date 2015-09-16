Use Library;
Select * From Title T Join Title_Author TA ON T.titleId=TA.titleId Join Authors A On A.authorId=TA.authorId WHERE A.authorName='Pooja'
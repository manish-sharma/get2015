Use library;
INSERT INTO Books_Issue (accessionNo,memberId) VALUES((SELECT accessionNo FROM Books B,Title T Where B.titleId=T.titleId AND
T.titleName='love of Arts' LIMIT 0,1),(Select memberId from members Where memberId=1006));
select* from Books_issue;

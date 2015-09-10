 USE Library;

SELECT * FROM Members;
SELECT Member_Id, Member_Name,Category FROM Members;
SELECT Member_Id, Member_Name,Category FROM Members WHERE Category = 'F';
SELECT DISTINCT Category FROM Members;
SELECT Member_Name,Category FROM Members ORDER BY Member_Name DESC;
SELECT Title_Name, Subject_Name,Publisher_Name FROM Title LEFT JOIN Subjects ON Title.Subject_Id = Subjects.Subject_Id LEFT JOIN Publishers ON Title.Publisher_Id = Publishers.Publisher_Id;
SELECT Category,Count(Category) FROM Members GROUP BY Category;
SELECT Member_Name FROM Members JOIN (SELECT Category FROM Members WHERE Member_Name = 'Mark Thomson') AS One ON Members.Category = One.Category;


SELECT accession_No from books where status  = 1;

select * from book_Issue;
create view result as (select issue_Date, accession_No,member_Id from book_Issue where accession_No IN (SELECT accession_No from books where status  = 1));
CREATE VIEW Que9 AS select result.issue_Date, result.accession_No,result.member_Id,book_Return.return_Date from book_return right join  result ON result.member_Id = book_Return.member_id AND result.Accession_No = book_return.accession_No;
SELECT que9.issue_Date, que9.accession_No,que9.member_Id,que9.return_Date, Member_Name from que9, members WHERE que9.member_Id = members.member_Id ORDER BY que9.issue_Date ,members.Member_Name;




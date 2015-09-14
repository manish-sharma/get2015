
/*1. create view and display view in which details of all issue books*/

CREATE OR REPLACE VIEW BooksIssue AS 

    SELECT member_name AS "Member Name", DATE(issue_date) AS "Issue Date" ,accession_no AS "Accession No",due_date AS "Due Date"
    
    FROM members , book_issue WHERE members.member_id = book_issue.member_id;


/*Display View*/
SELECT * FROM BooksIssue;


/*2. Create Description view in category description */
CREATE VIEW Description AS
    SELECT member_id AS "Member ID " ,member_name AS "Member Name",CASE category
        WHEN 'F' THEN "FACULTY" 
        WHEN 'S' THEN "STUDENT"
        ELSE "OTHERS"
        END   AS "Category"from members;


/*Display view */
SELECT * FROM BooksIssue ;

/*3. Display issue details if books is not return null is display*/


CREATE  OR REPLACE VIEW BooksIssue AS 

SELECT s.subject_name AS "Subject Name", t.title_name "Title Name", m.member_name AS "Member Name" ,

bi.issue_date AS "Issue Date" , bi.accession_no AS "Accession No", bi.member_id AS "Member Id", bi.due_date AS "Due Date" , 

IF( ( SELECT br.return_date FROM book_return br WHERE bi.accession_no= br.accession_no AND bi.member_id = br.member_id ),

( SELECT br.return_date FROM book_return br WHERE bi.accession_no= br.accession_no AND bi.member_id = br.member_id ),"NULL") AS "Return Date" 

FROM  book_issue bi ,members m ,titles t ,subjects s,books b WHERE bi.accession_no=b.accession_no AND b.title_id =t.title_id AND bi.member_id = m.member_id AND t.subject_id =s.subject_id;


















    
    
    
    
    



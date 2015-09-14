
/* 1. Show members which has same category has Dheeraj using Sub Query*/
SELECT * FROM members WHERE category = ( SELECT category FROM members WHERE member_name = "Dheeraj" )  AND member_name NOT IN( "Dheeraj" );




DELETE FROM book_return WHERE member_id=1;
DELETE FROM book_issue WHERE member_id=4 AND due_date='2015-11-30';
DELETE FROM book_issue WHERE member_id=5 AND issue_date='2015-09-24';
UPDATE  book_issue SET issue_date="2015-09-24" WHERE member_id=5 AND accession_no=6;


/*2. Show issue date, title, member name and due date who are not return books till .*/

SELECT bi.member_id ,m.member_name ,t.title_name ,b.title_id,bi.issue_date,bi.due_date 
    FROM  book_issue bi , members m ,books b ,titles t 
        WHERE NOT EXISTS ( SELECT  bi.accession_no FROM  book_return br WHERE br.accession_no = bi.accession_no) 
    AND bi.member_id=m.member_id AND bi.accession_no= b.accession_no AND b.title_id= t.title_id;
    



/*3.Corelated query list of all member who are return books after due date*/

SELECT bi.member_id ,m.member_name ,t.title_name ,b.title_id,bi.issue_date,bi.due_date 
    FROM  book_issue bi , members m ,books b ,titles t 
        WHERE EXISTS ( SELECT  bi.accession_no FROM  book_return br WHERE br.accession_no = bi.accession_no AND DATEDIFF(br.return_date, bi.due_date) > 0)
    AND bi.member_id=m.member_id AND bi.accession_no= b.accession_no AND b.title_id= t.title_id;
    

/*4.list of all  equal most expensive books */
SELECT * FROM books WHERE price = ( SELECT MAX( price ) FROM  books ) ;

/*5. Display Second maximum price */
SELECT IFNULL( MAX(price),"NOT EXIST") AS "Second Maximum Price" FROM books WHERE price NOT IN( SELECT MAX(price) FROM books);

/*Assignment 3.3.1 Display count of categories in single row*/
SELECT COUNT( IF ( category="F" ,member_name,NULL)) as  "No of faculty" ,COUNT( IF ( category="S" ,member_name,NULL)) as "No of student" 
,COUNT( IF ( category="O" ,member_name,NULL)) as "Others" from  members;


/*Assignment 3.3.2 no of title issued more than 2 times*/
SELECT title_id ,count(title_id)   as "No of title issued" from  book_issue ,books 
where book_issue.accession_no = books.accession_no
group by title_id  having count(title_id) > 2 ;

/*Assignment 3.3.3 no of book issued other than F(Faculty) */
SELECT distinct member_name FROM  book_issue, members where  book_issue.member_id = members.member_id and category
not in( "F");


/*Assignment 3.4 author which has altleast one book has been purchased*/
SELECT distinct author_name from books , authors , title_author
where books.title_id= title_author.title_id and authors.author_id=title_author.author_id;




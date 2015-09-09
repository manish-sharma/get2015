/*
 * Change value of addressLine2 column of Members table with “Jaipur”.
 */
SET SQL_SAFE_UPDATES=0;

UPDATE members 
SET addresssline2="JAIPUR";

SELECT * FROM members;


/*
 * Change value of addressLine1 column of Members table 
 * with value “EPIP, Sitapura” for the members belonging to category “F”.
 */

UPDATE members 
SET addressline1="EPIP,Sitapura"
WHERE category = "F";

SELECT * FROM members;
  
/*
 * Delete all the rows from Publishers table.
 */

TRUNCATE TABLE publishers;



/*
 * Inserting the sample data back in Publishers 
 * table using substitution variables.
 */


SET @pub_id_inp1=30001, @pub_nm_inp1='ABC Journals',
@pub_id_inp2=30105, @pub_nm_inp2='Academe Research Journals',
@pub_id_inp3=30115, @pub_nm_inp3='Academia Publishing',
@pub_id_inp4=30005, @pub_nm_inp4='Academia Scholarly Journals (ASJ)',
@pub_id_inp5=30018, @pub_nm_inp5='British Journal';
INSERT INTO publishers VALUES(@pub_id_inp1,@pub_nm_inp1);
INSERT INTO publishers VALUES(@pub_id_inp2,@pub_nm_inp2);
INSERT INTO publishers VALUES(@pub_id_inp3,@pub_nm_inp3);
INSERT INTO publishers VALUES(@pub_id_inp4,@pub_nm_inp4);
INSERT INTO publishers VALUES(@pub_id_inp5,@pub_nm_inp5);


/*
 * Delete those rows of Titles table belonging 
 * to Publisher with publisher_id = 1
 */
DELETE FROM titles
using titles,publishers
where titles.publisher_id= publishers.publisher_id
and publishers.publisher_id=1;
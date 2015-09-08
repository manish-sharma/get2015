use LIS;
SET FOREIGN_KEY_CHECKS=0;
delete from publisher;
SET FOREIGN_KEY_CHECKS=1;
SET @pub_id =1;
SET @pub_name = 'kiran';
SET @city ='jaipur';

INSERT INTO PUBLISHER(pub_id,pub_name,city) VALUES(@pub_id,@pub_name,@city);

DELETE  FROM TITLE WHERE pub_id =1;

update member set address_line2 ='jaipur';
update member set address_line1 ='EPIP ,Sitapura';
select * from publisher;

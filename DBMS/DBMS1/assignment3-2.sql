-- to update address by JAIPUR for addressline2 column in members table
UPDATE members SET addressline2="JAIPUR";


-- to show members table
SELECT * FROM members;


-- to update addressline1 by EPIP Sitapura where category column in members have F
UPDATE members SET addressline1="EPIP Sitapura" where category='F';


-- to show members table
SELECT * FROM members;


-- to delete all the rows from publisher table
DELETE FROM publisher;

SELECT * FROM publisher;


-- set subtitution variable
SET @publication1:='SHARMA';
SET @publication2:='JAIN';
SET @publication3:='MITTAL';
SET @publication4:='PANDIT'; 

SET @pblisherID1:=1001;
SET @pblisherID2:=1002;
SET @pblisherID3:=1003;
SET @pblisherID4:=1004;


-- again insert values in publishers by substitution variable
INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID1,@pblisherID1);
INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID2,@pblisherID2);
INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID3,@pblisherID3);
INSERT INTO publisher(publisher_id,publisher_name)VALUES(@pblisherID4,@pblisherID4);

SELECT * FROM publisher;
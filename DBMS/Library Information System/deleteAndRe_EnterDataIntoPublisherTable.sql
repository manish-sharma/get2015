Use Library;
DELETE FROM Publishers;
SET @name = 'Shyam Books';
SET @Id = 502;
INSERT INTO Publishers(publisherId, publisherName) VALUES(@Id, @name);

SET @name = ' Cbc House';
SET @Id = 501;
INSERT INTO Publishers(publisherId,publisherName) VALUES(@Id,@name);

SET @name = 'A M Publishers';
SET @Id = 503;
INSERT INTO Publishers(publisherId,publisherName) VALUES(@Id,@name);

SELECT * FROM Publishers;

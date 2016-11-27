CREATE TEMPORARY TABLE publisher(SELECT * FROM publishers);

CREATE TEMPORARY TABLE title(SELECT * from titles);

DELETE FROM publishers;

INSERT INTO publishers (SELECT * FROM publisher);

INSERT INTO titles (SELECT * from title);

SELECT * FROM publishers;
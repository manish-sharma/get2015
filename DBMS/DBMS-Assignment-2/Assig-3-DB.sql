CREATE DATABASE eCommerceApplication;

USE eCommerceApplication;


CREATE TABLE Category(
  Category_id VARCHAR(100),
  Category_name VARCHAR(100),
  Parent_category VARCHAR(100),
  PRIMARY KEY(Category_id)
);

CREATE TABLE Products(
  Product_id VARCHAR(100),
  Product_name VARCHAR(100),
  Category_id VARCHAR(100),
  PRIMARY KEY(Product_id),
  FOREIGN KEY(Category_id) REFERENCES Category(Category_id) ON DELETE CASCADE ON UPDATE CASCADE
);


INSERT INTO Category (Category_id,Category_name) VALUES('101','MOBILE & TABLETS');
INSERT INTO Category (Category_id,Category_name) VALUES('102','COMPUTERS');
INSERT INTO Category (Category_id,Category_name) VALUES('103','HOME APPLIANCES');

INSERT INTO Category VALUES('104','MOBILE','101');
INSERT INTO Category VALUES('105','TABLETS','101');
INSERT INTO Category VALUES('106','ACCESSORIES','101');
INSERT INTO Category VALUES('107','CASES & COVERS','101');

INSERT INTO Category VALUES('108','DESKTOP','102');
INSERT INTO Category VALUES('109','LAPTOP','102');
INSERT INTO Category VALUES('110','LAPTOP ACCESSORIES','102');
INSERT INTO Category VALUES('111','PRINTERS','102');


INSERT INTO Category VALUES('112','TVs','103');
INSERT INTO Category VALUES('113','AIR CONDITIONERS','103');
INSERT INTO Category VALUES('114','WASHING MACHINES','103');


INSERT INTO Products VALUES('201','SMART PHONE', '104');
INSERT INTO Products VALUES('202','FEATURED PHONE', '104');

INSERT INTO Products VALUES('203','2G', '105');
INSERT INTO Products VALUES('204','3G', '105');

INSERT INTO Products VALUES('205','KEYBOARD', '110');
INSERT INTO Products VALUES('206','MOUSE', '110');
INSERT INTO Products VALUES('207','HEADPHONES', '110');

INSERT INTO Products VALUES('208','INKJET', '111');
INSERT INTO Products VALUES('209','LASER', '111');

INSERT INTO Products VALUES('210','LED', '112');
INSERT INTO Products VALUES('211','LCD', '112');
INSERT INTO Products VALUES('212','PLASMA', '112');

INSERT INTO Products VALUES('213','FULL AUTOMATIC TOP LOAD', '114');
INSERT INTO Products VALUES('214','FULL AUTOMATIC FRONT LOAD', '114');
INSERT INTO Products VALUES('215','SEMI AUTOMATIC', '114');

SELECT c1.Category_id,c1.Category_name,
IFNULL(c2.Category_name,NULL)
FROM Category c1
LEFT JOIN Category c2
ON c1.Parent_category = c2.Category_id;


SELECT c1.Category_id,c1.Category_name,
IFNULL(c2.Category_name,NULL)
FROM Category c1
LEFT JOIN Category c2
ON c1.Parent_category = c2.Category_id ORDER BY c2.Category_name ASC;

SELECT c1.Category_id,c1.Category_name,
IFNULL(c2.Category_name,'TOP CATEGORY')
FROM Category c1
LEFT JOIN Category c2
ON c1.Parent_category = c2.Category_id;

SELECT Category_id,Category_name
FROM Category 
WHERE Parent_category IS NULL;






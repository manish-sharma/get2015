-- creating database Electroniclist

CREATE  DATABASE ElectronicList;
USE ElectronicList;

-- Creating table Categories 
CREATE TABLE Categories
(
    -- To store id , name, parent id
    id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    name VARCHAR(30) NOT NULL,
    parentId INTEGER NULL,
    FOREIGN KEY (parentid)  REFERENCES Categories (id)
);

-- Inserting the Top category
INSERT INTO Categories(id,name) VALUES (1,'Mobiles & Tablets');
INSERT INTO Categories(name) VALUES ('Computers');
INSERT INTO Categories(name) VALUES ('Home Appliances');

-- Inserting the sub category
INSERT INTO Categories(name,parentId) VALUES('MOBILES',1);
INSERT INTO Categories(name,parentId) VALUES('TABLETS',1);
INSERT INTO Categories(name,parentId) VALUES('Smart Phones',4);
INSERT INTO Categories(name,parentId) VALUES('Featured Phones',4);

-- Inserting the last Category
INSERT INTO Categories(name,parentId) VALUES('2G',5);
INSERT INTO Categories(name,parentId) VALUES('3G',5);
INSERT INTO Categories(name,parentId) VALUES('ACCESSORIES',1);
INSERT INTO Categories(name,parentId) VALUES('CASE & COVERS',1);

-- Inserting the sub category
INSERT INTO Categories(name,parentId) VALUES('DESKTOP',2);
INSERT INTO Categories(name,parentId) VALUES('LAPTOP',2);
INSERT INTO Categories(name,parentId) VALUES('LAPTOP ACCESSORIES',2);
INSERT INTO Categories(name,parentId) VALUES('PRINTERS',2);

-- Inserting the last Category
INSERT INTO Categories(name,parentId) VALUES('Keyboard',14);
INSERT INTO Categories(name,parentId) VALUES('Mouse',14);
INSERT INTO Categories(name,parentId) VALUES('Headphones',14);
INSERT INTO Categories(name,parentId) VALUES('Inkjet',15);
INSERT INTO Categories(name,parentId) VALUES('Laser',15);
INSERT INTO Categories(name,parentId) VALUES('TVs',3);
INSERT INTO Categories(name,parentId) VALUES('Air Conditioners',3);
INSERT INTO Categories(name,parentId) VALUES('Washing Machines',3);

-- Inserting the last Category
INSERT INTO Categories(name,parentId) VALUES('LED',21);
INSERT INTO Categories(name,parentId) VALUES('LCD',21);
INSERT INTO Categories(name,parentId) VALUES('PLASMA',21);

-- Inserting the last Category
INSERT INTO Categories(name,parentId) VALUES('Full Automatic',23);
INSERT INTO Categories(name,parentId) VALUES('Semi Automatic',23);
INSERT INTO Categories(name,parentId) VALUES('Top Load',27);
INSERT INTO Categories(name,parentId) VALUES('Front Load',27);
CREATE DATABASE eCommerce;

USE eCommerce;

 
CREATE TABLE categories
(
    
    id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    name VARCHAR(30) NOT NULL,
    parentId INTEGER NULL,
    FOREIGN KEY (parentid)  REFERENCES categories (id)
);


INSERT INTO categories(id,name) VALUES (1,'Mobiles & Tablets');
INSERT INTO categories(name) VALUES ('Computers');
INSERT INTO categories(name) VALUES ('Home Appliances');

INSERT INTO categories(name,parentId) VALUES('MOBILES',1);
INSERT INTO categories(name,parentId) VALUES('TABLETS',1);
INSERT INTO categories(name,parentId) VALUES('Smart Phones',4);
INSERT INTO categories(name,parentId) VALUES('Featured Phones',4);

INSERT INTO categories(name,parentId) VALUES('2G',5);
INSERT INTO categories(name,parentId) VALUES('3G',5);
INSERT INTO categories(name,parentId) VALUES('ACCESSORIES',1);
INSERT INTO categories(name,parentId) VALUES('CASE & COVERS',1);

INSERT INTO categories(name,parentId) VALUES('DESKTOP',2);
INSERT INTO categories(name,parentId) VALUES('LAPTOP',2);
INSERT INTO categories(name,parentId) VALUES('LAPTOP ACCESSORIES',2);
INSERT INTO categories(name,parentId) VALUES('PRINTERS',2);

INSERT INTO categories(name,parentId) VALUES('Keyboard',14);
INSERT INTO categories(name,parentId) VALUES('Mouse',14);
INSERT INTO categories(name,parentId) VALUES('Headphones',14);
INSERT INTO categories(name,parentId) VALUES('Inkjet',15);
INSERT INTO categories(name,parentId) VALUES('Laser',15);
INSERT INTO categories(name,parentId) VALUES('TVs',3);
INSERT INTO categories(name,parentId) VALUES('Air Conditioners',3);
INSERT INTO categories(name,parentId) VALUES('Washing Machines',3);

INSERT INTO categories(name,parentId) VALUES('LED',21);
INSERT INTO categories(name,parentId) VALUES('LCD',21);
INSERT INTO categories(name,parentId) VALUES('PLASMA',21);

INSERT INTO categories(name,parentId) VALUES('Full Automatic',23);
INSERT INTO categories(name,parentId) VALUES('Semi Automatic',23);
INSERT INTO categories(name,parentId) VALUES('Top Load',27);
INSERT INTO categories(name,parentId) VALUES('Front Load',27);



CREATE DATABASE electronics;

USE electronics;

CREATE TABLE products(
    item_id INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
    item_name VARCHAR(30) NOT NULL,
    parent_Id INTEGER NULL,
    FOREIGN KEY (parent_id)
        REFERENCES products (item_id)
);

INSERT INTO products(item_id, item_name) VALUES (1, 'Mobiles & Tablets');
INSERT INTO products(item_name) VALUES ('Computers');
INSERT INTO products(item_name) VALUES ('Home Appliances');

INSERT INTO products(item_name, parent_Id) VALUES('MOBILES', 1);
INSERT INTO products(item_name, parent_Id) VALUES('TABLETS', 1);
INSERT INTO products(item_name, parent_Id) VALUES('Smart Phones', 4);
INSERT INTO products(item_name, parent_Id) VALUES('Featured Phones', 4);

INSERT INTO products(item_name, parent_Id) VALUES('2G', 5);
INSERT INTO products(item_name, parent_Id) VALUES('3G', 5);
INSERT INTO products(item_name, parent_Id) VALUES('ACCESSORIES', 1);
INSERT INTO products(item_name, parent_Id) VALUES('CASES & COVERS', 1);

INSERT INTO products(item_name, parent_Id) VALUES('DESKTOP', 2);
INSERT INTO products(item_name, parent_Id) VALUES('LAPTOP', 2);
INSERT INTO products(item_name, parent_Id) VALUES('LAPTOP ACCESSORIES', 2);
INSERT INTO products(item_name, parent_Id) VALUES('PRINTERS', 2);

INSERT INTO products(item_name, parent_Id) VALUES('Keyboard', 14);
INSERT INTO products(item_name, parent_Id) VALUES('Mouse', 14);
INSERT INTO products(item_name, parent_Id) VALUES('Headphones', 14);
INSERT INTO products(item_name, parent_Id) VALUES('Inkjet Printer', 15);
INSERT INTO products(item_name, parent_Id) VALUES('Laser Printer', 15);
INSERT INTO products(item_name, parent_Id) VALUES('TVs', 3);
INSERT INTO products(item_name, parent_Id) VALUES('Air Conditioners', 3);
INSERT INTO products(item_name, parent_Id) VALUES('Washing Machines', 3);

INSERT INTO products(item_name, parent_Id) VALUES('LED TV', 21);
INSERT INTO products(item_name, parent_Id) VALUES('LCD TV', 21);
INSERT INTO products(item_name, parent_Id) VALUES('Plasma TV', 21);

INSERT INTO products(item_name, parent_Id) VALUES('Full Automatic', 23);
INSERT INTO products(item_name, parent_Id) VALUES('Semi Automatic', 23);
INSERT INTO products(item_name, parent_Id) VALUES('Top Load', 27);
INSERT INTO products(item_name, parent_Id) VALUES('Front Load', 27);

SELECT * FROM products;

SELECT 
    P.item_name AS node_name,
    IFNULL(parent1.item_name, 'Top Category') AS parent_name,
    parent2.item_name AS parent2_name,
    parent3.item_name AS parent3_name
FROM
    products P
        LEFT OUTER JOIN
    products AS parent1 ON parent1.item_id = P.parent_id
        LEFT OUTER JOIN
    products AS parent2 ON parent2.item_id = parent1.parent_id
        LEFT OUTER JOIN
    products AS parent3 ON parent3.item_id = parent2.parent_id;


SELECT 
    item_name
FROM
    products
WHERE
    parent_Id IS NULL;
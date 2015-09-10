/*
 * Defining Table Structure for ECommerce Application
 */
CREATE DATABASE eCommerce;


USE eCommerce;


/*
 * Creating Table category
 */
CREATE TABLE category(
   category_id INT PRIMARY KEY AUTO_INCREMENT,
   category_nm VARCHAR(30),
   parent_id INT
);

DESCRIBE category;

/*
 * Creating Table product
 */
CREATE TABLE product(
   product_id INT PRIMARY KEY AUTO_INCREMENT,
   product_nm VARCHAR(30),
   parent_id INT
   
);

ALTER TABLE product AUTO_INCREMENT=100;

DESCRIBE product;


 /*
  * Inserting data in category
  */
INSERT INTO category(category_nm) 
VALUES
('Mobiles & Tablets'),
('Computers'),
('Home Appliances');



INSERT INTO category(parent_id,category_nm) 
VALUES
(1,'Mobliles'),
(1,'Tablets'),
(1,'Accessories'),
(1,'Cases & Covers'),
(2,'Desktop'),
(2,'Laptop'),
(2,'Laptop Accessories'),
(2,'Printers'),
(3,'TVs'),
(3,'Air Conditioners'),
(3,'Washing Machines');

select * from category;



 /*
  * Inserting data in product
  */
INSERT INTO product(parent_id,product_nm) 
VALUES
(4,'Smart Phones'),
(4,'Featured Phones'),
(5,'2G'),
(5,'3G'),
(10,'Keyboard'),
(10,'Mouse'),
(10,'Headphones'),
(11,'Inkjet'),
(11,'Laser'),
(12,'LED'),
(12,'LCD'),
(12,'Plasma'),
(14,'Full Automatic'),
(14,'Semi Automatic'),
(114,'Front Load'),
(114,'Top Load');

/*
 * Displaying all the categories along with its Parent category.
 * Result is sorted on Parent Category.
 * If category is top category then displaying 
 * “Top Category” in Parent category. 
 */

SELECT c1.category_nm,
IFNULL(c2.category_nm,"Top Category") as ParentCategory
FROM category c1
LEFT JOIN category c2
ON c1.parent_id=c2.category_id
ORDER BY ParentCategory;

/*
 * Displaying only Top Categories.
 */
SELECT category_nm
FROM category
WHERE parent_id is NULL;




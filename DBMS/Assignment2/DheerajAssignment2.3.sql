/*create ecommerce database*/
CREATE  DATABASE ecommerce;
USE ecommerce;

/*create table product*/
CREATE TABLE `product`( 
	`id` INT AUTO_INCREMENT NOT NULL PRIMARY KEY , 
	`name`	VARCHAR(30) NOT NULL,
	parentId INT   NULL,
	FOREIGN KEY (parentid)  REFERENCES product (id)
);


INSERT INTO product(id,name) VALUES (1,'Mobiles & Tablets');
INSERT INTO product(name) VALUES ('Computers');
INSERT INTO product(name) VALUES ('Home Appliances');
INSERT INTO product(name, parentId) VALUES('MOBILES',1);
INSERT INTO product(name, parentId) VALUES('TABLETS',1);
INSERT INTO product(name, parentId) VALUES('Smart Phones',4);
INSERT INTO product(name, parentId) VALUES('Featured Phones',4);
INSERT INTO product(name, parentId) VALUES('2G',5);
INSERT INTO product(name, parentId) VALUES('3G',5);
INSERT INTO product(name, parentId) VALUES('ACCESSORIES',1);
INSERT INTO product(name, parentId) VALUES('CASE & COVERS',1);
INSERT INTO product(name, parentId) VALUES('DESKTOP',2);
INSERT INTO product(name, parentId) VALUES('LAPTOP',2);
INSERT INTO product(name, parentId) VALUES('LAPTOP ACCESSORIES',2);
INSERT INTO product(name, parentId) VALUES('PRINTERS',2);
INSERT INTO product(name, parentId) VALUES('Keyboard',14);
INSERT INTO product(name, parentId) VALUES('Mouse',14);
INSERT INTO product(name, parentId) VALUES('Headphones',14);
INSERT INTO product(name, parentId) VALUES('Inkjet',15);
INSERT INTO product(name, parentId) VALUES('Laser',15);
INSERT INTO product(name, parentId) VALUES('TVs',3);-- 21
INSERT INTO product(name, parentId) VALUES('Air Conditioners',3);
INSERT INTO product(name, parentId) VALUES('Washing Machines',3);
INSERT INTO product(name, parentId) VALUES('LED',21);
INSERT INTO product(name, parentId) VALUES('LCD',21);
INSERT INTO product(name, parentId) VALUES('PLASMA',21);
INSERT INTO product(name, parentId) VALUES('Full Automatic',23);
INSERT INTO product(name, parentId) VALUES('Semi Automatic',23);
INSERT INTO product(name, parentId) VALUES('Top Load',27);
INSERT INTO product(name, parentId) VALUES('Front Load',27);


/*Find list of all product by its id and parent id */
select node.name as node_name , IFNULL(parent1.name,"Top Category") as parent_name ,  IFNULL(parent2.name,"")  as parent2_name , IFNULL(parent3.name,"")   as parent3_name 
from product as node left outer join product as parent1 on parent1.id = node.parentid 
left outer join product as parent2 on parent2.id = parent1.parentid  
left outer join product as parent3 on parent3.id = parent2.parentid;

/*display top categories of product*/
SELECT name as "Top Categories" FROM product  where parentId is null ;









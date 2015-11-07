INSERT INTO topcategory
(topcategory_id,TopCategoryName) 
VALUES (1,'Mobiles & Tablets');

INSERT INTO topcategory
(TopCategoryName) VALUES 
('Computers');

INSERT INTO topcategory
(TopCategoryName) VALUES 
('Home Appliances');

-- Inserting the sub category
INSERT INTO supercategory
(supercategory_id,superCategoryName,topcategory_id) 
VALUES(1,'MOBILES',1);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('TABLETS',1);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('ACCESSORIES',1);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('CASES AND COVERS',1);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('DESKTOP',2);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('LAPTOP',2);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('LAPTOP ACCESSORIES',2);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('PRINTER',2);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('TVs',3);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('Air Conditioners',3);

INSERT INTO supercategory
(superCategoryName,topcategory_id) 
VALUES('Washing Machines',3);


-- INSERTING CATEGORY

INSERT INTO category
(category_ID,CategoryName,supercategory_id) 
VALUES(1,'Smart Phones',1);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('Featured Phones',1);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('2G',2);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('3G',2);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('KEYBOARD',7);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('MOUSE',7);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('HEADPHONE',7);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('INKJET',8);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('LASER',8);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('LED',9);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('LCD',9);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('PLASMA',9);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('FULLY AUTOMATIC',11);

INSERT INTO category
(CategoryName,supercategory_id) 
VALUES('SEMI AUTOMATIC',11);

-- INSERTING SUBCATEGORY
  

INSERT INTO subcategory
(subcategory_ID,subCategoryName,category_id) 
VALUES(1,'TOP LOAD',13);

INSERT INTO subcategory
(subcategory_ID,subCategoryName,category_id) 
VALUES(2,'FRONT LOAD',13);



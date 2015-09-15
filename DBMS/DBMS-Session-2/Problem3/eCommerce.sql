-- creating database
CREATE  DATABASE eCommerce;
USE eCommerce;

-- Creating table 
CREATE TABLE categories
(
    -- To store id , name, parent id
    id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    name VARCHAR(30) NOT NULL,
    parentId INTEGER NULL,
    FOREIGN KEY (parentid)  REFERENCES categories (id)
);

-- Inserting into the Top categories
INSERT INTO categories(id,name) VALUES 
(1,'Mobiles & Tablets');

INSERT INTO categories(name) VALUES 
('Computers'),('Home Appliances');


-- Inserting into sub category Mobiles & Tablets
    INSERT INTO categories(name,parentId) 
	VALUES('MOBILES',1),('TABLETS',1),('ACCESSORIES',1),('CASE & COVERS',1);
        
		-- Inserting into sub category Mobiles 
        INSERT INTO categories(name,parentId) VALUES
		('Smart Phones',4),('Featured Phones',4);
        
		-- Inserting in sub category Tablets
        INSERT INTO categories(name,parentId) VALUES
		('2G',5),('3G',5);

-- Inserting into sub category Computers
    INSERT INTO categories(name,parentId) VALUES
	('Desktop',2),('Laptop',2),('Laptop Accessories',2),('Printers',2);
        
		-- Inserting the sub Category Laptop Accessories
        INSERT INTO categories(name,parentId) VALUES
		('Keyboard',14),('Mouse',14),('Headphones',14);
        
		-- Inserting the sub Category Printers
        INSERT INTO categories(name,parentId) VALUES
		('Inkjet',15),('Laser',15);

-- Inserting into sub Category "Home Appliances"
    INSERT INTO categories(name,parentId) VALUES
	('TVs',3),('Air Conditioners',3),('Washing Machines',3);
    
	-- Inserting into sub Category "TVs"
    INSERT INTO categories(name,parentId) VALUES
	('LED',21),('LCD',21),('PLASMA',21);
	
    -- Inserting into sub Category "Washing Machines"
    INSERT INTO categories(name,parentId) VALUES
	('Full Automatic',23),('Semi Automatic',23);
        
		-- Inserting into sub Category "Full Automatic"
        INSERT INTO categories(name,parentId) VALUES
		('Top Load',27),('Front Load',27);
		
		
		


-- Query for to display all the categories along with its Parent category.
-- Result is sorted on Parent Category.

select node.name as node_name , IFNULL(parent1.name,'Top Category') as parent_name , parent2.name as parent2_name , parent3.name as parent3_name 
from categories as node 
left outer join categories as parent1 on parent1.id = node.parentid  
left outer join categories as parent2 on parent2.id = parent1.parentid  
left outer join categories as parent3 on parent3.id = parent2.parentid;
    
-- Display top categories
SELECT name FROM categories where parentId is null ;		

-- Query for to display all the categories along with its Parent category.

-- Result is  sorted on Parent Category.

-- Implementing self join and left outer join

SELECT node.name AS node_name , 
IFNULL(parent1.name,'Top Category') AS parent_name, 
parent2.name AS parent2_name , parent3.name AS parent3_name 
FROM Categories AS node 
LEFT OUTER JOIN Categories AS parent1 ON parent1.id = node.parentid  
LEFT OUTER JOIN Categories AS parent2 ON parent2.id = parent1.parentid  
LEFT OUTER JOIN Categories AS parent3 ON parent3.id = parent2.parentid;
    
-- To select categories if it is top category
SELECT name FROM Categories WHERE parentId is null ;
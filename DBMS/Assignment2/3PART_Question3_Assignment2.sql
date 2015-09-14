SELECT t.topcategoryname,s.supercategoryname,ifNull(c.categoryname,'-') as categoryname ,
ifNull(sc.subcategoryname,'-') as subcategoryname
FROM topcategory T Left outer join supercategory s on t.topcategory_ID=s.topcategory_ID 
Left outer join category c on s.supercategory_ID=c.supercategory_ID 
Left outer join subcategory sc on c.category_ID=sc.category_ID
ORDER by topcategoryname;


SELECT * FROM topcategory;
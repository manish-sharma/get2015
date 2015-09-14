
CREATE DATABASE eCommerce2;
USE eCommerce2;

CREATE TABLE topcategory
(
    -- To sid , name, parent id
    topcategory_id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    TopCategoryName VARCHAR(30) NOT NULL
);

CREATE TABLE supercategory(
    supercategory_id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    superCategoryName VARCHAR(30) NOT NULL,
    topcategory_id INTEGER,
    FOREIGN KEY(topcategory_ID) REFERENCES topcategory(topcategory_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE category
(
    -- To sid , name, parent id
    category_id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    CategoryName VARCHAR(30) NOT NULL,
    supercategory_id INTEGER,
    FOREIGN KEY(supercategory_ID) REFERENCES supercategory(supercategory_ID) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE subcategory
(
    -- To sid , name, parent id
    subcategory_id INTEGER AUTO_INCREMENT  NOT NULL  PRIMARY KEY , 
    subCategoryName VARCHAR(30) NOT NULL,
    category_id INTEGER,
    FOREIGN KEY(category_ID) REFERENCES category(category_ID) ON DELETE CASCADE ON UPDATE CASCADE
);
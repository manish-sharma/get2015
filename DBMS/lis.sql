CREATE TABLE AUTHOR(
au_id INT NOT NULL,
au_lname VARCHAR(50),
au_fname VARCHAR(50),
address VARCHAR(50),
city VARCHAR(30),
PRIMARY KEY(au_id));

CREATE TABLE PUBLISHER(
pub_id INT NOT NULL,
pub_name VARCHAR(50),
city VARCHAR(30),
PRIMARY KEY(pub_id));

CREATE TABLE MEMBER(
member_id INT NOT NULL,
member_name VARCHAR(50),
address_line1 VARCHAR(50),
address_line2 VARCHAR(50),
category VARCHAR(50),
PRIMARY KEY(member_id));

CREATE TABLE SUBJECTS(
sub_id INT NOT NULL,
 sub_name VARCHAR(10),
 PRIMARY KEY(sub_id));

CREATE TABLE TITLE(
title_id INT NOT NULL,
title VARCHAR(50),
title_type VARCHAR(50),
price INT ,
pub_id INT NOT NULL,
FOREIGN KEY(pub_id) REFERENCES PUBLISHER(pub_id),
PRIMARY KEY(title_id)
);


CREATE TABLE AUTHOR_TITLE(
title_id INT NOT NULL,
au_id INT NOT NULL ,
FOREIGN KEY (title_id) REFERENCES TITLE(title_id),
FOREIGN KEY(au_id) REFERENCES AUTHOR(au_id),
PRIMARY KEY(title_id,au_id));


 
CREATE TABLE BOOKS(
accession_no INT NOT NULL,
title_Id INT NOT NULL ,
purchase_id INT ,
price INT ,
status VARCHAR(50) ,
FOREIGN KEY (title_id) REFERENCES TITLE(title_id),
PRIMARY KEY (accession_no));


CREATE TABLE BOOK_ISSUE(
accession_no INT NOT NULL,
member_Id INT NOT NULL , 
issue_date DATE NOT NULL,
due_date DATE NOT NULL,
FOREIGN KEY (member_Id) REFERENCES MEMBER(member_Id),
FOREIGN KEY (accession_no) REFERENCES BOOKS(accession_no),
PRIMARY KEY (accession_no,issue_date,member_Id));



CREATE TABLE BOOK_RETURN(
accession_no INT NOT NULL,
member_Id INT NOT NULL , 
issue_date DATE NOT NULL,
due_date DATE NOT NULL,
FOREIGN KEY (member_Id) REFERENCES MEMBER(member_Id),
FOREIGN KEY (accession_no) REFERENCES BOOKS(accession_no),
PRIMARY KEY (accession_no,due_date,member_Id));



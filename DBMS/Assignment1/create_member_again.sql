CREATE TABLE members (member_id INTEGER PRIMARY KEY,
member_name VARCHAR(30),
address_line1 VARCHAR(50),
address_line2 VARCHAR(50),
category VARCHAR(30));

ALTER TABLE book_issue
ADD constraint book_issue_2 FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE book_return
ADD constraint book_return_2 FOREIGN KEY (member_id) REFERENCES members(member_id) ON DELETE CASCADE ON UPDATE CASCADE;

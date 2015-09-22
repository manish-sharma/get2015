CREATE TABLE members (member_id INTEGER PRIMARY KEY,
member_name VARCHAR(30),
address_line1 VARCHAR(50),
address_line2 VARCHAR(50),
category VARCHAR(30));
ALTER TABLE book_issue
ADD FOREIGN KEY (member_id)
REFERENCES members(member_id)ON DELETE CASCADE  ON UPDATE CASCADE;
ALTER TABLE book_return
ADD FOREIGN KEY (member_id)
REFERENCES members(member_id) ON DELETE CASCADE  ON UPDATE CASCADE;
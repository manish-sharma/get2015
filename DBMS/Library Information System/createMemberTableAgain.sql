USE Library;
CREATE TABLE Users(
userId INT not NULL,
userName VARCHAR(100),
addressLine1 VARCHAR(100),
addressLine2 VARCHAR(100),
gender char(1),
PRIMARY KEY(userId)
);

INSERT INTO Users VALUES ( 1001, 'raju','sector-8','sector-10','m'),
                        ( 1002, 'rani','malviyanager','sitapura','f'),
                       ( 1003, 'ram','jagatpura','mansroavar','m'),
                        ( 1004, 'rajshree','india gate','goner','f');
USE eCommerce;

create table category (
category_id int not null primary key,
category_name varchar(50)
);
create table mobile_tablets(
m_id int not null primary key,
m_name varchar(50) ,
category_id int not null,
foreign key (category_id) references category(category_id)
);
create table computers(
c_id int not null primary key,
c_name varchar(50) ,
category_id int not null,
foreign key (category_id) references category (category_id)

);
create table Home_Appliances(
h_id int not null primary key,
h_name varchar(50) ,
category_id int not null,
foreign key (category_id) references category (category_id)

);
create table mobiles(
mobile_id int not null primary key,
mobile_type varchar(50),
m_id int not null,
foreign key (m_id) references mobile_tablets(m_id)

);
create table Tablets(
Tablet_id int not null primary key,
Tablet_type varchar(50) ,
m_id int not null,
foreign key (m_id) references mobile_tablets(m_id)

);
create table mobile_products(
mobile_product_id int not null primary key,
mobile_product_name varchar(50) ,
mobile_product_type varchar(50),
mobile_id int not null,
foreign key (mobile_id) references mobiles (mobile_id)

);
create table Smart_phones(
s_phone_id int not null primary key,
s_phone_name varchar(50) ,
s_phone_colour varchar(50) ,
mobile_product_id int not null,
foreign key (mobile_product_id) references mobile_products(mobile_product_id)

);
create table Featured_phones(
f_phone_id int not null primary key,
f_phone_name varchar(50) ,
f_phone_colour varchar(50) ,
mobile_product_id int not null,
foreign key (mobile_product_id) references mobile_products(mobile_product_id)

);

create table Tablets_products(
Tablet_product_id int not null primary key,
Tablet_product_name varchar(50) ,
Tablet_product_colour varchar(50) ,
Tablet_id int not null,
foreign key (Tablet_id) references Tablets (Tablet_id)

);
create table 2G(
2G_id int not null primary key,
2G_name varchar(50) ,
2G_speed varchar(50) ,
Tablet_product_id  int not null,
foreign key (Tablet_product_id ) references Tablets_products(Tablet_product_id )

);
create table 3G(
3G_id int not null primary key,
3G_name varchar(50),
3G_speed varchar(50),
Tablet_product_id  int not null,
foreign key (Tablet_product_id ) references Tablets_products(Tablet_product_id )

);
create table Accessories(
Accessories_id int not null primary key,
Accessories_name varchar(50),
Accessories_type varchar(50),
m_id int not null,
foreign key (m_id) references mobile_tablets(m_id)

);
create table Cases_Covers(
cc_id int not null primary key,
cc_name varchar(50),
cc_type varchar(50),
m_id int not null,
foreign key (m_id) references mobile_tablets(m_id)

);
create table Desktop(
desktop_id int not null primary key,
desktop_name varchar(50),
desktop_type varchar(50),
c_id int not null,
foreign key (c_id) references computers(c_id)

);
create table Laptop(
Laptop_id int not null primary key,
Laptop_name varchar(50),
Laptop_type varchar(50),
c_id int not null,
foreign key (c_id) references computers(c_id)

);
create table Laptop_Accessories(
Laptop_Accessories_id int not null primary key,
Laptop_Accessories_name varchar(50),
Laptop_Accessories_type varchar(50),
c_id int not null,
foreign key (c_id) references computers(c_id)

);
create table Keyboards(
Keyboard_id int not null primary key,
Keyboard_name varchar(50),
Keyboard_type varchar(50),
Laptop_Accessories_id int not null,
foreign key (Laptop_Accessories_id) references Laptop_Accessories(Laptop_Accessories_id)

);
create table Mouse(
Mouse_id int not null primary key,
Mouse_name varchar(50),
Mouse_type varchar(50),
Laptop_Accessories_id int not null,
foreign key (Laptop_Accessories_id) references Laptop_Accessories(Laptop_Accessories_id)
);
create table HeadPhones(
Headphone_id int not null primary key,
HeadPhone_name varchar(50),
HeadPhone_type varchar(50),
Laptop_Accessories_id int not null,
foreign key (Laptop_Accessories_id) references Laptop_Accessories(Laptop_Accessories_id)

);

create table Printers(
Printers_id int not null primary key,
Printers_name varchar(50),
Printers_type varchar(50),
c_id int not null,
foreign key (c_id) references computers(c_id)

);
create table InkJet(
Ij_id int not null primary key,
Ij_name varchar(50),
Ij_type varchar(50),
Printers_id int not null,
foreign key (Printers_id) references Printers(Printers_id)

);
create table Laser(
L_id int not null primary key,
L_name varchar(50),
L_type varchar(50),
L_price int,
Printers_id int not null,
foreign key (Printers_id) references Printers(Printers_id)

);
create table TVs(
TVs_id int not null primary key,
TVs_name varchar(50),
TVs_type varchar(50),
h_id int not null,
foreign key (h_id) references Home_Appliances(h_id)

);
create table LED(
LED_id int not null primary key,
LED_name varchar(50),
LED_type varchar(50),
LED_price int,
TVs_id int not null,
foreign key (TVs_id) references TVs(TVs_id)

);
create table LCD(
LCD_id int not null primary key,
LCD_name varchar(50),
LCD_type varchar(50),
LCD_price int,
TVs_id int not null,
foreign key (TVs_id) references TVs(TVs_id)

);
create table Plasma(
P_id int not null primary key,
p_name varchar(50),
p_type varchar(50),
p_price int,
TVs_id int not null,
foreign key (TVs_id) references TVs(TVs_id)

);

create table Air_Conditioners(
AC_id int not null primary key,
AC_name varchar(50),
AC_type varchar(50),
h_id int not null,
foreign key (h_id) references Home_Appliances(h_id)

);
create table Washing_Machines(
WM_id int not null primary key,
WM_name varchar(50),
WM_type varchar(50),
h_id int not null,
foreign key (h_id) references Home_Appliances(h_id)

);
create table Full_Automatic(
F_id int not null primary key,
F_name varchar(50),
F_type varchar(50),
WM_id int not null,
foreign key (WM_id) references Washing_Machines(WM_id)

);
create table Top_Load(
T_id int not null primary key,
T_name varchar(50),
T_type varchar(50),
T_price int,
F_id int not null,
foreign key (F_id) references Full_Automatic(F_id)

);
create table Front_Load(
FL_id int not null primary key,
FL_name varchar(50),
FL_type varchar(50),
FL_price int,
F_id int not null,
foreign key (F_id) references Full_Automatic(F_id)

);
create table Semi_Automatic(
semi_id int not null primary key,
semi_name varchar(50),
semi_type varchar(50),
semi_price int,
WM_id int not null,
foreign key (WM_id) references Washing_Machines(WM_id)

);


Show tables;

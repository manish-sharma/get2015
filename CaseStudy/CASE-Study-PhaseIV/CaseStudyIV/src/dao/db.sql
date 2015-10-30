
use vehicle_management;

CREATE TABLE mycar (
created_by VARCHAR(30) NOT NULL,
created_time  VARCHAR(50) NOT NULL,
make VARCHAR(30) NOT NULL,
model VARCHAR(30) NOT NULL,
engine_cc varchar(30)  NOT NULL,
fuel_capacity varchar(30) NOT NULL,
milage varchar(30) NOT NULL,
price varchar(15) NOT NULL,
road_tax varchar(30) NOT NULL,
ac VARCHAR(10) NOT NULL,
power_steering VARCHAR(10) NOT NULL,
accessory_kit VARCHAR(10) NOT NULL,
PRIMARY KEY (model)
);


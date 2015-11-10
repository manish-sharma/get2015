Drop database vehicle;
CREATE DATABASE vehicle;
USE vehicle;
CREATE TABLE login(
username varchar(30) PRIMARY KEY,
password varchar(30),
name varchar(30),
email varchar(100) UNIQUE KEY
);

SELECT * FROM login;

INSERT INTO login VALUES("admin","admin","Gaurav Saini", "gaurav.saini@metacube.com");

CREATE TABLE Vehicle (
    id INTEGER UNSIGNED NOT NULL auto_increment PRIMARY KEY,
    make VARCHAR(30) NOT NULL,
    model VARCHAR(30) NOT NULL,
    engine_cc VARCHAR(30) NOT NULL,
    fuel_capacity VARCHAR(30) NOT NULL,
    mileage VARCHAR(30) NOT NULL,
    price INT UNSIGNED NOT NULL,
    road_tax INT UNSIGNED NOT NULL,
    created_by VARCHAR(50) NOT NULL,
    last_modified_time TIMESTAMP NOT NULL,
    created_time TIMESTAMP NOT NULL,
    image_path varchar(200) NOT NULL
);

SELECT * FROM vehicle;

CREATE TABLE Car(
    id INTEGER UNSIGNED NOT NULL auto_increment PRIMARY KEY,
    vehicle_id INTEGER UNSIGNED NOT NULL,
    ac VARCHAR(30) NOT NULL,
    power_steering VARCHAR(30) NOT NULL,
    accessory_kit VARCHAR(30) NOT NULL,
    created_by VARCHAR(50) NOT NULL,
    last_modified_time TIMESTAMP NOT NULL,
    created_time TIMESTAMP NOT NULL,
    CONSTRAINT `car_vehicle_id`
    FOREIGN KEY(vehicle_id)
    REFERENCES Vehicle(id)
);

SELECT * FROM car;

SELECT model, image_path FROM Vehicle LIMIT 1;

SELECT * FROM Vehicle WHERE price BETWEEN 250000 AND 500000;
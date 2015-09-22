
CREATE DATABASE IF NOT EXISTS vehicle_management;

USE vehicle_management;

CREATE TABLE IF NOT EXISTS vehicle (
    vehicle_id INT AUTO_INCREMENT,
    make VARCHAR(20) NOT NULL,
    created_by VARCHAR(30) NOT NULL,
    created_time DATE NOT NULL,
    model VARCHAR(20) NOT NULL,
    engine_cc VARCHAR(10) NOT NULL,
    fuel_capacity varchar(15) NOT NULL,
    mileage VARCHAR(20) NOT NULL,
    price INT NOT NULL,
    road_tax INT NOT NULL,
    PRIMARY KEY(vehicle_id),
    UNIQUE KEY(make, model, engine_cc)
);

CREATE TABLE IF NOT EXISTS Car (
    car_id INT AUTO_INCREMENT,
    ac VARCHAR(10) NOT NULL,
    power_steering VARCHAR(10) NOT NULL,
    accessory_kit VARCHAR(10) NOT NULL,
    vehicle_id INT NOT NULL,
    PRIMARY KEY(car_id),
    FOREIGN KEY(vehicle_id) REFERENCES vehicle(vehicle_id) ON DELETE CASCADE ON UPDATE CASCADE
);
    

CREATE TABLE IF NOT EXISTS Bike (
    bike_id INT AUTO_INCREMENT,
    self_start VARCHAR(10) NOT NULL,
    helmet_price INT NOT NULL,
    vehicle_id INT NOT NULL,
    PRIMARY KEY(bike_id),
    FOREIGN KEY(vehicle_id) REFERENCES vehicle(vehicle_id) ON DELETE CASCADE ON UPDATE CASCADE
);

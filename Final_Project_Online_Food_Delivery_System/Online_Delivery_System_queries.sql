-- Create Database query --
CREATE DATABASE Online_Delivery_system;

-- Drop Database query --
DROP DATABASE Online_Delivery_system;

-- Use Database --
USE Online_Delivery_system;

-- Create Table SQL Commands--  
CREATE TABLE User_Account_Directory
(user_id INT NOT NULL AUTO_INCREMENT,
user_name VARCHAR(100) NOT NULL,
user_password VARCHAR(300) NOT NULL,
user_role VARCHAR(100) NOT NULL,
PRIMARY KEY(user_id),
UNIQUE KEY `User_id` (user_id),
UNIQUE KEY `User_name`(user_name));

CREATE TABLE Customer_Directory
(
customer_id INT(10) NOT NULL AUTO_INCREMENT,
customer_name VARCHAR(250),
customer_emailid VARCHAR(250),
customer_phoneNum INT(10) NOT NULL,
customer_street_address VARCHAR(350),
customer_city VARCHAR(350),
customer_pincode INT(5),
user_id INT NOT NULL,
user_name VARCHAR(300) NOT NULL,
PRIMARY KEY(customer_id),
CONSTRAINT cus_dir_idx1 FOREIGN KEY (user_id) REFERENCES User_Account_Directory(user_id),
CONSTRAINT cus_dir_idx2 FOREIGN KEY (user_name) REFERENCES User_Account_Directory(user_name) );

CREATE TABLE Restaurant_Admin_Directory (
res_admin_id INT(10) NOT NULL AUTO_INCREMENT,
res_admin_name VARCHAR(250) NOT NULL,
user_id INT NOT NULL,
user_name VARCHAR(300) NOT NULL,
PRIMARY KEY(res_admin_id),
UNIQUE KEY `Res_Admin_id` (res_admin_id),
UNIQUE KEY `Res_Admin_name` (res_admin_name),
CONSTRAINT res_admin_idx1 FOREIGN KEY (user_id) REFERENCES User_Account_Directory(user_id),
CONSTRAINT res_admin_idx2 FOREIGN KEY (user_name) REFERENCES User_Account_Directory(user_name) );

CREATE TABLE Restaurant_Directory (
restaurant_id INT(10) NOT NULL AUTO_INCREMENT,
restaurant_name VARCHAR(250) NOT NULL,
restaurant_type VARCHAR(250) NOT NULL,
restaurant_phoneNum INT(10) NOT NULL,
restaurant_street_address VARCHAR(350) NOT NULL,
restaurant_city VARCHAR(350) NOT NULL,
restaurant_pincode INT(5) NOT NULL,
res_admin_id INT(10) NOT NULL,
res_admin_name VARCHAR(250) NOT NULL,
PRIMARY KEY(restaurant_id),
CONSTRAINT res_idx1 FOREIGN KEY (res_admin_id) REFERENCES Restaurant_Admin_Directory(res_admin_id),
CONSTRAINT res_idx2 FOREIGN KEY (res_admin_name) REFERENCES Restaurant_Admin_Directory(res_admin_name)
);

CREATE TABLE Menu_Directory (
restaurant_id INT NOT NULL,
food_id INT NOT NULL AUTO_INCREMENT,
food_cateogory VARCHAR(250) NOT NULL,
food_name VARCHAR(250) NOT NULL,
food_price INT NOT NULL DEFAULT 0,
food_preference VARCHAR(250) DEFAULT 'VEG',
PRIMARY KEY(food_id),
UNIQUE KEY `Food_id` (food_id),
CONSTRAINT food_idx FOREIGN KEY (restaurant_id) REFERENCES Restaurant_Directory(restaurant_id)
);

CREATE TABLE Order_Directory (
order_id BIGINT NOT NULL AUTO_INCREMENT,
datePlaced VARCHAR(100) NOT NULL,
orderCratedAt VARCHAR(100) NOT NULL,
customer_id INT NOT NULL,
restaurant_id INT NOT NULL,
order_id_generated BIGINT NOT NULL,
PRIMARY KEY(order_id),
UNIQUE KEY `oder_id` (order_id),
UNIQUE KEY `order_id_generated` (order_id_generated),
CONSTRAINT order_fk1 FOREIGN KEY (customer_id) REFERENCES Customer_Directory(customer_id),
CONSTRAINT order_fk2 FOREIGN KEY (restaurant_id) REFERENCES Restaurant_Directory(restaurant_id)
);

CREATE TABLE Menu_Order_Relation (
food_id INT NOT NULL,
order_id_generated BIGINT NOT NULL,
CONSTRAINT menu_order_fk1 FOREIGN KEY (order_id_generated) REFERENCES Order_Directory(order_id_generated),
CONSTRAINT menu_order_fk2 FOREIGN KEY (food_id) REFERENCES Menu_Directory(food_id)
);

CREATE TABLE DeliveryMan_Directory (
deliveryman_id BIGINT NOT NULL AUTO_INCREMENT,
deliveryman_name VARCHAR(250) NOT NULL,
deliveryman_phoneNumber BIGINT NOT NULL,
user_id INT NOT NULL,
user_name VARCHAR(300) NOT NULL,
area_covered VARCHAR(300),
zipcode_covered VARCHAR(300),
PRIMARY KEY(deliveryman_id),
UNIQUE KEY `deliveryman_id` (deliveryman_id),
CONSTRAINT del_dir_idx1 FOREIGN KEY (user_id) REFERENCES User_Account_Directory(user_id),
CONSTRAINT del_dir_idx2 FOREIGN KEY (user_name) REFERENCES User_Account_Directory(user_name)
);


-- Adding Constraints to tables --   
ALTER TABLE User_Account_Directory
ADD CONSTRAINT `User_name` UNIQUE (user_name);

ALTER TABLE User_Account_Directory
ADD CONSTRAINT `User_role` UNIQUE (user_role);

ALTER TABLE Restaurant_Admin_Directory
ADD CONSTRAINT `Res_Admin_name` UNIQUE (res_admin_name);

ALTER TABLE Restaurant_Directory 
ADD restaurant_type VARCHAR(250);

ALTER TABLE Menu_Directory
ADD food_size VARCHAR(100);

ALTER TABLE Menu_Directory
MODIFY COLUMN food_price FLOAT;

-- SELECT SQL Queries--  
SELECT * FROM User_Account_Directory;

SELECT user_name, user_password, user_role
FROM User_Account_Directory
WHERE user_name = 'customer' AND user_password = 'customer123' AND user_role = 'Customer';

SELECT * FROM User_Account_Directory u, Customer_Directory c WHERE u.user_id = c.user_id;

SELECT * FROM Restaurant_Directory r, Menu_Directory m WHERE m.restaurant_id = r.restaurant_id;

SELECT * FROM Customer_Directory;

SELECT * FROM Restaurant_Admin_Directory;

SELECT * FROM Restaurant_Directory;

SELECT * FROM User_Account_Directory u, Restaurant_Admin_Directory r WHERE u.user_id = r.user_id;

SELECT * FROM Menu_Directory;

SELECT * FROM Menu_Directory WHERE restaurant_id = 1;

SELECT * FROM Order_Directory;

SELECT * FROM Menu_Order_Relation;

SELECT user_name, user_password 
FROM User_Account_Directory
WHERE user_name = 'customer';

SELECT customer_id 
FROM Customer_Directory
WHERE user_name = 'customer';

SELECT * FROM Deliveryman_Directory;

SELECT * FROM User_Account_Directory u, DeliveryMan_Directory c WHERE u.user_id = c.user_id;

-- Inserting values into Customer_Directory--  
INSERT INTO Customer_Directory (customer_name, customer_emailid, customer_phoneNum, customer_street_address, customer_city, customer_pincode, user_id, user_name)
VALUES ('customer', 'customer@gmail.com', '1234567891', '352 Riverway', 'Boston', '02115', '1', 'customer');


-- Inserting values into User_Account_Directory--  
INSERT INTO User_Account_Directory (user_name, user_password, user_role)
VALUES ('customer', 'customer123', 'Customer');

INSERT INTO User_Account_Directory (user_name, user_password, user_role)
VALUES ('wokNtalk', 'wokntalk123', 'Restaurant Admin');

INSERT INTO User_Account_Directory (user_name, user_password, user_role)
VALUES ('deliveryman', 'deliveryman123', 'Delivery Man');

-- Inserting values into Restaurant_Admin_Directory-- 
INSERT INTO Restaurant_Admin_Directory (res_admin_name, user_id, user_name )
VALUES ('admin', 2, 'wokNtalk');

-- Inserting values into Restaurant_Directory --
INSERT INTO Restaurant_Directory (restaurant_name, restaurant_phoneNum, restaurant_street_address, restaurant_city, restaurant_pincode, res_admin_id, res_admin_name)
VALUES ('Wok N Talk', '1865342673', '23 Huntington Ave', 'Boston', '02130', 1, 'admin');


-- Inserting values into Menu for restaurant_id: 1 --
INSERT INTO Menu_Directory (restaurant_id, food_cateogory, food_name, food_price, food_size ,food_preference )
VALUES (1, 'Appetizers', 'Chicken Gyoza', 6.95, '6 pc', 'NON VEG');

INSERT INTO Menu_Directory (restaurant_id, food_cateogory, food_name, food_price, food_size ,food_preference )
VALUES (1, 'Soups', 'Miso Soup', 2.25, '1 bowl', 'VEG');

INSERT INTO Menu_Directory (restaurant_id, food_cateogory, food_name, food_price, food_size ,food_preference )
VALUES (1, 'Signature Dishes', 'Orange Chicken', 14.95, '28 oz', 'NON VEG');


-- Inserting into Delivery man --
INSERT INTO DeliveryMan_Directory (deliveryman_name, deliveryman_phoneNumber, user_id, user_name, area_covered, zipcode_covered)
VALUES ('Delivery Man', 2245679876, 3, 'deliveryman', 'Huntington', 02115);

-- Update Queries--
UPDATE Restaurant_Directory
SET restaurant_type = 'Chinese'
WHERE restaurant_id = 1;

UPDATE Menu_Directory
SET food_cateogory='Appetizers',
	food_name='Lemon Chicken',
    food_price=14.95,
    food_preference='NON VEG',
    food_size = '7pc'
WHERE restaurant_id = 1;

UPDATE Menu_Directory
SET food_cateogory='Appetizers',
	food_name='Chicken Gyoza',
    food_price=6.95,
    food_preference='NON VEG',
    food_size = '6pc'
WHERE food_id = 4;

UPDATE Menu_Directory
SET food_cateogory='Signature Dish',
	food_name='Orange Chicken',
    food_price=14.95,
    food_preference='NON VEG',
    food_size = '6 pc'
WHERE food_id= 6;

UPDATE Menu_Directory
SET food_cateogory='Soup',
	food_name='Miso Soup',
    food_price=2.95,
    food_preference='VEG',
    food_size = '1 Bowl'
WHERE food_id= 5;

UPDATE Customer_Directory
SET customer_emailid = 'amretasre6@gmail.com'
WHERE customer_id = 1;

-- Deleting records queries--  
DELETE  
FROM User_Account_Directory
WHERE user_name = 'customer';

DELETE  
FROM Menu_Directory
WHERE food_id = 8;

DELETE 
FROM Menu_Directory;

SET SQL_SAFE_UPDATES = 0;
SET SQL_SAFE_UPDATES = 1;

-- Displaying the columns in the tables created --  
SHOW FULL COLUMNS FROM User_Account_Directory;
SHOW FULL COLUMNS FROM Customer_Directory;

GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY "amre1999" WITH GRANT OPTION;





-- drop database student_manager;
create database student_manager;
use student_manager;

create table products (
product_id int primary key auto_increment not null unique,
`name` varchar(50),
price float,
description text(255),
image_url varchar(255)
);

create table shoppingcarts (
cart_id int primary key auto_increment not null unique,
product_id int,
quantity int,
foreign key (product_id) references products (product_id)
);

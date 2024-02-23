create database demo4;
use demo4;
create table users (
id int primary key auto_increment not null,
`name` varchar(45),
email varchar(45),
country varchar(45)
);

-- drop database winz_fast;
create database winz_fast;
use winz_fast;
create table if not exists models (
model_id bigint primary key auto_increment not null unique,
model_name varchar(20),
designs varchar(20),
color varchar(20),
is_delete bit default 0
);

create table if not exists brands (
brand_id bigint primary key auto_increment not null unique,
brand_name varchar(50),
is_delete bit default 0
);

create table if not exists vehicle_types (
type_id bigint primary key auto_increment not null unique,
type_name varchar(20),
is_delete bit default 0
);

create table if not exists fuels (
fuel_id bigint primary key auto_increment not null unique,
fuel_name varchar(10),
is_delete bit default 0
);

create table if not exists vehicles (
vehicle_id bigint primary key auto_increment not null unique,
vehicle_name varchar(50) not null,
type_id bigint not null,
brand_id bigint not null,
model_id bigint not null,
manufacture_year varchar(4),
fuel_id bigint,
number_of_kilometers varchar(10),
price double,
is_delete bit default 0,
foreign key (type_id) references vehicle_types (type_id),
foreign key (brand_id) references brands (brand_id),
foreign key (model_id) references models (model_id),
foreign key (fuel_id) references fuels (fuel_id)
);

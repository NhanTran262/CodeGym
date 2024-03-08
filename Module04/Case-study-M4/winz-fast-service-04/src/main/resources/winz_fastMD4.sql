drop database winz_fast;
create database winz_fast;
use winz_fast;

create table users
(
    id            bigint primary key auto_increment,
    date_of_birth varchar(20),
    email         varchar(100) not null unique,
    full_name     varchar(50),
    username      varchar(50),
    `password`    varchar(50),
    phone_number  varchar(15) unique,
    avatar        varchar(50),
         role_id int not null,
         constraint users_pk primary key (id),
     constraint users_roles_fk foreign key (role_id) references roles (id)

);

create table if not exists roles (
    id int not null auto_increment,
    name varchar(50) not null,
    description varchar(50) not null,
    constraint roles_pk primary key(id)
);

create table address
(
    id       bigint primary key auto_increment,
    street   varchar(50),
    district varchar(50),
    city     varchar(50),
    user_id  bigint,
    foreign key (user_id) references users (id)

);
create table if not exists users_roles (
    user_id int not null,
    role_id int not null,
    constraint users_roles_pk primary key (user_id, role_id),
    constraint users_roles_roles_fk foreign key (role_id) references roles (id),
    constraint users_roles_users_fk foreign key (user_id) references users (id)
);


create table category
(
    id   bigint primary key auto_increment,
    logo varchar(255),
    name varchar(50)
);

create table product
(
    id           bigint primary key auto_increment,
    brand        varchar(50),
    car_model    varchar(50),
    title        varchar(50),
    thumbnail    varchar(255),
    product_date varchar(50),
    price        varchar(255),
    view         int,
    user_id      bigint,
    category_id  bigint,
    foreign key (category_id) references category (id),
    foreign key (user_id) references users (id)
);

create table specifications
(
    id             bigint primary key auto_increment,
    engine         varchar(50),
    year           varchar(10),
    fuel           varchar(10),
    origin         varchar(50),
    gear           varchar(50),
    number_of_seat int,
    product_id     bigint,
    foreign key (product_id) references product (id)
);

create table booking
(
    id         bigint primary key auto_increment,
    user_id    bigint,
    view_date  varchar(50),
    comment    varchar(50),
    product_id bigint,
    foreign key (product_id) references product (id),
    foreign key (user_id) references users (id)
);

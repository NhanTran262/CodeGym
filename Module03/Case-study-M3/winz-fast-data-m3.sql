insert into users (user_name, `password`) values ('hoangnhan', 'codegym123');
insert into users (user_name, `password`) values ('minhthang', 'codegym123');
insert into users (user_name, `password`) values ('tuankiet', 'codegym123');
insert into users (user_name, `password`) values ('phucdu', 'codegym123');
insert into users (user_name, `password`) values ('datday', 'codegym123');

insert into roles (role_name) values ('Admin');
insert into roles (role_name) values ('User');

insert into user_roles (role_id, user_name) value (1,'hoangnhan');
insert into user_roles (role_id, user_name) value (2,'minhthang');


insert into levels (level_name) values ('Đại học');	
insert into levels (level_name) values ('Cao đẳng');	
insert into levels (level_name) values ('Trung cấp');	
insert into levels (level_name) values ('Phổ thông');

insert into positions (position_name) values ('Giám đốc');
insert into positions (position_name) values ('Phó giám đốc');
insert into positions (position_name) values ('Trưởng Phòng');
insert into positions (position_name) values ('Quản lý');
insert into positions (position_name) values ('Đội trưởng');
insert into positions (position_name) values ('Nhân viên');

insert into departments (department_name) values ('Điều hành');
insert into departments (department_name) values ('Hành chính');
insert into departments (department_name) values ('Sale-Marketing');
insert into departments (department_name) values ('Bảo trì');
insert into departments (department_name) values ('Bảo vệ');

insert  into customer_types (customer_type_name) values ('VIP');
insert  into customer_types (customer_type_name) values ('Thường');

insert into brands (brand_name) values ('TOYOTA');
insert into brands (brand_name) values ('HONDA');
insert into brands (brand_name) values ('MISTUBISHI');
insert into brands (brand_name) values ('FORD');

insert into variants (model, color) values ('Sendan', 'Đỏ');
insert into variants (model, color) values ('Sendan', 'Đen');
insert into variants (model, color) values ('Sendan', 'Trắng');
insert into variants (model, color) values ('SUV', 'Đỏ');
insert into variants (model, color) values ('SUV', 'Đen');
insert into variants (model, color) values ('SUV', 'Trắng');
insert into variants (model, color) values ('SPORT', 'Đỏ');
insert into variants (model, color) values ('SPORT', 'Đen');
insert into variants (model, color) values ('SPORT', 'Trắng');

insert into employees (user_name, employee_name, date_of_birth, id_card, salary, phone_number, email, address, level_id,position_id, department_id)
values ('minhthang', 'Minh Thắng', '2000-02-10','100011','500','0983111121','thang@gmail','Sài Gòn','1','6','3');

insert into vehicles (vehicle_name, brand_id, variant_id, price, `status`)
values ('Civic', '2', '7', '1000000', 'Liên hệ đặt xe');

insert into customers (customer_type_id, customer_name, date_of_birth, gender, id_card, phone_number, email, address)
values ('1', 'Phương Lê', '2007-04-11', 0 , '121333', '0984333331','phuongle@gmail.com','Sài Gòn'); 
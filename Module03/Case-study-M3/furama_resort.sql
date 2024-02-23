drop database furama_resort;
create database furama_resort;
use furama_resort;
create table positions (
position_id int primary key auto_increment not null unique,
position_name varchar(50)
);
-- set foreign_key_checks = 0;
-- truncate positions;
-- truncate departments;
-- truncate levels;
-- truncate customer_types;
-- truncate service_types;
-- truncate accompani_services;
-- truncate rent_types;
set foreign_key_checks = 1;

insert into positions (position_name) values ("Lễ tân");
insert into positions (position_name) values ("Phục vụ");
insert into positions (position_name) values ("Chuyên viên");
insert into positions (position_name) values ("Giám sát");
insert into positions (position_name) values ("Quản lý");
insert into positions (position_name) values ("Giám đốc");

create table departments (
department_id int primary key auto_increment not null unique,
department_name varchar(50)
);

insert into departments (department_name) values ("Sale – Marketing");
insert into departments (department_name) values ("Hành Chính");
insert into departments (department_name) values ("Phục vụ");
insert into departments (department_name) values ("Quản lý");

create table levels (
level_id int primary key auto_increment not null unique,
level_name varchar(50)
);

insert into levels (level_name) values ("Trung cấp");
insert into levels (level_name) values ("Cao đẳng");
insert into levels (level_name) values ("Đại học");
insert into levels (level_name) values ("Sau đại học");

create table employees (
employee_id int primary key auto_increment not null unique,
employee_name varchar(50),
day_of_birth date,
id_card varchar(50),
salary double,
phone_number varchar(50),
email varchar(50),
address varchar(50),
position_id int,
level_id int,
department_id int,
foreign key (position_id) references positions (position_id),
foreign key (department_id) references departments (department_id),
foreign key (level_id) references levels (level_id)
);

INSERT INTO employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id)
VALUES ('Hoàng', '1993-02-03', '100012', '800', '0987654321', 'hoang@gmail.com', 'Sài Gòn', '3', '1', '3');
INSERT INTO employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
VALUES ('Thịnh', '1999-04-09', '100234', '800', '0984567891', 'thinh@gmail.com', 'Quảng Nam', '3', '1', '3');
INSERT INTO employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
VALUES ('Khánh', '1995-09-12', '100987', '800', '0976512343', 'khanh@gmail.com', 'Quảng Nam', '3', '1', '3');
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id)
values("Danh","2004-11-27","2341","1400000","09847623","abcz@gmail.com","Sài Gòn",1,2,1);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Thịnh","1999-04-08","6969","1000000","903478534","abdc@gmail.com","Quảng Ngãi",2,1,1);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Đạt","1997-11-27","2772","2000000","0923763223","abc@gmail.com","Sài Gòn",1,2,1);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Kiệt","2004-01-31","1632","5000000","87435687","kaka@gmail.com","Phú Nhuận",1,1,1);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Đình","2002-01-31","1862","1000000","8237641","kakaahah@gmail.com","Quảng Nam",1,2,1);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Phái","2001-08-08","9873","7000000","93478534","abdcl@gmail.com","Sài Gòn",1,1,2);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Phúc","1995-02-02","1441","7000000","93478534","abdclk@gmail.com","Vinh",2,1,2);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Lượng","1998-02-23","8776","8000000","52367451","askladk@gmail.com","Ngệ An",2,1,2);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Phi","1992-02-23","8776","4500000","982367476","truongphi@gmail.com","Vinh",2,1,1);
insert into employees (employee_name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id) 
values("Vũ","1996-07-23","8776","5400000","687234","quanvu@gmail.com","Huế",2,2,1);
 
create table customer_types (
customer_type_id int primary key auto_increment not null unique,
customer_type_name varchar(50)
);

insert into customer_types (customer_type_name) values ("Diamond");
insert into customer_types (customer_type_name) values ("Platinium");
insert into customer_types (customer_type_name) values ("Gold");
insert into customer_types (customer_type_name) values ("Silver");
insert into customer_types (customer_type_name) values ("Member");

create table customers (
customer_id int primary key auto_increment not null unique,
customer_type_id int,
customer_name varchar(50),
day_of_birth date, 
age int, 
gender bit(1), 
id_card varchar(50), 
phone_number varchar(50), 
email varchar(50), 
address varchar(50),
foreign key (customer_type_id) references customer_types (customer_type_id)
);

insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address) 
values('1',"Phúc","1999-11-03",1,"1331","0238746","bac@gmail.com","Sài Gòn");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address) 
values('2',"Bố","2000-11-03",1,"8212","45614","lubo@gmail.com","Cà Mau");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values('4',"Phú","2011-11-03",0,"7171","73834","volamthienphu@gmail.com","Vinh");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values('1',"Tú","2001-12-04",1,"6712","08437","cbacba@gmail.com","Quảng Trị");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values("1","Nhân","2000-04-23",0,"7223","7651273","abc123@gmail.com","Huế");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values("3","Thượng","1994-04-14",1,"3741","727356","abc123acc@gmail.com","Hà Nội");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values("5","Tỷ","1989-05-13",1,"7365","2839645","lkhsdfiq@gmail.com","Bến Tre");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values("4","Hoa","1999-05-28",0,"1234","2133456","lkhsdfiq@gmail.com","Vinh");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values("3","Luân","1999-05-31",1,"1234","384t762","lkhsdfiq@gmail.com","Quảng Ngãi");
insert into customers (customer_type_id, customer_name, day_of_birth, gender, id_card, phone_number, email, address)  
values("2","Long","1988-12-31",1,"7345","125763","shjdgvvgq@gmail.com","Quảng Ngãi");

create table service_types (
service_type_id int primary key auto_increment not null unique,
service_type_name varchar(50)
);

insert into service_types (service_type_name) values("Extra VIP");
insert into service_types (service_type_name) values("VIP");

create table rent_types (
rent_type_id int primary key auto_increment not null unique,
rent_type_name varchar(50)
);

insert into rent_types (rent_type_name) values ("Thuê theo giờ");
insert into rent_types (rent_type_name) values ("Thuê theo ngày"); 
insert into rent_types (rent_type_name) values ("Thuê theo tháng"); 
insert into rent_types (rent_type_name) values ("Thuê theo năm");

create table services (
service_id int primary key auto_increment not null unique,
service_name varchar(50), 
area int,
rent double, 
max_tenant int, 
rent_type_id int, 
service_type_id int, 
room_standard varchar(50), 
other_amenities_description varchar(50), 
pool_area double, 
floor int, 
free_service_accompani text,
foreign key (rent_type_id) references rent_types (rent_type_id),
foreign key (service_type_id) references service_types (service_type_id)
);

insert into services (service_name, area, rent, max_tenant, rent_type_id, service_type_id, free_service_accompani ) 
values("Room","150","1500000","4",1,1,"Buffer sáng");
insert into services (service_name, area, rent, max_tenant, rent_type_id, service_type_id, room_standard, other_amenities_description, pool_area, `floor`, free_service_accompani) 
values("Villa","200","2500000","6",1,1,"Premium","View biển","100","1","buffer sáng và tối");
insert into services (service_name, area, rent, max_tenant, rent_type_id, service_type_id, free_service_accompani ) 
values("Room","150","5000000","4",2,4,"Buffer cả ngày");
insert into services (service_name, area, rent, max_tenant, rent_type_id, service_type_id, room_standard, other_amenities_description, pool_area, `floor`, free_service_accompani) 
values("Villa","250","5000000","10",2,3,"Premium","View biển","100","1","Buffer cả ngày");
insert into services (service_name, area, rent, max_tenant, rent_type_id, service_type_id, room_standard, other_amenities_description, pool_area, `floor`, free_service_accompani) 
values("Villa","250","5000000","10",1,2,"Premium","View biển","100","1","Buffer cả ngày");
insert into services (service_name, area, rent, max_tenant, rent_type_id, service_type_id, room_standard, other_amenities_description, pool_area, `floor`, free_service_accompani) 
values("Villa","250","5000000","10",2,2,"Premium","View biển","100","1","Buffer cả ngày");
insert into services (service_name, area, rent, max_tenant, rent_type_id, service_type_id, room_standard, other_amenities_description, pool_area, `floor`, free_service_accompani) 
values("Villa","250","5000000","10",1,4,"Premium","View biển","100","1","Buffer cả ngày");

create table accompani_services (
accompani_service_id int primary key auto_increment not null unique,
accompani_service_name varchar(50), 
price double,
unit varchar(10),
`status` varchar(50)
);
insert into accompani_services (accompani_service_name, price, unit, `status`) values ("Massage","100000","vnd","Ready");
insert into accompani_services (accompani_service_name, price, unit, `status`) values ("Karaoke","100000","vnd","Ready");
insert into accompani_services (accompani_service_name, price, unit, `status`) values ("Thức ăn","90000","vnd","Ready");
insert into accompani_services (accompani_service_name, price, unit, `status`) values ("Nước uống","50000","vnd","Ready");
insert into accompani_services (accompani_service_name, price, unit, `status`) values ("Thuê xe di chuyển tham quan resort","150000","vnd","Ready");

create table contracts (
contract_id int primary key auto_increment not null unique,
contract_date datetime, 
end_date datetime, 
deposits double, 
employee_id int, 
customer_id int, 
service_id int,
foreign key (employee_id) references employees (employee_id),
foreign key (customer_id) references customers (customer_id),
foreign key (service_id) references services (service_id)
);

insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id) 
values("2023-09-25","2023-09-27","3000000","1","2","1");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2023-09-20","2023-10-25","9000000","2","1","2");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2023-09-25","2023-10-30","4500000","1","2","2");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2023-09-20","2023-10-20","6400000","2","5","1");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2023-11-20","2023-11-25","2400000","2","2","3");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2023-11-05","2023-11-6","2500000","1","7","2");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2021-1-11","2023-10-11","1400000","1","4","2");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2022-12-20","2023-12-20","8700000","2","9","3");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2023-3-20","2023-10-4","5600000","2","8","2");
insert into contracts (contract_date, end_date, deposits, employee_id, customer_id, service_id)  
values("2023-09-14","2023-11-14","8200000","1","1","1");

create table detail_contracts (
detail_contract_id int primary key auto_increment not null unique,
contract_id int,
accompani_service_id int,
quantity int,
foreign key (contract_id) references contracts (contract_id),
foreign key (accompani_service_id) references  accompani_services (accompani_service_id)
);
 
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("1","2","1");
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("2","4","5");
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("3","5","4");
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("4","2","2");
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("5","3","3");
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("6","1","3");
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("7","1","4");
insert into detail_contracts (contract_id, accompani_service_id, quantity) values ("8","5","1");
 
-- Câu 2: Hiển thị thông tin của tất cả nhân viên 
-- có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select *
from employees
where
employee_name like 'H%'
or employee_name like 'T%'
or employee_name like 'K%'
and length(employee_name) <= 15;

-- Câu 3: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi 
-- và có địa chỉ ở “Sài Gòn” hoặc “Quảng Nam”
alter table customers add age int after day_of_birth;
set sql_safe_updates = 0;
update customers
set age = date_format(from_days(datediff(now(), day_of_birth)), '%Y') +0;
set sql_safe_updates = 1;
select *
from customers
where
age between 18 and 50
and (address like 'Sài gòn%' or address like 'Quảng Ngãi%');

-- Câu 4: Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select
ct.customer_name 'Tên KH',
count(ct.customer_id) 'Số lần đặt phòng'
from customers ct
join contracts ctr on ctr.customer_id = ct.customer_id
join customer_types ctt on ctt.customer_type_id = ct.customer_type_id
where
ctt.customer_type_name = 'Diamond'
group by ct.customer_id
order by count(ct.customer_id) asc;

-- Câu 5: Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và
--  Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select
ct.customer_id 'Mã KH',
ct.customer_name 'Tên KH',
ctt.customer_type_name 'Tên loại khách',
ctr.contract_id 'Mã HD',
sv.service_name 'Tên dịch vụ',
ctr.contract_date ' Ngày làm HD',
ctr.end_date 'Ngày kết thúc',
sum(sv.rent + dc.quantity * asv.price) 'Tổng tiền'
from customers ct
left join contracts ctr on ctr.customer_id = ct.customer_id
left join services sv on sv.service_id = ctr.service_id
left join detail_contracts dc on dc.contract_id = ctr.contract_id
left join accompani_services asv on asv.accompani_service_id = dc.accompani_service_id
left join customer_types ctt on ctt.customer_type_id = ct.customer_type_id
group by ct.customer_id,
ct.customer_name,
ctt.customer_type_name,
ctr.contract_id,
sv.service_name,
ctr.contract_date,
ctr.end_date ;

-- Câu 6: Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2023 (Quý 1 là tháng 1, 2, 3). 
select
sv.service_id 'Mã DV',
sv.service_name 'Tên DV',
sv.area 'Diện Tích',
sv.rent 'Chi Phí Thuê',
svt.service_type_name 'Tên loại DV'
from services sv
join service_types svt on svt.service_type_id = sv.service_type_id
where
sv.service_id not in(
select ctr.service_id
from contracts ctr
where month(ctr.contract_date) in (1,2,3) and year(ctr.contract_date) = 2023
);

-- Câu 7: Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2022
-- nhưng chưa từng được khách hàng đặt phòng trong năm 2023.
select
sv.service_id 'Mã DV',
sv.service_name 'Tên DV',
sv.area 'Diện tích',
sv.rent 'Chi phí thuê',
sv.max_tenant 'Số người tối đa',
svt.service_type_name 'Tên loại dịch vụ'
from services sv
join service_types svt on svt.service_type_id = sv.service_type_id
where 
sv.service_id in (
select ctr.service_id
from contracts ctr
where
year(ctr.contract_date) = 2022
and not year(ctr.contract_date) = 2023
);

-- Câu 8: Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- Cách 1:
select distinct customer_name 'Tên KH'
from customers;

-- Cách 2:
select customer_name 'Tên KH'
from customers
group by customer_name; 

-- Cách 3
select customer_name 'Tên KH'
from customers
union select customer_name
from customers;
 
-- Câu 9: Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2022 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select 
month(ctr.contract_date) 'Tháng',
count(ctr.customer_id) 'Số lượng khách đặt phòng'
from contracts ctr
where
year(ctr.contract_date) = 2022
group by ctr.contract_date;
 
-- Câu 10: Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,so_luong_dich_vu_di_kem 
--  (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select
ctr.contract_id 'Mã HD',
ctr.contract_date 'Ngày làm HD',
ctr.end_date 'Ngày kết thúc',
ctr.deposits 'Tiền cọc',
sum(dc.quantity) 'Số lượng dịch vụ đi kèm'
from contracts ctr
join detail_contracts dc on dc.contract_id = ctr.contract_id
group by ctr.contract_id;

-- Câu 11: Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có 
-- ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select 
asv.accompani_service_name 'Tên dịch vụ đi kèm',
ct.customer_name 'Tên KH',
ctt.customer_type_name 'Tên loại khách',
ct.address 'Địa chỉ'
from accompani_services asv
join detail_contracts dc on dc.accompani_service_id = asv.accompani_service_id
join contracts ctr on ctr.contract_id = dc.contract_id
join customers ct on ct.customer_id = ctr.customer_id
join customer_types ctt on ctt.customer_type_id = ct.customer_type_id
where
ctt.customer_type_name = 'Diamond'
and ( address like 'Vinh%' or address like 'Quảng Ngãi%');

-- Câu 12: Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), 
-- ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc 
-- của tất cả các dịch vụ đã từng được khách hàng đặt vào 
-- 3 tháng cuối năm 2022 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2023. 
select
ctr.contract_id 'Mã HD',
ep.employee_name 'Tên NV',
ct.customer_name 'Tên KH',
ct.phone_number 'SDT KH',
sv.service_name 'Tên DV',
sum(dc.quantity) 'Số lượng DV đi kèm',
ctr.deposits 'Tiền cọc'
from contracts ctr
join customers ct on ct.customer_id = ctr.customer_id
join employees ep on ep.employee_id = ctr.employee_id
join services sv on sv.service_id = ctr.service_id
join detail_contracts dc on dc.contract_id = ctr.contract_id
join accompani_services asv on asv.accompani_service_id = dc.accompani_service_id
where
month(ctr.contract_date) in (10,11,12) and year(ctr.contract_date) = 2022
and not
month(contract_date) between 1 and 6 and year(contract_date) = 2023
group by ctr.contract_id;

-- Câu 13: Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
--  (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
select 
asv.accompani_service_id 'Mã DV đi kèm',
asv.accompani_service_name 'Tên DV đi kèm',
count(dc.quantity) 'Số lần sử dụng DV đi kèm'
from accompani_services asv
join detail_contracts dc on dc.accompani_service_id = asv.accompani_service_id
group by asv.accompani_service_id
having count(dc.quantity) = (
select max(dc.quantity)
from accompani_services asv
join detail_contracts dc on dc.accompani_service_id = asv.accompani_service_id
group by asv.accompani_service_id
order by count(dc.quantity) desc
limit 1);

-- Câu 14: Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).
select
ctr.contract_id 'Mã HD',
svt.service_type_name 'Tên loại DV',
asv.accompani_service_name 'Tên DV đi kèm',
count(asv.accompani_service_id) 'Số lần sử dụng'
from accompani_services asv
join detail_contracts dc on dc.accompani_service_id = asv.accompani_service_id
join contracts ctr on ctr.contract_id = dc.contract_id
join services sv on sv.service_id = ctr.service_id
join service_types svt on svt.service_type_id = sv.service_type_id
group by 
dc.contract_id,
svt.service_type_name, 
asv.accompani_service_name
having count(asv.accompani_service_id) = 1;

-- Câu 15: Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2022 đến 2023. 
select
ep.employee_id 'Mã NV',
ep.employee_name 'Tên NV',
lv.level_name 'Tên trình độ',
dp.department_name 'Tên bộ phận',
ep.phone_number 'SDT NV',
ep.address 'Địa chỉ',
count(ctr.contract_id) 'Số lượng HD'
from employees ep
join levels lv on lv.level_id = ep.level_id
join departments dp on dp.department_id = ep.department_id
join contracts ctr on ctr.employee_id = ep.employee_id
where 
year(ctr.contract_date) between 2022 and 2023
group by ep.employee_id
having count(ctr.contract_id) <= 3;

-- Câu 16: Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2022 đến năm 2023.
set sql_safe_updates = 0;
delete from employees
where employee_id not in (
select employee_id
from contracts
where year(contract_date) between 2022 and 2023
);
set sql_safe_updates = 1;

-- Câu 17: Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2022 là lớn hơn 10.000.000 VNĐ. 
set sql_safe_updates = 0;
update customers
set customer_type_name = 1
where customer_id in (
select customer_id
from(
select ct.customer_id
from customers ct
left join contracts ctr on ctr.customer_id = ct.customer_id
left join detail_contracts dc on dc.contract_id = ctr.contract_id
left join accompani_services asv on asv.accompani_service_id = dc.accompani_service_id
left join services sv on sv.service_id = ctr.service_id
left join customer_types ctt on ctt.customer_type_id = ct.customer_type_id
where 
ctt.customer_type_name = 2
and year(ctr.contract_date) = 2023 
group by ct.customer_id
having sum(sv.rent + dc.quantity * asv.price) > 10000000
) as subquery);

set sql_safe_updates = 1; 

-- Câu 18: Xóa những khách hàng có hợp đồng trước năm 2022 (chú ý ràng buộc giữa các bảng). 
set sql_safe_updates = 0;
delete from customers
where customer_id not in(
select ct.customer_id
from customers ct
join contracts ctr on ctr.customer_id = ct.customer_id
where year(ctr.contract_date) < 2022
);
set sql_safe_updates = 1;

-- Câu 19: Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2022 lên gấp đôi.
set sql_safe_updates = 0;
update accompani_services
set price = price *2
where accompani_service_id in (
select n.accompani_service_id
from(
select asv.accompani_service_id
from accompani_services asv
join detail_contracts dc on dc.accompani_service_id = asv.accompani_service_id
join contracts ctr on ctr.contract_id = dc.contract_id
where year(ctr.contract_date) = 2022
group by asv.accompani_service_id
having count(dc.accompani_service_id) > 10
) as n);
set sql_safe_updates = 1;

-- Câu 20: Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
select 'Nhân viên' as Bảng,
employee_id 'ID',
employee_name 'Tên',
email 'Email',
phone_number 'SDT',
day_of_birth 'Ngày sinh',
address 'Địa chỉ'
from employees
union all 
select 'Khách hàng' as Bảng,
customer_id 'ID',
customer_name 'Tên',
email 'Email',
phone_number 'SDT',
day_of_birth 'Ngày sinh',
address 'Địa chỉ'
from customers;

-- Câu 21: Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” 
-- và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2022”. 
create view v_nhan_vien as 
select 
ep.employee_name 'Tên Nv',
ep.address 'Địa chỉ'
from employees ep
join contracts ctr on ep.employee_id = ctr.employee_id 
where ep.address = 'Hải Châu'
and date(ctr.contract_date) = '2022-12-12';

drop view v_nhan_vien;

-- Câu 22:  22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Phú Nhuận” 
-- đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.
set sql_safe_updates = 0;
update employees
set address = 'Phú Nhuận'
where address = 'Hải Châu';
set sql_safe_updates = 1;

-- Câu 23: Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với ma_khach_hang 
-- được truyền vào như là 1 tham số của sp_xoa_khach_hang. 
delimiter //
create procedure sp_xoa_khach_hang (in p_customer_id int)
begin
update customers set trang_thai = 0 where customer_id = p_customer_id;
end //
delimiter ;

-- Câu 24: 




 


 








 

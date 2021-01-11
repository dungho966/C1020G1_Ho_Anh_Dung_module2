create table offices (
	offices_id int primary key ,
    address varchar(50),
    phone_number int,
    country varchar(50)
);

create table employees(
	employee_id int primary key,
	employee_name varchar(50),
	email varchar(50),
    employee_work_for varchar(50),
	offices_id_offices int,
    foreign key (offices_id_offices) references offices(offices_id)
);

create table customers(
	customer_id int not null primary key  ,
    customer_name varchar(50),
    phone_number varchar(50) ,
    customer_address varchar(50),
    employee_id_employees int,
    foreign key (employee_id_employees) references employees(employee_id)
);

create table productsline  -- loai san pham 
 (
	productline_id int primary key,
	`description` varchar(50)
);

create table orders (
	order_id int primary key,
    date_buy date ,
    Request_date date, -- ngay yeu cau giao hang
	actual_date date ,  -- ngay giao hang thuc te
	number_order int ,
    price int ,
    customer_id_customers int,
    foreign key (customer_id_customers) references customers(customer_id)
);

create table products(
	product_id int primary key ,
    product_name varchar(50),
    production varchar(50),
    amount int,  -- so luong
    import_price double,
    export_price double
);



create table order_and_products(
	order_id int ,
    products_id int,
    primary key(order_id,products_id),
    foreign key (order_id) references orders(order_id),
    foreign key (products_id) references products(product_id)
);





create table payments (
	payment_id int ,
    payment_date date ,
    payment_price int,
    customer_id_customers int ,
	foreign key (customer_id_customers) references customers(customer_id)
);



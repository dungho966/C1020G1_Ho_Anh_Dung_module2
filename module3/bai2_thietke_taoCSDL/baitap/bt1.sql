create database bai2;
use bai2;


create table customers (
	customer_id  int primary key not null auto_increment unique,
    customer_name varchar(50) not null,
    email varchar(50),
    phone_number int
    
    
    

);


create table accounts(
	account_number int primary key not null ,
    account_type varchar(50),
    `date` date ,
    balance int,
	customer_id_customers int,
    
    foreign key (customer_id_customers) references customers(customer_id)
);

create table transactions (
	tran_number int primary key not null ,
    account_number int,
	`date` date,
    amount int,
    descriptions varchar(50),
    account_number_account int,
    
    foreign key (account_number_account) references  accounts(account_number)
    
);





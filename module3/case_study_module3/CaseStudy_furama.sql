create database case_study;

use case_study;

CREATE TABLE position_employee (
    position_id INT PRIMARY KEY,
    position_name INT
);

CREATE TABLE level_employee (
    level_id INT PRIMARY KEY,
    level_name VARCHAR(45)
);

CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(45)
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_fullname VARCHAR(45),
    position_id INT,
    level_id INT,
    department_id INT,
    date_of_birth DATE,
    identity_number VARCHAR(45),
    salary INT,
    phone VARCHAR(45),
    email VARCHAR(45),
    address VARCHAR(45),
    FOREIGN KEY (position_id)
        REFERENCES position_employee (position_id),
    FOREIGN KEY (level_id)
        REFERENCES level_employee (level_id),
    FOREIGN KEY (department_id)
        REFERENCES department (department_id)
);

CREATE TABLE service_included (
    service_included_id INT PRIMARY KEY,
    service_included_name VARCHAR(45),
    price INT,
    unit INT,
    available_status VARCHAR(45)
);

CREATE TABLE rent_type (
    rent_type_id INT PRIMARY KEY,
    rent_type_name VARCHAR(45),
    price INT
);

CREATE TABLE service_type (
    service_type_id INT PRIMARY KEY,
    service_type_name VARCHAR(45)
);

CREATE TABLE service (
    service_id INT PRIMARY KEY,
    service_name VARCHAR(45),
    area DOUBLE,
    num_of_floor INT,
    quantity_max INT,
    rent_cost INT,
    rent_type_id INT,
    service_type_id INT,
    service_status VARCHAR(45),
    FOREIGN KEY (service_type_id)
        REFERENCES service_type (service_type_id),
    FOREIGN KEY (rent_type_id)
        REFERENCES rent_type (rent_type_id)
);

CREATE TABLE customer_type (
    customer_type_id INT PRIMARY KEY,
    customer_type_name VARCHAR(45)
);

CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    customer_type_id INT,
    customer_fullname VARCHAR(45),
    date_of_birth DATE,
    identity_number VARCHAR(45),
    phone VARCHAR(45),
    email VARCHAR(45),
    address VARCHAR(45),
    FOREIGN KEY (customer_type_id)
        REFERENCES customer_type (customer_type_id)
);

CREATE TABLE contract (
    contract_id INT PRIMARY KEY,
    employee_id INT,
    customer_id INT,
    service_id INT,
    contract_start_date DATE,
    contract_end_date DATE,
    deposit_money INT,
    full_money INT,
    FOREIGN KEY (employee_id)
        REFERENCES employee (employee_id),
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id),
    FOREIGN KEY (service_id)
        REFERENCES service (service_id)
);

CREATE TABLE detail_contract (
    detail_contract_id INT PRIMARY KEY,
    contract_id INT,
    service_included_id INT,
    amount INT,
    FOREIGN KEY (service_included_id)
        REFERENCES service_included (service_included_id),
    FOREIGN KEY (contract_id)
        REFERENCES contract (contract_id)
);
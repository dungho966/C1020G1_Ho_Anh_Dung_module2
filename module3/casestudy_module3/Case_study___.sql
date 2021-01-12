use case_study;

insert into position_employee
value (1,'lễ tân'), (2,'phục vụ'), (3, 'chuyên viên'),(4, 'giám sát'),(5,'quản lý'), (6, 'giám đốc');

insert into level_employee
value (1,'trung cấp'), (2,'cao đẳng'),(3, 'đại học'),(4,'sau đại học');

insert into department
value (1, 'sale'),(2,'hành chính'),(3, 'phục vụ'),(4,'quản lý');

insert into employee
value 
(1, 'Ho Anh Dung', 1, 1, 1, '1993-09-12', 123456789, 1234567893, 123456789, 'abc@gmai.com', 'Quảng Trị'),
(2, 'Nguyen Van Tien', 2, 2, 1, '1990-09-11', 123666789, 123666789, 123666789, 'dasd@gmai.com', 'đà nẵng'),
(3, 'Dang Thi Hong Thanh', 1, 3, 1, '2000-12-01', 123555789, 123555789, 123555789, 'asd@gmai.com', 'Quảng Trị'),
(4, 'Bao Thinh', 2, 4, 1, '1998-09-12', 123444789, 123444789, 123444789, 'asd@abc.com', 'huế'),
(5, 'Ho Anh Dun', 3, 1, 1, '1999-12-12', 13000000, 13000000, 13000000, 'asd@abc.com', 'đà nẵng'),
(6, 'Nguyen Thanh Tung', 4, 2, 1, '1998-01-01', 242131, 242131, 242131, 'asd@abc.com', 'huế'),
(7, 'Le Quang Duong', 1, 3, 1, '1999-12-12', 23245, 4545, 345346, 'asd@abc.com', 'quảng nam'),
(8, 'Nguyen Long Phin', 2, 4, 1, '1999-12-15', 12245, 1235, 122346, 'asdas@abc.com', 'quảng nam');

insert into service_included 
 value
(1, 'massage', 100, 1, 'not ok'),
(2, 'karaoke', 100, 1, 'ok'),
(3, 'thức ăn', 50, 1, 'ok'),
(4, 'nước uống', 25, 1, 'ok'),
(5, 'xe tham quan resort', 300, 1, 'not ok');

insert into customer_type
value (1,'Diamond'),(2,'Platinum'),(3,'Gold'),(4,'Silver'),(5,'Member');

insert into customer 
 value
(1, 1, 'Tran Huu Kien', '1993-06-16', 1313213213, 1312312, 'nui@gmail.com', 'huế'),
(2, 1, 'Minh Tuan', '1995-10-10', 1313213213, 1312312, 'anh@gmail.com', 'nghệ an'),
(3, 2, 'Khanh Ha', '1999-12-12', 1313213213, 1312312, 'son@gmail.com', 'quảng trị'),
(4, 3, 'Thanh Van', '1997-12-12', 1313213213, 1312312, 'abc@anc.com', 'đà nẵng');

insert into service_type
value (1, 'villa'),(2,'house'),(3,'room');

insert into rent_type
value (1, 'giờ',500),(2, 'ngày',1000),(3,'tháng',2000 );

insert into service 
value
(1, 'villa', 123, 123, 13, 1231312, 1, 1, 'trống'),
(2, 'house', 123, 123, 13, 1231312, 1, 1, 'trống'),
(3, 'room', 123, 123, 13, 1231312, 1, 1, 'trống'),
(4, 'villa', 123, 123, 13, 1231312, 1, 1, 'hết');

insert into contract 
 value
(1, 2, 1, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(2, 2, 2, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(3, 2, 3, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(4, 2, 4, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(5, 2, 3, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(6, 2, 1, 2, '1999-12-12', '1999-12-12', 123123123, 123123123),
(7, 2, 2, 2, '1999-12-12', '1999-12-12', 123123123, 123123123);

insert into detail_contract 
 value
(1, 6, 5, 10), (2, 2, 2, 13), (3, 3, 3, 14), (4, 4, 4, 15), (5, 4, 4, 15), (6, 4, 4, 15), 
(7, 4, 4, 15), (8, 3, 3, 14), (9, 3, 3, 14), (10, 3, 3, 14);


-- task2-- 

SELECT 
    *
FROM
    employee
WHERE
    (SUBSTRING_INDEX(employee_fullname, ' ', - 1) LIKE 'H%'
        OR SUBSTRING_INDEX(employee_fullname, ' ', - 1) LIKE 'T%'
        OR SUBSTRING_INDEX(employee_fullname, ' ', - 1) LIKE 'K%')
        AND LENGTH(employee_fullname) <= 15;
        
      --   task3
      
SELECT 
    *
FROM
    customer
WHERE
    ((DATE_FORMAT(NOW(), '%Y') - DATE_FORMAT(date_of_birth, '%Y') - (DATE_FORMAT(NOW(), '00-%m-%d') < DATE_FORMAT(date_of_birth, '00-%m-%d'))) BETWEEN 18 AND 50)
        AND (address LIKE 'Quảng Trị'
        OR address LIKE 'Đà Nẵng');      
        
-- task4 
SELECT 
    customer.*,
    COUNT(contract.customer_id) AS so_lan_dat_phong
FROM
    customer
        JOIN
    contract ON customer.customer_id = contract.customer_id
        JOIN
    customer_type ON customer.customer_type_id = customer_type.customer_type_id
WHERE
    customer_type.customer_type_name LIKE 'Diamond'
GROUP BY customer.customer_id
ORDER BY so_lan_dat_phong;


-- task5

SELECT 
    customer.customer_id,
    customer.customer_fullname,
    customer_type.customer_type_name,
    contract.contract_id,
    service.service_name,
    contract.contract_start_date,
    contract.contract_end_date,
    (service.rent_cost + detail_contract.amount * service_included.price) AS tong_tien
FROM
    customer
        LEFT JOIN
    customer_type ON customer.customer_type_id = customer_type.customer_type_id
        LEFT JOIN
    contract ON customer.customer_id = contract.customer_id
        LEFT JOIN
    service ON contract.service_id = service.service_id
        LEFT JOIN
    detail_contract ON contract.contract_id = detail_contract.contract_id
        LEFT JOIN
    service_included ON detail_contract.service_included_id = service_included.service_included_id;
      --  task6
      
      SELECT 
    service.service_id,
    service.area,
    service.rent_cost,
    service_type.service_type_name
FROM
    service
        JOIN
    service_type ON service.service_type_id = service_type.service_type_id
WHERE
    NOT EXISTS( SELECT 
            contract.service_id
        FROM
            contract
        WHERE
            (contract.contract_start_date BETWEEN '2019-01-01' AND '2019-03-31')
                AND contract.service_id = service.service_id);
                
                
--  task7   
SELECT 
    service.service_id,
    service.service_name,
    service.area,
    service.rent_cost,
    service_type.service_type_name
FROM
    service
        JOIN
    service_type ON service.service_type_id = service_type.service_type_id
WHERE EXISTS( SELECT 
            contract.service_id
        FROM
            contract
        WHERE
            (contract.contract_start_date BETWEEN '2018-01-01' AND '2018-12-31')
                AND contract.service_id = service.service_id);   
                
                
   --  task8   
SELECT 
    *
FROM
    customer
GROUP BY customer.customer_fullname;

SELECT DISTINCT
    customer.customer_fullname
FROM
    customer;

SELECT 
    customer_fullname
FROM
    customer 
UNION SELECT 
    customer_fullname
FROM
    customer;
    
    
  --   task9
  
SELECT 
    MONTH(contract.contract_start_date) `month`,
    COUNT(MONTH(contract.contract_start_date)) AS so_nguoi_dat_phong
FROM
    contract
WHERE
    YEAR(contract.contract_start_date) = '2019'
GROUP BY `month`;
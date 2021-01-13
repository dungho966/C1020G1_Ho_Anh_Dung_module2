create database bai3;

use bai3;

CREATE TABLE bt1 (
    id INT,
    ten VARCHAR(50),
    tuoi INT,
    khoa_hoc VARCHAR(50),
    so_tien INT
);
insert into bt1
values
		(1, 'Hoang' , 21, 'CNTT' , 40000),
		(2, 'Viet' , 19, 'DTVT' , 32000),
		(3, 'Thanh' , 18, 'KTDN' , 40000),
		(4, 'Nhan' , 19, 'CK' , 45000),
		(5, 'Huong' , 20, 'TCNH' , 50000),
		(5, 'Huong' , 20, 'TCNH' , 20000);
SELECT 
    *
FROM
    bt1; 
    
-- task1  
SELECT 
    *
FROM
    bt1
WHERE
    ten = 'Huong';
    
    -- task2
select ten ,sum(so_tien) as 'tong_so_tien'
from bt1
where ten = 'Huong';    

-- task3

select distinct ten
from bt1;
  
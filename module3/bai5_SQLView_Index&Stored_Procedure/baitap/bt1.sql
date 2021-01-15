use bai5;
CREATE TABLE products (
    Id INT,
    productCode VARCHAR(50),
    productName VARCHAR(50),
    productPrice DOUBLE,
    productAmount INT,
    product_Description VARCHAR(50),
    productStatus VARCHAR(50)
);

insert INTO products 
values
		(1,'A1','pen',1,2,'black','like new'),
		(2,'A2','ruler',2,5,'white','old'),
		(3,'A3','car',10,1,'red','new');

CREATE VIEW viewProduct AS
    SELECT 
        productCode, productName, productPrice, productStatus
    FROM
        products;

SELECT 
    *
FROM
    viewProduct;

insert into viewProduct 
values 
('A10','Xe Dap',100, 'new');

UPDATE viewProduct 
SET 
    productCode = 'A20'
WHERE
    productName = 'Xe Dap';
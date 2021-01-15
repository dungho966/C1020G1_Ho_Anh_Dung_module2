create database bai5 ;

use bai5;

create table th1 (
	ID int ,
    student_name varchar(50),
    address varchar(50)
);
insert into th1
values
	(1 , 'dung1' , 'nghe an'),
	(2 , 'dung2' , 'nghe an'),
	(3 , 'dung3' , 'nghe an'),
	(4 , 'dung4' , 'nghe an'),
	(5 , 'dung5' , 'nghe an');
  
select *
from th1
where student_name = 'dung4';  
create index index_of_name
 on th1(student_name);  
 
 
 
 explain select *
 from th1
 where student_name = 'dung4';

    
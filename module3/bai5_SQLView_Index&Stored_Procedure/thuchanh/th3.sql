use bai5;
-- tham so in
DELIMITER //
create procedure getstudentbyid
(in idrd int)
begin 
	select *
    from th1
    where idrd = id;
end//
 DELIMITER ;   
 
 call getstudentbyid(2);
 
 -- tham so out

 DELIMITER //
 create procedure getstudentbycountry(
	in address1 varchar(50),
    out total int
 )
	begin 
		select count(id) 
        into total 
        from th1
        where address1 = address ;
	end //
  DELIMITER ;   
  call getstudentbycountry('nghe an' , @total);
  select @total;
  

 
 
 
 
 
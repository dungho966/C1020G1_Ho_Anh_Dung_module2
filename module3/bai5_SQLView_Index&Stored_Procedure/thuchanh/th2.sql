use bai5;

DELIMITER //
create procedure findAllStudent()
begin
	select *
    from th1 ;
end //
   DELIMITER ;
   
call findAllStudent();
-- before update trggers 

use mychema;

create table emp_details(
	emp_id int primary key,
    emp_name varchar(255),
    age int,
    salary int
);

insert into emp_details
values (1,'Ram',25,10000),
		(2,'Sham',26,15500),
        (3,'vinod',45,30000),
        (4,'Hema',26,32000);
        
        
delimiter //
create trigger update_trigger
before update
on emp_details 
for each row
begin 
if new.salary = 10000 then 
set new.salary = 85000;
elseif new.salary < 10000 then
set new.salary = 72000;
end if;
end//

update emp_details 
set salary = 8000
where emp_id = 1;

select * from emp_details;



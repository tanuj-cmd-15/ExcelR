use mychema;
-- creatimg pprocedure
DELIMITER //

create procedure display_customers()
begin
select * from customer order by country;
END //


call display_customers();

-- drop procedure
DROP PROCEDURE display_customers; 

DELIMITER //
CREATE PROCEDURE uk_customers()
BEGIN 
SELECT cust_id, first_name
from customer
where country = 'uk';
END //

call uk_customers();

-- parameterized procedure

DELIMITER //
CREATE PROCEDURE CTR_CUSTOMERS(ctr varchar(30))
Begin
select cust_id,first_name
from customer
where country = ctr;
end//

call ctr_customers('USA');
call ctr_customers('UK');

-- create procedure with cust_id and max_amount as parameter

DELIMITER //
Create procedure order_details(cust_id int, max_amt int)
begin
select customer.cust_id,customer.first_name,orders.amount
from customer
JOIN orders
on customer.cust_id = orders.cust_id
where customer.cust_id = cust_id and orders.amount < max_amt;
END //

call order_details(102,500);


-- Create procedure which fetches the emp_name and manager_name for particular manager
DELIMITER //
CREATE PROCEDURE emp_details(mgr_id varchar(20))
BEGIN 
SELECT employee.emp_name , manager.manager_name
from employee
join manager
on employee.managers_id = manager.manager_id
where employee.managers_id = mgr_id;
end //


select * from manager;
call emp_details('M3');
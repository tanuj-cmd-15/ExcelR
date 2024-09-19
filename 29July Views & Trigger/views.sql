use mychema ;

create view us_customers as 
select cust_id,first_name
from customer
where country = 'USA';

select * from us_customers;

-- update a view
create or replace view us_customers as 
select * 
from customer
where country = 'USA';



-- delete a view
drop view us_customers;
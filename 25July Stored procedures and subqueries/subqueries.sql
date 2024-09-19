-- subquery query inside query -- nested query

-- use a subquery to select the first_name of customers with the highest age

use mychema;
SELECT * from customer;

select first_name,age
from customer 
where age =(
	-- subquery
    select 	MAX(age)
    from customer
    where age < (
		select max(age)
        from customer
    )
);


-- display the distinct cust_id and their names of customers table who made the orders

-- using join
select distinct customer.cust_id,customer.first_name
from customer
join orders
on customer.cust_id = orders.cust_id
order by customer.cust_id;


-- using subquery

SELECT cust_id,first_name
from customer
where cust_id IN(
	-- subquery
    select cust_id
    from orders
);


-- NOTE : we should always try to use JOIN instead of subquery beacuse of excution spped of JOIN IS more optimize than subquery

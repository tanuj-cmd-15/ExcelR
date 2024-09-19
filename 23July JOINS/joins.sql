-- Joins 
use mychema;
select * from customer;
select * from orders;

-- join customers and orders table based on cust_id customers and cust_id from orders
select customer.cust_id,customer.first_name,orders.amount
	from customer
    join orders on customer.cust_id = orders.cust_id;

create  table  shippings(
	shipping_id INT,
    status varchar(255),
    cust_id int
);

insert into shippings values(1,'Pending',101),
							(2,'Delivered',102),
                            (3,'Pending',104),
                            (4,'Delivered',105);

select * from shippings;

-- join three table - cutomers, orders and shippings
select customer.cust_id,customer.first_name,orders.item,shippings.status
	from customer 
    join orders on customer.cust_id = orders.cust_id
    join shippings on customer.cust_id = shippings.cust_id ;

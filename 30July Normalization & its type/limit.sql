use mychema;
select * from employee;

select * from employee
limit 3;


-- replcaement of TOP
select * from employee
order by salary desc
limit 2;
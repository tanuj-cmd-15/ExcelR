use mychema;

create table em_details(
	emp_id int,
    emp_name varchar(255),
    emp_phone int
);

-- 1NF --
insert into em_details
values(1,'Ram',89934743,923484643);  -- it does not follow 1nf

insert into em_details
values(1,'Ram',89786756),
		(1,'Ram',89788976);    -- it follows 1NF




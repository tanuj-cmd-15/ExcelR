-- CHECK CONSTRAINT

use mychema;

create table orders_table(
	order_id INT PRIMARY KEY,
    amount INT CHECK( amount < 10000)
);
select * from orders_table;

insert into orders_table values(1,5000),
								(2,7000),
                                (3,2445),
                                (4,7000);
                                
insert into orders_table values (5,11000);


-- adding check constraint to product_table
alter table product_table 
		add check(amount>0);

alter table product_table 
		add constraint amountck check (amount>0);

insert into product_table 
		values (1001,"Cupboard",233,-1);

-- remove the constraint
alter table product_table drop check amountck;



-- Default coonstraint
create table schools(
	school_id int primary key,
    school_name varchar(255),
    school_country varchar(20) default 'IND'
);
insert into schools values(101,'JNV','US'),
							(102,'kv','IND');
select * from schools;
insert into schools(school_id, school_name) values(105,'army school');
insert into schools(school_id) values(109);

-- using alter command add default constraintto the colleges table
alter table colleges alter college_name set default 'others';

-- removing the constraint
alter table colleges alter college_name drop default;


-- create index constraint

create index college_index on colleges(college_code);
select * from colleges;


create index school_index on schools(school_id);

select * from schools;

-- drop indexes
 alter table schools drop index school_index;
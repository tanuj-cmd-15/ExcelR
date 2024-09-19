use mychema;

create table colleges(
	college_ID INT NOT NULL,
    college_code varchar(20) NOT NULL,
    college_name varchar(50)
);

insert into colleges
	values(101,'XYZ1089','XYZ ENGINEERING COLLEGGE');
SELECT * FROM colleges;

INSERT INTO colleges( college_ID, college_code, college_name) values(102,'BITS1009','Bits Pilani');
INSERT INTO colleges( college_ID, college_code) values(102,'BITS1009');


-- remove not null constraint
Alter table colleges MODIFY College_code varchar(20);
INSERT INTO colleges( college_ID ) values(104);

-- unique constraint 
CREATE TABLE employees(
	emp_id INT NOT NULL unique,
    emp_name VARCHAR(255),
    emp_salary INT,
    emp_city varchar(255)
);

INSERT INTO employees values(1001,'Samarth Jain',50000,'pune'),
							(1002,'Mahesh Patil',45000,'Mysore'),
                            (103,'Hema sood',89000,'Hyderabad');
Insert into employees values(104,'Harish Ghodke',10000,'Pune');

alter table employees modify emp_salary INT unique;
select * from employees;

-- Primary KEY

create table student(
	student_id INT,
    student_name varchar(255),
    student_course varchar(255),
    constraint studentID primary key(student_id)
);
create table student1(
	student_id INT primary key,
    student_name varchar(255),
    student_course varchar(255)
);




-- foreign key
create table customer1(
	id int primary key,
    name varchar(255),
    sge int
);

insert into customer1 values(1,'suraj',24),
							(2,'ram',26),
                            (3,'harish',15),
                            (4,'Varsha',60),
                            (5,'Pratibha',26);
                            

-- create another table product and add foreign key to customer_id
create table products(
	customer_id int,
    name varchar(255),
    foreign key(customer_id)
		references customer1(id)
);

-- insert the record with foreign key constraint
insert into products values(2,'keyboard'),
							(2,'mouse'),
                            (3,'Book'),
                            (4,'Monitor');
                            
select * from customer1;
select * from products;

insert into products values (null,'pen');



-- Multiple foreign keys
create table users(
	id INT PRIMARY KEY,
    first_name varchar(255),
    last_name varchar(255),
    age INT,
    country VARCHAR(255)
);

insert into users values(101,'john','Doe',25,'IND'),
						(102,'Joseph','Geller',26,'NYK'),
                        (103,'Ross','Geller',28, 'paris'),
                        (104,'sam','Bing',56,'France');

create table Transactions(
	transaction_id INT PRIMARY KEY,
    amount INT,
    seller INT,
    buyer INT,
    constraint fk_seller foreign key (seller) references users(id),
    constraint fk_buyer foreign key (buyer) references users(id)
);

insert into transactions values (1002030,2300,101,102);
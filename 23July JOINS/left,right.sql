-- office database

-- employe  - emp_id , name , salary , dept_id,manager_id

create table employee(
	emp_id INT PRIMARY KEY,
    emp_name varchar(255),
    salary int,
    dept_id varchar(20),
    managers_id varchar(20)
);

insert into employee 
	values(1,'Rahul',20000,'D1','M1'),
			(2,'Manoj',50000,'D2','M2'),
            (3,'Soham',50000,'D1','M1'),
            (4,'Rama',56000,'D3','M3'),
            (5 ,'Harish',10000,'D10','M3');
            
            
create table department(
	dept_id varchar(20),
    dept_name varchar(255)
);

insert into department
	values('D1','IT'),
			('D2','HR'),
            ('D3','FINANACE'),
            ('D4','Admin');
            
create table manager(
	manager_id varchar(20),
    manager_name varchar(255),
    dept_id varchar(20)
);

insert into manager
	values ('M1','Prem','D3'),
			('M2','Nick','D4'),
            ('M3','Joseph','D1'),
            ('M4','Hari','D1');
            
            
create table projects(
	project_id varchar(20),
    project_name varchar(255),
    team_member_id varchar(20)
);

insert into projects
	values ('P1','Data migration','M3'),
			('P2','ETL Tool','M4');
            
 select * from employee;   
 select * from department;
	
-- Fetch the employee name and depat name they belong to
select employee.emp_name as Employee_Name, department.dept_name as department_name
	from employee
    inner join department on employee.dept_id = department.dept_id;
    
-- fetch the all employee name and dept name they belong to
-- left join = inner join + any additional records in the left table

select employee.emp_name,employee.dept_id,department.dept_name
	from employee left join department on employee.dept_id = department.dept_id;
    

-- fetch all dept names and employee working there
-- right join - inner join + any additional records in the right table

select employee.emp_name , department.dept_id,department.dept_name
	from employee right join department on employee.dept_id = department.dept_id;


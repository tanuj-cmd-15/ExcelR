use mychema;
-- before insert trigger 
create table customers1(
	c_id int,
    age int,
    name varchar(255)
);

delimiter //
create trigger age_verify
before insert on customers1
for each row
if new.age < 0 then set new.age = 0;
end if;
//

insert into customers1 
values(101,24,'joy'),
(102,-10,"Rachit"),
(103,26,'michal'),
(104,-5,'Ram');

select * from customers1;

-- after insert trigger
create table student2(
	id int primary key,
    name varchar(40) not null,
    email varchar(30),
    birthdate date
); 

create table student3(
	id int primary key,
    name varchar(40) not null,
    email varchar(30),
    birthdate date
);

create table message1(
	id int,
    messageId int,
    message varchar(255),
    primary key (id,messageID)
);

create table message3(
	id int,
    messageId int,
    message varchar(255)
    
);


delimiter //
create trigger check_null_dob3
after insert on student3 
for each row 
begin 
if new.birthdate is null then insert into message3 (messageId,message)
values(new.id,concat('hi',new.name,'Please update the DOB '));
end if;
end //

insert into student3(id,name,email,birthdate)
values (101,'Harish','hhar@123GMAIL.com',null),
		(102,'OM','Om@gmail.com','1918-12-18'),
        (103,'sham','sham@gmail.com',null);
        

select * from message3;

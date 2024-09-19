use mychema;

create table stud(	
	s_id int,
    s_name varchar(255)

);

insert into stud
values(1,'SHam'),
		(2,'Ram'),
        (3,'Gopal');

create table course(
c_id  varchar(20),
    c_name varchar(255) ,
    	s_id int
);


insert into course
values('c1','Geography',2),
		('c2','Physics',1),
        ('c3','Maths',2),
        ('c4','English',3),
        ('c2','Hindi',2),
        ('c5','Geography',1);
        
Select s.s_name, group_concat(c.c_name separator ' , ' ) as courses
from stud s
join course c
on s.s_id = c.s_id
group by s_name;
        
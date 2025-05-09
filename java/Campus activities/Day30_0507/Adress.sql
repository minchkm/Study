create table Adress (

cus_no number(38) primary key,
name varchar2(50) not null,
phone varchar2(100) not null,
email varchar2(100) not null,
cus_date date
);

select * from Adress;

create sequence cus_seq 
start with 1
increment by 1
nocache
nocycle;
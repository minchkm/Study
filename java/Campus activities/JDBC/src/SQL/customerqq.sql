create or replace procedure customer_pro
(
cusname out customer.cus_name%type,

cusphone out customer.cus_phone%type,
cusemail out customer.cus_email%type,
cusno in customer.cus_no%type



)
is 



begin
select cus_name,cus_phone,cus_email into cusname,cusphone,cusemail  from customer where cus_no =cusno;
end;
/
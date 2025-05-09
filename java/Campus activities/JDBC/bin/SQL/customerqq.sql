create or replace procedure customer_pro--customer_pro 라는 저장프로시저를 생성, or replace 옵션은 재생성
(
 cusname out customer.cus_name%type,
 cusphone out customer.cus_phone%type,
 cusemail out customer.cus_email%type,
 cusno in customer.cus_no%type
 )
 
 is
  begin
  select cus_name, cus_phone, cus_email into cusname, cusphone,cusemail from customer where cus_no =cusno;
  --입력받은 고객번호를 기준으로 오라클 해당테이블로 부터 고객이름 번호 이메일을 검색해서
  --cusname,cusemail,cusphone 각 변수에 저장

 end;
 /

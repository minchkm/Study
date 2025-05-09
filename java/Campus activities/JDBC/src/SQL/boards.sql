--boards 테이블 생성(자료실)
create table boards(

bno number(38) primary key,
bwriter varchar2(50) not null,
btitle varchar2(200) not null,
bcontent varchar2(4000) not null,
bdate date default sysdate   --등록날짜, date는 오라클 날짜 타입 sysdate는 오라클 날짜함수,default sysdate 제약조건을 주면 해당
--컬럼에 굳이 날짜/시간값을 저장하지 않아도 기본값 날짜/시간값이 저장된다
,bfilename varchar2(200),  --기본적으로 null로 초기화 생략가능 
bfiledata blob null   --blob은 오라클에서 대용량 이진 데이터를 저장할수 있는 자료형 blob은 'Binary Large Object'의 약자이다 
--최대 4GB까지 저장가능 순수 이진 데이터이기에 텍스트가 아닌 파일데이터(동영상,그림,오디오,pdf,워드파일등)을 그대로 저장 가능 

);

select * from boards order by bno desc;

--seq_bno 시퀀스 생성
create sequence seq_bno
start with 1
increment by 1
nocache 
nocycle;

--seq_bno
select seq_bno.nextval as "다음시퀀스번호값" from dual;

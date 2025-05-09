-- 계좌 정보가 저장될 accounts 테이블 생성
create table accounts(
  ano varchar2(50) primary key,    -- 계좌번호
  owner varchar2(50) not null,     -- 계좌 소유주
  balance number(38) not null      -- 예금 잔액
);

-- 데이터 입력
insert into accounts values('123-111-1111', '홍길동', 100000);
insert into accounts values('222-222-2222', '길동', 100000);

-- 데이터 조회
select * from accounts order by balance asc;

-- 변경사항 저장
commit;

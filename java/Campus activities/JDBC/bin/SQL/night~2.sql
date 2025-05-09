
Table ACCOUNTS이(가) 생성되었습니다.

커밋 완료.

명령의 2 행에서 시작하는 중 오류 발생 -
create table accounts(
ano varchar2(50)primary key, --계좌번호
owner varchar2(50) not null, --계쫘 소유주
balance number(38) not null --예금 잔액
)
오류 보고 -
ORA-00955: name is already used by an existing object
00955. 00000 -  "name is already used by an existing object"
*Cause:    
*Action:
선택된 행 없음

명령의 10 행에서 시작하는 중 오류 발생 -
insert into accounts valuse('123-111-1111','홍길동',100000)
오류 발생 명령행: 10 열: 29
오류 보고 -
SQL 오류: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:

명령의 11 행에서 시작하는 중 오류 발생 -
insert into acoounts valuse('222-222-222',:'길동',100000)
오류 발생 명령행: 11 열: 29
오류 보고 -
SQL 오류: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:
커밋 완료.

명령의 2 행에서 시작하는 중 오류 발생 -
create table accounts(
ano varchar2(50)primary key, --계좌번호
owner varchar2(50) not null, --계쫘 소유주
balance number(38) not null --예금 잔액
)
오류 보고 -
ORA-00955: name is already used by an existing object
00955. 00000 -  "name is already used by an existing object"
*Cause:    
*Action:
선택된 행 없음

명령의 10 행에서 시작하는 중 오류 발생 -
insert into accounts valuse('123-111-1111','홍길동',100000)
오류 발생 명령행: 10 열: 29
오류 보고 -
SQL 오류: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:

명령의 11 행에서 시작하는 중 오류 발생 -
insert into acoounts valuse('222-222-222',:'길동',100000)
오류 발생 명령행: 11 열: 29
오류 보고 -
SQL 오류: ORA-00928: missing SELECT keyword
00928. 00000 -  "missing SELECT keyword"
*Cause:    
*Action:
커밋 완료.

--오라클 한줄 주석문 가호 

--customer 
/*  number(38)은 최대자리수가 38자리까지 정수 숫자저장
 * varchar2는 가변문자
 * date는 날짜 타입
 * 
 */

/* primary key 기본키 제약 조건 
 * not null null저장금지 즉 반드시 자료를 입력해야함 
 * 
 */
create table customer(   --(시험)

cus_no number(38) primary key,
cus_name varchar2(50) not null,
cus_phone varchar2(30) not null,
cus_email varchar2(100) not null,
cus_date date --고객 등록날짜,default sysdate 제약조건을 주면 cus_date컬럼에 굳이 등록날짜값을 저장하지 않아도 기본값 날짜값이 오라클 sysdate날짜 함수
--에 의해 저장 , default 제약조건은 기본값을 저장할 수 있게 해준다 
);


select * from customer; --테이블의 모든 컬럼 데이터를 확인 검색하는 쿼리문 *는 모든 컬럼을 뜻함



/* 레코드란 테이블 커럶에 저장된 한행의 자료집합을 말한다.
* 
* 레코드 저장문 형식
* insert into 테이블명(컬럼 목록)valuse(값);
*테이블의 모든 컬럼에 레코드 저장시에는 컬럼목록을 생략가능 컬럼에만 레코드를 저장할때는 컬럼목록을 명시 코드해얗 ㅏㅁ
*컬럼목록 순서와 values값 목록 순서는 일치해야함 
*문자열 레코드 저장시 '' 로 감싼다 
*
*SQL 문은 대소문자를 구분하지 않지만 컬럼에 저장된 영문 레코드는 대소문자를 구분한다 
*
*시퀀스란 번호 발생기 주로 고객번호나 게시판 번호등 정수숫자 번호값 발생용도로 사용
*특징)
*시퀀스 번호는 중복 번호가 없고 null없다 그러므로 primary key 제약조건으로 설정 정수숫자 타입으로 지정된 컬럼 레코드값
*저장용도로 사용해야함
*
*시퀀스 생성문법형식)
*create sequence 시퀀스명 
* start with 1   //1부터 시작,기본값으로 생략가능 
* increment ny 1 //1씩증가 기본값으로 생략가능
* nocache //임시 메모리를 사용하지 않겠다는 의미 생략하면 기본값은 cache 20이다 이것의 의미는 오라클에서 시퀀스 번호를 미리 20개
* 까지 메모리에 올려놓겠다는 의미이다  어제 마지막으로 발급된 시퀀스 번호가 100이라면 캐시에는 101~120까지 메모리에 있고 다음 시퀀스 번호값은 121부터 시작
* 오늘 db가 재시작 하면 캐시값은 초기화 
* nocycle; 시퀀스 최대값 또는 최소값에 도달하면 다시 처음부터 시퀀스 번호값을 반복하지 않겠다는 의미이다. 기본값 생략가능
* 
* 
* 
*/
--cus_seq라는 시퀀스 생성(시험)
create sequence cus_seq 
start with 1
increment by 1
nocache
nocycle;

select cus_seq.nextval as "다음 시퀀스 번호값" from dual;

select sysdate as "오늘 날짜와 시간값" from dual;

INSERT INTO customer (cus_no, cus_name, cus_phone, cus_email, cus_date)
VALUES (cus_seq.nextval, '홍길동', '010-7777-7777', 'hong@gmail.com', sysdate)

/* 저장후 레코드 검색 쿼리문 문법형식
 * select 컬럼목록 from 테이블명 where 조건식 order by 기준컬럼 desc(asc);
 * 
 * order by 정렬문이다
 * 내림차순 정렬 규칙
 * 한글은 가나다 역순 영어는 알파벳역순 숫자는 큰숫자 부터 먼저 정렬된다 
 * 
 * 오른차순 정렬은 asc문이다 기본값으로 생략가능 오름차순 정렬은 내림차순의 역순이다 
 * 
 */

--고객번호를 기준으로 내림차순 정렬
select * from customer order by cus_no desc;

--2번째 레코드 저장 
insert into customer values(cus_seq.nextval, '이순신', '010-9999-9999', 'lrks@gmai.com', sysdate);

insert into customer values(cus_seq.nextval, '신사임당', '010-9921-9159', 'trts@gmai.com', sysdate);

/* 레코드 수정문 형식
 * update 테이블명 
 * set 컬럼명 변경할값 컬럼명=변경할값 
 * where 조건식;
 * 
 */

--2번 레코드의 고객이름과 폰번호,이메일주소를 변경(시험나옴) 
update customer set cus_name='수정홍길동',cus_phone='010-5555-555',cus_email='desew@gmail.com' where cus_no=2;

--2번 고객번호를 검색
select cus_name, cus_phone,cus_email from customer where cus_no=2;

/* 레코드 삭제문 형식
*/ 
select * from customer order by cus_no asc;  --고객번호를 기준으로 오름차순 정렬

--4q번 레코드를 삭제
delete from customer where cus_no =4; 


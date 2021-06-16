-- 20210616

--  DML


-- 테스트 테이블 생성
create table dept01
as 
select * from dept where 1=0;


-- 데이터 입력 : 행단위 입력
-- insert into 테이블명 (컬럼명,...) values (데이터, 데이터,...)
-- 입력하고자하는 커럼과 입력데이터의 개수는 일치
-- 컬럼의 도메인과 입력데이터의 타입이 일치
-- 기본키와 같이 not null 인경우 컬럼을 생략하면 안됨

desc dept01;
select * from dept01;
-- 1번부서 개발팀 서울 위치
insert into dept01 (deptno, dname, loc)
            values (10, '개발팀', '서울')
;

insert into dept01 (deptno, dname, loc)
            values ('삼십', '개발팀', '서울')
;

insert into dept (dname, loc)
            values ('개발팀', '서울')
;



-- 데이터 저장할 컬럼기술을 생략 가능!
-- 모든 컬럼의 데이터를 입력할 때
-- values 절의 데이터의 순서 : 테이블이 생성될때 저의된 커럼의 순서 -> desc 테이블명
desc dept01;

insert into dept01 values (20, '마케팅', '부산');

desc emp;

insert into emp (empno, deptno) values (7777, 60);
select * from emp;
rollback;

desc orders;

insert into orders (orderid, custid, bookid) values (11, 6, 11);



-- 서브 쿼리를 이용해서 데이터 입력
drop table dept02;
create table dept02
as select * from dept where 1=0;
select * from dept02;

-- 데이터 입력
insert into dept02
select * from dept
;

insert into dept02
select * from dept02
;

-- 데이터를 변경 :  행단위로 선택하고 변경하고자하는 컬럼을 기술
-- update 테이블 명 set 컬럼이름=새로운 데이터, 컬럼이름=새로운 데이터 where 행을 선택하는 조건

create table dept03
as select * from dept 
;
select * from dept03;

-- 모든 부서의 위치를 SEOUL 로 이동
update  dept03
set loc='SEOUL'
;
--where 
-- 10번 부서의 위치를 PUSAN이동, 부서이름도 DEV 변경
update dept03
set loc='PUSAN', dname=null
where deptno=10
;

-- emp01 새롭게 생성하고 update
drop table emp01;
create table emp01
as select * from emp;
select * from emp01;

-- 모든 사원의 부서번호를 30번으로 수정합시다.
update emp01
set deptno=30;

-- 이번엔 모든 사원의 급여를 10% 인상시키는 UPDATE 문.
update emp01
set sal = sal*1.1
;

-- 모든 사원의 입사일을 오늘로 수정.
update emp01
set hiredate=sysdate
;


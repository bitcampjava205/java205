-- 20210618

-- JDBC
select * from dept01;


insert into dept01 values (DEPT01_DEPTNO_SEQ.nextval, 'dev', 'SEOUL');

-- dept01 deptno -> sequence
create sequence dept01_deptno_seq
start with 10
INCREMENT by 10;

delete from dept01 where deptno=?;

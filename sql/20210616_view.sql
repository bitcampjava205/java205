-- 20210616

-- view

-- 자주 사용되는 
-- 30번 부서에 소속된 사원들의 사번과 이름과 부서번호를 출력하기 위한 
-- SELECT문을 하나의 뷰로 정의해 봅시다.

create or replace view emp_view30
as
select empno, ename, deptno
from emp
where deptno=30
;

select * from emp_view30
where ename = 'JAMES'
;

-- view 삭제
drop view emp_view30;



-- 인라인 뷰를 이용한 TOP3 구하기
select rownum, ename
from emp
--order by hiredate
;

-- 입사일이 빠른 사람 5명만(TOP-N)을 얻어오기
select rownum, ename, hiredate
from (select * from emp order by  hiredate desc)

;

select * from emp order by  hiredate;

create or replace view view_HIR
as
select * from emp order by  hiredate;

select rownum, ename, hiredate from view_hir;

select rownum, ename, hiredate 
from view_hir 
where rownum<6
order by ename
;






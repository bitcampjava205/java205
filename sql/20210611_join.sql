-- 2021.06.11

-- JOIN : 스키마의 합

-- CROSS JOIN
-- 스키마의 합 : 집합의 곱 연산과 같다

select *
from emp, dept
where emp.deptno=dept.deptno
;

-- ansi cross join
select * 
from emp cross join dept
;

-- 이름이 SCOTT인 사람의 where e.ename='SCOTT'
--  부서명을 출력해봅시다. 
-- 출력해야하는 컬럼을 가지는 테이블을 확인해보자
-- 이름 : emp, 부서명 : dept
select e.ename, d.dname , d.deptno
from emp e, dept d
where e.deptno = d.deptno --and ename='SCOTT'
order by d.dname, e.ename
;

-- self JOIN : 자기 자신을 조인 ( 참조 )
-- emp -> mgr 컬럼이 emp.empno 참조
select e.empno, e.ename, e.mgr , m.ename
from emp e, emp m
where  e.mgr=m.empno(+)
;


-- NON EQUI JOIN
-- 동등 비교가 아닌 크다 작다와 같은 비교로 조인의 조건을 작성

select * from salgrade;

select e.ename, e.sal, s.grade, s.losal, s.hisal
from emp e, salgrade s
--where e.sal>=s.losal and e.sal<=s.hisal
where sal between s.losal and s.hisal
order by e.ename
;









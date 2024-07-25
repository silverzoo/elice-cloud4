SELECT * FROM emp;
-- 부서번호가 40인 부서의 급여 평균보다 높게 받는 사원들의 모든 컬럼과 나이를 조회하는 쿼리를 작성해주세요.
--나이 조회: 지금 년도에 몇 살인지 반환하는 수식
SELECT emp.*,
       FLOOR( (CAST(REPLACE(CURRENT_DATE,'-','') AS UNSIGNED) - CAST(REPLACE(birthdate,'-','') AS UNSIGNED)) / 10000 ) as age
FROM emp
WHERE sal >= (
            SELECT AVG(sal)
            FROM emp
            GROUP BY deptno
            HAVING deptno = 40);

-- 서브쿼리 확인: 부서번호40인 부서의 평균 급여
SELECT AVG(sal)
FROM emp
GROUP BY deptno
HAVING deptno = 40;
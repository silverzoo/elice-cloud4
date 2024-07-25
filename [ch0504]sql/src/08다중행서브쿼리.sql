SELECT * FROM emp;
-- 각 부서별 급여를 제일 많이 받는 사원의 월급을 받는 사원들을 조회하는 쿼리를 작성해주세요.


-- 답1. 인라인뷰 사용
SELECT a.*
FROM a, (
    SELECT deptno, MAX(sal) AS max_sal
    FROM emp a
    GROUP BY deptno
) as b
WHERE a.sal = b.max_sal
AND a.deptno = b.deptno;

-- 서브쿼리 확인
-- SELECT deptno, MAX(sal)
-- FROM emp
-- GROUP BY deptno;

-- 질문: MAX(sal)에 별칭을 추가해주지 않고 WHERE절에서 a.sal = b.MAX(sal) 하면 오류가 나는 이유?
-- 답: MAX(sal)은 함수를 호출하는 의미이므로 인라인뷰에서 뿐만 아니라 SELECT절을 제외한 모든 절에서 별칭을 지정해 사용해야 한다.

-- 답2. 다중행서브쿼리사용
SELECT *
FROM emp
WHERE sal IN (
    SELECT max(sal)
    FROM emp
    GROUP BY deptno);
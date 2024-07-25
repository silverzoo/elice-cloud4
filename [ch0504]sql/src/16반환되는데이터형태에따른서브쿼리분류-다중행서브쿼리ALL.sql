-- 아래는 EMPLOYEE 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC EMPLOYEE;

-- 1. 직급이 '사원'인 직원의 급여를 조회하는 쿼리를 작성해봅시다.
SELECT salary
FROM EMPLOYEE
WHERE position = '사원'
ORDER BY salary;


-- 2. 앞에서 작성한 쿼리와 ALL을 이용하여, 모든 사원들의 급여보다 높거나 같은 급여를 가진 직원을 조회하는 쿼리를 작성해봅시다.
SELECT *
FROM EMPLOYEE
WHERE salary >= ALL (
    SELECT salary
    FROM EMPLOYEE
    WHERE position = '사원')
ORDER BY employee_id;
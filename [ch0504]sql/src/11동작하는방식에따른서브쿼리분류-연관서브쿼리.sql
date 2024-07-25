-- 아래는 EMPLOYEE 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC EMPLOYEE;

-- 자신의 관리자의 급여보다 높거나 같은 급여를 가진 직원의 ID를 출력하는 쿼리를 작성해봅시다.
SELECT employee_id
FROM EMPLOYEE a
WHERE salary >= (
    SELECT salary
    FROM EMPLOYEE b
    WHERE a.manager_id = b.employee_id
)
ORDER BY employee_id;

-- 연관쿼리? 서브쿼리가 메인 쿼리에서 사용하는 컬럼을 가지고 있는 형태
-- 아래는 EMPLOYEE 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC EMPLOYEE;

-- 급여가 8000미만인 직원의 관리자 아이디와 급여를 출력하는 쿼리를 작성하세요.
SELECT employee_id, salary
FROM EMPLOYEE
WHERE employee_id IN (
                    SELECT manager_id
                    FROM EMPLOYEE
                    WHERE salary < 8000)
ORDER BY employee_id;

-- 급여가 8000미만인 직원을 관리하는 관리자 출력
-- SELECT manager_id
-- FROM EMPLOYEE
-- WHERE salary < 8000;

-- 비연관쿼리? 서브쿼리에서 사용하는 컬럼이 메인쿼리에서 사용하지 않을 경우
-- 아래는 EMPLOYEE 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC EMPLOYEE;

-- 1. 부서이름이 '개발'인 직원의 직원ID, 급여 정보를 가지는 뷰(EMPLOYEE_DEV)를 만드는 쿼리를 작성해봅시다.
CREATE VIEW EMPLOYEE_DEV AS(
                           SELECT employee_id, salary
                           FROM EMPLOYEE
                           WHERE department_name = '개발'
                           );


-- 2. 위에서 만든 뷰(EMPLOYEE_DEV)의 모든 데이터를 조회하는 쿼리를 작성해봅시다.
SELECT * FROM EMPLOYEE_DEV;
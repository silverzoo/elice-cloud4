-- gender가 'M'인 직원만 골라서 조회하는 쿼리를 작성해주세요.
DESC employees;

SELECT *
FROM employees
WHERE gender = 'M';
-- salaries 테이블에서 직원 번호와 한 직원의 평균 급여를 중복없이 출력해보세요.
DESC salaries;

--FROM절이 SELECT절보다 먼저 수행되기때문에 가능함
SELECT DISTINCT emp_no, (
                        SELECT AVG(salary)
                        FROM salaries a
                        WHERE a.emp_no = b.emp_no
                        ) AS avg_salary
FROM salaries b;
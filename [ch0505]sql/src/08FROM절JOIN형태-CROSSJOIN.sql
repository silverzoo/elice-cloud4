-- 아래 쿼리는 FIRST_NAME_T, LAST_NAME_T 테이블의 구조를 나타냅니다. 해당 테이블을 수정할 필요는 없습니다.
DESC FIRST_NAME_T;
DESC LAST_NAME_T;

-- FIRST_NAME_T와 LAST_NAME_T를 크로스조인으로 결합하고, first_name과 last_name을 출력하세요.
SELECT first_name, last_name
FROM FIRST_NAME_T
CROSS JOIN LAST_NAME_T
ORDER BY first_name, last_name;


--(CROSS) 생략가능
SELECT first_name, last_name
FROM FIRST_NAME_T
JOIN LAST_NAME_T
ORDER BY first_name, last_name;

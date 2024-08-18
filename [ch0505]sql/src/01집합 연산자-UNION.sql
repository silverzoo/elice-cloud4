-- 아래 쿼리는 request_past, request_new 테이블의 구조를 나타냅니다. 해당 테이블을 수정할 필요는 없습니다.
DESC request_past;
DESC request_new;

-- 1. 각 테이블에서 이름(name)과 번호(number)를 조회하고, 집합연산자를 통해 중복을 제거하지 않고 데이터를 연결해보세요.
SELECT name, number
FROM request_past
UNION ALL
SELECT name, number
FROM request_new
ORDER BY 1;

-- 2. 각 테이블에서 이름(name)과 번호(number)를 조회하고, 집합연산자를 통해 중복을 제거하여 데이터를 연결해보세요.
SELECT name, number
FROM request_past
UNION
SELECT name, number
FROM request_new
ORDER BY 1;
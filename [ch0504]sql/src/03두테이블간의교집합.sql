-- 대출,반납에 대한 정보를 user 테이블과 연결해 조회해 봅시다.
DESC rental;
DESC user;

-- 테이블의 내용(컬럼)을 모를 때
SELECT *
FROM rental
INNER JOIN user;

-- ON없이 사용한다면 중복을 고려하지 못한다.
-- 즉, 조건(ON)이 없어서 합집합이 된다.
SELECT COUNT(*) as '조인한테이블카운트' FROM rental INNER JOIN user;
SELECT COUNT(*) as 'rental테이블카운트' FROM rental;
SELECT COUNT(*) as 'user테이블카운트' FROM user;
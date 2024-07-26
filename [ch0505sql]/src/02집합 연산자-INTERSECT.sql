-- 아래 쿼리는 student, lecture_special 테이블의 구조를 나타냅니다. 해당 테이블을 수정할 필요는 없습니다.
DESC student;
DESC lecture_special;

-- 1. student 테이블에서 이름(name)와 이메일(email)을 조회하는 쿼리를 작성하세요.
SELECT name, email
FROM student;

-- 2. lecture_special 테이블에서 이름(name)와 이메일(email)을 조회하는 쿼리를 작성하세요.
SELECT name, email
FROM lecture_special;

-- 3. 위 2개의 쿼리에 대해서 집합 연산자를 이용하여 공통적으로 존재하는 데이터를 조회하는 쿼리를 작성해주세요.
SELECT name, email
FROM student
INTERSECT
SELECT name, email
FROM lecture_special;
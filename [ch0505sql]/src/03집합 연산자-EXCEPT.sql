-- 아래 쿼리는 lecture_basic, lecture_special 테이블의 구조를 나타냅니다. 해당 테이블을 수정할 필요는 없습니다.
DESC lecture_basic;
DESC lecture_special;

-- 1. lecture_basic 테이블에서 학생번호(student_number)와 학생이름(student_name)을 조회하는 쿼리를 작성하세요.
SELECT student_number, student_name
FROM lecture_basic;

-- 2. lecture_special 테이블에서 학생번호(student_number)와 학생이름(student_name)을 조회하는 쿼리를 작성하세요.
SELECT student_number, student_name
FROM lecture_special;

-- 3. 위 2개의 쿼리에 대해서 집합 연산자를 이용하여 lecture_special 테이블에는 존재하지만, lecture_basic에는
-- 존재하지 않는 학생번호와 학생이름을 조회하는 쿼리를 작성하세요.
SELECT student_number, student_name
FROM lecture_special
EXCEPT
SELECT student_number, student_name
FROM lecture_basic;
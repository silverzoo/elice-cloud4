-- 아래 쿼리는 CLASS_REQUEST, STUDENT, CLASS 테이블의 구조를 나타냅니다. 해당 테이블을 수정할 필요는 없습니다.
DESC CLASS_REQUEST;
DESC STUDENT;
DESC CLASS;

-- 1. CLASS_REQUEST 테이블에 대해 JOIN절과 USING을 이용해 STUDENT테이블과 결합하여
-- 신청번호(REQUEST_ID)와 학생이름(STUDENT_NAME)을 조회하는 쿼리를 작성해보세요.
SELECT request_id, student_name
FROM CLASS_REQUEST a
JOIN STUDENT b
ON a.student_id = b.student_id
ORDER BY 1;

-- 2. CLASS_REQUEST 테이블에 대해 JOIN절과 USING을 이용해 CLASS테이블과 결합하여
-- 신청번호(REQUEST_ID)와 과목이름(CLASS_NAME)을 조회하는 쿼리를 작성해보세요.
SELECT request_id, class_name
FROM CLASS_REQUEST a
JOIN CLASS b
ON a.class_id = b.class_id
ORDER BY 1;

-- 3. CLASS_REQUEST 테이블에 대해 JOIN절과 USING을 이용해 STUDENT테이블, CLASS테이블과 결합하여
-- 신청번호(REQUEST_ID)와 학생이름(STUDENT_NAME), 과목이름(CLASS_NAME)을 조회하는 쿼리를 작성해보세요.

-- 답1.
SELECT request_id, student_name, class_name
FROM STUDENT a
JOIN (
    SELECT request_id, student_id, class_name
    FROM CLASS_REQUEST
    JOIN CLASS
    USING (class_id)) b
ON a.student_id = b.student_id
ORDER BY 1;


-- 답2.
SELECT request_id, student_name, class_name
FROM CLASS a
JOIN (
    SELECT request_id, class_id, student_name
    FROM CLASS_REQUEST
    JOIN STUDENT
    USING (student_id)) b
ON a.class_id = b.class_id
ORDER BY 1;

-- 답3. JOIN 2번함
SELECT request_id, student_name, class_name
FROM CLASS_REQUEST
JOIN STUDENT USING (student_id)
JOIN CLASS USING (class_id)
ORDER BY 1;
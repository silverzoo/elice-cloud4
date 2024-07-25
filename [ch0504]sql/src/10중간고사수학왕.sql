-- 1. 경민이보다 중간고사 수학점수를 높거나 같게 받은 학생들을 조회해 주세요.
DESC students;
DESC middle_test;

-- students와 middle_test테이블 모두 조회하기 위해 JOIN + 특정학생의 수학 점수와의 비교를위해 서브쿼리 필요
SELECT b.*, a.*
FROM students a
LEFT JOIN middle_test b
ON a.student_id = b.student_id
WHERE b.math >= (
                SELECT math
                FROM middle_test
                WHERE student_id = 10504);
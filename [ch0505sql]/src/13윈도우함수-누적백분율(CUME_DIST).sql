-- 아래는 STUDENT 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC STUDENT;

-- 1. 윈도우 함수, CUME_DIST를 이용하여 성적에 대한 누적 백분율 값을 확인하세요.
SELECT
    ID,
    SCORE,
    CUME_DIST() OVER (ORDER BY SCORE DESC) AS CUME_DIST
FROM STUDENT
ORDER BY ID;


-- 2. 1번에서 확인한 누적 백분율 값에 대해 조건을 걸어, 상위 30%초과 상위 70%이내 학생들을 출력하세요.
SELECT ID, SCORE, CUME_DIST
FROM (
     SELECT
         ID,
         SCORE,
         CUME_DIST() OVER (ORDER BY SCORE DESC) AS CUME_DIST
     FROM STUDENT) a
WHERE 0.3 < a.CUME_DIST AND a.CUME_DIST <= 0.7
ORDER BY CUME_DIST;


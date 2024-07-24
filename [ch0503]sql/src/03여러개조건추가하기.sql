DESC score;

-- 수학 점수가 80점 초과, 국어 점수가 90점 이상인 학생의 정보를 검색해보세요.
SELECT *
FROM score
WHERE math > 80
AND korean >= 90;
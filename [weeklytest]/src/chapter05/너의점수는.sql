-- 지시사항 1번을 참고하여 코드를 작성하세요.
DESC test;
DESC students;

SELECT id, name, SUM(kor + eng + math) / 3 AS test_average
FROM test
JOIN students
USING (id)
GROUP BY name
ORDER BY id;
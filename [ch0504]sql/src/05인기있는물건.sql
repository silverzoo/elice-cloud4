-- 지시사항을 만족하는 쿼리를 작성해보세요.
DESC sale;

SELECT name, SUM(amount)
FROM sale
GROUP BY name
HAVING SUM(revenue) >= 50000;

-- 데이터 확인용
SELECT *
FROM sale;

SELECT name, SUM(amount), SUM(revenue)
FROM sale
GROUP BY name;
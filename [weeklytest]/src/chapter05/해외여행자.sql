-- 지시사항 1번을 참고하여 코드를 작성하세요.
DESC ticket;
DESC airplane;


SELECT a.user_id, a.date, b.country
FROM ticket a
INNER JOIN airplane b
ON a.airplane_id = b.id
WHERE b.country NOT IN (
    SELECT country
    FROM airplane
    WHERE country = 'Korea'
       OR country = 'China'
       OR country = 'Japan')
ORDER BY a.user_id;
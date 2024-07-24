-- 방식 1.
SELECT MAX(price) as 최댓값, MIN(price) as 최솟값
FROM books
WHERE publication_year BETWEEN 2001 AND 2003;

-- 방식 2.
WITH filtered_books as (
    SELECT price
    FROM books
    WHERE publication_year BETWEEN 2001 AND 2003
)

SELECT MAX(price) as 최댓값, MIN(price) as 최솟값
FROM filtered_books;

-- 제대로 출력했는지 price를 오름차순으로 확인
SELECT *
FROM books
WHERE publication_year BETWEEN 2001 AND 2003
ORDER BY price;
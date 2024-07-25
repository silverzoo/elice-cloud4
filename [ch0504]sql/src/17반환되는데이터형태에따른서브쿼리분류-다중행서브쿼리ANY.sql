-- 아래는 FOOD 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC FOOD;

-- 음식타입이 Main인 임의의 음식의 가격보다 비싼 음식들을 조회해봅시다.
SELECT *
FROM FOOD
WHERE price > ANY (
    SELECT price
    FROM FOOD
    WHERE food_type = 'Main')
ORDER BY food_id;


-- SELECT price
-- FROM FOOD
-- WHERE food_type = 'Main';

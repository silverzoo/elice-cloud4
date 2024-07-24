-- 아래에 미션을 수행하는 쿼리를 작성해 보세요.

-- 1. product테이블에서 물건들이 몇 종류 있는지 조회해 보세요.
SELECT COUNT(*) as '종류 수'
FROM product;

-- 2. product테이블에서 모든 물건들의 재고를 다 더해서 조회해 보세요.
SELECT SUM(stock) as 합계
FROM product;

-- 3. product테이블에서 판매가가 가장 비싼 물건의 판매가를 조회해 보세요.
SELECT MAX(selling_price) as 최고가
FROM product;
-- 판매기록을 product 테이블과 연결해 출력해 봅시다.
-- 이때 product테이블이 중심이 되도록 해 봅시다.

-- 출력되는 데이터의 내용은 동일, 순서의 차이만 있다.
-- sale 테이블 먼저 출력
SELECT *
FROM sale a
RIGHT JOIN product b
ON a.product_id = b.id;

-- product테이블 컬럼먼저 출력
-- SELECT *
-- FROM product a
-- LEFT JOIN sale b
-- ON b.product_id = a.id;
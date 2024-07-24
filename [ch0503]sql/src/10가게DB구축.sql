-- 아래에 문제 설명대로 정보를 추가해 봅시다.
DESC product;

INSERT INTO product
VALUES (1,'carrot',100,'2019-04-10',1000,900);

INSERT INTO product
VALUES (2,'tea',1000,'2020-02-10',1000,900);

INSERT INTO product (id,name,stock,list_price,selling_price)
VALUES (3,'clock',100,200000,180000);

-- product테이블 전체를 조회해 봅시다.
SELECT *
FROM product;
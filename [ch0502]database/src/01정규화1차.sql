-- 정의되어 있는 테이블을 확인해보세요.
DESC customer;

-- 1차 정규화를 적용하세요.
DELETE FROM customer WHERE customer_id = 'kmax6';

CREATE TABLE customer (
    customer_id      VARCHAR(5)  NOT NULL,
    customer_name    VARCHAR(10) NOT NULL,
    rental_time      VARCHAR(50) NOT NULL,
    rental_location  VARCHAR(20) NOT NULL,
    brand            VARCHAR(20) NOT NULL,
    model_year       INT         NOT NULL,
    price_per_minute INT         NOT NULL,
    basic_price      INT         NOT NULL,
    company          VARCHAR(20) NOT NULL
);


INSERT INTO customer VALUES ('kmax6', '김민준', '2020-08-20 13:01:02', '서울시 강남구 역삼동', 'boardkick', 2015, 100, 1000, 'elice');
INSERT INTO customer VALUES ('kmax6', '김민준', '2020-09-01 20:39:52', '서울시 강남구 역삼동', 'boardkick', 2015, 100, 1000, 'elice');


-- 정규화된 결과를 확인해보세요.
SELECT * FROM customer;

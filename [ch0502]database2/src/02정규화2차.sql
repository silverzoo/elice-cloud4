-- 정의되어 있는 테이블을 확인해보세요.
DESC customer;

-- 2차 정규화를 적용하세요.
DROP TABLE customer;

CREATE TABLE customer (
    customer_id   VARCHAR(5) PRIMARY KEY,
    customer_name VARCHAR(10) NOT NULL
);


CREATE TABLE borrow (
    customer_id      VARCHAR(5),
    rental_time      DATETIME,
    rental_location  VARCHAR(20) NOT NULL,
    brand            VARCHAR(20) NOT NULL,
    model_year       INT         NOT NULL,
    price_per_minute INT         NOT NULL,
    basic_price      INT         NOT NULL,
    company          VARCHAR(20) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
    CONSTRAINT customer_rental_pk PRIMARY KEY (customer_id, rental_time)
);



-- 주석을 해제하여 2차 정규화로 분해한 customer 테이블과 borrow 테이블의 구조 및 외래키 설정을 확인하세요.
SELECT * FROM information_schema.table_constraints WHERE CONSTRAINT_TYPE = 'FOREIGN KEY';
DESC customer;
DESC borrow;

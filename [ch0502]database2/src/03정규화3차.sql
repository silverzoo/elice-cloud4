-- 정의되어 있는 테이블을 확인해보세요.
DESC customer;
DESC borrow;

-- 3차 정규화를 적용하세요.
DROP TABLE borrow;

CREATE TABLE company (
    brand            VARCHAR(20) PRIMARY KEY,
    price_per_minute INT         NOT NULL,
    name             VARCHAR(20) NOT NULL
);


CREATE TABLE price (
    brand       VARCHAR(20),
    model_year  INT,
    basic_price INT NOT NULL,
    FOREIGN KEY (brand) REFERENCES company (brand),
    CONSTRAINT brand_model_pk PRIMARY KEY (brand, model_year)
);


CREATE TABLE borrow (
    customer_id     VARCHAR(5),
    rental_time     DATETIME,
    rental_location VARCHAR(20) NOT NULL,
    brand           VARCHAR(20) NOT NULL,
    model_year      INT         NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id),

    --복합키로 된 PK를 FK로 참조하는 방법
    FOREIGN KEY (brand, model_year) REFERENCES price (brand, model_year),
    CONSTRAINT customer_rental_pk PRIMARY KEY (customer_id, rental_time)
);


-- 주석을 해제하여 3차 정규화로 분해한 테이블의 구조 및 외래키 설정을 확인하세요.
SELECT * FROM information_schema.table_constraints WHERE CONSTRAINT_TYPE = 'FOREIGN KEY';
DESC company;
DESC price;
DESC borrow;

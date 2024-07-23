-- 쿼리 수행 속도를 확인하기 위한 명령어입니다.
SET profiling = 1;

-- 이름이 '배형찬'인 고객의 데이터를 검색하세요.
SELECT * FROM customer WHERE name = '배형찬';

-- name 컬럼의 인덱스를 설정하세요.
CREATE INDEX customer_name_idx ON customer (name);

-- 다시 한 번 이름이 '배형찬'인 고객의 데이터를 검색하세요.
SELECT * FROM customer WHERE name = '배형찬';

-- 쿼리 수행 속도 결과를 확인해보세요.
SHOW profiles;
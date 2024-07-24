-- 책들의 정보가 담겨있는 테이블의 구조를 조회합니다. 수정하실 필요는 없습니다.
DESC book;

-- 아래에 제목이 The Little로 시작하는 책만 조회하는 쿼리를 작성해주세요.
SELECT *
FROM book
WHERE title LIKE 'The Little%';

-- 아래에 제목에 and가 포함된 책만 조회하는 쿼리를 작성해주세요.
SELECT *
FROM book
WHERE title LIKE '%and%';

-- 아래에 제목이 Rings로 끝나는 책만 조회하는 쿼리를 작성해주세요.
SELECT *
FROM book
WHERE title LIKE '%Rings';
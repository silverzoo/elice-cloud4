-- rental테이블의 구조를 조회합니다. 수정하실 필요는 없습니다.
DESC rental;

-- 누가 몇권의 책을 빌려갔는지 조회해 봅시다.
SELECT user_id, COUNT(*)
FROM rental
GROUP BY user_id;


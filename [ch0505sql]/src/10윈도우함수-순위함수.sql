-- 아래는 GYM_MEMBER 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC GYM_MEMBER;

-- 스쿼트 점수, 벤치 프레스 점수, 데드 리프트 점수의 합계에 대해 동일 점수는 같은 순위로 취급하여 순위를 매겨 조회하세요.
SELECT
    MEMBER_ID,
    SQUAT,
    BENCH_PRESS,
    DEADLIFT,
    SQUAT + BENCH_PRESS + DEADLIFT AS WEIGHT_SUM,
    RANK() OVER (ORDER BY WEIGHT_SUM DESC) RANK
FROM GYM_MEMBER;

-- "순위는 RANK를 이용하고, 합계점수의 내림차순을 기준으로 순위를 세웁니다." 라는 의미를
-- "ORDER BY를 합계점수의 내림차순으로 하세요" 라고 잘 못 이해했다.
-- "RANK() 함수를 사용할 때 합계점수가 큰 순으로 순위를 매기라"는 의미였다.
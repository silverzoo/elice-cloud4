-- 아래는 BUDGET_USE 테이블에 대한 구조를 보여줍니다. 테이블을 수정하실 필요는 없습니다.
DESC BUDGET_USE;

-- 비용이 전체 비용 합계에서 차지하는 비율을 조회해 봅시다.
SELECT
    ID,
    USE_CODE,
    EXPENSE,
    ROUND(EXPENSE / SUM(EXPENSE) OVER() * 100, 4) AS RATIO
FROM BUDGET_USE
ORDER BY ID;

--MariaDB에서는 RATIO_TO_REPORT 함수를 지원하지 않는다.

--RATIO_TO_REPORT 사용해서 풀이
SELECT
    ID,
    USE_CODE,
    EXPENSE,
    ROUND(RATIO_TO_REPORT(EXPENSE) OVER() * 100, 4) AS RATIO
FROM BUDGET_USE
ORDER BY ID;

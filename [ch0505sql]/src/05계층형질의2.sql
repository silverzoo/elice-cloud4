-- WITH RECURSIVE 를 이용하여 계층형 질의를 작성해보세요.
WITH RECURSIVE CTE AS (
    SELECT mentee_id, mento_id, 0 AS lvl
    FROM MEMBER
    WHERE mento_id IS NULL

    UNION ALL

    SELECT a.mentee_id, a.mento_id, b.lvl+1 AS lvl
    FROM MEMBER a
    JOIN CTE b
    ON a.mento_id = b.mentee_id
)

SELECT mentee_id, mento_id, lvl
FROM CTE
ORDER BY lvl, mentee_id;

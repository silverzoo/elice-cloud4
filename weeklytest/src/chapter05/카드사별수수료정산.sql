SELECT
    ccm.card_company_id,
    ccm.company_name,
    ccm.fee,
    ROUND(SUM(od.pay_price * (ccm.fee / 100))) AS calculation
FROM
    orders o
JOIN
    orders_detail od
    ON o.order_number = od.orders
JOIN
    card_company_manager ccm
    ON o.card_company = ccm.card_company_id
WHERE
    o.order_status = '3001'
GROUP BY
    ccm.card_company_id
ORDER BY
    ccm.card_company_id;
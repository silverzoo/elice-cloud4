-- 아래에 미션을 수행하는 코드를 작성해 봅시다.
DESC shareholder;

-- 1. 모든 주주의 정보를 출력하세요.
SELECT *
FROM shareholder;

-- 2. 10만 주 이상 가지고 있는 주주들의 정보를 출력하세요.
SELECT *
FROM shareholder
WHERE stock >= 100000;

-- 3. Alexis, Craig, Fred가 가진 주식 수를 출력하세요.
SELECT stock
FROM shareholder
WHERE name = 'Alexis' OR name = 'Craig' OR name = 'Fred';

-- 4. 엘리스에게 찬성하면서 10만 주 이상 보유 중인 주주들의 이름과 주식 수를 출력하세요.
SELECT name, stock
FROM shareholder
WHERE agree = 0
AND stock >= 100000;

-- 5. 엘리스에게 반대하면서 10만 주 이상 보유 중인 주주들의 이름과 주식 수를 출력하세요.
SELECT name, stock
FROM shareholder
WHERE agree = 1
AND stock >= 100000;

-- 6. 20만 주 이상 또는 10만 주 이하만큼 보유하고 있는 주주들의 정보를 출력하세요.
SELECT *
FROM shareholder
WHERE stock <= 100000 OR 200000 <= stock;
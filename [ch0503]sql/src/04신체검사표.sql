-- 아래에 미션을 수행하는 코드를 작성해 봅시다.
DESC student;

-- 1. 모든 학생의 이름을 조회해보세요.
SELECT name
FROM student;

-- 2. 성별이 남자인 학생들의 모든 정보를 조회해보세요.
SELECT *
FROM student
WHERE gender = 'M';

-- 3. 키가 170 이하인 학생들의 키만 따로 조회해보세요.
SELECT height
FROM student
WHERE height <= 170;

-- 4. 몸무게가 50 이상인 학생들의 몸무게만 따로 조회해보세요.
SELECT weight
FROM student
WHERE weight >= 50;
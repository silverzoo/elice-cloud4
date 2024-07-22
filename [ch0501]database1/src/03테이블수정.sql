-- DESC 명령어를 통해 정의된 kickboards 테이블을 확인할 수 있습니다.
DESC kickboards;

-- kickboards 테이블에 member_birthday 컬럼을 추가하세요.
ALTER TABLE kickboards ADD COLUMN member_birthday DATE; -- NULL 조건을 안 적어도 디폴트는 NULL허용임

-- rental_date 속성의 데이터 타입을 TIME으로 수정하세요
ALTER TABLE kickboards MODIFY COLUMN rental_date TIME;

-- member_id와 kickboard_id 컬럼의 제약 조건을 NOT NULL로 수정하세요.
ALTER TABLE kickboards MODIFY COLUMN member_id varchar(16) NOT NULL;
ALTER TABLE kickboards MODIFY COLUMN kickboard_id varchar(16) NOT NULL;

-- kickboard_id와 kickboard_brand 컬럼의 이름을 변경하세요.
ALTER TABLE kickboards CHANGE COLUMN kickboard_id id varchar(16) NOT NULL;
ALTER TABLE kickboards CHANGE COLUMN kickboard_brand brand varchar(16);

-- distance 컬럼을 삭제하세요.
ALTER TABLE kickboards DROP COLUMN distance; -- 컬럼 삭제는 데이터타입과 제약조건을 적지 않는다. 적으면 오류 발생

-- kickboards 테이블의 이름을 kickboard로 수정하세요.
ALTER TABLE kickboards RENAME kickboard;

-- 수정된 kickboard 테이블의 구조를 확인해봅니다. 제출 시 아래 주석을 해제하세요.
DESC kickboard;
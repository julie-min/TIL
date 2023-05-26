## 자주 쓰는 MySQL 명령어

1. 유저 생성
CREATE USER '유저이름'@'호스트' IDENTIFIED BY '비밀번호';
// 호스트에 '%' = 와일드카드(모든 ip에서의 접속 허용)

2. 유저/호스트 목록 보기
SELECT User, Host FROM mysql.user;

3. 권한 부여
GRANT 권한유형 ON 데이터베이스.테이블 TO '유저이름'@'호스트';
// 예시) GRANT ALL PRIVILEGES ON *.* TO 'user'@'%';

4. 권한 취소
REVOKE 권한유형 ON 데이터베이스.테이블 FROM '유저이름'@'호스트';
// 예시) REVOKE ALL PRIVILEGES ON *.* FROM 'user'@'%';

* 권한 변경점을 즉시 적용하는 명령어 *
FLUSH PRIVILEGES;

5. 유저 권한 확인
SHOW GRANTS FOR '유저이름'@'호스트';

6. 유저 삭제
DROP USER '유저이름'@'호스트';

7. 데이터베이스 생성
CREATE DATABASE 데이터베이스이름;

8. 데이터베이스 목록 보기
SHOW DATABASES;

9. 데이터베이스 선택
USE 데이터베이스이름;

10. 데이터베이스 삭제
DROP DATABASE 데이터베이스이름;

11. 테이블 생성
CREATE TABLE 테이블이름 (
  열이름1 데이터유형1,
  열이름2 데이터유형2,
  ...
);

12. 테이블 목록 보기
SHOW TABLES;

13. 데이터 삽입
INSERT INTO 테이블이름 (열1, 열2, ...) VALUES (값1, 값2, ...);

14. 데이터 조회
SELECT * FROM 테이블이름;

15. 조건에 따른 데이터 조회
SELECT * FROM 테이블이름 WHERE 조건;

16. 데이터 업데이트
UPDATE 테이블이름 SET 열 = 값 WHERE 조건;

17. 테이블 구조 확인
DESC 테이블이름;

18. 테이블 데이터유형 수정
ALTER TABLE 테이블이름 MODIFY 열이름 데이터유형;

19. 데이터 삭제
DELETE FROM 테이블이름 WHERE 조건;

20. 테이블 삭제
DROP TABLE 테이블이름;
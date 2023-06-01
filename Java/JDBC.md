# JDBC (Java Database Connectivity)

- 자바언어와 데이터베이스를 연결
- SQL 문장의 실행, 핸들링
- 쉽게 말해 자바프로그램 내에서 SQL 문을 실행하기 위한 자바의 API
- JDBC API는 java.sql 패키지를 의미
- java.sql 패키지를 이용하면 DBMS에 종속되지 않는 프로그램 개발 가능


<br>

# SQL 종류

<명령어 종류>

| 종류 | 핵심기능 | 명령어|
| :---: | :---: | :---: |
| DDL | 생성,수정,삭제 | CREATE, ALTER, DROP
| DML | 등록,수정,삭제 | INSERT, UPDATE, DELETE
| DQL | 검색 | SELECT
| DCL | 권한부여,취소 | GRANT, REVOKE
| TCL | 트랜잭션 관리| COMMIT, ROLLBACK

# 진행 방식

1. mysql - jar. 파일 : DriverManager라고 부르며, Referenced Library 폴더에 넣으면 실행

2. Connection <br>
   `import java.sql.Connection;`

   ```java
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, username, password);
    }
    ```

3. PreparedStatement 생성 <br>
   미리 컴파일된 sql 문을 실행하기 위한 인터페이스이다.
   sql문을 데이터베이스로 전달한다.
   ```java
   Connection conn = dbConnector.getConnection();
                // PreparedStatement 는 SQL Injection 을 방어하는 가장 기본적인 기법이다. 공부하세요!
                PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
    ```

4. ResultSet 객체 <br>
   sql쿼리의 결과를 담는 객체
   결과값을 읽어온다.


5. 작업이 완료되면 Connection, Statement를 닫아준다.





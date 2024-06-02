# 웹 동작방식

> JSP 수업 필기

##  front-end
클라이언트측 브라우저

## transfer - http
[Header] 요청주소 전송한 데이터(**get**) <br>
[Body] 전송한 데이터 (**post**)

## Back-end
[웹서버측] Http에 의한 단순한 요청 html로 처리<br>
[WAS] Java로 DB처리와 같은 특정한 처리 프로그램<br>
[DB]

----

자바 프로그램을 만들때, 반드시 만들어주어야하는 class <br>

![image](https://github.com/julie-min/TIL/assets/130271406/7f5e27a7-ce25-447d-b1db-1b7977656b7b)

- DB처리 class: DAO (Data Access Object) 
     - **C**reate: Insert
     - **R**ead : Select(one,all)
     - **U**pdate: Update
     - **D**elete: Delete
     - 추가: 회원테이블-login, 중복체크
- Data 전송 class : DTO(Data Transfer Object)
- VO (Value Object)

서버는 브라우저가 요청하지않으면 절대 주지않는다.<br>
톰캣은 가만히 들고만 있다. <br>브라우저가 http가 움직여서 요청을 한다.
1) 톰캣이 살아있어야함 서버를 살리자.
2) 브라우저가 찾어. 브라우저를 열어라.
3) 톰캣이 찾어서 준다. 요청해줘. <br>톰캣이 응답한다.
=> Ctrl + F11 이 이 모든 과정을 한번에 다 해줄수있게 해준다. ^^

자바를 dB를 연결하는게 중요하다. <br>그걸 우리는 jdbc 라고 부른다.<br><br>
## JDBC 4단계
자바는 부품조립식이고 <br>DB와 연결할때는 반드시 2가지 부품이 필요하다.<br>
=> db table 과 자바와의 연동<br>
ex. member, bbs, reply table을 만들었다.<br>
자바에는 대응하는것을 만들어야겠지. <br>=> dto(VO), dao 이다.<br><br>
table 1개당 자바에서는 dto, dao 하나씩 만드는 것!<br>
위 예제 테이블을 3개 만들었다. <br>dto 3개, dao 3개를 만든다. <br>자바 클래스파일이 6개
--- table 3개 --> class는 6개!

<br>

그럼.. JDBC 4단계는 뭘까? <br>순서있게 코딩을 해야겠다.
1. 커넥터 설정 (mysql connector jar 파일)
2. DB 연결 (id,pw,db,url)
3. sql문 생성
4. sql문을 db 서버로 보낸다.

DTO(VO)는 데이터 전송할 때 <br>데이터를 묶어서 값을 넣고 뺄 수 있는 클래스<br>
DB테이블의 항목에 맞추어 만들어 놓은 것으로<br>
묶어서 리턴을 해야한다. <br>여러개를 쭈루룩 줄수가 없다.. <br>
DTO보다 VO를 더 많이 쓴다. <br>다른 기능없이 value만 딱 들어가있다는 의미이다.<br>
VO는 테이블마다 각각 만들어야한다.

---

## 자바 프로젝트 설계방법
**M**odel: 특정한 방법으로 처리 (DAO) <br>
**V**iew: 클라이언트 입력, 결과 출력(html) <br>
**C**ontrol: 클라이언트가 입력한 데이터 중간처리 (JSP)
<br><br>

브라우저 -----> 웹서버 + WAS ----> DBMS <br>
웹서버? 브라우저 요청 + 단순응답 <br>
nginx, apache webserver, iis, tomcat
<br>
WAS: web application Server<br>
tomcat, 동적으로 자바로 처리
wsgi, 동적으로 파이썬 처리
<br><br>
## DTO: Data Transfer Object <br>
많은 양의 데이터를 전송하는 경우 <br>
<mark>가방역할을 해주는 class </mark><br>
가방에 넣을 때는 set 메소드 이용<br>
가방에서 꺼낼 때는 get 메소드 이용<br>

---
## DAO / VO 테이블당 2개씩 클래스를 만든다.
- Model 부분에 각 역할을 하는 부품을 만들어주세요.
- DB처리 부분을 가진 클래스: DAO
- 여러 데이터를 전달하는 클래스: VO
- DB에 table을 만들면, 한 table당 자바에서는
- DAO와 DTO를 쌍으로 만들어주어야한다.
- 예를들어, 테이블이 5개라면, 총 10개의 클래스
- Reply테이블이라면 ReplyDAO, ReplyDTO

### 회원가입을 예시로 들어보자.
1. 회원가입 html : 회원정보 입력 폼
2. create.jsp : 입력한 정보를 받아와서 가방(dto)를 만든 후, 가방에 넣는다.
3. DB처리하는 DAO에 가방을 입력으로 주면서 create하라고 명령한다.
4. 실행결과를 고객에게 알려준다.
5. 회원DTO: 전달할 데이터를 담아줄 가방역할
6. 회원DAO: 회원테이블과 관련된 DB처리만 전담



<br><br>

# 자바 웹 기술

1. 애플릿 Applet <br>
   - 웹 초기에 동적 데이터 처리 지원기술
2. 서블릿 Servlet <br>
   - **웹** 상에서 요청된 서비스를 **서버**에서 처리하는 기술
3. JSP (Java Server Page) <br>
   - 서블릿과 동일한 기술이지만, <br>
   - 표현하는 방법과 역할이 다름.<br><br>

### 웹어플리케이션 서버 (Web App. Server, WAS)
웹 서버에서 요청된 다양한 종류의 문서를 실행하기 위한 **서버** <br>
<br>
### JSP 컨테이너 (servlet 컨테이너) == 엔진 
- 서블릿과 JSP처럼 동적 컨텐츠를 처리하는 프로그램
- 동적 컨텐츠의 저장소 역할
- 메모리 로딩, 객체 생성 및 초기화 등 생명주기 관리
- 변환 기능 수행
- 컨테이너 종류: **서블릿 컨테이너** / **JSP 컨테이너**

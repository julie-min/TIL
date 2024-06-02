## JSP 에서의 Session과 Cookies
세션 : 서버에 저장
-> 브라우저와 서버의 연결

쿠키: 클라이언트, 브라우저에 저장

---

## Cookie
- `name = value` 형식
- `expire = 날짜` 쿠키 유지 시간 지정
- `path = 경로` 쿠키의 유효 디렉터리 지정
- `domain = 서버정보` 쿠키 유효 서버 지정

### Cookie 생성 메서드
- `new Cookie(name,value)` 쿠키생성
- `setMaxAge(int expiry)` 유효시간 시정
- `setPath(String uri)` 쿠키 경로지정
- `setDomain(String domain)` 쿠키 도메인 설정
- `addCookie(Cookie cookie)` 쿠키전송
- `Cookie[] getCookies()` Cookie 추출
- `String getName()` Cookie 검색
- `String getValue()` Cookie 값 추출


쿠키 심기
```java
Cookie c1 = new Cookie("name","Min");
Cookie c2 = new Cookie("age", "100");
response.addCookie(c1);
response.addCookie(c2);
```

로그인 세션 잡기 <br>
로그인에 성공한다면 (아이디와 패스워드가 일치한다면)
세션을 id로 설정한다.
```java
String id = request.getParameter("id");
String pw = request.getParameter("pw");

String origianlID = "root";
String originalPW = "1234";

if(id.equals(originalID) && pw.equals(originalPW)) {
    session.setAttribute("id",id);
}
```

---

## Session
- 세션은 클라이언트 단위로 생성됨
- 세션은 생성시 세션ID라는 것이 부여됨
- Cookie 기술을 이용하여 세션ID를 웹클라이언트에 전송한다.
- 이 웹클라이언트가 받은 세션 ID를 사용하여 세션의 객체가 관리된다.

- `getSession()` 기존에 존재하는 세션리턴
- `getSession(true)` 세션이 없는 경우 새로 생성하여 리턴
- `getSession(false)` 세션이 없는 경우 null을 리턴

### HttpSession 메서드
`getAttribute(String name)` 값 반환 <br>
`getID()` 세션ID반환<br>
`getCreationTime()` 생성된 시간 반환<br>
`getLastAccessedTime` 마지막 클라이언트 시도 시간반환<br><br>
`getMaxInactiveInterval` 클라이언트 요청이 없을 때 서버가 현재의 세션을 언제까지 유지할지를 초단위로 반환한다. <br>기본 유효시간은 30분으로 지정되어있음.<br><br>
`isNew()` 서버측에서 새로운 HttpSession 객체를 생성한 경우에는 true 를 반환하고, 기존 세션이 유지되고 있는 경우라면 false를 반환한다. <br><br>
`removeAttribute(String name)` HttpSession 객체에서 name으로 지정된 객체를 삭제한다.<br><br>
`setMaxInactiveInterval(int second)` HttpSession객체의 유지시간을 설정한다. 지정된 시간이 지나면 HttpSession객체는 자동삭제된다.<br><br>

---
### 로그인 여부를 판단하는 것은 세션을 가지고 한다.
### 즉, 로그인에 실패하면 세션을 설정하지 않음.


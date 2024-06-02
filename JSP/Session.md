# Session & Cookie

- 네트워크 연결에 있어 비연결성이란?
  <br> > 요청에 대한 응답을 처리하게 되면 연결을 끊어버린다.

- 네트워크 연결에서 무상태성이란?
  <br> > 비연결성으로 인해, 이전에 저장했던 상태값을 계속 가지고 있을 수 없음. <br>
  즉, 이전의 정보가 남아있지 않음.


## 네트워크 연결에서 상태를 저장하기 위한 2가지 기술
1. 세션: 서버의 램에 저장
   - 서버, 하나씩 저장했다가 하나씩 꺼내쓸 수 있음. 저장하는 타입이 아무거나 괜찮음
2. 쿠키: 클라이언트의 브라우저에 저장
   - 하나씩 저장했다가 전체를 서버로 가지고 와서 꺼내써야한다. 모두다 스트링만 가능


아까 그 브라우저 정보에 대한 정보를 램에 저장 : 세션 기술
아이디를 브라우저에 저장하는 것: 쿠키
브라우저에 남겨놓는 것을 쿠키라고 한다.

세션도 단점이 있다. 각각의 클라이언트마다 그 정보를 계속 가지고 있어야 하기 때문에 서버가 부담이 된다. 서버가 너무 외울게 많아;; 네이버 유저는 천만이라고 치면.. 비용과 연관됨


쿠키는 본인의 컴퓨터, 브라우저에 저장하는 것이고 String으로 for문을 통해 꺼낸다. 
쿠키의 단점 : 보안 ⇒ String이다보니까 피씨방에서 다보인다. ㅎㅎ
쿠키를 많이 쓰는 것은 보안에 취약하다.



## 로그인 세션 구현하기
[로그인 html] : form action ⇒ 로그인세션저장하기.jsp
[로그인세션저장하기 jsp] 
String id = request.getParameter id, pw 받기
String originalId / originalPw
if(id. equals(originalId) && pw.equals(origianlPw)) {
session.setAttribute


### 쿠키: 클라이언트(브라우저)에 저장
### 세션: 서버(변수)에 저장

---

## 쿠키 생성 메서드
1. cookie 생성 : new Cookie(name, value)
2. 유효시간 지정: setMaxAge(int expiry)
3. 쿠키 경로 설정: setPath(String uri)
4. 쿠키 도메인 설정: setDomain(String domain)
5. 쿠키 전송: addCookie(Cookie cookie)
6. 쿠키 추출: Cookie[] getCookies()
7. 쿠키 검색: String getName()
8. 쿠키값 추출: String getValue()



- 쿠키를 심는다
- Cookie c1 = new Cookie("name","value");
- **response**.addCookie(c1)
- 브라우저에게 쿠키를 심으라고 명령함

- 쿠키를 가져온다
- Cookie[] cookies = **request**.getCookies();
- 

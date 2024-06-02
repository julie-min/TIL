# HTTP Protocol

- 브라우저가 HTML의 `form` 태그를 통해 서블릿을 요청할 때는 `GET`아니면 `POST`만 지정할 수 있다.

# JSP 스크립트 태그
1. 주석문<br>
   `<%--    --%>`

2. 지시자<br>
   `<%@       %>`

3. 수행문<br>
   `<%        %>`

4. 표현식<br>
   `<%=       %>`

5. 선언문 <br>
   `<%!       %>`

# JSP 내장객체
1. request : `HttpServletRequest` 타입의 request는 **브라우저가 서버에 파일을 요청할 때마다** 생성되는 객체다. <br> 
따라서 포워드 관계에 있는 JSP에서는 request에 정보를 저장하여 공유할 수 있다.

<br>

2. session : `HttpSession` 타입의 session은 브라우저 하나당 하나씩 생성된다. 따라서 브라우저가 종료되지 않는 동안 저장된 정보를 다른 JSP에서 공유할 수 있다. <br>
또한, 세션에 저장한 정보는 브라우저가 종료되지 않는 한 리디렉트 관계의 모든 JSP에서 공유할 수 있다.

<br>

3. application : `ServletContext` 타입의 application은 서버가 종료되지 않는 이상 application 내장 객체에 등록한 정보를 공유할 수 있다.
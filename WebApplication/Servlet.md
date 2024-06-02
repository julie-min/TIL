
# Servlet
- 자바의 웹 애플리케이션 프로그래밍 기술
- 웹 요청&응답의 흐름을 간단한 메서드 호출로 다루게 하는 기술
- 자바 코드 안에 HTML을 포함한다.
- MVC 패턴에서 컨트롤러로 이용된다.
- 서블릿이란 Java Web Application의 구성요소 중 동적인 처리를 하는 프로그램의 역할이다.
- 서블릿을 정의한다면 결국, WAS에서 동작하는 Java 클래스이다.
- 서블릿은 반드시 HttpServlet 클래스를 상속받아야한다.


# Servlet 동작 방식
1. Client -> <br>
2. Servlet Contatiner로 HTTP Request ->
3. HttpServletRequest, HttpServletResponse 객체 생성 ->
4. 서블릿 분석(Web.xml) -> 
5. 찾은 서블릿 -> 
6. service() 메소드 호출 -> 
7. doGet(), doPost() 호출 -> 
8. HttpServletRequest, HttpServletResponse 두 객체 소멸

사용자(클라이언트)가 URL을 치고 엔터치면 HTTP Request를 Servlet Container로 전송 <br>
Servlet Contatiner는 HttpServletRequest, HttpServletResponse 두 객체 생성 <br>
web.xml은 사용자가 요청한 URL을 분석하여 어느 서블릿에 대해 요청을 한 것인지 찾는다. <br>
해당 서블릿에서 service 메소드를 호출한 후 <br> 클라이언트의 POST, GET 여부에 따라 doGet() 또는 doPost()를 호출한다. <br>
doGet(), doPost()는 동적 페이지를 생성한 후 HttpServletResponse 객체에 응답을 보낸다. <br>
응답이 끝나면 HttpServletRequest, HttpServletResponse 두 객체를 소멸시킨다.


# Servlet Container
`HttpServletRequest`
- request 정보를 서블릿에게 전달하기 위한 목적으로 사용
- 헤더정보, 파라미터, 쿠키, URI, URL 등의 정보를 읽어 들이는 메서드와 Body의 Stream을 읽어들이는 메서드를 가지고 있다.
  
`HttpServletResponse`
- WAS는 어떤 클라이언트가 요청을 보냈는지 알고있고, 해당 클라이언트에게 응답을 보내기 위한 객체를 생성하여 서블릿에게 전달한다.
- 이 객체를 활용하여 content type, 응답코드, 응답 메세지 등을 전송한다.
  
### <mark> 서블릿 컨테이너는 자신이 생성하고 관리할 객체에 대한 정보를 `web.xml`파일을 통해 획득한다.</mark>

## kernel error <br>
스레드 끼리는 자원 공유 가능 <br>
프로세스끼리는 불가하며 에러 발생
<br>


## Web Container


---

## 주요 개념 비교

Servlet은 Java 언어로 작성된 웹 애플리케이션의 서버 사이드 컴포넌트입니다.
Servlet은 Java Servlet API를 사용하여 HTTP 요청을 처리하고, 동적으로 웹 페이지를 생성하고 제공하는 기능을 제공합니다.
Servlet은 Java EE(Java Enterprise Edition)의 일부로 포함되어 있으며, Java 웹 애플리케이션을 개발하는 데 기본적으로 사용됩니다.

JSP (JavaServer Pages):
JSP는 Java 기반의 서버 사이드 스크립트 언어입니다.
JSP는 **HTML 내에 Java 코드를 포함**할 수 있으며, 동적으로 웹 페이지를 생성하는 데 사용됩니다.
JSP는 서블릿으로 변환되어 실행되며, 서블릿과 마찬가지로 Java 웹 애플리케이션을 개발하는 데 사용됩니다.
JSP는 주로 웹 페이지의 프레젠테이션 로직을 처리하기 위해 사용됩니다.


Spring은 Java 기반의 애플리케이션 개발을 위한 오픈 소스 프레임워크입니다.
Spring은 애플리케이션 개발을 간편하게 만들기 위해 다양한 기능과 추상화 계층을 제공합니다.
Spring은 의존성 주입(Dependency Injection)과 관련된 기능을 강조하며, 개발자가 느슨한 결합과 테스트 가능한 코드를 작성할 수 있도록 돕습니다.
Spring은 다양한 모듈로 구성되어 있으며, 주요 모듈로는 Spring Core, Spring MVC, Spring Data, Spring Security 등이 있습니다.


Spring Boot는 Spring 기반의 애플리케이션을 빠르고 간편하게 개발하고 실행하기 위한 프레임워크입니다.
Spring Boot는 애플리케이션의 초기 설정과 종속성 관리 등을 자동화하여 개발자가 복잡한 설정 작업에 시간을 절약할 수 있도록 돕습니다.
Spring Boot는 기본적으로 Spring의 기능과 모듈을 사용하며, 추가적으로 **스타터(starter) 종속성**을 제공하여 특정 기술 스택의 개발을 더욱 쉽게 만들어줍니다.

## SpringBoot와 Servlet
SpringBoot는 Spring 프레임워크의 발전된 버전<br>
SpringBoot는 Spring을 더욱 편리하게 사용하도록 간소화함
또한 SpringBoot는 Servlet을 포함한 기술 <br>
SpringBoot는 Servlet API를 기반으로 웹개발 가능<br>
Servlet Container(Tomcat) 내장됨

즉, SpringBoot는 `HttpServletRequest` `HttpServletResponse` 를 사용하지 않는다. 사용할 필요가 없다. 이는 **애너테이션**으로 대체된다.

일부 특수한 경우에는 Spring Boot에서 HttpServlet을 사용해야 할 수 있습니다. 다음은 몇 가지 예시입니다:

필터(Filter) 사용: HttpServlet을 확장한 필터 클래스를 작성하여 요청 전후에 특정 작업을 수행하고 싶을 때 HttpServlet을 사용할 수 있습니다. 예를 들어, 요청의 로깅, 보안 검사 등을 수행하는 필터를 작성할 수 있습니다.

직접적인 Servlet Container 기능 사용: Spring Boot는 내장된 Tomcat, Jetty, Undertow와 같은 Servlet Container를 사용하며, 이를 활용하여 특정한 설정이나 동작을 수행할 수 있습니다. 이 경우 HttpServlet을 사용하여 Servlet Container와의 상호작용을 할 수 있습니다.

Legacy 코드와의 통합: 기존에 HttpServlet을 사용하는 코드나 라이브러리를 Spring Boot 애플리케이션에 통합해야 하는 경우가 있을 수 있습니다. 이 경우 HttpServlet을 사용하여 기존 코드를 유지하면서 Spring Boot 애플리케이션과 통합할 수 있습니다.

이러한 경우를 제외하고는 **Spring Boot에서는 HttpServlet을 직접 사용할 필요가 없습니다.**

## JSP
Java Server Pages <br>
동적 웹페이지를 생성하기 위한 <br>
<mark>자바 서버사이드 스크립팅 기술</mark>

JSP(JavaServer Pages)는 동적인 웹 페이지를 생성하기 위한 **Java 기반의 서버 사이드 스크립팅 기술**입니다. JSP는 HTML 문서 내에 Java 코드를 삽입하여 동적인 콘텐츠를 생성하고, 서버 측에서 이를 처리하여 클라이언트에게 동적으로 생성된 HTML 페이지를 전달합니다.

JSP는 **서블릿(Servlet) 기술** 위에 구축되어 있으며, JSP 파일은 서블릿으로 변환되어 실행됩니다. JSP 파일은 일반적인 **HTML 문서** 형식을 따르며, 확장자는 .jsp입니다. JSP 파일 내에서는 <% %> 태그를 사용하여 Java 코드를 삽입할 수 있습니다.

JSP는 정적인 HTML 코드와 동적인 Java 코드를 결합하여 웹 애플리케이션의 **동적인 부분**을 구현하는 데 사용됩니다. 예를 들어, 데이터베이스에서 정보를 가져와 테이블 형태로 동적으로 출력하거나, **사용자로부터 입력**을 받아 양식을 처리하는 등의 기능을 구현할 수 있습니다.

JSP는 Java의 강력한 기능과 HTML의 편리한 마크업 구조를 결합하여 개발자가 웹 애플리케이션을 쉽고 빠르게 구축할 수 있도록 도와줍니다. Spring Boot와 함께 사용되는 경우, Spring MVC와 JSP를 조합하여 웹 애플리케이션의 프레젠테이션 계층을 개발할 수 있습니다. 그러나 최근에는 JSP 대신에 **템플릿 엔진**인 **Thymeleaf, Freemarker, Velocity** 등을 더 많이 사용하는 추세입니다.

## 서블릿의 변수
1. 서블릿의 지역변수는 각 요청마다 스레드별로 스택 영역에 할당되어 사용되지만,
2. 멤버변수는 힙영역에 할당되어 서블릿을 실행하는 여러 스레드에서 공유한다.


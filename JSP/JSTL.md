# JavaServer Pages Standard Tag Library
: JSP에서 사용하는 태그 라이브러리 공통표준

- 코어 : 변수지원, 흐름제어, URL처리 -> *접두어 c*
- XML: XML코어/변환 -> *접두어 x*
- 포맷팅: 지역, 메시지형식, 숫자날짜형식 -> *접두어 fmt*
- SQL : *접두어 sql*
- 함수 : 콜렉션 처리, String처리 -> *접두어 fn*

## 코어 태그 Core
- ` <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> `

### 1. <c:set>
- 지정한 영역에 변수를 생성한다.
- `<c:set value="value" var="varName" scope="session"/>`

### 2. <c:out>
- 데이터를 출력

### 3. <c:remove>
- 변수를 삭제

### 4. <c:catch>
- 오류를 처리하는 태그
- <c:catch var="e"> 실행문 </c:catch>
<br>

```java
<% BookBean book = new BookBean(); %>

<c:set target="<%= book %>" property="title" value="The Secret" />
<%= book.getTitle() %>
```

### 5. <c:if>
- 조건문
- `<c:if test="testCondition" var="varName" scope="session">`

### 6. <c:choose>
- 여러개의 조건식을 처리, 조건에 만족하는 문장 하나만 처리
<br>
```java
<c:set var="num" value="${95}" />

점수 <c:out value="${num}" />은
<c:choose>
    <c:when test="${num>=90}"> A학점입니다. </c:when>
    <c:when test="${num>=80}"> B학점입니다. </c:when>
    <c:when test="${num>=70}"> C학점입니다. </c:when>
    <c:when test="${num>=60}"> D학점입니다. </c:when>
    <c:otherwise>F학점입니다.</c:otherwise>
</c:choose>
```

### 7. <c:forEach>
- 지정된 횟수만큼 명령문을 반복 실행하는 태그
  1) 객체들의 collection을 수행하는 경우
   ```java
   <c:forEach var="varName" items="collection" varStatus="varStatusName" begin="begin" end="end" step="step">
   ~~~~body~~~~ </c:forEach>
   ```

  2) 지정된 횟수만큼 반복 수행할 경우
   ```java
   <c:forEach var="varName" varStatus="varStatusName" begin="begin" end="end" step="step"> ~~~ body ~~~ </c:forEach>
   ```

### 8. <c:forTokens>
- 문자열을 특정문자로 구분하여 분리한 후 분리된 문자열만큼 명령문을 반복수행하는 태그

```java
<c:forEach var="i" begin="2" end="9">
    <c:forEach var="j" begin="1" end="9">
    ${i} * ${j} = ${i*j} <br>
    </c:forEach>
    <br>
</c:forEach>
```

### 9. <c:redirect>
- 다른 페이지로 이동할 때 사용하는 태그
`<c:redirect url="value" context="context" />`


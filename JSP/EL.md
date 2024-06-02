# EL
## Expression Language
- JSP에는 HTML이 더 많이 들어가기 때문에
- 효율적으로 JSP를 활용하기 위해서 문법을 보완하는 역할
  
`{#expr}` <br>
`${<표현>.<표현>}`

변환 예시
<br>
`request.getParameter("code")` = `${param.code}` <br>

### 비교 연산자
- `==` 또는 `eq`
- `!=` 또는 `ne`
- `<` 또는 `lt`
- `>` 또는 `gt`
- `<=` 또는 `le`
- `>=` 또는 `ge`
- 문자열비교 `${str=='값'}`
  <br>

### 비교 선택 연산자
<수식>? <값1> : <값2>
<br>
수식의 결과값이 true이면 값1, false이면 값2 리턴

즉, 컨트롤러를 통해 model.addAttribute로 값을 넘겨준 경우 JSP에서 EL로 사용 가능하다. EL은 달러표시로 한다.
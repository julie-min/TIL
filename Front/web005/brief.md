2023.06.20 화요일
- ajax
- jsp 파일 안에 html이 있기 때문에 굳이 따로 html 을 만들지않는다.
- 구성 : dynamic web project -> jsp/webcontent
- 제이쿼리, 부트스트랩 cdn 넣기 (타이틀 밑에)
<br>
<br>

# 제이쿼리 작성
1. $() : body를 먼저 읽어서 램에 저장 시작해줘. document의 뜻
2. $(function) + Ctrl+ Space => 익명함수 (anonymous function)
3. 닫을 때 괄호  끝에 시작점을 적어준다. 헷갈리지않게.
4. 결과를 받아오는 jsp 파일 작성 : html을 지운다.
5. 버튼: id, class 중 하나 
6. `$('#b1')` 이것을 한번 찾아봐봐 라는 뜻
7. `$('#b1').click()` 아이디가 b1인 버튼을 클릭했을 때 호출하겠다 -> 콜백함수
8. 콜백함수: 누를 때마다 호출하는 것..
9. `$('#b1').click(function() {` 입력으로 넣은 function(){함수처리부분}을 실행해줘.
10. 현재까지.. 
```html
<script>
$(function() {
	
	$('#b1').click(function() {
		alert("hi")
	}) //b1
}) // $
</script>
```
11. 성공했을때 뭘줄지 json으로 쓴다. (키-밸류)
```html
		$.ajax({
			url: ,
			success: ,
			error: 
		})
```
- url과 success 는 반드시 들어가야하는 것
- success: html 200번 성공이 되었을 때 보여주는 것
- 함수를 값으로 써주는 것이다.

12. 결과
```html
		$.ajax({
			url: "test.jsp",
			success: function() {
				
			} ,
			error: function() {
				
			}
		})
```

13. 변수 아무거나 넣어서 (x) 저장하는 것이다.
14. 요청 - 받아가지고 - 저장 - 보여주기 의 계속 반복
15. 결과
```html
$.ajax({
			url: "test.jsp",
			success: function(x) {
				alert("받은 데이터는 "+x)
			} ,
			error: function(e) {
				alert(e)
			}
		})
```
16. 데이터를 보내겠어 :data ,
17. test 라는 id를 가진 것을 가지고 가렴
```html
			data: {
				test: $('#test').val()
```

18. test.jsp 파일로 가서 (받아오는 파일) <br>
jsp 방식으로 request.getParameter 로 test를 받는다.



## b1을 클릭했을 때 함수를 실행해줘
## 그 함수는 ajax야
## 그 ajax함수의 입력값은 data, success, error 순으로해


19. 결과를 html 로 보여주고 싶을 떼
```html
success: function(x) {
				$('#d1').html("받은 데이터는" + x)
```

20. 있는지 없는지 확인하는 방법 : jsp 파일에서
21. 하나씩 꺼내서 입력값이랑 같은지 확인하는 것이다.
22. for-each문으로 하나씩 꺼내서 같은지 확인함 (읽기전용) 하나씩구문
23. `for(String s: list) { ` 하나씩 리스트에서 꺼내서 s로 저장
24. 비교연산자를 쓸수가 없어요 = >> 참조형이라서
25. `if(s.equals(user)){` 맞는게 있으면 괄호
26. `break;` for반복문을 break 한다. 있으면 브레이크.. if문의 break 아님


## 결제금액, 수단, 결제하기 부분

```
			data: {
				money: $('#money').val(),
				what: $('#what').val()
```

두개를 받아온다.

1. url:"money.jsp" 여기 파일에서 받아올게
2. 두개의 데이터를... ^^
3. 외부에서 받은 것은 다 string이라 바꿔준다.
4. `  int money2 = Integer.parseInt(money); `
5. 
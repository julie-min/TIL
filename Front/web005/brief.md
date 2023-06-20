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
11. 성공했을때 뭘줄지 json으로 쓴다.
```html
		$.ajax({
			url: ,
			success: ,
			error: 
		})
```

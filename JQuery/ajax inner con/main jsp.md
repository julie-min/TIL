<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- ajax를 통해 내부의 파일을 불러와서 실행하는 비동기 통신의 예시입니다. -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>


<script>
$(function() {  //body 먼저 읽어서 램에 저장을 해주세요. 익명함수입니다.
	
	$('#b1').click(function() { // b1 버튼을 누르면, 아래 함수를 실행하세요.
		alert("b1") // 연결되었는지 확인
		$.ajax({ // ajax 함수를 실행
			url: "test.jsp", // jsp 파일로 요청을 보내겠습니다.
			data: { // id가 test인 value를 보내겠습니다.
				test: $('#test').val()
			},
			success: function(x) { // 성공했다면, 그 응답을 x라고 하겠다.
				$('#d1').html("받은 데이터는" + x) // id가 d1인 것을 변경하겠다.
			} ,
			error: function(e) { // 에러가 난다면, 그 응답을 e라고 하겠다.
				alert(e)  // alert로 띄워보겠다.
			}
		}) // ajax
	}) //b1
	
	$('#b2').click(function() { //버튼 b2를 누르면, 아래를 실행하세요.
		alert("b2") // 일단 알림창 한번 보겠습니다.
		$.ajax({ // 버튼누르면 새로고침은 안하게 할게요.
			url: "money.jsp", // money 파일로 데이터를 던질게요 받아보세요~
			data: { // 데이터가 2개 갈겁니다. id가 money, what인 value를 보내겠습니다. (두개는 input임.)
				money: $('#money').val(),
				what: $('#what').val()
			},
			success: function(x) { // 성공한다면, 그 응답을 x로 하겠습니다.
				$('#d1').html("결제할 금액은" + x) // d1을 x로 치환하겠습니다.
			} ,
			error: function(e) {
				alert(e)
			}
		}) // ajax
	}) //b2
	
	$('#b3').click(function() {
		alert("b3")
		$.ajax({
			url: "idCheck.jsp",
			data: {
				user: $('#user').val()
			},
			success: function(x) {
				$('#d1').html("받은 데이터는" + x)
			} ,
			error: function(e) {
				alert(e)
			}
		}) // ajax
	}) //b3
	

	$('#b4').click(function() {
		alert("b4")
		$.ajax({
			url: "phone.jsp",
			data: {
				tel: $('#tel').val()
			},
			success: function(x) {
				$('#d1').html("받은 인증번호는" + x)
			} ,
			error: function(e) {
				alert(e)
			}
		}) // ajax
	}) //b4	
	
	
	$('#b5').click(function() {
		alert("b5")
		$.ajax({
			url: "won.jsp",
			data: {
				won: $('#won').val()
			},
			success: function(x) {
				$('#d1').html("달러로 환산한 금액은" + x +"달러")
			} ,
			error: function(e) {
				alert(e)
			}
		}) // ajax
	}) //b5	
	
	
	$('#b6').click(function() {
		alert("b6")
		$.ajax({
			url: "dol.jsp",
			data: {
				dol: $('#dol').val()
			},
			success: function(x) {
				$('#d1').html("원화로 환산한 금액은" + x+"원")
			} ,
			error: function(e) {
				alert(e)
			}
		}) // ajax
	}) //b6	
	
	
}) // $
</script>

<style>
input{
	background: skyblue;
	}}
</style>
</head>





<body>

<h3> 비동기통신으로 서버와 통신하기</h3>

	ajax테스트
	<input id="test">
	<button id="b1" class="mt-2 p-2 bg-primary text-white rounded">AjaxTest(b1)</button>
	<hr>
	
	결제금액: 
	<input id="money"><br><br>
	1)계좌이체 2)신용카드 3)휴대폰결제
	<br>
	결제수단 (번호입력)
	<input id="what">
	<button id="b2" class="mt-2 p-2 bg-primary text-white rounded">결제하기(b2)</button>
	<hr>
	
	회원가입할 ID
	<input id="user">
	<button id="b3" class="mt-2 p-2 bg-primary text-white rounded">회원가입시 id중복체크(b3)</button>
	<hr>
	
	인증받을 전화번호 입력
	<input id="tel">
	<button id="b4" class="mt-2 p-2 bg-primary text-white rounded">인증번호받기(b4)</button>
	<hr>
	
	원화를 달러로 
	<input id="won">
	<button id="b5" class="mt-2 p-2 bg-primary text-white rounded">원화를 달러로(b5)</button><br>
	달러를 원화로
	<input id="dol">
	<button id="b6" class="mt-2 p-2 bg-primary text-white rounded">달러를 원화로(b6)</button>
	<hr>


	<div id="d1" style="width: 400px; height: 100px; background: lightgray;">결과창</div>


</body>
</html>
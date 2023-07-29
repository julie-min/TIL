# Ajax

- ajax- asynchronous javascript and XML

- 비동기통신(순서 상관없음) <br>
필요할 때 **아무때나** 통신 가능

## 아무때나 에이작스

# XML
- extensible markup language 확장가능한 마크업 언어 <br>
- 태그를 가지고 정의함
- `<name>hong</name>`
- `<age>100</age>`
- 내가 내마음대로 태그를 막 만들어서 쓰고싶어~~
- 기존 html을 확장했기 때문에 extensible

# JSON
- java의 map(키:밸류) 형태에 해당
- 자료구조의 맵형태
- 자바스크립트에서 대상을 표기하기 위한 것
- javascript object notation 표기법
- `name: "hong", age: 100`
- 키: 메타데이터
- 값: 핵심데이터

# 대리인 서버 = proxy server
직접적으로 rss 를 받기 어려울 때는 agency server


# Ajax : 프로그래밍 언어가 아니다. 웹 접근 기술이다.

- 웹페이지 이벤트 발생 (버튼 클릭) ⇒ 
- JS : XMLHttpRequest 객체가 실행됨 ⇒
- 웹서버에 요청보냄 ⇒ 서버가 요청 처리하고 반환 ⇒ 자바스크립트 해석


ajax: 순서상관없이 아무때나 어느 위치에서든지 서버와 통신한다.
JQUERY : 제이쿼리 자체는 같은 html 내에서 값을 가져오는 일이다.

```
<script type="text/javascript" src="jquery 라이러리 파일 경로"></script>
$(function() {
$('#b1').click(function() {
today = $('#today').val()
if(today == '토' ||  today == '일') {
alert ('주말')
} else {
alert ('평일')
}
})
})
```



body에는 버튼의 id값과 입력창의 id값 총 2개가 있어야한다.

- $(function) : 밑에까지 쭉 읽어오기
- $('#b1') : $ 선택 # 버튼아이디값 (아이디값은 body에서 찾는다)
- $('#today') 입력창에 적힌것 (아이디)
- val() 값을 가져온다

JQuery에서 가져오는방법 = 거기에 있는게 뭔지모르니까 () 표시
$("#test").text())
<p id="test"> GET <b> ME <b> </p>

1. text() 특정 아이디값의 텍스트만 가져온다   `GET ME`
2. html() 특정 아이디값의 html 을 다 가져온다  `GET <b>ME</b> `
3. val() - form과 관련됨 (input)
4. attr() 

JQuery에서 변경하는방법 = (넣는다. 변경된다. 그전에 뭐가 써있든 그냥 바뀜.)
  $("#btn1").click(function(){
    $("#test1").text("Changed");
<p id="test">Chnage this</p>
<button id="btn1">Button</button>

1. text("Hello World") 기존 아이디에 해당하는 텍스트가 있다면 변경한다  `Changed`
2. html("<b>Hello World<b>") HTML요소까지 같이 적용해서 바꾼다
3. val("Hello World") 폼에 적어놓은 문구를 바꾼다

콜백함수 (순서대로 실행)
① hide ② alert
$("button").click(function(){
  $("p").hide("slow", function(){
	alert("The paragraph is now hidden");
  });
});


JQuery+AJAX
$.get(URL,callback);
$(document).ready(function(){
  $("button").click(function(){
    $.get("demo_test.asp", function(data, status){
      alert("Data: " + data + "\nStatus: " + status);
    });
  });
});



$.post(URL,data,callback);
$("button").click(function(){
  $.post("demo_test_post.asp",
  {
	name: "Donald Duck",
	city: "Duckburg"
  },
  function(data, status){
    alert("Data: " + data + "\nStatus: " + status);
  });
});




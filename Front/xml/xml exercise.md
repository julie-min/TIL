# xml


## $(doc).find('rank') // 배열
- xml 변수인 doc 에서 
- rank를 찾아서 가져와봐
- 그리고 그걸 list 에 넣자

`list = $(doc).find('rank') `
- find 함수를 쓸 때에는 꼭 달러를 쓸것
- 
```html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		alert("내가 호출되었어.!")
		$.ajax({
			url: "data/rank.xml",
			success: function(doc) {
				//alert("받은 데이터는 " + doc)
				list = $(doc).find('rank') //배열 [rank, rank, rank], [rank]
				//alert(list.length + " " + list)
				for (var i = 0; i < list.length; i++) {
					name = $(list[i]).find('name').text() //<name>hong</name>
					tel = $(list[i]).find('tel').text() 
					//alert(name)
					$('#d1').append("이름은 " + name + ", 연락처는 " + tel + "<br>")
				}
			},
			error: function(e) {
				alert(e)
			} //error
		}) //ajax
	}) //b1
}) //$
</script>
<style>
input{
	background: yellow;
	color: red;
}
</style>
</head>
<body>
	<button id="b1" class="mt-2 p-2 bg-primary text-white rounded">XML받아오자.</button>
	<hr>
	<div id="d1" style="width: 400px; height: 100px; background: lime;">
	</div>
</body>
</html>
```

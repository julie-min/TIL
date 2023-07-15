# 클라이언트가 어떻게 요청을 할수있는가? 4가지

1. 브라우저에 주소를 바로 입력 : GET 방식

2. **form action**  ⇒ method로 쓴다. POST 방식이 좀더 많다.
method가 없다면, GET방식이다.

3. a 태그 + href ⇒ GET방식

4. 자바스크립트 location.href ⇒ GET방식 

이 중에서 POST를 쓸수있는 건 form action밖에 없다.

---

## GET 방식: <br>
GET 방식은 정보를 가져오기 위해 사용됩니다. 브라우저에서 웹 페이지를 요청할 때 GET 방식을 사용합니다. 예를 들어, 물건을 주문하기 위해 다음과 같은 URL을 사용할 수 있습니다:

``` html
http://example.com/order?item=123&quantity=2
```
- 요청정보 헤더의 URI 뒤에 추가되어 전달됨.
- 쿼리 스트링 내용이 외부에 노출되어 보임.
- 쿼리 스트링 길이가 제한적
- 인코딩/디코딩 설정이 별도로 불필요
- http의 header부분에 URI와 함께 서버로 전달됨. 



## POST 방식: <br>
POST 방식은 <mark>정보</mark>를 전송하고 처리하기 위해 사용됩니다. 브라우저에서 폼을 제출할 때나 데이터를 서버에 전송해야 할 때 POST 방식을 사용합니다. 예를 들어, 물건을 주문하기 위해 다음과 같은 폼을 사용할 수 있습니다:

``` html
<form action="http://example.com/order" method="POST">
  <input type="text" name="item" value="123">
  <input type="text" name="quantity" value="2">
  <input type="submit" value="주문">
</form>
```

위의 폼은 물건의 ID와 주문 수량을 **입력받아 서버로 전송하는 역할**을 합니다. <br> action 속성은 데이터를 전송할 서버의 URL을 지정하고, method 속성은 전송 방식을 나타냅니다. <br> 여기서는 **POST 방식**을 사용하고 있습니다. 사용자가 **폼을 제출**하면 입력된 데이터가 서버로 전송되고, 서버는 해당하는 물건을 찾아 주문을 처리한 후 응답을 반환합니다.

간단히 말해서, GET 방식은 **URL에 데이터를 포함**시켜 요청을 전달하고, <br> POST 방식은 **데이터를 별도**로 전송하여 요청을 전달합니다. <br> GET 방식은 주로 데이터를 **조회**할 때 사용되고, POST 방식은 데이터를 서버에 **제출하거나 변경**할 때 사용됩니다.

- 요청정보가 http body에 넣어져서 서버로 전달
- 전달되는 문자열의 내용이 주소에 노출되지 않음.
- 인코딩/디코딩의 작업이 별도로 필요
- 보안이 유지되어야 하는 데이터 전송
- 데이터의 길이가 긴 경우
- 바이너리 파일 전송(이미지, 파일첨부 등)


---

### CRUD(Create, Read, Update, Delete) 작업

글쓰기(Create): 글을 작성하여 게시판에 추가하는 작업입니다. 이 작업은 사용자가 입력한 데이터를 서버로 전송해야 합니다. 일반적으로는 **POST** 방식을 사용합니다. 사용자가 작성한 글의 내용을 서버로 전송하기 위해 폼을 사용하고, 폼을 제출할 때 POST 요청을 보내는 방식입니다.

글읽기(Read): 게시판에서 글을 읽는 작업입니다. 글을 조회하기 위해 서버에 요청을 보내는 것이므로 **GET** 방식을 사용합니다. 사용자가 특정 글을 클릭하거나 게시판 목록을 불러올 때, 해당 글에 대한 정보를 가져오기 위해 GET 요청을 사용합니다.

글수정(Update): 이미 작성된 글을 수정하는 작업입니다. 글 수정을 위해서는 해당 글의 내용을 서버로 전송해야 합니다. 이 역시 **POST** 방식을 사용합니다. 사용자가 수정한 내용을 서버로 전송하기 위해 폼을 사용하고, **폼을 제출**할 때 POST 요청을 보내는 방식입니다.

글삭제(Delete): 작성된 글을 삭제하는 작업입니다. 글 삭제를 위해 서버에 요청을 보내는 것이므로 GET 또는 POST 방식을 사용할 수 있습니다. 일반적으로는 POST 방식을 사용하여 삭제 요청을 전송합니다. 삭제할 글의 ID 등 필요한 정보를 POST 요청에 담아 서버로 전송합니다.

요약하자면, <mark>글쓰기 작업은 POST 방식</mark>으로 처리하는 것이 일반적이며, <mark>글읽기는 GET 방식</mark>을 사용합니다. 글수정은 POST 방식으로 수정된 내용을 전송하고, 글삭제는 POST 방식을 사용하여 삭제 요청을 전송하는 것이 보통입니다. 하지만, 실제로는 구현 방식에 따라 다를 수 있으므로 상황에 맞게 선택할 수 있습니다.


## 링크를 클릭하여 조회
```html
<a href="view.jsp?id=123">글 제목</a>
```
- GET 방식
- view.jsp는 글의 상세 내용을 보여주는 JSP 페이지입니다.
- id=123은 조회할 글의 식별자(ID)를 나타냅니다.
- 이 링크를 클릭하면 브라우저가
- view.jsp?id=123을 GET 방식으로 요청하여
- 해당 글의 상세 정보를 서버로부터 받아옵니다.


## 검색 폼 제출
```html
<form action="search.jsp" method="GET">
  <input type="text" name="keyword" placeholder="검색어를 입력하세요">
  <input type="submit" value="검색">
</form>
```
- GET으로 쓸때
- 사용자가 검색어를 입력하고 폼을 제출하면, 
- 입력된 검색어가 keyword 파라미터로 포함되어 
- search.jsp?keyword=검색어와 같은 형태로 GET 요청이 전송

```html
<div class="container mt-3">
  <h2>Block Level Buttons</h2>
  <p>If you have many block-level buttons, you can control the space between them with the .gap-* class:</p>
  <div class="d-grid gap-3">
    <button type="button" class="btn btn-primary btn-block" onclick="location.href='path/to/your/jsp/file1.jsp'">Full-Width Button</button>
    <button type="button" class="btn btn-primary btn-block" onclick="location.href='path/to/your/jsp/file2.jsp'">Full-Width Button</button>
    <button type="button" class="btn btn-primary btn-block" onclick="location.href='path/to/your/jsp/file3.jsp'">Full-Width Button</button>
  </div>
</div>
```


```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
  <div class="container">
    <h2 class="mt-4">회원가입</h2>
    <form action="insert.jsp" method="post">
      <div class="mb-3">
        <label for="username" class="form-label">아이디:</label>
        <input type="text" class="form-control" id="username" name="username" required>
      </div>
      <div class="mb-3">
        <label for="password" class="form-label">비밀번호:</label>
        <input type="password" class="form-control" id="password" name="password" required>
      </div>
      <div class="mb-3">
        <label for="name" class="form-label">이름:</label>
        <input type="text" class="form-control" id="name" name="name" required>
      </div>
      <div class="mb-3">
        <label for="email" class="form-label">이메일:</label>
        <input type="email" class="form-control" id="email" name="email" required>
      </div>
      <button type="submit" class="btn btn-primary">가입하기</button>
    </form>
  </div>

  <!-- Bootstrap JS (Optional) -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
```
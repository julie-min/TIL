# Query String 쿼리스트링
- 클라이언트가 웹서버에 서비스를 요청할때 추가로 전달하는 데이터
- 클라이언트가 서버에 정보를 요청할 때 사용하는 문자열

## 쿼리스트링의 규칙
1. name=value 형식으로 전달되며, 여러개의 name=value쌍이 있을때는 &를 구분자로 사용한다.
- `id=guest & name=Amy`
- name은 개발자가 정의하고, value는 사용자가 입력하는 값이다.

2. 영문자, 숫자, 일부 특수문자는 그대로 전달되고, 이를 제외한 나머지 문자는 %기호와 함께 16진수로 바뀌어 전달된다.
- `id=guest & name=%C8%AB%B1%B5`

3. 공백문자는 +기호로 변환되어 전달된다.

## form 태그
`<form action="서버프로그램 경로" method="요청방식>` <br>
action: 쿼리스트링을 처리할 서버프로그램 <br>
method: GET / POST

### 텍스트 입력상자 - 한줄
`<input type="text" name="변수이름" maxlength="숫자" size="숫자" value="문자열">`

### 텍스트 입력상자 - 여러줄
`<textarea cols="숫자" rows="숫자" name="변수이름"></textarea>`

### 체크박스
`<input type="checkbox" name="변수이름" value="문자열">`
```java
<input type="checkbox" name="hobby" value="sports">
<input type="checkbox" name="hobby" value="reading">
<input type="checkbox" name="hobby" value="traveling">
```

### 라디오버튼
`<input type="radio" name="변수이름" value="문자열">`
```java
<input type="radio" name="gender" value="male">
<input type="radio" name="gender" value="female">
```

### 펼침목록
```java
<select name="변수이름">
    <option value="문자열">항목이름
    <option value="문자열">항목이름
</select>
```
### 전송버튼
`<input type="submit" value="문자열"`

### 초기화버튼
`<input type="reset" value="문자열" />`



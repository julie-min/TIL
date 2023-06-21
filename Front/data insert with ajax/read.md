# ajax 외부데이터 저장

### 외부에서 받은 데이터를 <br> 웹사이트에 비동기로 보여주고 <br> 그 데이터도 저장을 해보자.


## 1. 디비버 mysql table 만들기
``` sql
CREATE TABLE `drug` (
    `id` VARCHAR(256) DEFAULT NULL,
    `name` VARCHAR(256) DEFAULT NULL,
    `company` VARCHAR(256) DEFAULT NULL,
    `code` VARCHAR(256) DEFAULT NULL
);
```
- 주의할 점
- 따옴표가 아닌 백틱이다.
- 열 이름의 오타가 있으면 절대 못찾는다.


## 2. 모카루 json 파일 받기
https://mockaroo.com/
- 주의할 점
- null values가 포함되면 오류 가능성이 높다
- 열 이름을 반드시 맞춰준다.
- 해당 파일을 Web Content > data 폴더에 넣어놓는다.

## 3. jsp 파일 작성
1) head : cdn 연결
2) body 만들기 : id필요
3) head - script 입력 ajax

## 4. Ajax 작성
1. body부터 읽어들여요.
2. 버튼을 클릭하면 함수 실행
3. 비동기적으로 새로고침없이 실행할래.
4. 여기 파일을 사용하겠다.
5. 응답한다면 그걸 doc이라고 저장할게.
6. 그걸 배열로 만들어.
7. 배열을 하나씩 가져와
8. 각 배열의 id 속성을 id 변수에 넣자
9. 각 배열의 name 속성을 name 변수에 넣자
10. 이런식으로 해당 데이터파일의 속성을 변수로 맵핑해준다.
11. body 결과박스에 새로운 내용을 추가하자.
12. 그리고 추가로 데이터베이스에도 넣을거야. 새로운 비동기 시작
13. 사용할 파일은 이거야
14. ajax요청을 동기적으로 수행해. 순서대로 (db에 순서대로 저장 원해.)
15. 뭘 보낼거냐면.. id, name 같은 데이터를 보낼거야
16. 응답한다면 콘설에 출력
17. 실패한다면 콘솔에 출력




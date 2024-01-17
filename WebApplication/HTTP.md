# HTTP (HyperText Transfer Protocol)
- 웹에서 클라이언트인 '브라우저'와 '서버'가 통신할 때 사용하는 통신 규약이다.

- 일반적으로 웹 클라이언트 : 브라우저를 의미한다. (크롬, 파이어폭스, 사파리, 엣지..)

<br>

## HTTP 특징
1. 비연결성 Connectionless <br>
브라우저가 특정 문서를 요청하는 순간만 잠깐 서버와 연결됐다가 연결이 끊어진다.

2. 무상태 Stateless <br>
웹서버가 웹클라이언트의 상태정보를 유지하지 않는 것을 의미 <br>
특정 목적을 위해 브라우저로 전송된 데이터를 유지하지 않는다는 것이다.

<br>

## URL (Uniform Resource Locator)
> http: // localhost : 8080 / BoardWeb / board / login.html
1. `http:` 프로토콜
2. `//` 프로토콜 구분자
3. `localhost:` 웹서버가 설치된 호스트 컴퓨터, localhost는 현재 사용중인 컴퓨터라는 뜻
4. `8080` 호스트 컴퓨터에서 8080 포트를 사용하는 서버
5. `BoardWeb` 8080 포트의 서버에서 실행되는 웹 어플리케이션 이름이 BoardWeb이다.
6. `board` 디렉터리
7. `login.html` board 디렉토리에 있는 파일

<br>

***


## HTTP 요청 프로토콜 구조
- start-line
- message-header
- CRLF (Carriage Return Line Feed) 한줄 공백
- message-body
  
## start-line
요청과 관련된 세가지 핵심정보 <br>
<mark>① 요청방식 ② 요청URL ③프로토콜/버전</mark>

<요청방식, method> <br>
요청방식이란, 브라우저가 웹서버에 요청을 전달하는 방식

| 요청 방식 | 의미 |
| :---: | :---: |
| GET | 조회(상세,목록) |
| POST | 등록 |
| PUT | 수정 |
| DELETE | 삭제 |

<요청 URI> <br>
URI는 URL에서 포트번호 이후의 문자열을 의미한다. <br>
위 예제에서는 8080 이후 <br>
`BoardWeb/board/login.html`

<프로토콜/버전> <br>
일반적으로 웹에서 사용하는 HTTP 프로토콜은 1.1버전을 사용한다. 따라서 사용자가 URL 요청을 서버에 전송하면, start-line에는 다음과 같은 정보가 자동으로 설정된다. <br>
`GET BoardWeb/board/login.html HTTP/1.1`

## message-header
키(key):값(value) 형태로 정보가 설정 <br>
- 브라우저가 처리할 수 있는 문자열 인코딩 목록
- 브라우저의 이름과 버전 정보
- 브라우저가 처리할 수 있는 압축 방식

## message-body
사용자가 입력한 정보가 설정됨 <br>

***
## HTTP 응답 프로토콜
- status-line
- message-header
- CRLF
- message-body

## status-line
<mark>① 프로토콜버전 ② 상태코드 ③상태메시지</mark>

<상태코드>

| 상태코드 | 의미 |
| :---: | --- |
| 200 | 정상적인 처리 |
| 403 | 브라우저가 요청한 파일에 접근할 수 없음 |
| 404 | 브라우저가 요청한 파일이 서버에 없음 |
| 405 | 브라우저가 요청한 방식을 서버에서 지원하지 않음 |
| 500 | 서버 처리하는 과정에서 예외가 발생함 |


<상태메시지>

| 상태코드 | 상태메시지 |
| --- | --- |
| 200 | OK |
| 403 | Forbidden |
| 404 | Not Found |
| 405 | Method Not Allowed |
| 500 | Internal Server Error |

***
### GET 요청
`<form action="login process" method="get">`
<br>
GET 요청방식은 사용자가 입력한 정보가 쿼리 문자열로 외부에 노출되기 때문에 로그인 같은 기능에서는 절대 사용해서는 안된다. POST로 사용해야함

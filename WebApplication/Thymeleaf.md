# Thymeleaf

템플릿 엔진이란, <br>
HTML과 데이터를 결합한 결과물을 만들어주는 도구로서, <br>
스프링부트에서는 JSP가 아닌 타임리프 사용을 권장
<br>
웹브라우저는 타임리프의 속성인 `th:`를 알지 못하기 때문에 순수 HTML으로만 화면을 구성한다.<br>
<br>

## 타임리프 라이브러리 추가

```java
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
```
<br>

## 타임리프의 사용하기
1. Thymeleaf + Bootstrap
   
```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>블로그</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css">
</head>
```

- 주의점: html 파일 헤드부분에 작성하며, JS파일에는 적용하지 않는다.

2. 표현식

| 표현식  | 설명 |
| ------------ | ------------ |
| ${ }        | 변수값 |
| #{ }   | 속성파일, 외부자원|
| @{ }  | URL 링크 |
| *{ }   | 객체 |




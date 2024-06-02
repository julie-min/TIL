# StringBuffer 문자열 변경

- append : 객체 생성 + 문자열 생성
- toString : 자료형 변환
  ```java
  StringBuffer sb = new StringBuffer();
  sb.append("hello");
  sb.append(" ");
  sb.append("Java");
  String result = sb.toString();
  System.out.println(result);
  ```

# StringBuilder
- 단일 스레드에서 Buffer보다 빠르다.
- 안전성을 요구하는 멀티스레드 환경에서는 Buffer가 좋다.<br>
  => 안전성: Buffer / 성능: Builder


---

## insert
```java
StringBuffer sb = new StringBuffer();
sb.append("Java");
sb.insert(0,"hello");
System.out.println(sb.toString());
```
특정 위치에 문자열을 삽입



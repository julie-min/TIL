# primitive 원시자료형
- int, long, double, float, boolean, char
- new 키워드로 객체 생성 불가
- literal 로만 값을 세팅

### 원시자료형의 Wrapper Class
- int : Integer
- long : Long
- double : Double
- float : Float
- boolean : Boolean
- char : Char

# String 문자열 내장 메서드
- equals : 두 문자열의 비교 (==가 아님)
  `a.equals(b)`

- contains: 문자열이 포함되어 있는지의 여부
  `a.contains("Java")`

- indexOf: 문자열이 시작되는 위치 리턴
  <br> 유의사항: 인덱스는 0부터 시작된다.
  `a.indexOf("Java")`
  문자의 위치를 숫자로 알려준다.

- charAt : 문자열에서 특정 위치의 문자를 리턴
  숫자를 물어보면 해당 문자 1개를 알려준다.
  `a.charAt(6)`

- replaceAll : 문자열을 바꾼다.
  `a.replaceAll("Java","Jaba")`

- substring : 문자열 중 특정 부분만 뽑아낸다.
  `a.substring(0, 4)`
  범위를 지정해서 문자 여러개가 나온다.
  단, 끝은 포함이 안된다.

- toUpperCase : 문자열을 모두 대문자로 변경
- toLowerCase : 문자열을 모두 소문자로 변경

- split : 구분자를 기준으로 문자열로 잘라준다.
  `String[] result = a.split(":")`

---

## 문자열 포매팅
- 문자열 안의 특정한 값만 교체해서 사용할 경우, 값을 삽입
``` java
int number = 10;
String day = "three";
System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
```

- 문자열 포맷 코드
- **String: %s**
- character(문자1개) : %c
- int : %d
- float : %f

```java
System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples" 출력
System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234" 출력
```

- 포매팅된 문자열을 출력하기 위해서는 printf 메서드를 사용해야한다.
- `System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력
`

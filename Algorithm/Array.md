# Array 배열
- 배열이란 자료형의 종류가 아닌, 자료형의 집합
- 배열의 길이는 고정되어있다.<br>
`String[] weeks = new String[7];`

- 배열에 접근하는 방법: for문 <br>
```java
String[] weeks = {"월","화","수","목","금","토","일"};
for (int i = 0; i <weeks.length ; i++) {
    System.out.println(weeks[i]);
}
```
# List : 크기가 정해져있지 않음
- 크기가 정해져있지않고,
- 동적으로 변한다.


### ArrayList
- `ArrayList pitches = new ArrayList();`
- `ArrayList<String> pitches = new ArrayList<>();`

- 값을 넣을때: `pitches.add("x");`
- 값을 출력할때: `pitches.get(1);`
- 담긴 갯수: `pitches.size();`
- 있는지 확인: `pitches.contains("140")`
- 삭제: 지정 또는 번호 가능 `pitches.remove(0)` `pitches.remove("140")`
- 정렬: `pitches.sort(Comparator.naturalOrder());` <br>
- `pitches.sort(Comparator.reverseOrder());`
  

<br>
이미 문자열 배열이 있는 경우, 리스트에 넣을때 asList를 사용한다.

```java
String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
```
---

<br>
리스트를 콤마+문자열로 반환하는 방법

```java
ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
    String result = String.join(",", pitches);
    System.out.println(result);  // 138,129,142 출력
```

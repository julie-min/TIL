# Stream API
- Java8에서 추가된 기능
- 컬렉션 데이터를 선언형으로 쉽게 처리
- 루프문을 사용하지 않아도 되며, 중첩을 사용할 필요 없음.
- 멀티 쓰레드 구현 없이 사용

---

# Stream 특징
- 내부 반복을 통한 작업을 수행한다.
- 단 한번만 사용이 가능하다.
- 원본 데이터를 변경하지 않는다.
- 필터-맵 기반의 API를 사용하여 지연 연산을 통해 성능을 최적화 시킨다.
- 손쉬운 병렬처리가 가능하다.


# Stream API의 동작 흐름
1. 스트림을 생성한다.
2. 스트림의 중개연산 (변환) => 필터
3. 스트림의 최종연산 (사용) => 맵

# 스트림 생성

```java
ArrayList<Integer> list = new ArrayList<Integer>();


list.add(4);
list.add(2);
list.add(3);
list.add(1);

// 컬렉션에서 스트림 생성

Stream<Integer> stream = list.stream();

// forEach() 메소드를 이용한 스트림 요소의 순차 접근

stream.forEach(System.out::println);
```

```java
String[] arr = new String[]{"넷", "둘", "셋", "하나"};

 

// 배열에서 스트림 생성

Stream<String> stream1 = Arrays.stream(arr);

stream1.forEach(e -> System.out.print(e + " "));

System.out.println();

 

// 배열의 특정 부분만을 이용한 스트림 생성

Stream<String> stream2 = Arrays.stream(arr, 1, 3);

stream2.forEach(e -> System.out.print(e + " "));
```

# 스트림의 중개연산 (intermediate operation)
- 스트림에 의해 생성된 초기 스트림은 중개 연산을 통해 또 다른 스트림으로 변환된다.
- 중개연산은 연속으로 연결하여 사용할 수 있다.

## 중개연산의 메소드
1. 스트림 필터링: filter, distinct
2. 스트림 변환: map, flatMap
3. 스트림 제한: limit, skip
4. 스트림 정렬: sorted
5. 스트림 연산 확인: peek


## 스트림 필터링
- filter: 주어진 조건에 맞는 요소로 구성된 새로운 스트림을 반환
- distinct: 중복된 요소 제거

```java
IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

// 스트림에서 중복된 요소를 제거함.
stream1.distinct().forEach(e -> System.out.print(e + " "));
System.out.println();

 
// 스트림에서 홀수만을 골라냄.
stream2.filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
```

## 스트림 변환
- map: 스트림 요소를 함수의 인수로 전달하여 그 결과값을 반환
- flatMap: 해당 요소들이 배열이라면 각 요소의 반환값을 새로 합친 새로운 스트림 반환

```java
Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");

stream.map(s -> s.length()).forEach(System.out::println);
```

## 스트림 제한
- limit: 스트림의 첫번째 요소부터 전달된 개수만큼의 요소만으로 이루어짐
- skip: 스트림의 첫번째 요소부터 전달된 개수만큼을 제외한 요소로 이루어짐
  
```java
IntStream stream1 = IntStream.range(0, 10);
IntStream stream2 = IntStream.range(0, 10);
 
stream1.skip(4).forEach(n -> System.out.print(n + " "));
System.out.println();

stream2.limit(5).forEach(n -> System.out.print(n + " "));
System.out.println();
```

## 스트림 정렬
- sorted: 비교자를 이용하여 정렬
- 이때, 비교자를 전달하지 않으면 기본적으로 사전순으로 정렬한다.
```java
Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");


stream1.sorted().forEach(s -> System.out.print(s + " "));
System.out.println();


stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
```

## 스트림 연산 확인
- 원본 스트림에서 요소를 소모하지 않으므로, 주로 연산과 연산 사이에 결과를 확인할 때 사용
- 디버깅용

# 스트림의 최종연산 (terminal operation)
- 최종 연산을 통해 각 요소를 소모하여 결과 표시
- 지연되었던 모든 중개 연산들이 최종 연산 시에 모두 수행
- 최종 연산시, 모든 요소를 소모한 스트림은 더이상 사용할 수 없게 된다.

## 최종연산 메소드
- 요소의 출력: forEach
- 요소의 소모: reduce
- 요소의 검색: findFirst, findAny
- 요소의 검사: anyMatch, allMatch, noneMatch
- 요소의 통계: count, min, max
- 요소의 연산: sum, average
- 요소의 수집: collect


# 요소의 출력
- forEach: 각 요소를 소모하여 수행
- 반환타입은 void
- 모든 스트림의 모든 요소를 출력하는 용도로 많이 사용됨
```java
Stream<String> stream = Stream.of("넷", "둘", "셋", "하나");

stream.forEach(System.out::println);
```


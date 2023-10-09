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


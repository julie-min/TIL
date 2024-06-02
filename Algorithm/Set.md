# Set

## HashSet
- 중복X
- 저장순서 X => 순서를 원한다면 LinkedHashSet
- 빠른 검색이 요구될 때 유용
- 빠르게 검색하되, 순서가 중요하지않을때
- 인덱싱으로 값을 얻을 수 없다.


## TreeSet
- HashSet보다는 느리다.
- 중복X 
- 자동정렬 O
- 정렬된 순서로 접근해야할때

## HashMap
- 빠른검색 가능
- 순서가 없음

## TreeMap
- 데이터를 key를 기준으로 정렬, 반복

---

## 교집합 구하기

```java
HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

HashSet<Integer> intersection = new HashSet<>(s1);
intersection.retainAll(s2);
System.out.println(intersection);
```

## 합집합 구하기
```java
HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

HashSet<Integer> union = new HashSet<>(s1);
union.addAll(s2);
System.out.println(union);
```

## 차집합 구하기
```java
HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

HashSet<Integer> substract = new HashSet<>(s1);
substract.removeAll(s2);
System.out.println(substract);
```
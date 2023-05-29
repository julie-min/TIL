![7a52ea087adb4c988f935a852c5ca009](https://github.com/julie-min/TIL/assets/130271406/b994e95c-7072-45e7-9420-82d545a45e13)

# Java Collection Class

| Collection   | 중복   | 순서유지 | 정렬 방식 |
| ------------ | :----: | :------: | :------: |
| Array        |   O    |    O     |    -     |
| ArrayList    |   O    |    O     |    -     |
| LinkedList   |   O    |    O     |    -     |
| HashMap      |   X    |    X     |    -     |
| HashSet      |   X    |    X     |    -     |
| Iterator     |   X    |    O     |    -     |
| TreeSet      |   X    |    O     | 오름차순 |
| TreeMap      |   X    |    O     | 키 정렬  |

<br>

> 문법 외우기

| Collection   | 객체 생성문법 |
| ------------ | ------------ |
| Array        | `DataType[] arrayName = new DataType[length];` |
| ArrayList    | `ArrayList<DataType> listName = new ArrayList<>();` |
| LinkedList   | `LinkedList<DataType> listName = new LinkedList<>();` |
| HashMap      | `HashMap<KeyType, ValueType> mapName = new HashMap<>();` |
| HashSet      | `HashSet<ElementType> setName = new HashSet<>();` |
| Iterator     | `Iterator<ElementType> iteratorName = collectionObject.iterator();` |
| TreeSet      | `TreeSet<ElementType> setName = new TreeSet<>();` |
| TreeMap      | `TreeMap<KeyType, ValueType> mapName = new TreeMap<>();` |



## Array
1. Store multiple values in a single variable
2. Define the variable type with square brackets
3. `~~.length` method 사용 가능

`String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};` <br>
`int[] myNum = {10, 20, 30, 40};`

## ArrayList
1. resizable array : 사이즈가 특정되지 않은 리스트. 동적으로 크기를 조정함.
2. 모든 타입의 객체 저장 가능
3. 자주 요소를 추가, 삭제, 검색해야할 때
4. 크기가 자동으로 조절되는 확장 가능한 상자
5. 중복된 요소를 허용하며,
6. 입력된 순서를 유지한다.

```java
import java.util.ArrayList; 
// import the ArrayList class 

ArrayList<String> cars = new ArrayList<String>(); 
// Create an ArrayList object
```

- 다양한 메소드 사용가능 <br>
`add()` `get()` `set()` `remove()` `clear()` `size()` 

- for loop 와  for-each loop 에서 많이 쓰인다.
```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
```

---

## LinkedList
1. 이중 연결 리스트를 사용
2. 각 요소는 이전, 다음 요소에 대한 참조가 있어 요소 간의 빠른 삽입/삭제 가능
3. 중복을 허용한다.
4. 순서를 유지한다.

## ArrayList vs LinkedList <br>
ArrayList 요소가 추가되면 array에 보관한다. <br> array가 충분치 않으면, 새로운 큰 어레이로 <mark> 대체 </mark> 되며, <br>기존 old array는 삭제된다.

반면 LinkedList는 아이템을 <mark> containers</mark>에 보관한다. 그 컨테이너들이 서로 연결되어있다.


LinkedList가 추가/삭제시 참조만 변경하면 되므로 ArrayList보다 비용이 덜 소요된다. 그러나 이전 요소부터 순차적으로 접근해야 되기 때문에 접근 시간은 더 오래 걸린다.

ArrayList 가 <mark>더 많은 메모리</mark>를 사용한다. 

#### 사용 시나리오:
ArrayList: 데이터의 접근이 빈번하고 순차적인 추가 및 삭제가 적은 경우에 적합합니다.
LinkedList: 요소의 추가 또는 삭제가 자주 발생하며 순차적인 데이터 접근보다는 요소 간의 연결을 더 중요시하는 경우에 적합합니다.


#### 간단한 예시:

ArrayList: 학생 목록을 저장하고 특정 인덱스의 학생 정보에 빠르게 접근해야 할 때 사용합니다.
LinkedList: 작업 대기열에서 작업을 추가하거나 제거하며 <mark>작업 간의 우선순위를 유지해야 할 때</mark> 사용합니다.

---

## HashMap
- 아이템을 `key/value` pair(쌍) 으로 저장
- key의 hashcode를 사용하여 빠르게 검색
- 중복 미허용 
- 순서 유지

```java
import java.util.HashMap; 
// import the HashMap class

HashMap<String, String> capitalCities = new HashMap<String, String>();
```
매핑된 쌍을 통해 그 페어값을 찾고자 할 때 <br>
ex. 학생의 이름과 성적을 매핑하는 성적표 <br>
홍길동을 찾으면 홍길동이 안나오고, 홍길동의 성적이 나옴.

---

## HashSet
- 중복 미허용
- 순서 미유지
- 로또번호 생성기

```java
import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();
```
---


## TreeSet
- 중복 미허용
- 순서 유지
- 자동으로 오름차순된다.
- 주로 정렬된 데이터를 유지하고자 할 때

```java
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
```
---

## TreeMap
- key+value의 키값쌍
- 중복 미허용
- 순서 유지
- Key를 기준으로 오름차순 정렬
- 그러니까 왼쪽 요소를 기준으로 오름차순

```java
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> students = new TreeMap<>();
        
        students.put("Alice", 90);
        students.put("Bob", 80);
        students.put("Charlie", 95);
        students.put("David", 85);
        
        for (String name : students.keySet()) {
            int score = students.get(name);
            System
```
```java
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Orange");
        
        System.out.println(map); 
        // 출력: {1=Banana, 2=Orange, 3=Apple}
    }
}
```
---

## Iterator
- 'iterating' is the technical term for looping
- 리스트의 요소들을 하나씩 차례대로 만나면서 처리한다.
- 정해놓은 메소드 (루프문)에 의해 어떤 처리를 차례대로 한다는 뜻
- hasNext(): 다음 요소의 존재 여부를 확인하고, 반환값은 참거짓
- next() 다음요소 반환
- hasNext()가 거짓이 되면 순회종료
- 리스트의 모든 요소를 출력하거나, 집합의 중복을 제거하고 유일한 요소만 처리하는 등의 작업이 가능하다.

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
}
```

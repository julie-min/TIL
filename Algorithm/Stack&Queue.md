# Stack
- 프링글스통
- Last In First Out
- 입출력시 순서가 바뀌는 것이 특징이다.
- LinkedList로 구현하는 것이 적합

```java
Stack<String> stack = new Stack<>();

stack.push("0"); // 저장
stack.peek(); // 맨위보기(꺼내진않음)
stack.pop(); // 맨위꺼내기(없어짐)
stack.remove(0); // 순서상관없이 지정해서 삭제=> 첫번째꺼 삭제가능
stack.size(); //갯수세기
stack.indexOf("홍길동"); //위치번호
stack.set(0,"임길동"); // 순서상관없이 지정해서 갈아끼운다.

while(!stack.empty()) {
    System.out.println(st.pop());
}
// 비어있지 않다면, 맨위꺼내는 것을 반복
// 즉, 안비어있으면 끝에서부터 꺼내라(넣었을때의 역정렬)
```

---

# Queue
- 종이컵 디스펜서
- First In First Out 선입선출
- 인큐, 디큐
- 데이터가 나오는 곳: 프런트
- 데이터를 넣는 곳: 리어

```java
LinkedList<String> queue = new LinkedList<String>();
queue.offer("0"); // 객체 저장
queue.peek(); // 삭제없이 읽기만하기
queue.remove(0); // 꺼내기
queue.poll(); // 꺼내기
```

---

## 예시

```java
public static Stack back = new Stack();

public static void goURL(String url){
    back.push(url);
    if(!forward.empty())
        forward.clear();

public static void goForward() {
    if(!forward.empty())
        back.push(forward.pop());
}


public static void goBack() {
    if(!back.empty())
        forward.push(back.pop());
}
}
```
---

## Priority Queue
- 저장한 순서에 관계없이 우선순위(priority)가 높은 것부터 꺼내게 된다는 특징
- null은 저장할 수 없다.
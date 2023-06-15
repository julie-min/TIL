# Method
자바 메서드 사용법


<br>

## 객체 지향의 2대원칙
1. 응집도는 높아야한다.
2. 결합도는 낮아야한다.

> 응집도란, 하나의 클래스에서 하나의 역할만 하는 것
> 결합도란, 다른 부품을 쓸수 있는지에 대한 여부


메서드는 방법, 기능이다. <br>
객체는 부품을 조립하는 것이다. <br>
방법에 의해 기능을 정의한다. <br>

## 메서드의 3대 요소
1. 메서드의 리턴타입
   - void
   - 반환타입

2. 메서드의 입력값
   - 메서드명 (입력값, 입력값 ...)
   - 자바는 입력값의 순서가 중요하다 (O)
   - 자바는 입력값의 갯수가 중요하다 (O)
<br>
3. 메서드의 이름


## 메서드의 형식
1. public + [반환여부/타입] + [메소드이름] (입력값) { 처리할 기능 나열 }
<br> <br>

2. 입력값의 종류, 개수, 순서가 다르면 자바는 메소드 이름을 동일하게 쓸 수 있다.

3. 입력값이 다르면 다른 메소드로 인식한다.

4. 반환이 없는 경우는 void

5. 반환이 있는 경우는 맨끝에 return 값


### 1) 반환여부/타입
int + int = int <br>
double + int = double <br>
String + int = String <br>
String + String = String <br>
{ } 사이에 return을 넣어준다.

void 는 return 과 함께 못옴
<br>


### 2) 입력값, 파라미터, 매개변수
전달된 값을 저장하는 **매개** 역할을 수행

<br><br>
## 여러 클래스에서 불러오기


### 예시1번
1. 계산기 클래스
   - 클래스명: 계산기
   - 메서드: 더하기, 곱하기, 빼기...
2. 카페 클래스 (메인)
   - 클래스명: 카페


- 메인 클래스에서 계산기 메서드 불러오기 <br>
  ```java
  계산기 cal = new 계산기();
  ```
해당 불러올 메서드가 있는 클래스명을 써주는 것
<br>
- cal 이라는 카페에서 사용할 메서드 생성한 것
- 카페에서 반환값 생성
  ``` java
  cal.더하기(2,3);
  cal.곱하기(2,3);
  int result = cal.빼기(3,2);
  System.out.println(result);
  ```


### 예시 2번
- 반환값이 배열일 때
```java
public ArrayList<Integer> getEven(int[] num) {
    System.out.println(Arrays.toString(num));
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int x : num) {
        if(x %2 == 0) {
            list.add(x);
        }
    }
}
```
# Structure of Class
> 클래스의 개념

- 객체를 만들어내기 위한 설계도
- 객체를 생성하기 위한 템플릿
- 이 객체는 메모리에 할당된 인스턴스
  
- 필드 + 메소드
  - 필드 : 변수
  - 메소드 : 명령문

- 객체 : 클래스로 선언된 변수 <br>
  즉, 객체는 클래스명을 사용해서 만든다.
- 인스턴스 : 객체가 메모리에 할당된 상태 <br>
  런타임에 구동되는 `객체` <br>
  `= new Abc();` <br>
  


<br>

![image](https://github.com/julie-min/TIL/assets/130271406/4e8f326e-f7ea-4e94-b4ce-4256b2255443)

![image](https://github.com/julie-min/TIL/assets/130271406/c6c75b28-12df-4b6a-8c7e-3a2b82897a8d)

<br>

---

## 필드 Field
- 선언된 형태는 변수와 비슷하지만 필드를 변수라고 부르지는 않는다.
- 객체의 데이터, 상태
- 필드는 메소드 전체에서 사용된다.
  - 메소드 밖에서 선언 : 필드
  - 메소드 안에서 선언 : 지역변수 (Local variable)
- 필드 선언은 중괄호 블록 어디에서든 가능
- 메소도 앞, 뒤 어디든 가능하다.
- 형식1 : `타입` + `필드` 
- 형식2 : `타입` + `필드` + `=` `초기값`

```java
String company = Tesla;
int Speed = 300;
int Speed;
boolean engineStart;
```
`=` `초기값` 설정이 안되어있다면<br>
자동으로 기본 초기값으로 설정한다.<br>
`null` `0` `false`
  
<img width="687" alt="image" src="https://github.com/julie-min/TIL/assets/130271406/4340116c-e2e8-45f7-b16f-cdf7553b4e5d">

- 클래스 외부에서 필드를 사용할 때, <br>
  객체를 생성해서 사용해야한다.
  <br>객체가 존재하지않으면 필드도 존재하지 않기 때문이다.

<img width="602" alt="image" src="https://github.com/julie-min/TIL/assets/130271406/961d994f-9e5f-42d9-9c43-b52207933ab7">

- 변수는 생성자/메소드 내부에서만 사용가능
- 필드는 모든 생성자와 메소드에서 사용가능
- 외부에서 필드를 사용하려면 객체생성
- spped 필드는 Car클래스에서 생성자, 메소드로 변경 가능하다.


```java
public class Car {
   String company = "KIA"
   String color = "black"
   int maxSpeed = 280;
   int speed; // 0으로 초기화 됨
}
```

```java
public class Person {
   private Car car;

   public void driveCar() {
      car = new Car();
      car.speed = 10;
   }

   public static void main(String[] args) {
      Person person = new Person();
      person.driveCar();
   }
}
```


---

## 메소드 Method
- 객체의 기능, 수행문
- 선언부 + 구현부
- 선언부 : `접근제한자`+`반환타입`+`이름`
- 입출력에 따라 형태 변화
 1) 출력(반환)의 유무 <br>
    - 반환X  :  `void` <br>
    - 반환O  :  반환값타입 (`int`,`double`) <br>
      반환값이 있으면 반드시 return문 작성.

1) 입력의 유무 <br>
   - 입력X : 매개변수가 필요없다. 메소드명`();`
   - 입력O : 매개변수가 필요하다. `(int a, int b)` <br>
     어떤 재료를 가지고 반환할지 그 입력을 표현


  <br>

  ![화면 캡처 2023-06-04 024729](https://github.com/julie-min/TIL/assets/130271406/d69463b0-78c8-4713-ba19-d82d2c8d4a49)
  <br>

1) 입력 X 출력 X <br>
   `void` + `메소드명`+ `()`+ {`수행문`}<br>
   `public` `void` `clearCache` `()`<br>
   `void` `poweron` `()` <br>
   void + 참조변수.메소드명();

2) 입력 O 출력 X <br>
   `void`+`메소드명`+(`매개변수타입`+`매개변수`)+{`수행문`}<br>
   `public` `void` `displayInfo` `(String` `name)`<br>
   void +참조변수.메소드명(값);<br>
   입력은 받지만 그 결과를 외부로 반환하지 않고,<br> 내부에서 처리하거나 다른 작업을 수행하는 목적

3) 입력 X 출력 O <br>
   `반환타입`+`메소드명`+`()`+{`수행문`}<br>
   `public` + `String` `getCurrentTime` `()`<br>
   입력없이 출력만 한다.

4) 입력 O 출력 O <br>
   `반환타입`+`메소드명`+(`매개변수타입`+`매개변수`)+{`수행문`}<br>
   `public` `int` `Sum` `(int num1`, `int num2)`<br>

---

## 클래스 간 객체 접근방법
```java
public class Car {
   private int speed;

   public void setSpeed(int speed) {
      this.speed = speed;
   }

   public int getSpeed() {
      return speed;
   }
}
```
```java
public class Other {
   private String color;

   public void setColor(String color) {
      this.color = color;
   }

   public String getColor() {
      return color;
   }

   public void useSpeed() {
      Car useCar = new Car();
      int carSpeed = useCar.getSpeed();
      System.out.println("속도: " + carSpeed);
   }
}
```





<br><br>
> 출처 <br>
> http://wiki.hash.kr/index.php/%ED%95%84%EB%93%9C_%28%EC%9E%90%EB%B0%94%29 <br>
> https://runestone.academy/ns/books/published/apcsareview/JavaBasics/Summary.html
> https://kephilab.tistory.com/48
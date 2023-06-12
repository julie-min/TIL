# Enums 열거형

## Enum is short for <mark>"enumerations"</mark>, which means "specifically listed".

- 고정된 값들의 집합을 나타냄
- 상수를 정의하는 데이터 유형
- 한정된 선택지를 가지는 변수를 표현한다.
- 주로 대문자로 표시한다.
- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
- Enum 도 Class의 일종이다.
- 클래스, 인터페이스 대신에 사용된다.
  
  <br>
``` java
enum Level {
LOW,
MEDIUM,
HIGH 
}
```

``` java
Level myVar = Level.MEDIUM;
```

- 열거 상수는 대문자로 작성한다.
- 각 상수는 쉼표로 구분한다.
- 선언된 순서대로 0부터 인덱스 부여된다.

``` java
public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
        
        if (today == Day.SATURDAY || today == Day.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}
```

```java
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}
```

[enum클래스명] + [변수명] = [클래스명].상수;

---

```java
public enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}
```
```java
public class Main {
    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;
        
        switch (currentSeason) {
            case SPRING:
                System.out.println("It's spring!");
                break;
            case SUMMER:
                System.out.println("It's summer!");
                break;
            case AUTUMN:
                System.out.println("It's autumn!");
                break;
            case WINTER:
                System.out.println("It's winter!");
                break;
        }
    }
}
```
### ENUM 클래스에서 정해진 상수들을 열거한다.
### Main 클래스에서 Switch-case 문으로 상수에 맞는 구문을 호출한다.
### Main 클래스에서 객체를 초기화할때
`Season currentSeason = Season.SUMMER;` <br>
### 이런식으로 case를 지정해준다.

---

## Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that <mark>you know aren't going to change</mark>, like month days, days, colors, deck of cards, etc.

---

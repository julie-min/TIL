# Encapsulation, 캡슐화

- 데이터와 메서드를 하나의 단위로 묶는 것
- 객체의 내부 데이터로 직접적인 접근을 제한하여, 메서드를 통해 데이터를 보호하고 관리하는 방법

## 캡슐화를 구현하기 위한 방법
1. 접근제어자<br>
   `private` `public` `protected`를 통해 외부에서의 직접적인 접근을 제한한다.

2. Getter & Setter <br>
   `Getter` 멤버 변수의 값을 반환
   `Setter` 멤버 변수의 값을 설정

3. 데이터 은닉

---

### The get method returns the variable value, <br> and the set method sets the value.

## Syntax for both is that they start with either <mark>get or set</mark>, followed by the name of <mark>the variable</mark>, <mark>with the first letter in upper case</mark>

``` java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
## Class attributes can be made read-only (if you only use the get method), <br> or write-only (if you only use the set method)

<br>
내가 메소드 접근 제한을 걸고
read-only
write-only를 만들 수 있는 방법이다.

---

## Getter와 Setter 만드는 방법
- private으로 선언된 필드 이름을 기반으로 작성된다.
- ex) private String name; 이라면 getName, setName이 되는 것

```java
public String getName() {
    return name;
}
```

```java
public void setName(String newName) {
    name = newName;
}
```

## Example
```java
public class Person {
    private String name;
    private int age;

    // Getter 메서드
    public String getName() {
        return name;
    }

    // Setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    // Getter 메서드
    public int getAge() {
        return age;
    }

    // Setter 메서드
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Setter를 사용하여 필드 값 설정
        person.setName("John");
        person.setAge(25);

        // Getter를 사용하여 필드 값 읽기
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
```

main 메서드에서 객체를 설정해주는 것은 잊지말자.

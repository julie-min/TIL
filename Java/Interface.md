# Interface 인터페이스

- 객체의 동작을 정의하는 추상화된 개념
- 인터페이스의 목적? <br>
  클래스 간의 결합도를 낮추는 것 <br>
  클래스 간의 의존성을 줄인다.
- 클래스를 사용하는 클라이언트 코드는 인터페이스를 통해서만 클래스와 상호작용 하게되므로, <br>
  클래스의 내부 구현에 대한 세부정보를 숨길 수 있습니다. 이는 코드의 모듈화와 유지보수성을 향상시킬 수 있는 장점을 제공합니다.


  ### 인터페이스는 직접적으로 객체를 생성할 수 없다. 그러므로 바디도 없고, 생성자도 없다.


```java
// Vehicle.java
public interface Vehicle {
    void start();
    void stop();
}

// Car.java
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
    
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
    }
}
```

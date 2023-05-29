# Thread 스레드

- 멀티 작업을 동시에
- Java의 멀티스레드 프로그래밍
- 여러 작업을 병렬로 실행가능
  
## Thread methods
1. start()
2. run() 스레드가 실행되는 로직을 정의
3. sleep() 일시정지
4. join() 스레드의 종료를 기다리게 함
5. interrupt() 작업중단

```java
public class Main {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(new CountdownTask());
        Thread messageThread = new Thread(new MessageTask());

        countdownThread.start();
        messageThread.start();
    }
}

class CountdownTask implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Countdown: " + i);

            try {
                Thread.sleep(1000); // 1초간 일시 정지
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MessageTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from MessageTask!");

        try {
            Thread.sleep(2000); // 2초간 일시 정지
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MessageTask completed!");
    }
}
```
카운트다운 메서드와 메시지 출력 메서드가 동시에

---

### Differences between "extending" and "implementing" Threads

The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface, it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.

---

### 스레드 형식은 두가지다.
> 1. Extend Syntax
> 2. Implement Syntax


### 1. Extend 사용하기 <br>
```java
public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

```java
public class Main extends Thread {
  public static void main(String[] args) {
    Main thread = new Main();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

### 2. Implement 사용하기 <br>
Runnable 인터페이스 구현방식으로서, <br> run() 메서드를 포함한다. <br>

```java
public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```

```java
public class Main implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
```


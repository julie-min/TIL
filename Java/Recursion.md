# Recursion (재귀)

- making a function call itself.
- recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers.
- 재귀를 구현할 때는 몇 가지 주의사항을 염두에 두어야 합니다. 무한 재귀를 피하기 위해 종료 조건을 명확히 정의해야 하며, 재귀 호출 시마다 문제의 크기가 충분히 작아지도록 해야 합니다. 그렇지 않으면 스택 오버플로우(Stack Overflow) 등의 문제가 발생할 수 있습니다.
- Java에서 재귀를 사용하기 위해서는 메서드가 자기 자신을 호출할 수 있는 재귀 호출 형태로 작성해야 합니다. 이때 재귀 호출은 종료 조건을 만족할 때까지 반복적으로 수행됩니다.


# 팩토리얼 계산
```java
public class Factorial {
    public static int factorial(int n) {
        // 종료 조건: n이 0이면 1을 반환
        if (n == 0) {
            return 1;
        }
        
        // 재귀 호출: n과 factorial(n-1)의 곱을 반환
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int result = factorial(5); // 팩토리얼 계산
        System.out.println("Factorial of 5: " + result);
    }
}
```

# 1부터 10까지 덧셈

```java
public class Main {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
```

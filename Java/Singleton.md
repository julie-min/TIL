# Singleton 싱글톤

### 싱글톤이란? 
- 소프트웨어 디자인 패턴 중 하나로, 
- 어떤 클래스의 인스턴스를 전역적으로 하나만 생성하고, 
- 이 인스턴스에 접근할 수 있는 
- 전역적인 접근점을 제공하는 방법

### 전역적이다?
- 전역적으로 하나만 생성한다는 뜻은, 
- 해당 클래스 내에 인스턴스가 오직 하나만 존재하고
- 어디서든 그 인스턴스에 접근할 수 있다는 의미이다.

### 인스턴스의 생성
- 인스턴스 생성은 한번만 이루어진다.
- 생성된 인스턴스에 접근하기 위한 전역적인 접근점이 제공된다.
- 다중 스레드 환경에서 안전하게 사용될 수 있도록 구현되어야한다.
- 로그 관리자, 데이터베이스 연결 풀, 애플리케이션 설정 정보 등
- 일반적으로 싱글톤은 클래스 내부에 정적Static 변수로 인스턴스를 저장하고, 외부에서는 해당 인스턴스를 접근할 수 있는 정적메서드를 제공한다.


### 싱글톤을 사용하는 이유?
1. 전역적인 상태를 유지해야하는 경우나, 리소스를 공유해야하는 경우 
2. 인스턴스 생성 및 초기화 비용이 많이 드는 경우에는 싱글톤을 사용하여 이를 최소화할 수 있음


```java
package com.multi.mvc007;

public class Car {
	String color; //4
	int cc; //4
	String company;
	int price;
	
	
	public Car(String color, int cc, String company, int price) {
		this.color = color;
		this.cc = cc;
		this.company = company;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [color=" + color + ", cc=" + cc + ", company=" + company + ", price=" + price + "]";
	}
}
```
#### 하나의 클래스여도 객체를 2개 생성하면 그 객체들은 서로 다르다.

#### 그러나, 싱글톤의 경우 (클래스를 싱글톤으로 정의한다면)

## 각 객체의 인스턴스가 동일하다.

- 하나의 인스턴스를 공유하는 이유는 무엇일까? 
- 여러개를 만들지않게 하는 경우가 필요하기 때문이다.
- I/O 바운드 작업들은 시간이 오래걸린다.
- 서버 따로 DB 서로 다른 컨테이너에 분리되어있다.
- 컨테이너가 분리되어있기 때문에 쿼리를 보낼때마다 비용이 소요되는 것이다.
- 

```java
public class Score {
    private static Score instance;

    private int score;

    private Score() {
        // 생성자를 private으로 선언하여 외부에서 인스턴스를 생성하는 것을 막습니다.
        score = 0;
    }

    public static Score getInstance() {
        if (instance == null) {
            // 인스턴스가 없을 경우에만 생성합니다.
            instance = new Score();
        }
        return instance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

```

## 나의 질문과 답변
맞습니다. 클래스의 생성자를 private으로 설정하면 외부에서 직접적으로 해당 클래스의 인스턴스를 생성할 수 없게 됩니다. 따라서 외부에서 해당 클래스에 접근하거나 조회하는 것이 제한됩니다.

맞습니다. Score 클래스를 private으로 만들어 접근을 원천 차단하고, getInstance() 메서드를 통해 해당 클래스의 인스턴스를 얻을 수 있게 합니다. getInstance() 메서드는 보통 public으로 선언되어 외부에서 호출 가능하며, 이를 통해 싱글톤 인스턴스를 얻을 수 있습니다. 이렇게 별도의 메서드를 통해 접근을 허용하면서도, 생성자의 접근을 제한하여 싱글톤 인스턴스의 유일성을 유지할 수 있습니다.

맞습니다. 싱글톤 패턴은 접근 제한과 공유를 조합하여 외부에서 클래스의 인스턴스에 접근하는 것을 효과적으로 제어하는 방식입니다. 클래스 내부의 상태를 유지하면서도, 외부에서 필요한 곳에서 인스턴스를 공유하고 사용할 수 있게 됩니다.

요약하자면, 싱글톤 패턴은 인스턴스 생성을 제한하고, 접근 가능한 메서드를 제공하여 동일한 인스턴스를 여러 곳에서 공유하고 사용하는 것을 가능하게 합니다. 이를 통해 객체의 생성과 관리를 효율적으로 조절할 수 있습니다.


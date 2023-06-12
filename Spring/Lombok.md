## @ArgsConstructor
생성자를 만들어주는 어노테이션으로서 다음과 같이 3가지가 있다.

@NoArgsConstructor : 디폴트 생성자만 만들어준다.
@AllArgsConstructor : 모든 필드의 생성자를 만들어준다.
@RequiredArgsConstructor : 필수 생성자만 만들어준다.
<br>

---

생성자는 객체를 초기화하는 역할을 담당합니다. 이때, 생성자를 효율적으로 작성하고 관리하기 위해 Lombok 라이브러리에서 제공하는 어노테이션들이 있습니다.

**@NoArgsConstructor** 어노테이션은 디폴트 생성자를 만들어줍니다. 디폴트 생성자는 매개변수가 없는 생성자로, 클래스의 인스턴스를 생성할 때 아무런 인자를 전달하지 않고 생성할 수 있게 해줍니다. <br><br>
비유적으로 말하면, 디폴트 생성자는 아무런 설명 없이 기본적인 형태로 객체를 만들어준다고 할 수 있습니다. 예를 들어, '사람' 객체의 디폴트 생성자는 그냥 기본적인 '사람' 객체를 만들어준다고 생각할 수 있습니다.

**@AllArgsConstructor** 어노테이션은 모든 필드의 생성자를 만들어줍니다. 이 어노테이션을 사용하면 클래스의 모든 필드를 매개변수로 받는 생성자를 자동으로 생성해줍니다. <br><br> 비유적으로 말하면, @AllArgsConstructor는 객체를 생성할 때 모든 필드에 대한 설명을 담은 생성자를 만들어준다고 할 수 있습니다. '사람' 객체를 예로 들면, 이름, 나이, 성별 등의 필드를 모두 포함한 생성자를 자동으로 생성해줍니다.

**@RequiredArgsConstructor** 어노테이션은 필수 생성자만을 만들어줍니다. 필수 생성자는 클래스의 일부 필드 중에서 특정 조건을 만족하는 필드들로 구성된 생성자입니다. 이 어노테이션을 사용하면 필수 생성자에 해당하는 필드들을 매개변수로 받는 생성자를 자동으로 생성해줍니다. <br><br>비유적으로 말하면, @RequiredArgsConstructor는 필요한 필드들로 구성된 생성자를 만들어준다고 할 수 있습니다. 예를 들어, '사람' 객체에서 이름과 나이는 필수로 입력해야 하는 필드라면, @RequiredArgsConstructor는 이름과 나이를 매개변수로 받는 생성자를 자동으로 생성해줍니다.

요약하자면, @NoArgsConstructor는 기본적인 형태의 생성자, @AllArgsConstructor는 모든 필드를 포함한 생성자, @RequiredArgsConstructor는 필수 필드들을 포함한 생성자를 자동으로 생성해주는 역할을 합니다. <br> 이 어노테이션들을 사용하면 객체를 초기화하는 데 필요한 생성자를 간편하게 작성할 수 있고, 코드의 가독성과 유지보수성을 향상시킬 수 있습니다.

----

## 예시

```java
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    private String name;
    private int age;
    private String gender;
    
    public static void main(String[] args) {
        // 디폴트 생성자 사용
        Person person1 = new Person();
        
        // 모든 필드를 포함한 생성자 사용
        Person person2 = new Person("John", 25, "Male");
        
        // 필수 필드만을 포함한 생성자 사용
        Person person3 = new Person("Jane", 30);
    }
}
```


위의 코드에서 Person 클래스는 name, age, gender라는 세 개의 필드를 갖고 있습니다. 이 클래스에 Lombok의 어노테이션을 적용하면 자동으로 생성자들이 생성됩니다.

@NoArgsConstructor는 디폴트 생성자를 생성합니다. person1 객체는 매개변수 없이 생성됩니다. 

@AllArgsConstructor는 모든 필드를 포함한 생성자를 생성합니다. person2 객체는 모든 필드를 매개변수로 받아 생성됩니다.

@RequiredArgsConstructor는 필수 필드만을 포함한 생성자를 생성합니다. person3 객체는 name과 age 필드를 매개변수로 받아 생성됩니다.

이렇게 생성자를 간편하게 작성하고 사용할 수 있습니다. Lombok의 어노테이션을 활용하면 반복적이고 번거로운 생성자 작성을 줄일 수 있으며, 코드의 가독성을 향상시킬 수 있습니다.
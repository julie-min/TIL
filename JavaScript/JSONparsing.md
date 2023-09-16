# How to send or receive a Collection?

# Java에서 리스트 프론트로 보내기
> Using Jackson
```java
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        List<String> myList = Arrays.asList("apple", "banana", "cherry");

        try {
            String jsonString = objectMapper.writeValueAsString(myList);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
결과
```json
["apple","banana","cherry"]
```

# 프론트에서 JSON 받기
```javascript
fetch('URL_백엔드_API', {
  method: 'GET'
})
  .then(response => response.json())
  .then(data => {
    // JSON 형식의 데이터가 JavaScript 객체나 배열로 변환되어 data 변수에 저장됨
    console.log(data);
  });
```
결과
```javascript
["apple", "banana", "cherry"]
```
# 프론트에서 배열이나 객체 JSON 만들기
```javascript
const jsonString = '["apple","banana","cherry"]';
const myArray = JSON.parse(jsonString);
console.log(myArray);
```

# json을 받은 백엔드
1. 자바의 object로 받기
```java
// String to Object
String json = "{ \"name\" : \"Ryan\", \"age\" : 30 }";
User user = objectMapper.readValue(json, User.class);
// JSON File to Object
User user = objectMapper.readValue(new File("user.json"), User.class);
// JSON URL to Object
User user = objectMapper.readValue(new URL("file:user.json"), User.class);
```

2. 자바의 List로 받기
```java
String jsonArr = "[{\"name\":\"Ryan\",\"age\":30},{\"name\":\"Jake\",\"age\":20}]";
List<User> users = objectMapper.readValue(jsonArr, new TypeReference<>() {});
```

---

정리하자면...
# JavaScript의 내장함수
1. `JSON.parse`
   : JSON -> JavaScript
2. `JSON.stringify`
   : JavaScript -> JSON

``` javascript
const jsonString = '{"name": "John", "age": 30}';
const myObject = JSON.parse(jsonString);
console.log(myObject.name); // 출력: John

const myObject = { name: "John", age: 30 };
const jsonString = JSON.stringify(myObject);
console.log(jsonString); // 출력: {"name":"John","age":30}
```

```javascript
const jsonString = '{"name": "John", "age": 30, "location": "New York"}';
const myObject = JSON.parse(jsonString);

console.log(myObject);
```
결과
```javascript
{
  name: 'John',
  age: 30,
  location: 'New York'
}
```

그 외 백엔드 자바진영에서 JSON을 사용하고 싶다면 `Jackson` 라이브러리를 사용하면 된다.

# JavaScript Data Type

### 8 datatypes
- String
- Number
- Bigint
- Boolean
- Undefined
- Null
- Symbol
- Object

### Object Datatype
- Object
- Array
- Date

### Array
- 대괄호 [ ]
- const cars = ["Saab", "Volvo", "BMW"]

### Array to JSON
```javascript
const arr = ["John", "Peter", "Sally", "Jane"];		
const myJSON = JSON.stringify(arr);		
myJSON
//출력결과
["John","Peter","Sally","Jane"]
```

### Object
- 중괄호 { }
- name : value 페어
```javascript
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue"
};
```
- value값만 배열로 얻고싶을 때
```javascript
const myObject = {
  key1: 'value1',
  key2: 'value2',
  key3: 'value3'
};
const valuesArray = Object.values(myObject);
```
valuesArray = ['value1', 'value2', 'value3']

<br>

### Object와 JSON의 차이
1. key:value 에서 object는 key가 따옴표에 둘러싸여 있지 않다.
```javascript
const myObject = { key: 'value' };
```
JSON은 엄격한 구문 규칙으로, 모든 값이 큰따옴표로 감싸있다.


2. 데이터 타입의 제한
- JSON은 문자열, 숫자, 불리언, 배열, 객체, null만을 지원한다.
- 함수를 지원하지 않는다.
- JS는 함수도 가능하다.
- 또한 JSON은 메서드를 포함하지 못한다.

----

## Array → Object로 만드는 방법
- value값을 null로 지정
```javascript
const myArray = ['name', 'age', 'location'];
const myObject = {};

myArray.forEach(key => {
  myObject[key] = null;
});

console.log(myObject);
```
결과
```javascript
{
  name: null,
  age: null,
  location: null
}
```

## Object → Array로 만드는 방법
```javascript
const myObject = {
  name: 'John',
  age: 30,
  location: 'New York'
};

const myArray = Object.values(myObject);

console.log(myArray);

```
## Object → JSON으로 만드는 방법

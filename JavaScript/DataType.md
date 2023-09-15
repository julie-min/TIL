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
모든 키와 밸류에 큰따옴표를 넣어 String화 해주는 것이다.
```javascript
const myObject = {
  name: 'John',
  age: 30,
  location: 'New York'
};

const jsonString = JSON.stringify(myObject);

console.log(jsonString);
```
결과
```json
{
  "name": "John",
  "age": 30,
  "location": "New York"
}
```
## JSON → Object으로 만드는 방법
JSON.parse라는 강력한 기능으로 쉽게 말해 Object의 형식으로 바꿔준다.
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

## Array → JSON으로 만드는 방법
큰따옴표를 붙여주는 형식은 뭐다? `Stringify`
```javascript
const myArray = ['name', 'age', 'location'];
const jsonString = JSON.stringify(myArray);

console.log(jsonString);
```
결과
```json
["name","age","location"]
```

## Value값이 배열인 경우
JSON도 배열을 가질 수 있다.
```javascript
const myObject = {
  name: 'John',
  hobbies: ['reading', 'traveling', 'coding']
};

// Object를 JSON으로 변환
const jsonString = JSON.stringify(myObject);

// 해당 배열 추출
const hobbiesArray = myObject.hobbies;

console.log(jsonString);
console.log(hobbiesArray);

```
결과
```json
{
  "name": "John",
  "hobbies": [
    "reading",
    "traveling",
    "coding"
  ]
}
```
배열만 추출함
```javascript
['reading', 'traveling', 'coding']
```
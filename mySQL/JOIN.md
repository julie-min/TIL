
## 1. 기본 

```
SELECT * FROM Categories C
JOIN Products P 
  ON C.CategoryID = P.CategoryID;
  ```

```
SELECT 
  C.CategoryID, C.CategoryName, 
  P.ProductName, 
  O.OrderDate,
  D.Quantity
FROM Categories C
JOIN Products P 
  ON C.CategoryID = P.CategoryID
JOIN OrderDetails D
  ON P.ProductID = D.ProductID
JOIN Orders O
  ON O.OrderID = D.OrderID;
```

## 2. 형식

---
- SELECT : 표시할 열 + 콤마
- FROM : **우리가 조회하고자 하는 데이터가 준비된 열** -> 해당 내용이 있는 핵심 테이블부터 시작
---
- JOIN : 조인의 대상이 되는 순서의 테이블
- ON : 공통의 열 -> `=` 로 적어준다
---
- WHERE : 특정 레코드 필터링
- GROUP BY : 그룹화 지정을 위한 열

```
SELECT *
FROM table1
JOIN table2 ON table1.id = table2.id
WHERE condition
GROUP BY column1
```




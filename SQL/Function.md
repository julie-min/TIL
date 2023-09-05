# Built-in Function
- Built-in function & User Defined Function
- Single-Row function / Multi-Row function
- Aggregate function / Group function / Window function

# Single Row function
- `SELECT`, `WHERE`, `ORDER BY`
- 여러 인자를 입력해도 하나의 결과만을 리턴한다.
- 함수의 인자로 상수, 변수, 표현식이 가능하다.

# 문자형 함수
- LOWER : 알파벳 문자를 소문자로
- UPPER : 알파벳 문자를 대문자로
- ASCII : 문자나 숫자를 ASCII 코드 번호로
- CHAR / CHR : ASCII 코드번호를 문자나 숫자로
- CONCAT : 문자열 1과, 문자열 2를 연결한다. 
- (Oracle) '||' (SQL server) '+'
- SUBSTR / SUBSTRING : m의 위치에서 n개의 문자길이
- LENGTH / LEN : 문자열의 개수를 숫자값으로
- LTRIM : 문자열의 첫문자부터 확인해서 지정문자가 나타나면 해당문자를 제거한다.
- RTRIM : 문자열의 마지막문자부터 확인해서 지정문자가 나타나는 동안 해당문자를 제거한다.
- TRIM : 문자열에서 머리말, 꼬리말, 또는 양쪽에 있는 지정문자를 제거한다.
- ex. TRIM('x' FROM 'xxYYZZxYZxx') = 'YYZZxYZ'
  
# 숫자형 함수
- ABS: 숫자의 절대값
- SIGN : 숫자가 양수인지, 음수인지, 0인지 구별한다.
- MOD(숫자1, 숫자2) : 숫자1 나누기 숫자2의 나머지 (%)
- CEIL / CEILING : 숫자보다 크거나 같은 최소의 정수
- FLOOR : 숫자보다 작거나 같은 최대의 정수
- ROUND : 숫자를 소수점m자리에서 반올림
- TRUNC : 숫자를 소수점m자리에서 잘라서 버림
- SIN / COS / TAN : 숫자의 삼각함수 값을 리턴
- ex. CEIL(38.123) = 39
- ex. ROUND(38.5235. 3) = 38.524



# Nomalization
## 정규화
- 목적: 삽입, 삭제, 갱신 이상현상을 방지
- 함수적 종속성에 기반
- 1 정규화 : 1NF = 모든 값이 원자값을 가짐
- 2 정규화 : 2NF = 부분함수종속 제거
- 3 정규화 : 3NF = 이행함수종속 제거
- 식별자가 아닌 속성이 결정자 역할을 하는 함수 종속 제거: 3NF

- 1차 정규화: 모든 값이 원자값, 더이상 나뉘어지는 값이 없도록
- 함수적 종속성이란?
- x값 하나에 y값 하나가 대응되는 것


- 2차 정규화: 부분함수종속제거
- 2차 정규화를 통해 2차 정규형이 만들어짐
- PK의 일부가 화살표의 출발이 되는 결정자가 되는 것 : 제거

# 1NF : first normal form
- 도메인이 원자값
- 하나의 셀에 따옴표로 여러 값이 들어가는 이상현상

# 2NF : 2nd normal form
- PK가 복합키일때 나타나는 오류
- PK 중 하나가 개별적으로 다른 키를 정의하고 있을때
- 부분함수 종속 제거
- 원본테이블 + 테이블을 나눔 (각각이 제2정규형이 됨)
  
# 3NF : 3rd mormal form
- PK가 아닌 놈이 화살표를 쏘면 안된다.
- PK가 아닌데 다른 키를 정의하고 있다.
- 이행함수 종속 제거
- 별도의 테이블로 빼준다. 이때는 별도로 나가는애들도 지워준다.
- 각각이 3정규형이 된다.


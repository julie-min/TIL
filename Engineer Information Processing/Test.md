# Test

## White box
- 논리위주, 모듈 내의 내부 소스코드
- 원시코드, 모든 문장을 한번 이상 실행
- 시간이 오래 걸리지만 테스트 효과는 확실하다.

<br>
1. Base Path test : 흐름도 작성, 논리적 복잡도 측정
2. Control Structure test 
   1) 조건검사: Condition
   2) 루프검사: Loof
   3) 데이터흐름 검사: Data flow



<br> <br> <br>

## Black box
- 구조와 논리를 모르는 상태에서 각 기능이 완전히 작동되는지 검사
- 기능검사라고도 불린다.
<br>
1. Equivalence Partitioning 동치분할검사: 입력자료 초점
2. Boundary Value 경계값조사
3. Cause-Effect Graphing 원인-효과 그래프 : 입력 데이터간의 관계 확인
4. Error Guessing 오류 예측 검사 : 과거의 경험, 감각으로 테스트
5. Comparison Testing 비교 검사 : 여러 버전의 프로그램으로 같은 결과 확인 


## Test Driver
- 상향식 테스트
- 하위 모듈 호출 (상위 모듈이 없을 때)

## Stub
- 하향식 테스트
- 가짜 시험용 모듈
- 드라이버보다 작성이 쉽다. 시험용이기 때문에
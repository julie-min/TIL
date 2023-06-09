# Python Study for Exam
> 파이썬 프로그래밍 기말고사를 위한 예제학습입니다.
> 
![3743912635_zUEh83MQ_a12d0a2875cd64bdbea6453f581933fc7efff739](https://github.com/julie-min/TIL/assets/130271406/4a248cd4-1b30-4177-b795-ed47c440bf99)
<br>

1. 파이썬 인터프리터에서 기본적으로 지원하는 함수<br>
   : 내장함수

2. 구조적 프로그래밍 패러다임에서 제안된 제어구조<br>
   : 순차구조<br>
   : 반복구조<br>
   : 선택구조 (결함이 있으면 고친다.)

3. 에러의 원인
```python
msg = "Love Python"

count = 1
while count <=5 :
    print(msg)
```
> 무한반복을 일으키는 프로그램이다. <br>
> 컴퓨터 오류발생으로 중단되는 주요 원인
<br>

4. 데이터 <br>
- 이론을 세우는 데 기초가 되는 사실
- 관찰, 실험, 조사로 얻은 사실
- 데이터와 정보의 차이: 
  정보는 또다른 물음의 답이 될 수 있음.<br>
  통계, 집합 등 가공을 통해 만들어 지는 것임
<br>

5. 고급언어로 작성된 소스코드를 컴퓨터가 이해할 수 있는 기계어로 변환해주는 프로그램은?<br>
   : 인터프리터

6. 신체기관과 컴퓨터장치의 기능 비교<br>
   - CPU : 연산
   - 플래시메모리 : 저장
   - RAM : 저장
   - HMD : 헤드마운티드 디스플레이(가상현실)

7. `odd ---> 1 3 5 7 9 `<br>
   : odd = range(1,10,2)<br>
   : range의 두번째 값은 `-1` 로 만들어진다.<br>
   **range(시작숫자, 종료숫자, step)**

8. 파이썬 프로그램 실행과정<br>
   - 코드작성
   - 컴파일러 CPython
   - 바이트코드 (모든 운영체제에서 운영가능)
   - 파이썬 가상머신 PVM
   - 기계어

9. 파이썬에 대한 설명<br>
    - 명령형, 절차적, 객체지향, 함수형
    - 완전한 애플리케이션 *단독개발은 어려움*
    - 실행할 수 있는 의사 코드 수준의 문법 지향
    - (모르는 사람이 봐도 아는 코드)
    - 많은 개발자의 의견 수용, 토론 발전

10. `print("Hello World!")` <br>
    : Hello World 는 `파라미터` `매개변수` 이다.


11. `body = [181, 78, "brown", "black"]`<br>
    - black 을 purple로 변경
    - `body[3] = "purple"`
    - 인덱스가 `0`부터 시작한다.

12. 다음 중 식별자로 사용할 수 없는 것은?<br>
    - or : 예약어와 겹친다.
    - blue456
    - _24h : 언더바로 시작이 가능함
    - _____init____: 길이제한 없음
    - 특수기호도 사용불가

13. 파이썬 개발환경중 오픈소스이며, <br>
    문서화가 쉽고, 클라우드 기반 대화형 개발 및 실행 환경을 제공하는 것은?<br>
    : 코랩 (주피터 노트북은 클라우드가 아님)

14. 코드의 실행결과<br>
```python
print("나는!")
   print("파이썬을 할 수 있다.")
```
정답: `구문 에러 발생`
같은 블록 내에서는 들여쓰기 칸 수가 같아야 합니다.
위반시에는 "IndentationError: unexpected indent"라는 에러를 출력합니다.

15. 입력장치-출력장치+주기억장치+제어+연산<br>
    위와 같은 5개의 장치를 통해 컴퓨터를 구성하는 방식<br>
    : **폰 노이만 구조**

16. 실행결과<br>
    (1) 
    ```
    rad = input()
    rad = int(rad)
    print(rad)
    ```

    (2)
    ```
    rad = input("숫자입력")
    rad = int(rad)
    print(rad)
    ```

    (3)
    ```
    print(int(input("숫자입력")))
    ```

<br>
17. 여러 프로그램 실행이 요청되면 한정된 자원을 효과적으로 사용하도록 조율하는 운영체제의 기능은?<br>
: 프로세스 관리

<br>
18. 홀짝여부를 판별하는 프로그램

```python
number = 9
if ( number % 2 == 1 ) :
    print("홀수입니다.")
else :
   print("짝수입니다.")
```
<br>
19. 다음 코드의 실행 결과는?
    
```python
for i in range(1,5) :
   for j in range(i) :
      print("#", end=" ")
   print()
```
- range: 1씩 증가시켜라. 1부터 4까지
- range(n) = range(0,n) 시작값이 0이고 i보다 작은수까지 1씩 증가
- i = 1 이면 j = 0, `#`
- i = 2 이면 j = 0,1 `##`
- 결과 : 
```
#
##
###
####
```

20. 가위바위보 소스코드
```python
options = ["가위", "바위", "보"]
user = input("가위,바위,보를 입력: ")
com = random.choice(options)

if user == come:
   print("비겼다")

elif user == "바위" and com == "가위" :
   print("이겼다!")

else
   print("졌다..")
```

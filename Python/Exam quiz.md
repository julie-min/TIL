# Python
기말고사 공부를 하기 위한 <br>
짧은 O/X 문제입니다.

![20220609_62a17157651f0](https://github.com/julie-min/TIL/assets/130271406/10e951e4-68f0-4a61-ab8c-eb44a3209575)


> 파이썬에서 데이터타입은 다른 데이터 타입으로 변경할 수 있다. ⭕

> 파이썬은 히도 판로쉼이 주도하여 발전하고 있다 ❌

> 전공"은 컴퓨터과학과라는 특정 범주에 속하는 개념이므로, **범주적 데이터**로 분류됩니다.

데이터는 일반적으로 다음과 같은 네 가지 유형으로 분류됩니다.

**연속적 데이터 (Continuous data)**: 연속적 데이터는 `숫자`로 표현되는 데이터입니다. 이 데이터는 연속적인 값으로 표현되며 무한한 수의 가능한 값이 있습니다. 예를 들어, 온도, 시간, 길이 등이 연속적 데이터의 예입니다.

**범주적 데이터 (Categorical data)**: 범주적 데이터는 `고유한 범주` 또는 그룹으로 분류되는 데이터입니다. 이러한 데이터는 명목 또는 순서형으로 나뉠 수 있습니다. 예를 들어, `성별`, `혈액형`, `학위` 등이 범주적 데이터의 예입니다.

**정보 (Information)**: 정보는 데이터가 가진 의미나 가치를 나타냅니다. 데이터는 단순히 정보의 원천이며, 정보는 데이터를 해석하고 이해하는 과정을 통해 얻어집니다. 정보는 데이터를 통해 얻을 수 있는 **통찰력, 패턴, 관계** 등을 포함합니다.

**반정형 데이터 (Semi-structured data)**: 반정형 데이터는 구조화되지 않은 데이터로, 일부 구조를 가지고 있지만 완전한 구조가 아닙니다. 이러한 데이터는 일반적인 데이터베이스의 행과 열 형태로 표현하기 어렵거나 유연한 구조를 가지고 있는 경우에 해당됩니다. 예를 들어, `이메일`, `웹 로그`, `소셜 미디어 게시물` 등이 반정형 데이터의 예입니다.



> 표현의 모호성을 제거하고 자연어와 유사한 형태의 문법을 갖는 프로그래밍 언어는 ? `3세대 프로그래밍 언어`

> 특정 영역 내의 명령문에 대한 실행여부를 프로그램 실행 과정 중 `조건`에 따라 결정하는 구조 : 선택구조

> `sep=""` 공백없이 만드는 print인자 <br>
> `end=""` 공백문자 추가 인자

> 논리적으로 실행 불가능한 명령문 작성 시 발생하는 오류: 실행 오류

> 파이썬은 구조적 프로그래밍 패러다임을 지원하며, goto문을 사용하지 않고 프로그램을 구성할 수 있는<br>
> 순차 - 선택 - 반복 구조를 제공한다.
- 순차구조: 실행의 흐름을 주어지는 명령의 위치적 흐름에 따라 수행
- 선택구조: 특정 영역 내의 명령문에 대한 실행여부를 프로그램 실행 과정 중 조건에 따라 결정
- 반복구조: 특정 영역의 명령문을 조건에 따라 여러 번 재실행하는 구조

> 계수 제어 반복 구조에서 특정반복 횟수와 반복시 계수의 값을 정하기 위해 사용하는 데이터 타입은? **시퀀스**

> for문은 리스트 등과 같은 **시퀀스**의 첫번째 요소부터 마지막요소까지 <br>
> 하나씩 변수에 대입하여 블럭의 명령문을 수행하며, 마지막 요소까지 수행한 후 종료하는 **계수 제어 반복**이다.

> **중첩 반복 구조**는 하나의 외부 반복구조에 *여러 개의 내부 반복 구조*가 **중첩**되어 사용되는 구조를 말하며, 외부 반복 구조가 매 반복될때마다 내부 반복 구조에 재진입하여 새롭게 실행된다.

> 모든 메소드의 첫 번째 매개변수는 `self`이다.

> **모듈: 함수, 상수, 클래스를 모아놓은 집합체** <br>
> 모듈 등록시 `import` 구문과 `from import`구문을 사용한다.

<br>

> 네임스페이스: 특정 객체를 이름에 따라 구분할 수 있는 범위
> 특정한 배열 순서나 규칙적인 의미가 없는, 임의의 수

> 데이터를 구성하는 개별 문자를 **인코딩 체계*를 통해 `바이트`로 변경하여 연속적으로 저장한 파일의 종류는? `텍스트 파일`

> 시퀀스에서 각각의 항목을 순서대로 한번씩만 방문하는 과정은? **순회**

- 이벤트 기반 프로그래밍 <br>
- EDP Event  Driven Programming
- 실행의 흐름을 예측하는 프로그래밍 기법이 무의미한 GUI 환경에서 사용
<br>

> 소프트웨어 개발 라이프사이클의 순서:<br>
계획 - 분석 - 설계 - 구현 - 테스트 - 유지보수

> EDP 구동구조<br>
이벤트 발생장치 - **이벤트 큐**에 쌓이기 시작함<br>
이벤트 핸들러 (이벤트 처리 메소드) <br>
이벤트 루프 (반복되는 과정)

> 배치 프로세스 : 일괄적으로 모아놓은 대량의 데이터를 **특정시간**에 지정한 처리방법에 따라 처리하는 과정


> 리스트 : **단일 식별자**로 **순서화**된 값의 집합체를 저장할 수 있는 데이터 타입

> 2차원 리스트 접근방법 : distance[행][열] <br>
> 단, 0부터 센다.

---

1. 유사한 유형의 문제를 해결할 수 있도록 특정 작업을 수행하는 명령문의 집합을 단일 식별자로 구성한 개념은? <br>
   : **함수**

2. 숫자 앞에 삽입된 공백의 개수<br>
```python
format(3.141592, ">20.3f")
```
- `>` 오른쪽 정렬
- `20` 총 20개의 문자열 자리
- `.3` 소수점 이하 자리수, 3자리까지
- `f` 실수
- 풀이: 오른쪽으로 정렬된 20자리 문자열에서<br>
- 소수점 이하 3자리로 나타낸다면<br>
- `_______________3.142`
  
3. 특정한 배열 순서나 규칙적인 의미가 없는, 임의의 수는? <br>
  : 난수

4. private 데이터 필드에 값을 설정하는 메소드를 `접근자`라고 한다. ❌

5. 대규모 소프트웨어 개발에 자원을 투입하여 초기에 예상한 결과물 구현을 목적으로 소프트웨어 전체 개발 과정을 하나의 프로세스로 정의한 것은? <br>
 : 소프트웨어 개발 라이프사이클

6. 소프트 웨어 개발 라이프사이클에서, 요구반영, 예상결과 유사검증 및 오류파악이 진행되는단계는? <br>
   : **테스트**

---

- random() : 0~1사이의 숫자 중 난수 발생
- randint(a,b) : a부터 b사이의 숫자 중 난수 발생
- randrange(a,b,c) : a부터 b사이의 c의 간격으로 나열된 숫자 중 난수발생
- choice(sequence) : 주어진 항목을 핸덤하게 반환
- sample(sequence) : 랜덤하게 여러개의 원소를 선택
- shuffle(sequence) : 시퀀스의 순서를 랜덤하게 섞음
---

```python
h_fp = open("hamlet_by_Shakespeare.txt", "r")
wdict = dict()
for line in h_fp.readlines():
    for word in line.strip().split():
        word = word.strip(" ,?[.\";").lower()
        if wdict.get(word) is not None:
            count = wdict[word]
        else :
            count = 0
            wdict[word] = count + 1
h_fp.close()
```
1. "hamlet_by_Shakespeare.txt" 파일을 읽기 모드("r")로 열어 파일 객체를 생성하고, h_fp 변수에 할당합니다.
2. 빈 사전(dict)을 생성하여 wdict 변수에 할당합니다. 이 사전은 단어와 해당 단어의 빈도수를 저장하는데 사용됩니다.
3.  파일을 줄 단위로 읽으면서 반복합니다.
4. 각 줄을 공백 기준으로 단어로 분리하여 반복합니다. for word in line.strip().split()
5. word.strip(" ,?[.\";"): 단어의 앞뒤로 나타나는 특수문자와 공백을 제거합니다.
6. 사전에서 해당 단어 word를 키로 사용하여 값을 조회합니다. 만약 해당 단어의 빈도수가 존재한다면, count 변수에 해당 빈도수를 할당합니다.
7. 해당 단어의 빈도수가 존재하지 않는다면, 새로운 단어의 빈도수를 초기화하고 wdict 사전에 해당 단어를 키로 사용하여 빈도수를 1로 할당합니다.

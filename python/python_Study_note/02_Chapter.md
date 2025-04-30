Chapter 1. 변수와 자료형
1.1 변수
변수는 데이터를 저장하는 공간임.
파이썬은 변수를 선언할 때 자료형을 명시하지 않아도 되고, 값이 할당될 때 자동으로 자료형이 결정됨.
```python
text
age = 24
height = 172.5
grade = 'A'
name = "홍길동"
is_student = True
```
1.2 자료형
파이썬의 자료형은 크게 기본형(숫자, 문자, 불리언 등)과 컬렉션형(리스트, 튜플, 딕셔너리, 집합 등)으로 구분함.

기본형(primitive type)
```python
| 자료형   | 크기    | 예시 값      | 설명     |
|----------|---------|--------------|----------|
| int      | 가변    | 100          | 정수     |
| float    | 가변    | 3.14         | 실수     |
| str      | 가변    | "Hello"      | 문자열   |
| bool     | 1바이트 | True/False   | 논리값   |
| NoneType | -       | None         | 값 없음  |
컬렉션형(collection type)
```
| 자료형 | 예시 값            | 설명           |
|--------|--------------------|----------------|
| list   |          | 리스트(배열)   |
| tuple  | (1, 2, 3)          | 튜플(불변배열) |
| dict   | {"a":1, "b":2}     | 딕셔너리(맵)   |
| set    | {1, 2, 3}          | 집합           |
예시 코드:

```python
message = "Hello, Python!"
numbers = [1, 2, 3, 4,e": "홍길동", "age": 24}
1.3 변수 선언과 초기화
파이썬은 변수를 선언과 동시에 값을 할당하며, 초기화 없이 사용하면 에러가 발생함.

```
score = 90        # 선언과 동시에 초기화
pi = 3.1415
1.4 상수
파이썬에는 상수 키워드는 없으나, 대문자 변수명을 사용해 상수처럼 사용함.

```
PI = 3.141592
MAX_STUDENT = 30
1.5 자료형 변환
서로 다른 자료형 간에는 변환이 필요함.

자동 형변환 (묵시적 변환)
작은 범위에서 큰 범위로는 자동 변환됨.

```
a = 10
b = 3.14
c = a + b   # int + float → float
print(c)    # 13.14
강제 형변환 (명시적 변환)
함수를 사용하여 명시적으로 변환함.

```python
x = 3.14
y = int(x)  # 소수점 이하가 잘려서 3이 됨
print(y)
1.6 변수와 자료형 종합 예제
text
age = 24
height = 172.5
grade = 'A'
name = "홍길동"
is_student = True

print("이름:", name)
print("나이:", age)
print("키:", height)
print("학점:", grade)
print("학생 여부:", is_student)
위 코드는 여러 자료형의 변수를 선언하고 값을 할당한 뒤 출력함.
```
1.7 연습문제
자신의 이름, 나이, 키, 학점, 학생 여부를 변수로 선언하고 한 줄로 출력하는 코드 작성.

아래 코드의 실행 결과 예측 및 실제 실행:

```python
x = 7
y = 2.5
print(x + y)
print(int(y))
```
상수로 원의 반지름과 원주율(3.14)을 선언하고, 원의 넓이를 구하는 코드 작성.

1.8 연습문제 풀이
```python
# 1번
name = "홍길동"
age = 20
height = 175.5
grade = 'A'
is_student = True
print(f"이름:{name}, 나이:{age}, 키:{height}, 학점:{grade}, 학생여부:{is_student}")
```
# 2번
```python
x = 7
y = 2.5
print(x + y)    # 9.5
print(int(y))   # 2
```
# 3번
```python
RADIUS = 5
PI = 3.14
area = PI * RADIUS * RADIUS
print("원의 넓이:", area)
```

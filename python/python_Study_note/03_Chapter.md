Chapter 3. 제어문
3.1 조건문(if, elif, else)
파이썬에서 조건문은 프로그램의 흐름을 제어할 때 사용함.
특정 조건이 참(True)이면 해당 코드를 실행하고, 거짓(False)이면 다른 코드를 실행함.

기본 구조

```python
if 조건식:
    실행할 코드
elif 다른조건식:
    실행할 코드
else:
    실행할 코드
```
예시
```python
score = 85

if score >= 90:
    print("A학점임")
elif score >= 80:
    print("B학점임")
else:
    print("C학점임")
if는 가장 먼저 검사하는 조건임.

elif는 위의 조건이 거짓일 때 추가로 검사함.

else는 위의 모든 조건이 거짓일 때 실행함.
```
중첩 조건문
조건문 안에 또 조건문을 넣을 수 있음.

```python
age = 20
if age >= 18:
    if age < 65:
        print("성인임")
    else:
        print("노인임")
else:
    print("미성년자임")
```
3.2 비교 연산자와 논리 연산자
조건문에서 자주 사용하는 연산자는 아래와 같음.

text
| 연산자 | 설명           | 예시          |
|--------|----------------|---------------|
| ==     | 같다           | a == b        |
| !=     | 다르다         | a != b        |
| >      | 크다           | a > b         |
| <      | 작다           | a < b         |
| >=     | 크거나 같다    | a >= b        |
| <=     | 작거나 같다    | a <= b        |
| and    | 그리고         | a > 1 and b < 5 |
| or     | 또는           | a < 1 or b > 5  |
| not    | 부정           | not a == b      |
3.3 반복문(for, while)
반복문은 같은 동작을 여러 번 반복할 때 사용함.
파이썬에는 대표적으로 for문과 while문이 있음.

for문
```python
for 변수 in 반복가능한객체:
    실행할 코드
예시: 1부터 5까지 출력
```
```python
for i in range(1, 6):
    print(i)
range(1, 6)은 1, 2, 3, 4, 5를 차례로 생성함.
```
while문
```python
n = 1
while n <= 5:
    print(n)
    n += 1
조건이 참인 동안 계속 반복함.

n += 1은 n을 1씩 증가시킴.
```
3.4 break와 continue
반복문을 제어할 때는 break와 continue를 사용할 수 있음.

break는 반복문을 즉시 종료함.

continue는 아래 코드를 건너뛰고 다음 반복을 시작함.

예시:

```python
for i in range(10):
    if i == 5:
        break   # i가 5가 되면 반복문 종료
    if i % 2 == 0:
        continue  # 짝수는 건너뜀
    print(i)
```
3.5 중첩 반복문
반복문 안에 또 반복문을 넣을 수 있음.
예시: 구구단 2~4단 출력

```python
for dan in range(2, 5):
    print(f"{dan}단")
    for i in range(1, 10):
        print(f"{dan} x {i} = {dan*i}")
    print()  # 한 단이 끝나면 빈 줄 출력
```
3.6 pass문
pass는 아무 동작도 하지 않고 넘어가고 싶을 때 사용함.

```python
for i in range(5):
    if i == 2:
        pass  # 아무것도 하지 않음
    else:
        print(i)
```
3.7 연습문제
1~100까지의 합을 for문과 while문으로 각각 구하는 코드 작성.

1~20 사이의 홀수만 한 줄로 출력하는 코드를 for문을 이용해 작성.

3.8 연습문제 풀이
```python
# 1번 (for문)
total = 0
for i in range(1, 101):
    total += i
print("1~100 합(for문):", total)
```
# 1번 (while문)
```python
total = 0
i = 1
while i <= 100:
    total += i
    i += 1
print("1~100 합(while문):", total)
```
```python
# 2번
for i in range(1, 21):
    if i % 2 == 1:
        print(i, end=' ')
print()
```

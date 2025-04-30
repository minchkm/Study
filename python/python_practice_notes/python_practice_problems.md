
# 🐍 Python 연습문제 모음 (기초편)

파이썬 기본 문법을 연습하기 위한 문제들과 풀이를 정리한 파일입니다.

---

## ✅ 문제 1: 홀짝 판별기
> 사용자로부터 정수를 입력받아, 그 수가 홀수인지 짝수인지 출력하는 프로그램을 작성하세요.

### 🔍 풀이
```python
num = int(input("정수를 입력하세요: "))
if num % 2 == 0:
    print("짝수입니다.")
else:
    print("홀수입니다.")
```

---

## ✅ 문제 2: 구구단 출력
> 사용자로부터 숫자 하나를 입력받아 해당 숫자의 구구단을 출력하세요. (예: 5 → 5단)

### 🔍 풀이
```python
dan = int(input("몇 단을 출력할까요? "))
for i in range(1, 10):
    print(f"{dan} x {i} = {dan * i}")
```

---

## ✅ 문제 3: 리스트 평균 구하기
> 주어진 숫자 리스트의 평균을 구하는 코드를 작성하세요.

```python
numbers = [10, 20, 30, 40, 50]
```

### 🔍 풀이
```python
numbers = [10, 20, 30, 40, 50]
average = sum(numbers) / len(numbers)
print("평균은:", average)
```

---

## ✅ 문제 4: 문자열 뒤집기
> 사용자로부터 문자열을 입력받아, 이를 거꾸로 출력하세요.

### 🔍 풀이
```python
text = input("문자열을 입력하세요: ")
reversed_text = text[::-1]
print("뒤집은 문자열:", reversed_text)
```

---

## ✅ 문제 5: 최대값과 최소값 구하기
> 숫자로 이루어진 리스트에서 가장 큰 값과 가장 작은 값을 출력하세요.

```python
numbers = [4, 17, 23, 1, 9, 12]
```

### 🔍 풀이
```python
numbers = [4, 17, 23, 1, 9, 12]
print("최댓값:", max(numbers))
print("최솟값:", min(numbers))
```

---

## ✅ 문제 6: 팩토리얼 계산기
> 정수를 입력받아 해당 수의 팩토리얼을 계산하세요.

### 🔍 풀이
```python
n = int(input("정수를 입력하세요: "))
result = 1
for i in range(1, n + 1):
    result *= i
print(f"{n}! =", result)
```

---

## ✅ 문제 7: 구구단 전체 출력
> 2단부터 9단까지 전체 구구단을 출력하는 프로그램을 작성하세요.

### 🔍 풀이
```python
for dan in range(2, 10):
    print(f"\n--- {dan}단 ---")
    for i in range(1, 10):
        print(f"{dan} x {i} = {dan * i}")
```

---

## ✅ 문제 8: 소수 판별기
> 정수를 입력받아 소수인지 아닌지 판별하세요.

### 🔍 풀이
```python
n = int(input("정수를 입력하세요: "))
is_prime = True
if n < 2:
    is_prime = False
else:
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            is_prime = False
            break
if is_prime:
    print("소수입니다.")
else:
    print("소수가 아닙니다.")
```

---

## ✅ 문제 9: 피보나치 수열 생성기
> n개의 피보나치 수열을 출력하세요.

### 🔍 풀이
```python
n = int(input("몇 개의 피보나치 수를 출력할까요? "))
a, b = 0, 1
for _ in range(n):
    print(a, end=" ")
    a, b = b, a + b
```

---

## ✅ 문제 10: 구 리스트에서 짝수만 출력하기
> 주어진 리스트에서 짝수만 출력하세요.

```python
numbers = [1, 3, 4, 6, 9, 12, 15, 20]
```

### 🔍 풀이
```python
numbers = [1, 3, 4, 6, 9, 12, 15, 20]
evens = [x for x in numbers if x % 2 == 0]
print("짝수 리스트:", evens)
```

---

이 연습문제들은 파이썬 기초 문법을 익히는 데 도움을 줄 수 있는 예제들로 구성되어 있습니다.

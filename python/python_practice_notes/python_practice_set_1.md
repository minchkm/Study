# 🐍 Python 연습문제 세트 1

## ✅ 문제 1: 세 수 중 가장 큰 수 찾기
### 🔍 풀이
```python
a = int(input("첫 번째 수: "))
b = int(input("두 번째 수: "))
c = int(input("세 번째 수: "))
print("가장 큰 수는:", max(a, b, c))
```

---

## ✅ 문제 2: 구구단 짝수 단만 출력
### 🔍 풀이
```python
for dan in range(2, 10, 2):
    print(f"\n--- {dan}단 ---")
    for i in range(1, 10):
        print(f"{dan} x {i} = {dan * i}")
```

---

## ✅ 문제 3: 문자열 길이 세기
### 🔍 풀이
```python
text = input("문자열을 입력하세요: ")
print("길이:", len(text))
```

---


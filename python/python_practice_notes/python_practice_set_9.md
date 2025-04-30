# 🐍 Python 연습문제 세트 9

## ✅ 문제 1: 특정 구간의 합
### 🔍 풀이
```python
start = 10
end = 20
print(f"{start}부터 {end}까지의 합:", sum(range(start, end + 1)))
```

---

## ✅ 문제 2: 문자 개수 세기 (a~z)
### 🔍 풀이
```python
text = input("문자열 입력: ")
from collections import Counter
counts = Counter(text)
for char in sorted(counts):
    print(char, ":", counts[char])
```

---

## ✅ 문제 3: 짝수 인덱스 문자만 출력
### 🔍 풀이
```python
text = input("문자열 입력: ")
print("짝수 인덱스 문자:", text[::2])
```

---


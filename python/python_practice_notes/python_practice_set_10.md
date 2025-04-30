# 🐍 Python 연습문제 세트 10

## ✅ 문제 1: 리스트에서 최빈값 구하기
### 🔍 풀이
```python
from statistics import mode
nums = [1, 2, 2, 3, 4]
print("최빈값:", mode(nums))
```

---

## ✅ 문제 2: 문자열 중복 제거
### 🔍 풀이
```python
text = "aabbccddeeff"
unique = ''.join(sorted(set(text)))
print("중복 제거:", unique)
```

---

## ✅ 문제 3: 리스트 내 음수 제거
### 🔍 풀이
```python
nums = [3, -1, 5, -7, 2]
positives = [n for n in nums if n >= 0]
print("음수 제거:", positives)
```

---


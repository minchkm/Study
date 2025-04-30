# 🐍 Python 연습문제 세트 8

## ✅ 문제 1: 리스트 정렬하기
### 🔍 풀이
```python
nums = [5, 2, 9, 1, 7]
nums.sort()
print("정렬된 리스트:", nums)
```

---

## ✅ 문제 2: 리스트에서 중복 제거 후 정렬
### 🔍 풀이
```python
nums = [3, 3, 2, 5, 2, 1]
unique_sorted = sorted(set(nums))
print("중복 제거 및 정렬:", unique_sorted)
```

---

## ✅ 문제 3: 문자열에 숫자만 남기기
### 🔍 풀이
```python
text = "abc123def456"
digits = ''.join([c for c in text if c.isdigit()])
print("숫자만:", digits)
```

---


# 🐍 Python 연습문제 세트 7

## ✅ 문제 1: 요소 교환
### 🔍 풀이
```python
a = [1, 2, 3]
a[0], a[2] = a[2], a[0]
print("교환 결과:", a)
```

---

## ✅ 문제 2: 리스트 내 특정 값 제거
### 🔍 풀이
```python
lst = [1, 2, 3, 4, 2, 5]
value = 2
lst = [x for x in lst if x != value]
print("2 제거:", lst)
```

---

## ✅ 문제 3: 알파벳 포함 여부 확인
### 🔍 풀이
```python
text = input("문자열 입력: ")
if any(c.isalpha() for c in text):
    print("알파벳 포함됨")
else:
    print("알파벳 없음")
```

---


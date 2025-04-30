# 🐍 Python 연습문제 세트 2

## ✅ 문제 1: 리스트에서 홀수만 출력
### 🔍 풀이
```python
nums = [3, 6, 9, 12, 15, 17]
odds = [n for n in nums if n % 2 != 0]
print("홀수:", odds)
```

---

## ✅ 문제 2: 역순 출력
### 🔍 풀이
```python
lst = [1, 2, 3, 4, 5]
print("역순:", lst[::-1])
```

---

## ✅ 문제 3: 알파벳 개수 세기
### 🔍 풀이
```python
text = input("문자열 입력: ")
count = 0
for c in text:
    if c.isalpha():
        count += 1
print("알파벳 수:", count)
```

---


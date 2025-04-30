# 🐍 Python 연습문제 세트 3

## ✅ 문제 1: 특정 숫자 개수 세기
### 🔍 풀이
```python
nums = [1, 2, 3, 2, 4, 2, 5]
print("2의 개수:", nums.count(2))
```

---

## ✅ 문제 2: 대소문자 변환
### 🔍 풀이
```python
text = input("문자열 입력: ")
print("대문자:", text.upper())
print("소문자:", text.lower())
```

---

## ✅ 문제 3: 짝수와 홀수 개수 출력
### 🔍 풀이
```python
nums = [1, 2, 3, 4, 5, 6]
even = len([n for n in nums if n % 2 == 0])
odd = len([n for n in nums if n % 2 != 0])
print("짝수:", even, "홀수:", odd)
```

---


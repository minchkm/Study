# 🐍 Python 연습문제 세트 6

## ✅ 문제 1: 단어 개수 세기
### 🔍 풀이
```python
text = "Life is short you need python"
print("단어 수:", len(text.split()))
```

---

## ✅ 문제 2: 평균보다 큰 수
### 🔍 풀이
```python
nums = [10, 20, 30, 40, 50]
avg = sum(nums) / len(nums)
above_avg = [x for x in nums if x > avg]
print("평균 이상 수:", above_avg)
```

---

## ✅ 문제 3: 팰린드롬 확인
### 🔍 풀이
```python
text = input("문자열 입력: ")
if text == text[::-1]:
    print("팰린드롬입니다.")
else:
    print("아닙니다.")
```

---


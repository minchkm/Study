# 🐍 Python 연습문제 세트 11

## ✅ 문제 1: 문자열 길이별 정렬
### 🔍 풀이
```python
words = ["apple", "hi", "banana", "cat"]
words.sort(key=len)
print("길이순 정렬:", words)
```

---

## ✅ 문제 2: 중복 문자 제거한 문자열 출력
### 🔍 풀이
```python
text = "banana"
result = "".join(sorted(set(text), key=text.index))
print("중복 제거 문자열:", result)
```

---

## ✅ 문제 3: 딕셔너리로 학점 계산
### 🔍 풀이
```python
scores = {"국어": 90, "영어": 85, "수학": 95}
average = sum(scores.values()) / len(scores)
print("평균 점수:", average)
```

---


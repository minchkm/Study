# 🐍 Python 연습문제 세트 12

## ✅ 문제 1: 공배수 구하기
### 🔍 풀이
```python
n1 = 3
n2 = 4
print("1부터 100 사이의 공배수:", [i for i in range(1, 101) if i % n1 == 0 and i % n2 == 0])
```

---

## ✅ 문제 2: 대각선 출력
### 🔍 풀이
```python
size = 5
for i in range(size):
    print(" " * i + "*")
```

---

## ✅ 문제 3: 두 문자열이 애너그램인지 확인
### 🔍 풀이
```python
a = "listen"
b = "silent"
print("애너그램 여부:", sorted(a) == sorted(b))
```

---


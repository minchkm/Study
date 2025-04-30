# 📘 Chapter 03 - 연산자 총정리

## 산술 연산자
```c
int a = 10, b = 3;
printf("%d\n", a + b);  // 13
printf("%d\n", a - b);  // 7
printf("%d\n", a * b);  // 30
printf("%d\n", a / b);  // 3
printf("%d\n", a % b);  // 1
```

정수 나눗셈은 소수점 버리니까 주의!

## 관계 연산자
```c
printf("%d\n", a > b);  // 1 (true)
printf("%d\n", a == b); // 0 (false)
```

## 논리 연산자
```c
int x = 1, y = 0;
printf("%d\n", x && y);  // 0
printf("%d\n", x || y);  // 1
printf("%d\n", !x);      // 0
```

# 📘 Chapter 08 - 포인터

## 포인터 기본
```c
int a = 10;
int *p = &a;

printf("%d\n", *p);  // 10
```

## 포인터와 배열
```c
int arr[3] = {1, 2, 3};
int *p = arr;
printf("%d\n", *(p + 1));  // 2
```

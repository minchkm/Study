# 📘 Chapter 06 - 배열과 문자열

## 배열 선언
```c
int arr[5] = {1, 2, 3, 4, 5};
```

## 문자열
```c
char str[] = "hello";
printf("%s\n", str);
```

문자열은 `\0`(null 문자)로 끝나야 함.

## 문자열 함수
```c
#include <string.h>

char str1[20] = "Hello";
char str2[20] = "World";

strcat(str1, str2); // str1에 str2 붙이기
printf("%s\n", str1);  // HelloWorld
```

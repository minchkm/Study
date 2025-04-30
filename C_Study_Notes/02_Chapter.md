# 📘 Chapter 02 - 변수랑 자료형 정리

## 변수 선언
```c
int a;
float b;
char c;
```

변수는 메모리에 공간을 할당받는 느낌. 자료형에 따라 크기가 다름.

## 주요 자료형 크기 확인

```c
#include <stdio.h>

int main() {
    printf("int: %lu bytes\n", sizeof(int));
    printf("float: %lu bytes\n", sizeof(float));
    printf("char: %lu bytes\n", sizeof(char));
    return 0;
}
```

내 컴 기준 출력:
```
int: 4 bytes
float: 4 bytes
char: 1 bytes
```

`sizeof()`는 자료형이나 변수의 크기를 확인할 때 자주 씀.

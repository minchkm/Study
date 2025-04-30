# 📘 Chapter 01 - C 언어 시작하기

## 왜 C 언어를 공부할까?
요즘은 파이썬, 자바 같은 고급 언어가 많지만 C는 여전히 시스템 프로그래밍, 임베디드 분야에서 많이 쓰이고 있음.  
게다가 포인터 같은 개념은 다른 언어에선 잘 못 느껴보니까 기본기 다지기엔 딱이라고 생각함.

## 컴파일러 설치
나는 MinGW 설치해서 gcc 컴파일러 씀.  
설치 끝나면 터미널에서 `gcc --version`으로 잘 설치됐는지 확인.

## 첫 번째 C 프로그램

```c
#include <stdio.h>

int main() {
    printf("Hello, World!\n");
    return 0;
}
```

## 컴파일 & 실행
```bash
gcc hello.c -o hello
./hello
```

이렇게 하면 `Hello, World!` 출력됨. 간단하지만 C의 시작은 여기서부터!

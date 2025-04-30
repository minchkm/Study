# 💻 C 언어 연습문제 세트 10

## ✅ 문제 1: 정수 입력받아 출력
### 🔍 풀이
```c
#include <stdio.h>
int main() {
    int n;
    printf("정수 입력: ");
    scanf("%d", &n);
    printf("입력한 수: %d\n", n);
    return 0;
}
```

---

## ✅ 문제 2: 짝수 홀수 판별
### 🔍 풀이
```c
#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    if (n % 2 == 0)
        printf("짝수\n");
    else
        printf("홀수\n");
    return 0;
}
```

---

## ✅ 문제 3: 배열의 합 구하기
### 🔍 풀이
```c
#include <stdio.h>
int main() {
    int arr[5] = {1, 2, 3, 4, 5}, sum = 0;
    for (int i = 0; i < 5; i++) sum += arr[i];
    printf("합계: %d\n", sum);
    return 0;
}
```

---


# 📘 Chapter 04 - 조건문 (if, switch)

## if 문 기본
```c
int score = 80;
if (score >= 90) {
    printf("A\n");
} else if (score >= 80) {
    printf("B\n");
} else {
    printf("C\n");
}
```

## switch 문
```c
int num = 2;
switch (num) {
    case 1:
        printf("One\n");
        break;
    case 2:
        printf("Two\n");
        break;
    default:
        printf("Other\n");
}
```

`break` 안 쓰면 밑으로 계속 실행됨.

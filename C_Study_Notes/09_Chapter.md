# 📘 Chapter 09 - 구조체

## 구조체 정의
```c
struct Person {
    char name[20];
    int age;
};

struct Person p1 = {"Alice", 30};
```

## 구조체 배열
```c
struct Person people[2] = {
    {"Alice", 30},
    {"Bob", 25}
};
```

## Chapter 2. 연산자와 제어문

### 2.1 연산자(Operators)

자바에서는 다양한 연산자를 제공함. 대표적으로 산술, 대입, 비교, 논리, 증감, 조건(삼항) 연산자가 있음.

#### 2.1.1 산술 연산자

| 연산자 | 설명   | 예시    |
| ------ | ------ | ------- |
| +      | 덧셈   | a + b   |
| -      | 뺄셈   | a - b   |
| *      | 곱셈   | a * b   |
| /      | 나눗셈 | a / b   |
| %      | 나머지 | a % b   |

```java
int a = 10, b = 3;
System.out.println(a + b); // 13
System.out.println(a / b); // 3 (정수 나눗셈)
System.out.println(a % b); // 1 

```

#### 2.1.2 대입 연산자

| 연산자 | 설명        | 예시    |
| ------ | ----------- | ------- |
| =      | 값 할당     | a = 5   |
| +=     | 더해서 할당 | a += 3  |
| -=     | 빼서 할당   | a -= 2  |
| *=     | 곱해서 할당 | a *= 4  |
| /=     | 나눠서 할당 | a /= 2  |
| %=     | 나머지 할당 | a %= 3  |

#### 2.1.3 비교 연산자

| 연산자 | 설명        | 예시    |
| ------ | ----------- | ------- |
| ==     | 같다        | a == b  |
| !=     | 다르다      | a != b  |
| >      | 크다        | a > b   |
| <      | 작다        | a < b   |
| >=     | 크거나 같다 | a >= b  |
| <=     | 작거나 같다 | a <= b  |

#### 2.1.4 논리 연산자

| 연산자 | 설명         | 예시              |
| ------ | ------------ | ----------------- |
| &&     | 그리고(AND)  | a > 0 && b < 10   |
| ||     | 또는(OR)     | a > 0 || b < 0    |
| !      | 부정(NOT)    | !(a == b)         |

#### 2.1.5 증감 연산자

| 연산자 | 설명   | 예시  |
| ------ | ------ | ----- |
| ++     | 1 증가 | a++   |
| --     | 1 감소 | a--   |

#### 2.1.6 조건(삼항) 연산자
```java
int max = (a > b) ? a : b;
```
---

### 2.2 제어문(Control Statements)

프로그램의 흐름을 제어하는 문장. 조건문과 반복문이 있음.

#### 2.2.1 조건문

##### if문
```java
if (score >= 90) {
    System.out.println("A학점");
} else if (score >= 80) {
    System.out.println("B학점");
} else {
    System.out.println("C학점 이하");
}
```

##### switch문
```java
switch (grade) {
    case 'A':
        System.out.println("우수");
        break;
    case 'B':
        System.out.println("보통");
        break;
    default:
        System.out.println("노력 필요");
}
```

#### 2.2.2 반복문

##### for문
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
##### while문
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
##### do-while문
```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```
---

### 2.3 break와 continue

- break: 반복문을 즉시 종료
- continue: 이후 코드를 건너뛰고 다음 반복 진행
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    if (i == 5) break;
    System.out.println(i);
}
// 출력: 1 2 4
```
---

### 2.4 종합 예제
```java
public class ControlExample {
    public static void main(String[] args) {
        int score = 85;
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else {
            System.out.println("C학점 이하");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("반복: " + i);
        }
    }
}
```
---

### 2.5 연습문제

- 1부터 10까지의 합을 구하는 코드를 for문, while문 각각으로 작성해보기
- 사용자로부터 점수를 입력받아(Scanner 사용) 학점을 출력하는 프로그램 작성
- switch문을 사용해서 요일(1~7)을 입력받아 무슨 요일인지 출력하는 코드 작성

---

### 2.6 참고자료

- 자바 연산자 공식 문서  
- 생활코딩 - 자바 제어문 강의

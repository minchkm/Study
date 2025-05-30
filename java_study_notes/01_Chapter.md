## Chapter 1. 변수와 자료형

### 1.1 변수
변수는 데이터를 저장하는 공간임. 자바에서는 변수를 선언할 때 자료형을 반드시 명시해야 함.

```java
int age = 24;
double height = 172.5;
char grade = 'A';
String name = "홍길동";
boolean isStudent = true;
```

### 1.2 자료형
자바의 자료형은 크게 기본형(primitive type)과 참조형(reference type)으로 구분함.

#### 기본형(primitive type)

| 자료형 | 크기    | 예시 값        | 설명     |
|--------|---------|----------------|----------|
| byte   | 1바이트 | 100            | 작은 정수 |
| short  | 2바이트 | 32000          | 작은 정수 |
| int    | 4바이트 | 123456         | 일반 정수 |
| long   | 8바이트 | 123456789L     | 큰 정수   |
| float  | 4바이트 | 3.14f          | 실수     |
| double | 8바이트 | 3.141592       | 정밀 실수 |
| char   | 2바이트 | 'A'            | 문자     |
| boolean| 1바이트 | true/false     | 논리값   |

#### 참조형(reference type)
문자열, 배열, 클래스, 인터페이스, 열거형 등이 있음.

```java
String message = "Hello, Java!";
int[] numbers = {1, 2, 3, 4, 5};
```

### 1.3 변수 선언과 초기화
변수는 선언만 할 수도 있고, 선언과 동시에 값을 할당할 수도 있음. 자바에서는 변수를 사용하기 전에 반드시 초기화해야 함.

```java
int score;        // 선언
score = 90;       // 값 할당

double pi = 3.1415; // 선언과 동시에 초기화
```

### 1.4 상수(final)
상수는 한 번 값이 정해지면 변경할 수 없음. `final` 키워드로 선언함. 상수명은 대문자로 작성하는 것이 관례임.

```java
final double PI = 3.141592;
final int MAX_STUDENT = 30;
```

### 1.5 자료형 변환
서로 다른 자료형 간에는 변환이 필요함.

#### 자동 형변환 (묵시적 변환)
작은 크기의 자료형에서 큰 크기의 자료형으로는 자동 변환됨.

```java
int a = 10;
double b = a; // int → double 자동 변환
```

#### 강제 형변환 (명시적 변환)
큰 크기의 자료형에서 작은 크기의 자료형으로 변환할 때는 형변환 연산자를 사용함.

```java
double x = 3.14;
int y = (int) x; // 소수점 이하가 잘려서 3이 됨
```

### 1.6 변수와 자료형 종합 예제

```java
public class VariableExample {
    public static void main(String[] args) {
        int age = 24;
        double height = 172.5;
        char grade = 'A';
        String name = "홍길동";
        boolean isStudent = true;

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("학점: " + grade);
        System.out.println("학생 여부: " + isStudent);
    }
}
```

// 위 코드는 여러 자료형의 변수를 선언하고 값을 할당한 뒤 출력함.

### 1.7 연습문제

- 자신의 이름, 나이, 키, 학점, 학생 여부를 변수로 선언하고 한 줄로 출력하는 코드 작성.
- 아래 코드의 실행 결과 예측 및 실제 실행:

```java
int x = 7;
double y = 2.5;
System.out.println(x + y);
System.out.println((int)y);
```

- 상수로 원의 반지름과 원주율(3.14)을 선언하고, 원의 넓이를 구하는 코드 작성.

### 1.8 참고자료
- 자바의 기본 자료형 공식 문서
- 생활코딩 - 자바 변수와 자료형 강의

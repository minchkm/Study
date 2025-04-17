## Chapter 2. 연산자와 제어문 - 연습문제 & 풀이

### 문제 1
두 정수를 입력받아 두 수의 합, 차, 곱, 몫, 나머지를 출력하는 프로그램을 작성하시오.
```java
import java.util.Scanner;
public class Calc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("합: " + (a + b));
System.out.println("차: " + (a - b));
System.out.println("곱: " + (a * b));
System.out.println("몫: " + (a / b));
System.out.println("나머지: " + (a % b));
}
}
```


**설명:**  
Scanner로 두 정수를 입력받아 각각의 연산 결과를 출력한다.

---
```java
### 문제 2
정수 n을 입력받아 1부터 n까지의 합을 for문과 while문으로 각각 출력하시오.

// for문
int n = 10; // 예시
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i;
}
System.out.println("for문 합: " + sum);

// while문
int m = 10; // 예시
int sum2 = 0, i = 1;
while (i <= m) {
sum2 += i;
i++;
}
System.out.println("while문 합: " + sum2);

text
**설명:**  
for문과 while문 모두 1부터 n까지 반복하며 합계를 구한다.
```
---
```java
### 문제 3
switch문을 이용해 1~7 사이의 숫자를 입력받아 요일을 출력하시오.

int day = 3; // 예시
switch (day) {
case 1: System.out.println("일요일"); break;
case 2: System.out.println("월요일"); break;
case 3: System.out.println("화요일"); break;
case 4: System.out.println("수요일"); break;
case 5: System.out.println("목요일"); break;
case 6: System.out.println("금요일"); break;
case 7: System.out.println("토요일"); break;
default: System.out.println("잘못된 입력");
}

```java
**설명:**  
switch문으로 입력값에 따라 요일을 출력한다.

---

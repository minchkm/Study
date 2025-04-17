## Chapter 4. 배열과 컬렉션 - 연습문제 & 풀이

### 문제 1
정수 5개를 입력받아 배열에 저장하고, 모든 요소의 합과 평균을 출력하시오.
```java
import java.util.Scanner;
public class ArraySumAvg {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] arr = new int;
int sum = 0;
for (int i = 0; i < 5; i++) {
arr[i] = sc.nextInt();
sum += arr[i];
}
double avg = sum / 5.0;
System.out.println("합: " + sum + ", 평균: " + avg);
}
}

```
**설명:**  
배열에 입력을 저장하고, 합과 평균을 계산한다.

---

### 문제 2
ArrayList를 사용해 문자열 3개를 입력받아 모두 출력하시오.
```java
import java.util.ArrayList;
import java.util.Scanner;
public class ListTest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> list = new ArrayList<>();
for (int i = 0; i < 3; i++) {
list.add(sc.nextLine());
}
for (String s : list) {
System.out.println(s);
}
}
}

```
**설명:**  
ArrayList에 문자열을 저장하고, 향상된 for문으로 출력한다.

---

### 문제 3
2차원 배열을 사용해 3x3 행렬의 대각선 합을 출력하시오.
```java

int[][] arr = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
int sum = 0;
for (int i = 0; i < 3; i++) {
sum += arr[i][i];
}
System.out.println("대각선 합: " + sum); // 1+5+9=15

```
**설명:**  
2차원 배열의 [i][i] 위치의 값을 더한다.

---

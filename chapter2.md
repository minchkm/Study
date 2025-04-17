2장. 연산자와 제어문
2.1 연산자
산술 연산자
연산자	설명	예시	결과
+	덧셈	3 + 2	5
-	뺄셈	3 - 2	1
*	곱셈	3 * 2	6
/	나눗셈	3 / 2	1.5
%	나머지	3 % 2	1
++	증가	a++	a+1
--	감소	a--	a-1
코드 예시
java
int a = 7;
int b = 3;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
비교 연산자
연산자	설명	예시	결과
==	같다	3 == 2	false
!=	다르다	3 != 2	true
>	크다	3 > 2	true
<	작다	3 < 2	false
>=	크거나 같다	3 >= 2	true
<=	작거나 같다	3 <= 2	false
논리 연산자
연산자	설명	예시	결과
&&	그리고	true && false	false
||	또는	true || false	true
!	부정	!true	false
코드 예시
java
int x = 5;
System.out.println(x == 5);
System.out.println(x != 3);
System.out.println(x > 2);
System.out.println(x < 10);
System.out.println(x >= 5);
System.out.println(x <= 4);

boolean a = true;
boolean b = false;
System.out.println(a && b);
System.out.println(a || b);
System.out.println(!a);
2.2 제어문
if, else if, else
java
int score = 85;
if (score >= 90) {
    System.out.println("A학점");
} else if (score >= 80) {
    System.out.println("B학점");
} else {
    System.out.println("C학점 이하");
}
switch문
java
int month = 3;
switch(month) {
    case 3:
    case 4:
    case 5:
        System.out.println("봄");
        break;
    case 6:
    case 7:
    case 8:
        System.out.println("여름");
        break;
    case 9:
    case 10:
    case 11:
        System.out.println("가을");
        break;
    default:
        System.out.println("겨울");
}
반복문
for문
java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
while문
java
int count = 0;
while (count < 3) {
    System.out.println(count);
    count++;
}
do-while문
java
int n = 0;
do {
    System.out.println(n);
    n++;
} while (n < 3);
break, continue
java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;
    if (i % 2 == 0) continue;
    System.out.println(i);
}
2.3 연습문제
1부터 100까지의 합을 구하는 코드를 작성하시오.

구구단 2단을 출력하는 코드를 작성하시오.

정수를 입력받아 짝수/홀수 판별하는 코드를 작성하시오.

2.4 참고자료
자바 연산자 공식 문서

생활코딩 - 자바 제어문

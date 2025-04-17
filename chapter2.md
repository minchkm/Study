Chapter 2. 연산자
자바에서는 값을 계산하거나 비교하거나 논리 판단을 하기 위해 다양한 연산자를 제공함. 종류는 많지만 기본적인 것부터 확실히 익히는 게 좋음.

2.1 산술 연산자
숫자 계산에 사용되는 기본 연산자들.
+, -, *, /, % 다섯 개가 있음.

java
복사
편집
int a = 10;
int b = 3;

System.out.println(a + b); // 13
System.out.println(a - b); // 7
System.out.println(a * b); // 30
System.out.println(a / b); // 3 (몫만 출력됨)
System.out.println(a % b); // 1 (나머지)
/ 연산은 정수 나눗셈일 경우 소수점 아래는 잘려나감.

%는 나눗셈의 나머지를 구함.

2.2 증감 연산자
변수를 1씩 증가(++) 또는 감소(--)시킬 때 사용함. 전위와 후위가 있음.

java
복사
편집
int x = 5;
System.out.println(++x); // 6 (먼저 증가 후 출력)
System.out.println(x--); // 6 (출력 후 감소, 다음 x는 5)
2.3 비교 연산자
두 값을 비교해서 true 또는 false 값을 반환함.


연산자	설명	예시
==	같다	a == b
!=	다르다	a != b
>	크다	a > b
<	작다	a < b
>=	크거나 같다	a >= b
<=	작거나 같다	a <= b
2.4 논리 연산자
조건을 여러 개 결합할 때 사용함. 주로 boolean 값에 사용함.


연산자	설명	예시
&&	AND	(age >= 20 && age < 30)
||	OR	(a > 10 || b < 5)
!	NOT	!(isStudent)
java
복사
편집
int age = 25;
boolean result = (age >= 20 && age <= 29);
System.out.println(result); // true
2.5 대입 연산자
값을 변수에 대입하거나 연산 후 대입하는 데 사용함.

java
복사
편집
int a = 10;
a += 5;  // a = a + 5; → 15
a *= 2;  // a = a * 2; → 30
2.6 삼항 연산자 (조건 연산자)
조건식 ? 참일 때 값 : 거짓일 때 값

java
복사
편집
int score = 85;
String grade = (score >= 90) ? "A" : "B 이하";
System.out.println(grade); // B 이하
2.7 연산자 우선순위
*, /, % > +, - > 비교 > 논리 > 대입

헷갈릴 땐 괄호로 묶어서 순서 정해주면 됨

java
복사
편집
int result = 3 + 4 * 2;       // 11
int result2 = (3 + 4) * 2;    // 14
2.8 연습문제
[문제 1]
두 정수를 입력받아 사칙연산 결과를 모두 출력하는 코드 작성

[문제 2]
나이가 20 이상이면 "성인", 아니면 "청소년" 출력

[문제 3]
아래 코드의 결과 예측하고, 실제 결과와 비교해보기

java
복사
편집
int a = 7;
int b = 2;
System.out.println(a / b);
System.out.println(a % b);
System.out.println((a > b) && (b != 0));

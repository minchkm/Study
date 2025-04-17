## Chapter 3. 메서드와 클래스 - 연습문제 & 풀이
```java
### 문제 1
정수 두 개를 입력받아 합을 반환하는 메서드 sum(int a, int b)를 작성하시오.

public static int sum(int a, int b) {
return a + b;
}
// 사용 예시
System.out.println(sum(10, 20)); // 30

```
**설명:**  
매개변수 두 개를 받아 합을 반환하는 메서드.

---

### 문제 2
```java
Person 클래스를 만들고 이름(name)과 나이(age)를 필드로 선언, introduce() 메서드로 자기소개를 출력하시오.

public class Person {
String name;
int age;
public Person(String name, int age) {
this.name = name;
this.age = age;
}
public void introduce() {
System.out.println("안녕하세요, 저는 " + name + "이고, " + age + "살입니다.");
}
}
// 사용 예시
Person p = new Person("홍길동", 23);
p.introduce();

```
**설명:**  
생성자와 메서드를 활용해 객체의 정보를 출력한다.

---

### 문제 3
Car 클래스를 만들고, model과 year를 필드로 선언, 생성자와 printInfo() 메서드를 구현하시오.
```java

public class Car {
String model;
int year;
public Car(String model, int year) {
this.model = model;
this.year = year;
}
public void printInfo() {
System.out.println("모델명: " + model + ", 연식: " + year);
}
}
// 사용 예시
Car c = new Car("소나타", 2022);
c.printInfo();

```
**설명:**  
생성자에서 필드를 초기화하고, 메서드에서 정보를 출력한다.

---

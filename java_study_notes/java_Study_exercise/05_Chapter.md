## Chapter 5. 객체지향 프로그래밍 - 연습문제 & 풀이

### 문제 1
```java
Animal 클래스를 만들고, Dog와 Cat이 sound()를 오버라이딩하도록 구현하시오.

public class Animal {
public void sound() {
System.out.println("동물이 소리를 냅니다.");
}
}
public class Dog extends Animal {
@Override
public void sound() {
System.out.println("멍멍");
}
}
public class Cat extends Animal {
@Override
public void sound() {
System.out.println("야옹");
}
}
// 사용 예시
Animal a1 = new Dog();
Animal a2 = new Cat();
a1.sound(); // 멍멍
a2.sound(); // 야옹

```
**설명:**  
상속과 오버라이딩을 이용해 다형성을 구현한다.

---

### 문제 2
Engine 클래스를 Car에 합성하여 start() 메서드에서 엔진 시동과 자동차 출발을 출력하시오.
```java

public class Engine {
public void ignite() {
System.out.println("엔진 시동");
}
}
public class Car {
private Engine engine = new Engine();
public void start() {
engine.ignite();
System.out.println("자동차 출발!");
}
}
// 사용 예시
Car car = new Car();
car.start();

```
**설명:**  
Car가 Engine을 필드로 포함(합성)하여 기능을 위임한다.

---

### 문제 3
try-catch문으로 0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하시오.
```java

try {
int result = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("0으로 나눌 수 없습니다.");
}

```
**설명:**  
예외 발생 시 catch 블록에서 메시지를 출력한다.

---

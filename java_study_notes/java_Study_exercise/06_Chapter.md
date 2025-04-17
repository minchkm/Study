## Chapter 6. 인터페이스와 추상 클래스 - 연습문제 & 풀이

### 문제 1
인터페이스 Shape을 만들고, Circle과 Rectangle이 넓이를 계산하도록 구현하시오.
```java
public interface Shape {
double area();
}
public class Circle implements Shape {
private double r;
public Circle(double r) { this.r = r; }
public double area() { return Math.PI * r * r; }
}
public class Rectangle implements Shape {
private double w, h;
public Rectangle(double w, double h) { this.w = w; this.h = h; }
public double area() { return w * h; }
}
// 사용 예시
Shape s1 = new Circle(2);
Shape s2 = new Rectangle(3, 4);
System.out.println(s1.area()); // 12.566...
System.out.println(s2.area()); // 12.0

```
**설명:**  
인터페이스를 구현하여 각 도형의 넓이 계산 메서드를 제공한다.

---

### 문제 2
추상 클래스 Vehicle을 만들고, Car와 Bike가 각각 move()를 구현하도록 하시오.
```java

public abstract class Vehicle {
public abstract void move();
}
public class Car extends Vehicle {
public void move() { System.out.println("차가 달립니다."); }
}
public class Bike extends Vehicle {
public void move() { System.out.println("자전거가 달립니다."); }
}
// 사용 예시
Vehicle v1 = new Car();
Vehicle v2 = new Bike();
v1.move(); // 차가 달립니다.
v2.move(); // 자전거가 달립니다.

```
**설명:**  
추상 클래스를 상속받아 각 교통수단의 이동 방식을 구현한다.

---

### 문제 3
Movable, Attackable 인터페이스를 구현하는 Robot 클래스를 작성하시오.
```java

public interface Movable {
void move();
}
public interface Attackable {
void attack();
}
public class Robot implements Movable, Attackable {
public void move() { System.out.println("로봇이 이동합니다."); }
public void attack() { System.out.println("로봇이 공격합니다."); }
}
// 사용 예시
Robot r = new Robot();
r.move(); // 로봇이 이동합니다.
r.attack(); // 로봇이 공격합니다.

```
**설명:**  
다중 인터페이스 구현을 통해 여러 기능을 가진 클래스를 작성한다.

---

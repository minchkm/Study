/*
 * 1. 부모와 자손에서 동일한 멤버변수명이 정의된 경우 호출되는 변수 결정은 참조변수 타입에 의해 결정된다.
 * 2. 업캐스팅 이후 오버라이딩한 메서드 호출한 경우 참조변수가 실제 가리키는 객체 타입에 의해서 결정된다.
 */


class Mother08 {
	int x = 100;
	
	void method() {
		System.out.println("부모클래스 메서드");
	}
}

class Child08 extends Mother08 {
	int x = 200;

	@Override
	void method() {
		System.out.println("오버라이딩한 메서드");
	}
	
	
}

public class RefCast08 {

	public static void main(String[] args) {
		
		Mother08 m = new Child08();
		
		System.out.println("m.x = " + m.x);	// 부모와 자손에서 동일한 멤버변수가 정의된 경우
											// 호출되는 변수의 결정은 참조변수 타입에 의해 결정됨

		m.method();		// 업캐스팅 이후 오버라이딩한 메소드를 호출. 이 경우 참조변수가 실제 가리키는
						// 객체 타입에 의해서 호출되는 메서드가 결정됨
		
		Child08 ch = new Child08();
		ch.method();
		System.out.println("ch.x = " + ch.x);	// 200
		
		Mother08 m2 = new Mother08();
		m2.method();
		System.out.println("m2.x = " + m2.x);	// 100
	
	}

}

/*
 * 두 부모 인터페이스의 디폴트 메서드 이름이 동일한 경우 다중 상속한 자손클래스에서 디폴트 메서드를 오버라이딩해야 한다.
 */

interface InterA {
	default void display() {
		System.out.println("InterA display()");
	}
	
	static void staticMethod() {
		System.out.println("자바 8버전에서 정적 메서드가 추가됨");
	}
}

interface InterB {
	default void display() {
		System.out.println("InterB display()");
	}
}

class ChildClass02 implements InterA, InterB {

	@Override
	public void display() {
		System.out.println("오버라이딩한 디폴트 메서드");
	}
}

public class InterEx02 {

	public static void main(String[] args) {
		
		ChildClass02 child = new ChildClass02();
		child.display();
	}
}

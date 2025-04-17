/*
 * 1. 부모 인터페이스에 추가된 추상메서드는 반드시 이를 구현 상속한 자손클래스에서 오버라이딩해야 한다.
 * 자손클래스에서 불필요한 추상메서드를 오버라이딩하는 불편함을 해결하기 위해 디폴트 메서드를 사용한다.
 */

interface ParentInter01 {
	void absMethod();	// public abstract가 생략된 추상메서드
	
	public default void defaultMethod() {
		System.out.println("부모 인터페이스의 디폴트 메서드");
	}
}

class ChildClass01 implements ParentInter01 {

	@Override
	public void absMethod() {
		System.out.println("부모 인터페이스의 추상메서드가 오버라이딩된 것");
	}

	// 선택적으로 필요할 경우 default 메서드 오버라이딩하고 불필요할 경우 안해도 됨
	
	@Override
	public void defaultMethod() {
		System.out.println("부모 인터페이스의 default 메서드는 선택적으로 오버라이딩");
	}
}

public class InterEx01 {

	public static void main(String[] args) {
		
		ChildClass01 child = new ChildClass01();
		child.absMethod();
		child.defaultMethod();

	}

}

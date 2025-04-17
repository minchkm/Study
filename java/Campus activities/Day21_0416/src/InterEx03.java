/*
 * 부모 인터페이스의 디폴트 메서드와 부모클래스의 일반메서드가 동일한 경우 자손에서는 부모 인터페이스의 
 * 디폴트 메서드는 무시하고, 부모클래스의 일반메서드가 상속되어진다.
 */

class ParentClass03 {
	public void display() {
		System.out.println("부모클래스 일반 메서드");
	}
}

interface ParentInter03 {
	default void display() {
		System.out.println("부모 인터페이스의 디폴트 메서드");
	}
}

class ChildClass03 extends ParentClass03 implements ParentInter03 {
	
}

public class InterEx03 {

	public static void main(String[] args) {

		ChildClass03 child03 = new ChildClass03();
		child03.display();		// 부모클래스의 일반 메서드가 상속되어 호출된다.
		
	}

}

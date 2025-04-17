/*
 * 부모 추상클래스를 상속받은 자손클래스에서는 부모의 모든 추상메서드를 오버라이딩해야 자손클래스 객체 생성이 가능
 */

abstract class AbstractClass01 {
	abstract void method01();	// abstract 키워드로 추상메서드 method01() 정의
								// 추상메서드는 { }가 없고, 실행문장이 없어 호출이 불가능
	
	void method02() {
		System.out.println("추상클래스에 일반 메서드도 올 수 있다. method02()");
	}
}

abstract class MiddleClass01 extends AbstractClass01 {
	void method03() {
		System.out.println("일반 메서드 method03()");
	}
}

class SubClass01 extends MiddleClass01 {
	@Override
	void method01() {
		System.out.println("부모의 추상메서드가 오버라이딩된 method01()");
	}
}

public class AbsEx01 {

	public static void main(String[] args) {
		
		SubClass01 sub = new SubClass01();
		sub.method01();		// 자손에서 오버라이딩한 메서드 호출
		sub.method02();		// 상속받아서 호출
		sub.method03();		// 상속받아서 호출

	}

}

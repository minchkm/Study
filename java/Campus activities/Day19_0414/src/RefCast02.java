/*
 * 다운캐스팅이란?
 * 		1. 다운캐스팅을 하려면 사전에 상속관계를 만들어야 함
 * 		2. 다운캐스팅은 부모클래스 타입을 자손 타입으로 내리는 것을 말함
 * 		3. 다운캐스팅을 하기 전 반드시 사전에 업캐스팅을 해야 한다.
 * 		4. 다운캐스팅을 하려면 명시적 형변환(캐스팅) 연산자를 사용해야 한다. (자동형변환 안됨)
 */

class Mother02 {
	void m02() {
		System.out.println("부모클래스로 정의된 메서드 m02()");
	}
}

class Child02 extends Mother02 {
	void ch02() {
		System.out.println("자손클래스로 선언된 메서드 ch02()");
	}
}

public class RefCast02 {

	public static void main(String[] args) {
		
		Mother02 m02 = new Child02();		// 업캐스팅
		Child02 ch02;
		ch02 = (Child02)m02;		// 명시적 형변환 연산자를 사용하여 다운캐스팅
		ch02.m02();
		ch02.ch02();

	}

}

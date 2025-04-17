/*
 * 레퍼런스 간의 형변환 중 업캐스팅 특징
 * 		1. 업캐스팅을 하려면 사전에 상속관계를 만들어야 함
 * 		2. 업캐스팅이란 자손 타입이 부모 타입으로 올라가는 현상
 * 		3. 업캐스팅은 암묵적인 자동 형변환을 해줌
 */

class Mother01 {
	public void m01() {
		System.out.println("부모클래스 메서드 m01()");
	}
}

class Child01 extends Mother01 {
	public void ch01() {
		System.out.println("자손클래스 메서드 ch01()");
	}
}

public class RefCast01 {

	public static void main(String[] args) {
		
		Child01 ch01 = new Child01();
		ch01.m01();		// 상속받아서 호출
		ch01.ch01();	// 자손에서 정의한 메서드
		Mother01 mo;	// 부모클래스 참조변수 선언 (객체주소가 저장되지 않은 참조변수)
		mo = ch01;		// 업캐스팅
		mo.m01();
		
		System.out.println("\n========================\n");
		
		Mother01 m02 = new Child01();	// 업캐스팅
		m02.m01();

	}

}

/*
 * 부모와 동일한 멤버변수가 자손에서 정의된 경우 / 자손에서 메서드가 오버라이딩된 경우 호출되는 변수와 메서드 실습
 * 동일한 멤버변수가 있을 경우 부모로부터 상속받은 멤버변수 접근은 super.변수명
 * 동일 멤버 변수명에 접근할 때는 this.변수명 또는 변수명
 * 멤버변수명 = 속성 = 필드
 */


class Mother10 {
	int a = 100;
	
	void m() {
		System.out.println("부모클래스 메서드");
	}
}

class Child10 extends Mother10 {
	int a = 200;

	@Override
	void m() {
		System.out.println("a = " + a);		// 200
		System.out.println("this.a = " + this.a);	// 200 (this 생략 가능)
		System.out.println("super.a = " + super.a);	// 100
	}
	
	
}

public class RefCast10 {

	public static void main(String[] args) {
		
		Mother10 m = new Child10();		// 업캐스팅
		System.out.println("m.a = " + m.a);	// 100
		m.m();	// 업캐스팅 이후 오버라이딩한 메서드 호출

	}

}

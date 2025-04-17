// 업캐스팅 이후 오버라이딩한 메서드 호출

class Mother06 {
	public void m06() {
		System.out.println("부모클래스 메서드 m06()");
	}
}

class Child06 extends Mother06 {
	
	@Override
	public void m06() {
		System.out.println("오버라이딩한 메서드 m06()");
	}

	public void ch06() {
		System.out.println("자손클래스 메서드 ch06()");
	}
}

public class RefCast06 {

	public static void main(String[] args) {
		
		Mother06 m = new Child06();		// 업캐스팅
		m.m06();	// 업캐스팅 이후 오버라이딩한 메서드 호출. 
					// 참조변수 m이 실제 가리키는 인스턴스 객체 타입에 의해서 호출되는 메서드가 결정됨

	}

}

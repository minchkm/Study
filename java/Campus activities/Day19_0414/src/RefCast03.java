/*
 * 다운캐스팅을 할 때는 사전에 반드시 업캐스팅을 해야 하지만 이것을 하지 않고 명시적 형변환 연산자를 사용해서
 * 다운캐스팅을 하면 자바 컴파일러는 이 부분을 검증하지 못하고 컴파일하여 바이트 코드 클래스 파일을 만든다.
 * 이 클래스파일을 실행 시 예외 오류가 발생한다.
 * 이 부분을 방지하기 위해서 나온 것이 형변환 유무 판단 연산자 instanceof 이다.
 */

class Mother03 {
	void m03() {
		System.out.println("부모 타입 m03()");
	}
}

class Child03 extends Mother03 {
	void ch03() {
		System.out.println("자손 타입 ch03()");
	}
}

public class RefCast03 {

	public static void main(String[] args) {
		
		Mother03 m = new Mother03();	// 사전 업캐스팅을 하지 않음
		Child03 ch = (Child03)m;		// 명시적 다운캐스팅
		
		// 사전에 업캐스팅을 하지 않아서 캐스팅 연산 예외 오류가 발생함
		ch.m03();
		ch.ch03();

	}

}

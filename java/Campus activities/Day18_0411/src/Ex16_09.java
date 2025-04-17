
class A {
	public A() {
		System.out.println("hello from a");
	}
}

class B extends A {
	public B() {
		System.out.println("hello from b");
		super();	// 부모클래스 기본생성자를 먼저 호출하려면 super()는 블록 내 가장 상단에 위치해야 함
	}
}

public class Ex16_09 {

	public static void main(String[] args) {
		
		A a = new B();

	}

}

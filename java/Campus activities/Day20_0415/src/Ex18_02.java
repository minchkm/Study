class A {
	public final int method1() {
		return 0;
	}
}

class B extends A {
	public int method1() {	// final 메서드는 오버라이딩을 할 수 없음
		return 1;
	}
}
public class Ex18_02 {

	public static void main(String[] args) {
		
		B b = new B();
		System.out.println("x = " + b.method1());

	}

}

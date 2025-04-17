
class A2 {
	public String toString() {
		return "4";
	}
}

class B2 extends A2 {
	public String toString() {	// 상속관계에서 메소드 오버라이딩
		return super.toString() + "3";
	}
}

public class Ex16_10 {

	public static void main(String[] args) {
		A2 a = new A2();
		System.out.println(a);	// a.toString()
		System.out.println(new A2());	// new A2().toString
		
		B2 b = new B2();
		System.out.println(b);	// b.toString()
		System.out.println(new B2());	// new B2().toString

	}

}

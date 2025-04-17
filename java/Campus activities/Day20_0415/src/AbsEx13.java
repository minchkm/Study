// 클래스와 클래스 간 직접 연결하는 방식 (자바 프로젝트에서 권하지 않음)

class A1 {
	public void methodA(B1 b) {
		b.methodB();
	}
}

class B1 {
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class AbsEx13 {

	public static void main(String[] args) {
		
		A1 a = new A1();
		a.methodA(new B1());

	}

}

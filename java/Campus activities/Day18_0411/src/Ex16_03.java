
class Parent2 {
	protected int a, b, c;

	public Parent2() {
		System.out.println("Parent 클래스의 디폴트 생성자 호출");
	}
	
	public Parent2(int a, int b, int c) {
		System.out.println("Parent 클래스의 전달인자 3개짜리 생성자 호출");
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

class Child2 extends Parent2 {
	protected int d;
	
	public Child2() {
		System.out.println("Child 클래스의 디폴트 생성자 호출");
	}
	
	public Child2(int a, int b, int c, int d) {
		super(a, b, c);
		System.out.println("Child 클래스의 전달인자 3개짜리 생성자 호출");
		this.d = d;
	}
	
	public void print() {
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
	}
}

public class Ex16_03 {

	public static void main(String[] args) {
		
		Child2 one = new Child2();
		one.print();
		
		System.out.println("\n=======================\n");
		Child2 two = new Child2(10, 20, 30, 40);
		two.print();

	}

}

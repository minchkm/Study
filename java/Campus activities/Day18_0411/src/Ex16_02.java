
class Parent {
	private int a;
	int b;
	protected int c;
	public int d;
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}
}

class Child extends Parent {
	
	public Child(int a, int b, int c, int d) {
		setA(a);
//		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	
	void func() {
		System.out.println(getA());
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


public class Ex16_02 {

	public static void main(String[] args) {

		Child one = new Child(1, 2, 3, 4);
		one.func();
		
	}

}

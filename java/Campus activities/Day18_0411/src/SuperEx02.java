/*
 * this() : 상속과 관련 없음. 같은 클래스 내에서 오버로딩된 다른 생성자를 호출할 때 사용
 * super() : 자손에서 부모클래스
 */

class Father02 {
	int x = 1;
	int y = 2;
	
	Father02(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Son02 extends Father02 {
	int z = 3;
	
	Son02() {
		this(10, 20, 30);
	}
	
	Son02(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void print() {
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
	}
}
public class SuperEx02 {

	public static void main(String[] args) {
		
		Son02 s02 = new Son02();
		s02.print();

	}

}

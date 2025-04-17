// 정적메소드 내에서는 this 를 사용할 수 없다.

class St05 {
	static int a = 10;
	int b = 20;
	
	// 정적 메소드
	static void printA() {
		System.out.println(a);
		System.out.println(this.b);	// 정적메소드 내에서는 this 사용 불가
									// 이유 : this는 클래스 차원이 아닌 객체 입장에서 다루기 때문
	}
	
	// 인스턴스 메소드
	void printB() {
		System.out.println(a);		// 정적 변수 사용 가능
		System.out.println(this.b);	// this 사용 가능
	}
	
	static void printC() {
		System.out.println(b);	// 정적 메소드 내에서 인스턴스 변수 사용 불가
	}
}

public class StaticEx05 {

	public static void main(String[] args) {

	}

}

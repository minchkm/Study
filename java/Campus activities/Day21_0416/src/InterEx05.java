
abstract class Test05 {
	abstract void methodA();	// 추상메서드
	
	abstract void methodB() {	// { }가 있는 경우 abstract 키워드가 없는 일반 메서드가 되어야 한다.
		System.out.println("methodB()");
	}
}

public class InterEx05 {

	public static void main(String[] args) {

	}

}

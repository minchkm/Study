
class TestSuper {
	TestSuper(int i) {}
	// 생성자가 오버로딩되면 전달인자가 없는 기본생성자를 묵시적 제공하지 않는다.
}
class TestSub extends TestSuper{

	/*
	 * 에러 발생 이유
	 * 		부모 TestSuper 클래스가 생성자 오버로딩이 되어서 기본생성자를 묵시적 제공하지 않는다.
	 * 		그런데 자손에서 부모의 기본생성자를 호출하려다가 컴파일 에러가 발생한다.
	 */
}

public class Ex16_06 {

	public static void main(String[] args) {
		
		new TestSub();

	}

}

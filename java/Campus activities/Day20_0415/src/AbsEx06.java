/*
 * final 메서드 특징
 * 		메서드를 final로 선언하면 자손에서 더 이상 오버라이딩을 허용하지 않는다.
 */

class FinalMethod {
	public final void p() {
		
	}
}

class FinalSubClass extends FinalMethod {
	
	@Override
	public void p() {}	// final 메서드는 오버라이딩을 할 수 없음
}

public class AbsEx06 {

	public static void main(String[] args) {

	}

}

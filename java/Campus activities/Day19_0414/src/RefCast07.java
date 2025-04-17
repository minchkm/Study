/*
 * instanceof 연산자는 형변환(업캐스팅/다운캐스팅) 유무 판단 연산자이다.
 * 다운캐스팅을 할 때 캐스팅 연산 예외 오류 발생을 방지하기 위해서 if문과 함께 instanceof 연산자를 사용하는 것이 좋다.
 */

class Car07 {
	
}

class FireEngine07 extends Car07 {
	
}

public class RefCast07 {

	public static void main(String[] args) {
		
		FireEngine07 fe = new FireEngine07();
		
		// fe가 부모 Car07 타입으로 업캐스팅이 가능한가? -> true
		if (fe instanceof Car07) {
			System.out.println("업캐스팅이 가능합니다.");
		}
		
		// fe가 자바 최상위 부모클래스 Object 타입으로 업캐스팅이 가능한가? -> true
		if (fe instanceof Object) {
			System.out.println("업캐스팅이 가능합니다.");
		}
		
		Object obj = new FireEngine07();	// 업캐스팅
		
		// obj가 다운캐스팅이 가능한가? -> true (사전에 업캐스팅을 했으므로 다운캐스팅 가능)
		if(obj instanceof FireEngine07) {
			System.out.println("다운캐스팅이 가능합니다.");
			FireEngine07 fe2 = (FireEngine07)obj;	// 명시적인 다운캐스팅 
		} else {
			System.out.println("다운캐스팅이 불가능합니다.");
		}

	}

}

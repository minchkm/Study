/*
 * 인터페이스 특징
 * 		1. 인터페이스는 interface 키워드로 정의하고 자손클래스에서 implements 키워드로 구현 상속받는다.
 * 		2. 자손클래스에서 하나 이상의 부모 인터페이스로부터 다중 상속을 받을 수 있다.
 * 		3. 인터페이스에 오는 추상메서드는 public abstract 키워드로 정의한다. (생략 가능)
 * 		4. 부모 인터페이스를 구현 상속받은 자손클래스에서 부모의 모든 추상메서드를 반드시 오버라이딩해야 한다.
 */

interface IHello07 {	// 최초 작성한 인터페이스의 부모는 없다.
	void sayHello(String name);		// public abstract가 생략된 추상메서드
									// { }가 없고, 실행 문장이 없고, 호출 불가능
}

class Hello07 implements IHello07 {

	@Override
	public void sayHello(String name) {	// 자손에서 부모 인터페이스의 모든 추상메서드 오버라이딩
		System.out.println(name + "씨 안녕~");
	}
}

public class AbsEx07 {

	public static void main(String[] args) {

		Hello07 h = new Hello07();
		h.sayHello("홍길동");
		IHello07 ih;	// 부모 인터페이스 타입으로 참조변수 선언 가능
		ih = new Hello07();		// 부모 인터페이스 타입으로 업캐스팅 가능
		ih.sayHello("이순신");	// 업캐스팅 이후 오버라이딩한 메서드 호출
	}
}

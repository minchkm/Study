// 부모 클래스와 인터페이스를 자손에서 동시에 상속받는 예제

interface IHello10 {
	public abstract void sayHello(String name);
}

abstract class GoodBye10 {
	public abstract void sayGoodBye(String name);
}

// class 자손클래스 extends 부모(추상)클래스 implements 부모인터페이스
class SubClass10 extends GoodBye10 implements IHello10 {

	@Override
	public void sayHello(String name) {
		System.out.println(name + " 안녕!");
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name + " 잘가!");
	}
	
}

public class AbsEx10 {

	public static void main(String[] args) {

		SubClass10 sub = new SubClass10();
		sub.sayHello("강감찬");
		sub.sayGoodBye("신사임당");
		
	}

}

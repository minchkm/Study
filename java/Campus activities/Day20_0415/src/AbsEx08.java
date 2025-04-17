// 일반 클래스나 추상클래스는 하나 이상의 부모로부터 다중 상속을 받을 수 없고, 단일 상속만 가능하다.

abstract class Hello08 {
	public abstract void sayHello(String name);
}

abstract class GoodBye08 {
	public abstract void sayGoodBye(String name);
}

class SubClass08 extends GoodBye08, Hello08 {	// 추상 클래스는 단일 상속만 가능함
	@Override
	public void sayGoodBye(String name) {
	
	}
	
	@Override
	public void sayHello(String name) {
		
	}
}

public class AbsEx08 {

	public static void main(String[] args) {

	}

}




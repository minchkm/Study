// 클래스 간 직접 연결보다는 중간에 인터페이스를 끼워넣어 간접 연결하는 방식을 사용

interface I14 {
	public abstract void play();
}

class B14 implements I14 {

	@Override
	public void play() {
		System.out.println("play in B14 class");
	}
}

class C14 implements I14 {

	@Override
	public void play() {
		System.out.println("play in C14 class");
	}
}

class A14 {
	void autoPlay(I14 i) {	// 매개변수 다형성
		i.play();		// 업캐스팅 이후 오버라이딩한 메소드 호출
	}
}

public class AbsEx14 {

	public static void main(String[] args) {
		
		A14 a = new A14();
		a.autoPlay(new B14());
		a.autoPlay(new C14());
		
	}

}

// 인터페이스에 오는 모든 변수는 public static final로 인식되는 정적 상수만 올 수 있다.

interface IColor12 {
	int RED = 1;	// public static final 이 생략된 정적 상수 RED
	public static final int GREEN = 2;
	public static final int BULE = 3;
	
	void setColor(int c);	// public abstract 가 생략된 추상메서드
	public abstract int getColor();		// 추상메서드
}

abstract class AbsColor12 implements IColor12 {
	int color = GREEN;		// 추상클래스에는 일반 변수가 올 수 있다.

	@Override
	public void setColor(int c) {
		color = c;
	}
}

class SubClass12 extends AbsColor12 {

	@Override
	public int getColor() {
		return color;
	}
	
}

public class AbsEx12 {

	public static void main(String[] args) {
		
		SubClass12 sub = new SubClass12();
		sub.setColor(IColor12.RED);
		System.out.println(sub.getColor());

	}

}

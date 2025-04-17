/*
 * 매개변수 다형성 문법
 * 		1. 상속, 업케스팅, 메서드 오버라이딩 문법이 적용된 매개변수 다형성이 적용되면
 * 		   자손클래스 개수만큼 메서드 오버로딩을 하지 않아도 된다.
 * 		   그만큼 코드라인이 줄어들고, 중복 코드가 없어 개발 기간이 단축된다.
 * 
 * 		매개변수 다형성 문법이 적용되지 않아서 자손 클래스 개수만큼 매개변수 타입을 다르게 한 
 * 		메서드 오버로딩을 하는 불필요한 중복코드를 확인해보는 예제
 */

import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx03 {
	
	// 매개변수 다형성 문법이 적용된 경우 => 업캐스팅
	static void 입고01(ShapeClass ref) {		// 매개변수 타입이 부모 추상클래스로 선언되면
											// 모든 자손을 업캐스팅하면서 받을 수 있음
		ref.draw();		// 업캐스팅 이후 오버라이딩한 메서드 호출
	}

	// 매개변수 다형성 문법이 적용되지 않은 경우
	// 불필요하게 자손클래스 타입을 다르게 한 메서드 오버로딩을 해야 함
	static void 입고02(Circ c) { c.draw(); }
	static void 입고02(Rect r) { r.draw(); }
	static void 입고02(Tria t) { t.draw(); }
	
	public static void main(String[] args) {

		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		입고01(c);
		입고01(r);
		입고01(t);
		System.out.println("\n======================\n");
		
		입고02(new Circ());
		입고02(new Rect());
		입고02(new Tria());
		
	}

}

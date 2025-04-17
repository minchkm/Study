/*
 * 자바 21 버전에서 새롭게 추가된 패턴 매칭
 * 자바 21 버전부터는 switch 레이블에 패턴을 작성해서 표현값과 매칭을 시킬 수 있음
 * 이 방식은 표현값이 객체를 참조하는 변수, 즉 레퍼런스 참조 변수일 경우에만 사용할 수 있음
 * 표현값이 참조 타입 변수일 경우 패턴을 사용해서 타입 검사를 수행하고, 자동 타입 변환을 해서 레이블의 패턴 변수를 초기화
 * 초기화된 변수를 중괄호 { } 블록에서 사용
 * 
 *  표현값과 레이블 패턴 중 하나와 반드시 매칭이 되어야 함
 *  만약 매칭할 패턴이 없는 경우에는 나머지 매칭을 위해 default문을 포함해야 함
 *  즉, 표현값과 반드시 일치하는 레이블 실행문이 있어야 함 (완전성)
 */

import java.util.Date;

public class SwitchEx12 {

	public static void method01(Object obj) {	// 매개변수 다형성, 상속, 업캐스팅, 오토박싱
		// public : 자신의 클래스뿐만 아니라 같은 패키지 폴더의 다른 클래스, 외부 패키지의 상속받은 자손 클래스,
		//          다른 클래스 등 누구나 접근 가능하게 하는 접근 권한 제어자
		switch(obj) {	// 표현값이 Object 타입인 참조타입 (레이블 패턴 사용 가능)
			case Integer i -> System.out.println(i);	// 다운캐스팅
			case String s -> System.out.println("\"" + s + "\"");	// s 패턴 변수 초기화
			case null, default -> System.out.println("null or 해당사항 없음");
		}
	} // method01()
	
	private static void method02(Object obj) {
		/*
		 *  private : 자신의 클래스에서만 접근 가능하게 하는 접근 권한 제어자
		 *  static : 해당 클래스로 직접 접근하는 정적메소드를 정의할 때 사용하는 예약어
		 *  void : 반환값이 없는 자료형 (리턴 타입 없음)
		 *  Object : 자바 최상위 부모클래스
		 */
		String result = switch(obj) {
			case Integer i -> String.valueOf(i);	// 정수 인자값을 문자열로 변환
			case String s -> "\"" + s + "\"";
			case null, default -> "unknown";
		};
		
		System.out.println(result);
		
	} // method02()
	
	public static void main(String[] args) {

		method01(100);
		method01("100");
		method01(null);
		method01(new Date());
		
		System.out.println("\n===================\n");
		
		method02(10);	// 오토박싱, 업캐스팅
		method02("10");	// 업캐스팅
		method02(null);
		method02(new Date());	// 업캐스팅
		
	}

}

/*
 * 레이블 통과)
 * switch-case 다중 조건문에서 레이블에 패턴이 사용되면 기본적으로 다음 레이블로 통과가 금지됨
 * 하지만 다음이 default문이라면 통과가 가능함
 * 화살표 연산이 사용되면 무조건 다음 통과가 금지됨
 */

public class GuardEx02 {
	
	private static void method01(Object obj) {
		switch(obj) {
			case String s:	// 레이블 패턴 사용
				System.out.println("String s : " + s);
				break;	// break를 생략하면 컴파일 에러가 발생함
			case Integer i:
				System.out.println("Integer i : " + i);
//				break;	// default문 바로 앞의 case문은 break 생략 가능
			case null, default:
				System.out.println("null or unknown");
		};
	} // method01()
	
	private static void method02(Object obj) {
		switch(obj) {
			// 레이블 패턴, 화살표 연산자가 사용되면 다음 case 레이블 통과가 금지됨
			case String s -> System.out.println("String s : " + s);
			case Integer i -> System.out.println("Integer i : " + i);
			case null, default -> System.out.println("null or unknown");
		}
	}

	public static void main(String[] args) {

		method01("seoul");
		System.out.println();
		method01(7);
		System.out.println();
		method02(7);
		
	}

}

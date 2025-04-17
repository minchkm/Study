// java 17 버전까지는 switch-case문의 표현값이 null인 경우 예외 오류가 발생
// java 21 버전투버튼 null을 지정해도 예외 오류가 발생하지 않아 처리할 수 있게 되었음

public class SwitchEx11 {

	private static void method01(String s) {
		
		switch(s) {
			case null -> System.out.println("null");
			case "a", "b" -> System.out.println("a or b");
			case "c" -> System.out.println("c");
			default -> System.out.println("해당사항 없음");
		}

	} // method01
	
	private static void method02(String s) {
		
		switch(s) {
			case "a", "b" -> System.out.println("a or b");
			case "c" -> System.out.println("c");
			case null, default -> System.out.println("null or 해당사항 없음");
		}
		
	} // method02
	
	public static void main(String[] args) {
		
		method01(null);
		method02("d");
		method02(null);
		
	}

}

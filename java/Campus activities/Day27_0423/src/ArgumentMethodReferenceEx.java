import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceEx {

	public static void main(String[] args) {
  
		ToIntBiFunction<String, String> function;
		/*
		 *  이 함수형 인터페이스에 정의된 추상메서드 intapplyASInt 는 2개의 인자값을 전달받아 
		 */
		
		function = (a,b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("java21", "JAVA21"));
		
		function = String ::compareToIgnoreCase;
		print(function.applyAsInt("java22", "java2"));
		
	}

	public static void print(int order) {
		if(order <0) {
			System.out.println("사전순으로 먼저 나옵니다");
		}else if (order ==0) {
			System.out.println("동일한 문자열 입니다");
		}else {
			System.out.println("사전순으로 나중에 나옵니다");
		}
		
		
		
	}
	
	
	
}

 

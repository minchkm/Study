
/*
 * 자바의 비교(관계) 연산자
 * 1. 비교 연산자의 결과값은 boolean 타입이다 (true 또는 false)
 * 2. 비교 연산자 종류
 * 		> (~보다 크다), >= (~보다 크거나 같다), < (~보다 작다), <= (~보다 작거나 같다), == (같다), != (같지 않다)
 */
public class WeekEx04 {

	public static void main(String[] args) {

		boolean result = false;
		
		result = (6 > 2);
		System.out.println("6 > 2 : " + result);
		
		result = (2 >= 5);
		System.out.println("2 >= 5 : " + result);
		
		result = (2 < 3);
		System.out.println("2 < 3 : " + result);
		
		result = (8 <= 2);
		System.out.println("8 <= 2 : " + result);
		
		result = (8 == 2);
		System.out.println("8 == 2 : " + result);
		
		result = (8 != 2);
		System.out.println("8 != 2 = " + result);
		
		System.out.println("\n==========================\n");
		
		int a = 10, b = 4;
		result = (a + b) > (a - b);
		System.out.println((a + b) + " > " + (a - b) + " : " + result);
		
		result = a < b;
		System.out.printf("%d < %d : %b", a, b, result);
		
	}

}

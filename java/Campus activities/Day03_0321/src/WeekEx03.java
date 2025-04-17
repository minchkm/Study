
/*
 * 자바에서 + 연산 기호의 특징
 * 1. 숫자 + 숫자에서는 덧셈 연산을 한다
 * 2. 숫자 + 문자에서는 숫자가 문자로 치환되어 문자열 연결
 */

public class WeekEx03 {

	public static void main(String[] args) {
		
		int a = 10, b = 10;
		int c = a + b;
		System.out.printf("%d + %d = %d \n", a, b, c);	// %d : 10진수 정수 출력
		
		String result = a + "10";	// 숫자가 문자로 치환됨 ("10" + "10" => "1010")
		System.out.printf("result = %s \n", result);	// %s : 문자열 출력
		
	}

}

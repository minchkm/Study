/*
 * printf() 메소드 : 다양한 출력형태 지시자를 통해서 여러 종류의 값을 표현
 * 출력형태 지시자 종류
 * %d (10진수 정수), %c (단일문자)
 */

public class VarTest02 {

	public static void main(String[] args) {

		char c;		// 단일문자 타입으로 변수 c 선언 (단일문자는 10진수 정수로 저장됨)
		
		c = 'A';	// 'A'는 10진수 정수 65로 저장됨
		System.out.printf("%c => %d\n", c, (int)c);
		
		c = 'a';	// 'a'는 10진수 정수 97로 저장됨
		System.out.printf("%c => %d\n", c, (int)c);
		
		c = '7';	// '7'은 10진수 정수 55로 저장됨
		System.out.printf("%c => %d\n", c, (int)c);
	}

}

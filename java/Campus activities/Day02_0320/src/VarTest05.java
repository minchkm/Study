/*
 * "+" 연산 기호의 특징
 * 1. 숫자 + 숫자 : 덧셈 연산 수행 (덧셈 연산기호)
 * 2. 숫자 + 문자 or 문자 + 숫자 or 문자 + 문자 : 문자열 연결 (문자열 연산기호)
 */

public class VarTest05 {

	public static void main(String[] args) {
		
		System.out.println(7+7+"");	// 숫자 + 숫자는 덧셈 연산 수행
									// 숫자 + 문자는 숫자가 문자열로 치환됨
									// 14 + "" => "14" + "" => "14"
		
		System.out.println(7 + "" + 7);

	}

}

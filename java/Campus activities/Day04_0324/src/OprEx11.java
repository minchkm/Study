
public class OprEx11 {

	public static void main(String[] args) {
		
		// 영문 소문자 'a'를 영문 대문자 'A'로 변환해서 출력하는 프로그램
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		
		System.out.printf("'%c'의 대문자 : '%c'", lowerCase, upperCase);

	}

}

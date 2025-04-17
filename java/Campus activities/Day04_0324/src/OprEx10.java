// char 타입 단일문자 연산

public class OprEx10 {

	public static void main(String[] args) {
		
		char c01 = 'a';
		char c02 = c01;
		char c03 = ' ';
		
		int i = c01 + 1;	// 97 + 1
		System.out.printf("i = %d \n", i);
		
		c03 = (char)(c01 + 1);	// 자동산술법에 의해 char타입이 int타입으로 자동형변환
								// 2바이트 크기의 char타입 변수 c03에 저장하기 위해 명시적인 형변환
		
		System.out.printf("c03 = %c \n", c03);	// b
		
		c02++;
		c02++;	// 증감연산자는 자동형변환을 하지 않음 (int 타입으로 변환되지 않음)

		System.out.printf("c02 = %c \n", c02);	// c
	}

}

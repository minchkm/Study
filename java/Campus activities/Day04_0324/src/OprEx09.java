// char 단일문자는 자바에서 10진수 정수로 저장되는 것을 활용한 예제

public class OprEx09 {

	public static void main(String[] args) {
		
		char a = 'a';		// 'a'는 10진수 정수 97
		char d = 'd';		// 'd'는 10진수 정수 100
		char zero = '0';	// '0'은 10진수 정수 48
		char two = '2';		// '2'는 10진수 정수 50
		
		System.out.printf("'%c' - '%c' = %d \n", d, a, d - a);	// 100 - 97 - 3
		// %c는 단일문자 출력 형태, %d는 10진수 출력 형태
		System.out.printf("'%c' - '%c' = %d \n", two, zero, two - zero); // 50 - 48 - 2
		System.out.printf("'%c' = %d \n", a, (int)a);
		System.out.printf("'%c' = %d \n", d, (int)d);
		System.out.printf("'%c' = %d \n", zero, (int)zero);
		System.out.printf("'%c' = %d \n", two, (int)two);
		
		
	}

}

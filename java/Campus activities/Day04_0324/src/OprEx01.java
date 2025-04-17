/*
 * 확장된 (복합)대입연산자 종류
 * a += 10 은 a = a + 10 을 의미
 * a -= 10 은 a = a - 10 을 의미
 */
public class OprEx01 {

	public static void main(String[] args) {

		int i = 1;
		i = i + 5;
		System.out.printf("i = %d \n", i);
		
		i -= 3;		// i = i - 3
		System.out.println("i = " + i);
		
		i += 7;		// i = i + 7
		System.out.printf("i = %d %n", i);
		
		
	}

}

// 자바의 산술연산자

public class OprEx06 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d \n", a, b, a + b);
		
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		
		System.out.printf("%d * %d = %d \n", a, b, a * b);
		System.out.printf("%d / %d = %d \n", a, b, a / b);
		
		System.out.printf("%d / %.1f = %f \n", a, (float)b, a / (float)b);

	}

}

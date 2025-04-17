// 명시적인 캐스팅 연산자인 형변환 연산자를 사용한 예제

public class OprEx07 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);		// 자동산술법에 의해서 byte가 int로 자동형변환 (int + int = int)
									// 4바이트 int타입을 1바이트 byte타입 변수 c에 저장하려면 명시적인 캐스팅 연산자를 사용해야 함
		System.out.printf("%d + %d = %d \n", a, b, c);
		
		int d = a + b;
		System.out.println(a + " + " + b + " = " + d);
		System.out.println("\n=============================\n");
		
		// 명시적인 (byte)형으로 형변환헤서 값 손실이 발생함
		a = 10;
		b = 30;
		c = (byte)(a * b);
		System.out.printf("%d * %d = %d \n", a, b, c);
	}

}

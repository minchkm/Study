package ch03_quiz;

public class DataEx06 {

	public static void main(String[] args) {
		byte b = 127;
		byte c = 126;
		byte d = (byte)(b + c);
		/*
		 * 자바는 덧셈연산을 수행할 때 가장 효율적이고 값 손실 위험이 없는 4바이트 int 타입으로 수행함
		 * 때문에 byte형이 int형으로 자동 형번환됨 ( byte + byte -> int + int )
		 * 이를 byte형의 변수 d에 저장하기 위해서 (byte) 캐스팅 연산자를 사용하여 byte형으로 명시적 형변환
		 */
		int i = b + c;
		
		System.out.println("b = " + b + ", c = " + c);
		System.out.printf("byte 타입의 범위를 벗어난 값 : %d + %d = %d", b, c, d);
		System.out.printf("\n정상적인 덧셈 결과값 : %d + %d = %d", b, c, i);
	}

}

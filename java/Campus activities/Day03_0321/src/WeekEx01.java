/*
 * 캐스팅 형변환 연산자와 음의 정수를 이진수로 변한하는 예제
 */

public class WeekEx01 {

	public static void main(String[] args) {
		
		int i = 10;
		byte  b = (byte)i;	// (byte) 캐스팅 연산자를 사용해서 byte형으로 명시적인 형변환
		System.out.printf("[int -> byte] i = %d -> b = %d %n", i, b);
		
		i = 300;
		b = (byte)i;	// 300은 byte형 범위를 벗어나기 때문에 자료손실이 발생
		System.out.printf("[int -> byte] i = %d -> b = %d %n", i, b);
		
		// 음의 정ㅅ를 2진수로 변환 (2진수 출력 형태는 자바에 존재하지 않음)
		i = -2;
		b = (byte)i;
		System.out.println("10진 음의정수값을 이진문자열로 변환 = " + Integer.toBinaryString(b));
		// 형변환을 하지 않아도 됨
		System.out.println("10진 음의정수값을 이진문자열로 변환 = " + Integer.toBinaryString(i));
	
		/*
		 * 자바의 자동산술법이란?
		 * 자바는 작은 크기의 타입에서 큰 크기의 타입으로 암시적인 자동 형변환을 해준다
		 * 값 손실 위험이 없기 때문에 캐스팅 연산자를 사용하지 않아도 컴파일러가 자동 형변환을 해줌
		 * 
		 * byte(1바이트) -> short(2바이트), char(2바이트) -> int(4바이트) 
		 * -> long(8바이트) -> float(4바이트) -> double(8바이트)
		 * 왼쪽에서 오른쪽으로 크기가 더 큰 타입으로 형변환 시 자동산술에 의해서 자동 형변환을 수행한다.
		 * 
		 * ex) 7 + 7.0 은 int + double 이므로 자동산술법에 의해 double + double로 자동 형변환되어 
		 *     7.0 + 7.0 = 14.0이 됨 (결과값은 double(8바이트) 타입)
		 */
	}

}

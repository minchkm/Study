/*
 * 자바의 기본타입에서 범위가 큰 타입에서 작은 타입으로 형변환 시
 * 반드시 명시적인 캐스팅(형변환) 연산자를 사용해야 함
 * 그 반대의 경우 내부적인 암시적인 자동형 변환을 해줌
 */
public class DataType03 {

	public static void main(String[] args) {
		
		/*
		 * 자바의 정수형 자료형 종류
		 * byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
		 * char 단일문자 타입도 10진수 정수로 저장되므로 정수 자료형에 포함됨
		 */
		byte a = 1;
		short b = 128;
		int c = 32768;
		
		b = a;	// 1바이트가 2바이트로 변경 (내부 암시적인 자동형변환)
		System.out.println(b);

		b = (short)c;	// 명시적인 캐스팅 연산자를 사용하여 형변환 (자료 손실 위험이 있기 때문)
						// short 타입 최대값 범위를 벗어나서 해당 타입의 최소값 출력
	
		System.out.println("b = " + b);	// -32768
	}

}

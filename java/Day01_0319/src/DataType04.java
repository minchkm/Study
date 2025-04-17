/*
 * 자바의 실수 숫자 자료형
 * float - 크기 : 4바이트, 저장되는 정밀도 : 7자리, 접미사 f 또는 F (생략 불가)
 * double - 크기 : 8바이트, 저장되는 정밀도 : 15자리, 접미사 d 또는 D
 * (정밀도 때문에 자바의 기본 실수 자료형이 되어서 접미사 생략 가능) 
 */
public class DataType04 {

	public static void main(String[] args) {
		
		float a = 100.7f;
		double b = 100.7f;	// double 타입은 접미사 d, 접미사 f, 생략 전부 가능
		double c = 100.1;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		

	}

}

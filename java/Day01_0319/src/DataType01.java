
public class DataType01 {
	// public : 누구나 접근 가능하도록 하는 접근제어자
	// class : 클래스명을 정의할 때 사용

	public static void main(String[] args) {
		// static : 클래스명으로 직접 접근하는 정적 메소드를 정의할 때 사용
		// void : 반환값이 없는 타입
		// String[] : 문자열 배열
		System.out.println(10);			// System.out : 모니터 출력장치와 연결
		System.out.println(10.5);		// 10.5는 8바이트 double 실수값
		System.out.println('a');		// 'a'는 단일문자 char 타입. 자바에서 단일문자는 해당 단일문자에 대한 10진수 정수로 저장
		System.out.println(true);		// boolean 타입 (true, false)
		System.out.println(10L); 		// 10 뒤에 접미사 l 또는 L이 붙으면 8바이트 long 타입값
		System.out.println(10.3f); 		// 10.3 뒤에 접미사 f 또는 F가 붙으면 4바이트 float 타입 실수형
		System.out.println("seoul");	// "seoul"은 문자열 String 타입 (기본 타입이 아닌 레퍼런스 타입)
		
	}

}

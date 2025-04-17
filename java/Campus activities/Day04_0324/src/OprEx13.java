// 소수점 넷째 자리에서 반올림하는 예제

public class OprEx13 {

	public static void main(String[] args) {
		
		double pi = 3.141592;	// 값 뒤에 접미사 f or F가 생략됨
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		/*
		 * 3.141592 * 1000 은 자동산술법에 의해 double * double로 자동형변환
		 * 3141.592 + 0.5 = 3142.092 를 (int)로 형변환하여 소수점 이하를 버리고 3142가 남음
		 * 3142 / 1000.0 -> 3142.0 / 1000.0 = 3.142
		 */
		System.out.println(shortPi);
		
		// 자바의 내장 API를 사용해서 소수점 넷째 자리에서 반올림하는 예제
		double result = Math.round(pi * 1000) / 1000.0;
		// round() : 메소드 인자값으로 주어진 값을 소수점 첫째자리에서 반올림하여 정수값으로 반환
		// 3.141592 * 1000.0 = 3141.592 -> 첫째자리 반올림하여 3142 반환
		// 3142 / 1000.0 -> 3142.0 / 1000.0 = 3.142
		System.out.println("result = " + result);

	}

}

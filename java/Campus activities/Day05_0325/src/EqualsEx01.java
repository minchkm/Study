/*
 * 문자열 값 비교
 * 1. String 문자열 내장 API 클래스에 오버라이딩된 equals() 메소드를 가져와서 문자열 값을 비교할 경우
 * 	  객체의 주소가 달라도 문자열 값만을 비교하여 문자열 내용이 같으면 참, 다르면 거짓을 반환한다.
 * 
 * 2. 비교 연산자 "=="로 문자열 값을 비교할 경우
 *    문자열 값이 같아도 객체 주소가 다르면 거짓, 같으면 참을 반환한다. (문자열 값이 아닌 객체 주소를 비교)
 */
public class EqualsEx01 {

	public static void main(String[] args) {
		
		String str01 = "1234";		// 새로운 객체 주소를 생성하지 않고 문자열 상수를 가리킴
		String str02 = new String("1234");	// new 키워드로 새로운 객체 주소 str02를 생성
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");	// 같은 문자열 상수를 가리킴
		// "==" 문자열 비교는 같은 주소이면 참을 반환
		System.out.printf("str01 == \"1234\" ? %b%n", str01 == "1234");
		System.out.printf("str02 = \"1234\" ? %b%n", str02 == "1234");	// 주소가 달라서 false 반환
		
		System.out.printf("str01.equals(\"1234\") ? %b%n", str01.equals("1234"));
		// equals() 메소드는 문자열 값만 비교

		System.out.printf("str02.equals(\"1234\") ? %b%n", str02.equals("1234"));
		// 객체 주소는 다르지만 문자열 내용값이 같으므로 true
		
		System.out.println(str01.equals(str02));
		
		String str03 = new String("abc");
		System.out.println(str03.equals("ABC"));			// equals() 메소드는 영문 대소문자를 구분하므로 false
		System.out.println(str03.equalsIgnoreCase("ABC"));	// equalsIgnoreCase() 메소드는 영문 대소문자를 구분하지 않고 비교하므로 true
		
		// 문자열 값만 비교할 때는 "=="를 사용하지 않고 equals() 메소드 사용
		
	}

}

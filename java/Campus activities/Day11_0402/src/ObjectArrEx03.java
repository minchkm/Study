// 단일문자 char[] 배열과 String 문자열 클래스 예제
public class ObjectArrEx03 {

	public static void main(String[] args) {
		
		String str = "Java";
		str = str + 8;	// 문자열 + 숫자 => 문자가 우선시되어 숫자 8이 문자열 "8"로 변경됨
		System.out.printf("%s\n", str);
		
		String str01 = "ABCDE";
		char ch = str01.charAt(3);	// 문자열의 4번째 단일문자 'D'를 구함
		System.out.println("구해진 단일문자 : \'" + ch + "\'");
		
		String str02 = "012345";
		String result = str02.substring(1, 4);
		// substring(a, b) : a번째 인덱스부터 b번째 인덱스 전까지의 문자열 반환
		System.out.println(result);
		
		String src = "ABCDE";
		
		System.out.println("src 문자열 길이 : " + src.length());
		
		for(int i = 0; i < src.length(); i++) {
			char ch02 = src.charAt(i);	// 문자열의 i번째 단일문자를 구함
			System.out.println("src.charAt(" + i + ") : " + ch02);
		}
		
		char[] chArr = src.toCharArray();	// String 문자열을 단일문자 char[] 배열로 반환
		System.out.println(chArr);	

	}

}

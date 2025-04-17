/*
 * 문자열을 다루는 String 내장 api 클래스는 자기 자신의 내용을 수정할 수 없다.
 * StringBuffer 내장 api는 자기 자신의 내용을 수정할 수 있다.
 */

public class InterEx12 {

	public static void main(String[] args) {

		String cityName = "seoul";
		System.out.println("도시 이름을 영문 대문자로 => " + cityName.toUpperCase());
		System.out.println("cityName = " + cityName);
		System.out.println("문자열 길이 : " + cityName.length());
		System.out.println("\'seoul\'의 세 번째 문자 : " + cityName.charAt(2));
		// charAt(a) : a번째 단일문자를 구함 (0부터 시작)
		System.out.println("\'seoul\'에서 u가 몇 번째에 저장되었는가? => " 
										+ (cityName.indexOf('u')+1));
		// indexOf('u') : 단일문자 'u'를 왼쪽에서부터 찾아서 가장 먼저 나오는 해당 문자의
		//                위치 번호를 카운트해서 구함 (0부터 시작)
		
		StringBuffer str01 = new StringBuffer();
		str01.append("Java"); 
		str01.append(" Programming");
		System.out.println("추가된 문자 : " + str01.toString());
		
		String result = str01.substring(0, 4);
		System.out.println("0 이상 4 미만 사이의 문자를 반환 : " + result);
		
		str01.replace(0,  4, "Jsp");	// 0 이상 4 미만 사이 문자를 Jsp로 변경
		System.out.println();
	}

}

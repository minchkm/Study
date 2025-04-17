/*
 * 레퍼런스 타입 변수가 같은 객체 주소를 공유해서 new 키워드로 새로운 객체를 생성하면 다른 주소값을 가진다.
 * 이 경우 값을 공유하지 못한다.
 */

class MyDate03 {
	int year = 2023;
	int month = 10;
	int day = 31;
}

public class BasicRef03 {

	public static void main(String[] args) {
		
		MyDate03 d = new MyDate03();	// 객체 (객체 주소가 저장된 참조변수)
		MyDate03 t = d;		// d의 객체 주소가 t에 대입되어 d, t가 같은 객체 주소를 가리킨다.
		
		System.out.println(d.year + "년 " + d.month + "월 " + d.day + "일");
		System.out.println(t.year + "년 " + t.month + "월 " + t.day + "일");
		System.out.println();
		
		t = new MyDate03();		// 새로운 객체를 생성하면 다른 주소값이 저장되어 d와 다른 주소를 가짐
		t.year = 2024;
		t.month = 11;
		t.day = 10;
		
		System.out.println(d.year + "년 " + d.month + "월 " + d.day + "일");
		System.out.println(t.year + "년 " + t.month + "월 " + t.day + "일");
		
	}

}

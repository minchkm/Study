/*
 * changeDate(MyDate05 t){} : 메소드 매개변수 타입이 참조타입이다.
 */

class MyDate05 {
	int year = 2024;
	int month = 6;
	int day = 30;
}

class ReMethod {
	void changeDate(MyDate05 t) {	// MyDate05 t = d; 가 된다. (t와 d가 같은 객체주소를 가리킴)
		t.year = 2025;
		t.month = 4;
		t.day = 7;
	}
}

public class BasicRef05 {

	public static void main(String[] args) {
		
		ReMethod rm = new ReMethod();
		MyDate05 d = new MyDate05();
		System.out.println("메소드 호출 전 : " + d.year + "년 " + d.month + "월 " + d.day + "일");
		
		rm.changeDate(d);	// d 객체 주소가 전달
		System.out.println("메소드 호출 후 : " + d.year + "년 " + d.month + "월 " + d.day + "일");

	}

}

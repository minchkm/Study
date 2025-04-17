/*
 * 생성자의 특징
 * 		1. 생성자 이름은 클래스 이름과 동일하게 정의한다.
 * 		2. new 클래스명(); 에 의해서 생성자를 호출한다.
 * 		3. 생성자의 주된 기능은 클래스 소속 멤버 변수 중 인스턴스 변수 초기화 기능이다.
 */

class MyDate21 {
	// 3개의 속성 정의 (클래스 소속의 멤버변수 중 인스턴스 변수가 됨)
	private int year;
	private int month;
	private int day;
	
	public MyDate21() {	// 전달 인자가 없는 기본 생성자 정의
		// 생성자의 주기능 : 인스턴스 변수 초기화 기능
		year = 2025;
		month = 4;
		day = 8;
		System.out.println("기본 생성자 호출");
	}
	
	public void pr() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}

public class ConstEx01 {

	public static void main(String[] args) {

		MyDate21 d = new MyDate21();	// new 클래스명(); 에 의해서 기본 생성자를 호출 (14라인)
		d.pr();		// 객체명.메소드(); 에 의해서 해당 메소드를 호출하여 초기화한 인스턴스 변수값 출력
		
	}

}

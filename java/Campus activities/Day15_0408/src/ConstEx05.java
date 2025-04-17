/*
 * 클래스 소속의 멤버 변수와 생성자 소속의 매개변수 이름이 같은 경우
 * 		-> 멤버 변수 앞에 this 키워드를 사용해야 함
 * 		   this가 없으면 자바는 이를 구분하지 못해 값이 저장되지 않는 문제가 발생
 */

class MyDate05 {
	private int year;
	private int month;
	private int day;
	
	public MyDate05() {}	// 기본 생성자 명시적 정의
	
	public MyDate05(int new_year, int new_month, int new_day) {
		year = new_year;
		month = new_month;
		day = new_day;
	}
	
	public void setYear(int year) {
		year = year;	// 왼쪽의 멤버변수와 오른쪽의 매개변수명이 같으면 자바에서 이를 구분하지 못해 값을 저장 못함
	}
	
	public void setMonth(int new_month) {
		month = new_month;
	}
	
	public void pr() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}
public class ConstEx05 {

	public static void main(String[] args) {
		
		MyDate05 md = new MyDate05(2024, 7, 1);
		md.pr();
		md.setYear(2025);	// 연도값 변경 안됨
		md.pr();
		md.setMonth(4);		// 변경됨
		md.pr();
		

	}

}

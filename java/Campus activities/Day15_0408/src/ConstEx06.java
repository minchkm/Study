/*
 * 생성자 또는 메소드 내에서 멤버변수와 매개변수명이 같은 경우 이를 구분하기 위해 this 를 사용
 */

class MyDate26 {
	private int year;
	private int month;
	private int day;
	
	public MyDate26() {}
	
	public MyDate26(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void print() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}

public class ConstEx06 {

	public static void main(String[] args) {
		
		MyDate26 md26 = new MyDate26(2024, 7, 25);
		md26.print();
		md26.setYear(2025);
		md26.setMonth(4);
		md26.print();

	}

}

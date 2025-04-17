/*
 * 같은 클래스 내에서 오버로딩된 다른 생성자를 호출하려면 this() 를 사용한다.
 */

class MyDate27 {
	private int year;
	private int month;
	private int day;
	
	public MyDate27() {
		this(2025, 4, 1);	// 같은 클래스 내에서 매개변수 3개짜리 오버로딩된 생성자 호출
	}

	public MyDate27(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print() {
		System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}
public class ConstEx07 {

	public static void main(String[] args) {
		MyDate27 md01 = new MyDate27();
		md01.print();
		MyDate27 md02 = new MyDate27(2025, 4, 8);	// 오버로딩된 생성자 호출
		md02.print();

	}

}

/*
 * 참조타입 매개변수는 객체의 주소값이 전달되어져 주소값을 공유한다. 변경된 값도 공유 가능하다.
 */

class Data09 {
	int x;
}

public class BasicRef09 {

	public static void main(String[] args) {
		
		Data09 d = new Data09();
		d.x = 10;
		System.out.println("main() d.x = " + d.x);	// 10
		
		change(d);		// d의 객체 주소값이 전달됨
		System.out.println("change() 메소드 호출 후 main() d.x = " + d.x);	// 1000

	}
	
	static void change(Data09 d) {		// 참조타입 매개변수 Data09 d
		d.x = 1000;
		System.out.println("change() d.x = " + d.x);	// 1000
	}

}

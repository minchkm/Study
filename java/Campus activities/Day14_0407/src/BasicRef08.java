/*
 * 기본 타입 매개변수는 값만 전달된다. 객체 주소를 공유하지 않아서 값도 공유하지 않는다.
 */

class Data08 {
	int x;
}

public class BasicRef08 {
	
	static void change(int x) {		// int x라는 기본타입 매개변수
		x = 1000;
		System.out.println("change() = " + x);	// 1000
	}

	public static void main(String[] args) {
		
		Data08 d = new Data08();
		d.x = 10;
		System.out.println("main() x = " + d.x);	// 10
		
		change(d.x);	// change() 메소드를 호출하면서 값 10을 전달
		System.out.println("change() 메소드 호출 후 main()의 x = " + d.x);	// 10

	}

}

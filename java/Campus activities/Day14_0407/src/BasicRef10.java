/*
 * 매개변수가 int[] x 이면 이것은 배열이라서 참조타입 매개변수가 된다. (주소값 공유 가능, 배열 원소값 공유 가능)
 */
public class BasicRef10 {
	
	static void change(int[] arr) {
		arr[0] = 1000;
		System.out.println("change() 메소드의 arr[0] = " + arr[0]);	// 1000
	}

	public static void main(String[] args) {
		
		int[] x = {10};
		System.out.println("main() 메소드의 x[0] = " + x[0]);	// 10
		
		change(x);	// 배열 주소를 공유
		System.out.println("change() 메소드 호출 후 x[0] = " + x[0]);	// 1000

	}

}

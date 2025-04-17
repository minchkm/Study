// 07장 제어문의 다양한 활용.pdf 5번 문제

public class Ex07_05 {

	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 6 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

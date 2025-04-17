// 07장 제어문의 다양한 활용.pdf 4번 문제

public class Ex07_04 {

	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) { 
			for(int k = 2; k <= 9; k++) {
				System.out.printf("%d * %d = %d\t", k, i, k * i); 
			} 
			System.out.println();
		}
	}
}

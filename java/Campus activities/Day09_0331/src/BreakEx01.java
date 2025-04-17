/*
 * break문의 특징)
 * - 반복문 내에서 break문을 만나면 해당 반복문을 종료한다.
 */

public class BreakEx01 {

	public static void main(String[] args) {
		
		int i;
		
		for (i = 1; i <= 10; i++) {
			System.out.print(" " + i);
		}
		System.out.println("\n===============\n");

		// 4의 배수일 때 중단하도록 설정
		for (i = 1; i <= 10; i++) {
			if (i % 4 == 0) {
				break;
			} else {
				System.out.print(" " + i);
			}
		}	
	}
}

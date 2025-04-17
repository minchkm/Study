/*
 * continue문 특징)
 * - 반복문에서 continue문을 만나면 아래 문장을 수행하지 않고 반복문의 처음으로 돌아가 반복을 계속함
 */

public class BreakEx03 {

	public static void main(String[] args) {
		
		int i;
		
		// 1부터 10까지 반복하며 4의 배수는 출력하지 않음
		for(i = 1; i <= 10; i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.print(" " + i);
		}

	}

}

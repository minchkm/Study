/*
 *  이중 for 반복문에서 가장 안쪽 반복문 내부에 break문을 사용하면
 *  가장 근접한 반복문만 중단하고 바깥 반복문은 중단하지 못한다.
 *  이 경우 바깥 반복문 앞 또는 위에 임의의 레이블명을 지정하여 중첩 반복문을 완전히 중단할 수 있다.
 */

public class BreakEx02 {

	public static void main(String[] args) {
		
		int i, a;
		
		// 안쪽 반복문만 중단
		for(a = 1; a < 10; a++) {
			for(i = 1; i <= 10; i++) {
				if(i % 3 == 0) {
					break;
				}
				System.out.print(" i -> " + i);
			} // inner for
			System.out.println("\n a -> " + a);		// 바깥 반복문은 중단되지 않음
		} // outer for
		System.out.println("\n======================\n");
		
		// 이중 반복문 전부 중단
		exit_for:	// 이중 반복문 중단을 위한 임의의 레이블명 지정
			for (a = 1; a < 10; a++) {
				for (i = 1; i <= 10; i++) {
					if(i % 3 == 0) {
						break exit_for;		// 이중 for문 중단
					}
					System.out.print(" i -> " + i);		// 1, 2
				} // inner for
				System.out.println("\n a -> " + a);		// 실행하지 않음
			} // outer for

	}

}

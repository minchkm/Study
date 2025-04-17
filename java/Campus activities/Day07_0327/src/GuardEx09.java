// 스캐너와 이중 for문 예제

import java.util.Scanner;

public class GuardEx09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("#을 출력할 라인 수를 입력 >> ");
		int lineNumber = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= lineNumber; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		
	}

}

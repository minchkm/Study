// 이중 for문을 사용한 구구단 구하기

public class GuardEx10 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(">> " + i + "단 <<");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println("=============");
		}
		
		int k = 2;
		while (k <= 9) {
			System.out.print(k + "단\t\t");
			k++;
		}
		System.out.println("\n===============================================");
		
		for(int i = 1; i <= 9; i++) {
			for(k = 2; k <= 9; k++) {
				System.out.printf("%d * %d = %d\t", k, i, k * i);
			}
			System.out.println();
		}

	}

}

// 07장 제어문의 다양한 활용.pdf 3번 문제

public class Ex07_03 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				count++;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("\n====================\n");
		
		count = 0;
		
		for(int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
			count++;
			
			if(count % 10 == 0) {
				System.out.println();
			}
		}
	}

}

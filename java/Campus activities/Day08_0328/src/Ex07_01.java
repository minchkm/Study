// 07장 제어문의 다양한 활용.pdf 1번 문제

public class Ex07_01 {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		
		for (int i = 22; i <= 76; i++) {
			if(i % 2 == 0) {
				sum += i;
				count++;
			}
		}
		
		System.out.println("짝수의 개수 -> " + count);
		System.out.println("그 합 -> " + sum);
		
		System.out.println("\n=======================\n");
		
		count = 0;
		sum = 0;
		
		for (int i = 22; i <= 76; i+=2) {
			sum += i;
			count++;
		}
		
		System.out.println("짝수의 개수 -> " + count);
		System.out.println("그 합 -> " + sum);

	}

}

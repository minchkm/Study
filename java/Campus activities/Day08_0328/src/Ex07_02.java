// 07장 제어문의 다양한 활용.pdf 2번 문제

public class Ex07_02 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 10 == 0) {
				System.out.printf("1 ~ %d까지의 합 -> %d\n", i, sum);
			}
		}	
	}
}

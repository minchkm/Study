/*
 * 1. for문을 2번 사용하여 짝수/홀수의 누적합
 * 2. for문 안에 if문 사용하여 짝수/홀수의 누적합
 */


public class WhileEx03 {

	public static void main(String[] args) {
		
		int i;
		int odd_tot, even_tot;
		
		// for문 2개 사용
		for(i = 10, even_tot = 0, odd_tot = 0; i >= 2; i-=2) {
			even_tot += i;
		}
		for(i = 1; i <= 10; i+=2) {
			odd_tot += i;
		}
		
		System.out.println("짝수의 합 = " + even_tot);
		System.out.println("홀수의 합 = " + odd_tot);
		
		System.out.println();
		
		// for문, if문 사용
		for(i = 1, even_tot = 0, odd_tot = 0; i <= 10; i++) {
			if(i % 2 == 1) {
				odd_tot += i;
			} else {
				even_tot += i;
			}
		}
		
		System.out.printf("홀수의 합 = %d\n", odd_tot);
		System.out.printf("짝수의 합 = %d\n", even_tot);
	}
}

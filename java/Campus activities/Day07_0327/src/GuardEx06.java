/*
 * while 반복문 형식)
 * while (조건식) {
 * 		조건식이 참일동안 반복 실행;
 * 		증감식;
 * }
 */
public class GuardEx06 {

	public static void main(String[] args) {
		
		int i;
		
		// for 반복문
		for(i = 10; i >= 1; i-=2) {
			System.out.print(" " + i);
		}
		
		System.out.println("\n==================\n");
		
		// while 반복문
		i = 2;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println("\n==================\n");
		
		// while 반복문을 사용한 짝수의 누적합
		int sum = 0;
		i = 10;
		while (i >= 2) {
			sum += i;
			i-=2;
		}
		System.out.println("짝수들의 누적합 = " + sum);
		
	}

}

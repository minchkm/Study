// if-else문을 활용한 최대값/최소값을 구하는 예제

import java.util.Scanner;

public class EqualsEx07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수값 입력 >> ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수값 입력 >> ");
		int b = Integer.parseInt(sc.next());	// nextLine() : 문자열로 입력받음
													// parseInt() : 입력받은 문자열을 정수 숫자로 변환
		int max = 0;
		int min = 0;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		System.out.printf("최대값 = %d \n", max);
		System.out.printf("최소값 = %d \n", min);
		
		
	}

}

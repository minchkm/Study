/*
 * && (논리곱 : AND) , || (논리합 : OR) 논리연산자의 효율적인 연산에 관한 예제
 * 
 * 1. || 논리합 연산에서 왼쪽 연산 결과가 true이면 오른쪽 연산 결과에 관계없이 결과 연산값은 true가 됨
 *    즉, 왼쪽 연산 결과가 true가 되도록 하는 효율적인 코딩을 하면 오른쪽 연산을 수행하지 않아 실행 속도가 빨라짐
 *    
 * 2. && 논리곱 연산에서 왼쪽 연산 결과가 false이면 오른쪽 연산 결과에 관계없이 결과 연산값은 false가 됨
 *    즉, 왼쪽 연산 결과가 false가 되도록 코딩을 하면 오른쪽 연산을 수행하지 않아 실행 속도가 빨라짐
 */

public class EqualsEx02 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		System.out.printf("a = %d, b = %d%n", a, b);
		System.out.printf("a != 0 || ++b != 0 : %b%n", a != 0 || ++b != 0);
		// a != 0 이 true이기 때문에 오른쪽 연산인 ++b 를 수행하지 않음
		System.out.println("a = " + a + ", b = " + b);	// 5, 0
		System.out.printf("a == 0 && ++b != 0 : %b%n", a == 0 && ++b != 0);
		// a == 0이 false이기 때문에 오른쪽 연산인 ++b 를 수행하지 않음
		System.out.println("a = " + a + ", b = " + b);	// 5, 0

	}

}

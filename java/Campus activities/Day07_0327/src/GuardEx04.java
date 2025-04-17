/*
 * 명확한 반복횟수가 정해진 경우 사용하는 for 반복문 형식
 * 		for(초기치; 조건식; 증감식) {
 * 			조건식이 참일 동안 반복 실행;
 * 		}
 */
public class GuardEx04 {

	public static void main(String[] args) {
		
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("Hello Java!");
		}
		System.out.println("\n==================\n");
		
		for (i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}
		System.out.println("\n==================\n");
		
		for(i = 2; i <= 10; i+=2) {
			System.out.print(" " + i);
		}
		System.out.println("\n==================\n");
		
		for(i = 5; i >= 1; i--) {
			System.out.print(" " + i);
		}
	}

}

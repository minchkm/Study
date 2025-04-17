// for 반복문에서 초기치, 증감식을 2개씩 지정하는 예제
// 중첩 for문 예제
public class GuardEx08 {

	public static void main(String[] args) {
		
		for(int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.printf("%d \t %d%n", i, j);
		}
		
		System.out.println("\n=================\n");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(" *" );
			} // inner for()
			System.out.println();
		} // outer for()
		
		

	}

}

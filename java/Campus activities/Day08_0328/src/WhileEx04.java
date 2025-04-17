// 이중 for문 예제

public class WhileEx04 {

	public static void main(String[] args) {
		
		int i;	// 안쪽 for문 제어변수
		int a;	// 바깥쪽 for문 제어변수
		
		System.out.println("시침 -------------> 분침");
		System.out.println("a(바깥쪽 제어변수) --> i(안쪽 제어변수)");
		
		for (a = 1; a <= 5; a++) {
			for(i = 1; i <= 5; i++) {
				System.out.println(a + " ---------------> " + i);
			} // inner for
			System.out.println("\n=================\n");
		} // outer for
		
		
	}

}

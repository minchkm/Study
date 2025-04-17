// for문, continue, if문을 사용해서 1부터 100까지


public class BreakEx06 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		for(i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.printf("sum = %d\n", sum);
	}
}

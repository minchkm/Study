
public class Ex08_01 {

	public static void main(String[] args) {
		
		int i;
		int max = 0;
		
		for(i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				max = i;
			}
		}
		System.out.println("1 ~ 100 사이 가장 큰 7의 배수 : " + max);
		
		for(i = 100; i >= 1; i--) {
			if(i % 6 == 0) {
				break;
			}
		}
		System.out.println("1 ~ 100 사이 가장 큰 6의 배수 : " + i);
	}
}

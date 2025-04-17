package exam_250403;

public class Ex_05 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.printf("1~10까지의 누적합 = %d\n", sum);
	}

}

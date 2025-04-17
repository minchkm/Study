package exam_250403;

public class Ex_03 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 4 == 0) {
				sum += i;
			}
		}
		System.out.printf("1 ~ 10의 정수 중 4의 배수의 합 = %d\n", sum);

	}

}

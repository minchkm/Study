import java.util.Random;

public class Ex08_02 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while(i <= 50) {
			i++;
			if(i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.printf("누적합 = %d\n", sum);
		
		for(;;) {
			Random r = new Random();
			
			int diceNum = r.nextInt(6) + 1;
			// r.nextInt(6) : 0 ~ 5.9999 사이의 정수 난수 발생, 
			// +1을 하여 1 ~ 6.9999, 즉 1 ~ 6 사이 정수 난수 발생
			System.out.println("임의의 주사위 눈 수 = " + diceNum);
			
			if(diceNum == 4) break;		// 난수값이 4가 나오면 무한루프 종료0
		}
	}
}

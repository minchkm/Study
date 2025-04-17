// for 반복문을 사용한 7단 구구단과 1부터 10까지 누적합 계산 예제
public class GuardEx05 {

	public static void main(String[] args) {

		int i;
		int dan = 7;
		
		System.out.println("======= " + dan + "단 =======");
		
		for (i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		
		System.out.println("\n===================\n");
		
		int total = 0;
		
		for(i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println("1부터 10까지의 누적합 = " + total);
		
	}

}

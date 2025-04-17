// 배열의 총합, 평균

public class ArrayEx08 {

	public static void main(String[] args) {

		int sum = 0;
		double avg = 0.0;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i : score) {
			sum += i;
		}
		
		avg = (double)sum/score.length;
		
		System.out.printf("총합 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
	}
}

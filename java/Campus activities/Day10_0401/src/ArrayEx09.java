// 배열 원소 최대값, 최소값 구하기 예제

public class ArrayEx09 {

	public static void main(String[] args) {
		
		int[] score = {95, 96, 97, 93, 92};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.printf("최대값 = %d, 최소값 = %d\n", max, min);
		
		System.out.println("\n====================\n");
		
		max = score[0];
		min = score[0];
		
		for(int i : score) {
			if(i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
		}
		System.out.printf("최대값 = %d, 최소값 = %d\n", max, min);
	}
}

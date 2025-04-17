/*
 * 2차원 배열 원소값을 1차원 배열로, 1차원 배열을 일반 변수로 가져오는 예제 (확장 for문)
 */

public class ObjectArrEx04 {

	public static void main(String[] args) {

		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};	// 4행 * 3열의 총 12개의 원소값을 저장하여 초기화한 2차원 배열 score 생성
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
			}
		}
		System.out.println("\n=====================\n");
		
		for(int[] arr : score) {	// 2차원 배열을 1차원 배열로 변경
			for(int a : arr) {		// 1차원 배열을 일반 변수로 변경
				sum += a;
			}
		}
		System.out.printf("배열 원소 누적합 sum = %d\n", sum);
		
	}

}

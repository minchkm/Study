// 배열 주소 범위를 벗어난 예외 오류 ArrayIndexOutOfBoundsException

public class ArrayEx05 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		
		int k = 1;
		
		score[0] = 100;
		score[1] = 90;
		score[k+1] = 95;
		score[3] = 99;
		score[4] = 98;
		
		int tmp = score[k+2] + score[4];	// 99 + 98
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] : %d\n", i, score[i]);
		
		}
		System.out.printf("tmp = %d\n", tmp);
		System.out.printf("score[%d] : %d\n", 7, score[7]);	// 배열주소 인덱스 번호 범위를 벗어나서 예외 오류 발생

	}

}

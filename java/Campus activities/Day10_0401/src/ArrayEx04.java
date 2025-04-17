// 2차원 배열에 관한 실습 예제
 
public class ArrayEx04 {

	public static void main(String[] args) {

		int[][] score = new int[3][2];	// 3행 * 2열의 2차원 배열 score 생성
		
		score[0][0] = 10; score[0][1] = 20;
		score[1][0] = 30; score[1][1] = 40;
		score[2][0] = 50; score[2][1] = 60;
		
		int i, j;	// 반복문 제어변수
		
		for(i = 0; i < score.length; i++) {	// 2차원 배열의 score.length는 행의 길이를 반환 => 3
			for(j = 0; j < score[i].length; j++) {	// score[i].length는 각 행의 열의 길이를 반환 => 2
				System.out.print(" " + score[i][j]);
			} // inner for
			System.out.println();
		} // outer for
	}
}

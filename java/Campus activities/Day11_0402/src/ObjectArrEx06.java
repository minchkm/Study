/*
 * 가변 배열(래그드 배열, 래기드 배열) 이란?
 * 2차원 이상의 다차원 배열을 생성할 때 행의 길이는 고정시키고 각 행의 열의 길이는 지정하지 않고
 * 나중에 각각 각 행의 열의 길이를 가변적으로 설정해서 배열을 생성함으로써
 * 고정된 형태 배열이 아닌 각 행의 열의 길이가 유동적인 배열
 * 
 * 가변 배열 생성 형식)
 * 	int[][] score = new int[5][];	// 행의 길이는 5로 고정시키고 열의 길이를 지정하지 않음
 */

public class ObjectArrEx06 {

	public static void main(String[] args) {
		
		// final : 상수 선언 (수정할 수 없음, 변수명 영문 대문자로 설정, 최초값 반드시 지정)
		final int MAX_ROWS = 5;

		int[][] ragged = new int[MAX_ROWS+1][];	// 행의 길이는 6으로 고정, 열의 길이는 지정하지 않음
		
		for(int r = 0; r <= MAX_ROWS; r++) {
			ragged[r] = new int[r+1];	// 각 행의 열의 길이를 구함
										// 첫번째 행의 열의 길이는 1, 6번째 행의 열의 길이는 6
		}
		
		for(int r = 0; r < ragged.length; r++) {
			for(int c = 0; c < ragged[r].length; c++) {
				ragged[r][c] = c;
			} // inner for
		} // outer for
		
		for(int r = 0; r < ragged.length; r++) {
			for(int c = 0; c < ragged[r].length; c++) {
				System.out.print(" " + ragged[r][c]);
			} // inner for
			System.out.println();
		} // outer for
		
		

	}

}

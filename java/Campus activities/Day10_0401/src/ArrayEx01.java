/*
 *  배열 : 동일한 타입의 하나 이상의 원소값을 고정된 크기로 한꺼번에 저장하기 위해서 사용하는 것
 *  new 키워드를 사용한 배열 생성법)
 *  타입[] 배열명 = new 타입[배열크기];
 */


public class ArrayEx01 {

	public static void main(String[] args) {

		int[] score = new int[5];
		score[0] = 100;		// 배열 인덱스는 0부터 시작
		score[1] = 90;
		score[2] = 99;
		score[3] = 80;
		score[4] = 97;
		
		System.out.printf("배열 크기 = %d\n", score.length);
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}
		
	}

}

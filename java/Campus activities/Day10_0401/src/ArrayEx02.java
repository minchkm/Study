// 배열 원소값과 총합, 평균을 구하는 예제
public class ArrayEx02 {

	public static void main(String[] args) {

		int[] score = {100, 90, 80, 96, 100};	// 5개의 int타입 배열원소값을 직접 저장하여 초기화
		
		int sum = 0;		// 총합
		double avg = 0.0;	// 평균
		int i;				// 반복문 제어변수
		
		for(i = 0; i < score.length; i++) {
			sum += score[i];	// 배열 원소의 총합 구하기
		}
		avg = (double)sum/score.length;		// double/int는 자동산술법에 의해 double/double이 됨
											// 몫과 나머지를 함께 구함
		System.out.printf("총합 = %d\n", sum);
		System.out.printf("평균 = %f\n", avg);
		
	}

}

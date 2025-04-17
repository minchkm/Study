// 2차원 배열을 활용해서 과목별 총점, 개인별 총점, 개인별 평균을 구하는 예제

public class ObjectArrEx05 {

	public static void main(String[] args) {

		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};	// 5행 * 3열의 2차원 배열 score 생성
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println(" 번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=================================================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			double avg = 0.0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.printf("%3d\t", i + 1);	// %3d : 3자리 10진수 정수 표현, 오른쪽 정렬, 빈 자리는 공백으로 채움
			
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%3d\t", score[i][j]);
			} // inner for
			
			avg = sum/(double)score[i].length;
			
			System.out.printf("%3d\t", sum);
			System.out.printf("%5.1f \t \n", avg);
			// %0.0f : %전체자리수.소수점이하자리수	
			// %5.1f : 소수점 포함 전체 자리수는 5, 소수점 이하 자리수는 1
		}
		System.out.println("=================================================");
		System.out.printf(" 총점 :   %3d\t%3d\t%3d\n", korTotal, engTotal, mathTotal);
		
	}

}

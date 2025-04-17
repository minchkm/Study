// 1차원 배열 원소값 중에서 최대값을 구하는 예제

public class ArrayEx03 {

	public static void main(String[] args) {
		
		double[] data = {9.5, 7.0, 5.0, 10.0, 12.0, 13.0};
		
		double max = 0.0;
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}	
		System.out.printf("배열 원소 최대값 = %f\n", max);
	}
}

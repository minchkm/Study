// 배열 원소값을 서로 바꾸는 예제

public class ArrayEx10 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(" " + numArr[i]);
		}
		System.out.println("\n=====================\n");
		
		for(int i = 0; i < 10; i++) {
			// random() : 0.0 ~ 0.9999 사이의 실수 난수 발생
			// 10을 곱하여 0.0 ~ 9.9999 사이의 실수 난수 발생
			// (int)로 형변환하여 소수점 이하 버리고 0 ~ 9 사이의 정수 난수 발생
			int n = (int)(Math.random() * 10);
			
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(" " + numArr[i]);
		}
		System.out.println("\n");
		
		for(int a : numArr) {
			System.out.print(" " + a);
		}
		System.out.println("\n=============\n");

	}

}

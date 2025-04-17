// 참조타입 배열 매개변수

public class BasicRef11 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3, 2, 1, 6, 5, 4};	// new int[]는 생략 가능
		
		printArr(arr);
		
		int total = sumArr(arr);
		
		System.out.printf("arr 배열원소 총합 = %d\n", total);

	}
	
	static void printArr(int[] arr) {
		
		System.out.print("[");
		for(int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.print("]\n");
		
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}

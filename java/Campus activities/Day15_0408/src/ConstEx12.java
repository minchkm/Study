// 클래스 초기화 블록 static{} 를 활용한 정적 배열 초기화 

public class ConstEx12 {
	
	static int[] arr = new int[10];		// 크기가 10인 정적 배열
	
	static {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}

	public static void main(String[] args) {
		System.out.print("[ ");
		for(int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.print("]");
	}
}

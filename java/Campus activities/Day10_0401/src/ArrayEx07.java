// 배열 복사 예제

public class ArrayEx07 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println("변경 전 배열 크기 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2];	// 배열 크기 2배로 증가
		
		for(int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;		// 배열은 참조타입이다. 그러므로 우측의 tmp 배열 주소가 arr에 대입되어
						// 기존 arr 배열 주소는 사라진다. 결국 arr은 tmp 배열 주소를 가리킨다.
						// arr 배열 크기는 5가 아닌 10이 된다.
		
		System.out.println("변경 후 배열 크기 : " + arr.length);
		
		System.out.println("\n================\n");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		
		System.out.println("\n================\n");
		
		for(int i : arr) {
			System.out.print(" " + i);
		}
	}
}

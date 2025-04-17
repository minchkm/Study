// 전달인자 개수가 다른 메소드가 오버로딩된 경우 기본타입 매개변수와 참조타입 배열 매개변수의 차이점 등

public class BasicRef12 {

	public static void main(String[] args) {
		
		BasicRef12 br = new BasicRef12();
		
		int re = br.add(3, 5);
		System.out.println("3 + 5 = " + re);
		
		int[] arr = {0};	// 첫 번째 배열 원소값을 0으로 초기화
		br.add(3, 5, arr);	// arr과 result가 같은 배열 주소를 가리킴
							// 첫 번째 배열 원소값이 메소드 호출 후 0에서 8로 변경됨
		System.out.printf("arr[0] 배열 원소값 = %d\n", arr[0]);

	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	// 매개변수인 전달 인자 개수가 다른 메소드 오버로딩
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}

}

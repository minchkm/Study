// return 사용 예제

public class MethodEx02 {
	
	static int getTotal(int data) {
		int i;
		int sum = 0;
		
		for(i = 1; i <= data; i++) {
			sum += i;
		}
		
		return sum;	// return 키워드에 의해 getTotal() 메소드를 호출한 곳으로 sum을 반환
	}

	public static void main(String[] args) {
		
		int total = getTotal(10);
		System.out.println("1부터 10까지 누적합 = " + total);

	}

}

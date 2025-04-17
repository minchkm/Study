

public class MethodEx01 {

	// 사용자 정의 정적 메소드 (정적 메소드 : 클래스의 객체를 생성하지 않고 해당 클래스로 직접 호출하는 메소드)
	static void sum(int n) {
		// sum() 메소드 앞에 리턴 타입이 없는 void형을 사용, 즉 반환값이 없는 자료형
		// int n을 매개변수 또는 전달 인자라고 함
		int i;			// 반복문 제어변수
		int total = 0;	// 누적합 저장 지역변수 (지역변수는 선언과 동시에 초기화를 해줘야 함)
		
		for(i = 1; i <= n; i++) {
			total += i;
		}
		System.out.printf("1부터 %d까지의 합 = %d\n", n, total);
		System.out.println("\n=========================\n");
	}
	
	static void sum2(int count) {
		int i = 1;
		int total = 0;
		
		while(i <= count) {
			total += i;
			i++;
		}
		
		System.out.printf("1부터 %d까지의 합 = %d\n", count, total);
		System.out.println("\n=========================\n");
	}
	
	
	public static void main(String[] args) {
		sum(10);
		sum2(100);
	}

}

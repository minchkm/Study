// 이중 for문 안에 if-else문 사용 예제

public class GuardEx12 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j) {
					System.out.printf("[%d, %d]", i, j);
				} else {
					System.out.printf("%5c", ' ');	// %5c : 총 5자리 단일문자를 표현(기본 오른쪽 정렬)
				} // if-else
			} // inner for
			System.out.println();
		} // outer for

	}

}

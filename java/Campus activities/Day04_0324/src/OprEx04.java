// 비트 단위 시프트 연산
public class OprEx04 {

	public static void main(String[] args) {

		byte x = 15;
		System.out.println("x << 2 : " + (x << 2));
		// 정수 15를 2비트만큼 왼쪽으로 이동시키고 오른쪽 빈자리는 항상 0으로 채운다
		
		System.out.println("x >> 2 : " + (x >> 2));
		// 2비트만큼 오른쪽으로 이동, 양수일 경우 왼쪽 빈자리를 0으로, 음수일 경우 1로 채운다
		
	}

}

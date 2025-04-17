/*
 * while 무한루프문을 사용해서 누적합이 100을 초과할 때 무한루프문을 종료시키고
 * 반복문 제어변수와 누적합을 출력하는 예제
 */
public class BreakEx05 {

	public static void main(String[] args) {

		int i = 0, sum = 0;		// 반복문 제어변수 i와 누적합 저장 변수 sum 선언 및 초기화
		
		while(true) {
			if(sum > 100) {
				break;
			}
			++i;
			sum += i;
		} // while
		System.out.printf("i = %d\n", i);
		System.out.printf("sum = %d\n", sum);
		
	}

}

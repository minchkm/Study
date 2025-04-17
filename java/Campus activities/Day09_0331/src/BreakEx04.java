/*
 * 무한루프문 : 반복문의 조건식이 무조건 참이어서 영원히 반복되는 반복문
 * while(true) {
 * 	  실행문장;
 * }
 */

public class BreakEx04 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(true) {		// 무한루프
			System.out.print(i + "번Spring\t");
			if(++i >= 10) {
				break;	// 무한루프 종료
			} // if
		} // while
		System.out.println(i + "번End");
		
		System.out.println("\n=====================\n");
		
		/*
		 *  for문 무한루프문 형식
		 *  for(;;) {
		 *  
		 *  }
		 *  초기치, 조건식, 증감식을 생략하면 무한루프문이 됨
		 */
		
		i = 0;
		
		for(;;) {
			System.out.print(i + "번 노란 개나리\t");
			if(++i >= 10) {
				break;
			}
		} // for
		System.out.println(i + "번 끝");
		
	}
}

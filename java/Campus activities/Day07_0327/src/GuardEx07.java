/*
 * do-while 반복문 형식)
 * do {
 * 		조건이 참일 동안 반복 실행;
 * 		증감식;
 * } while (조건식);
 * 
 * 조건식을 나중에 검사하기 때문에 최소 한번은 무조건 실행된다.
 */
public class GuardEx07 {

	public static void main(String[] args) {

		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 0);
		
		
		i = 0;
		while (i < 0) {
			System.out.println(i);
			i++;
		}
		
	}

}

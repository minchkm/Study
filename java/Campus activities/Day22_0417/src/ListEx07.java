/* java.util 패키지의 Queue 컬렉션 인터페이스를 구현한 컬렉션 클래스 LinkedList 특징)
 * 입구와 출구가 달라서 먼저 입력된 자료가 먼저 나가는 구조이다 (first input first output:fifo)
 * 
 */

import java.util.LinkedList;

public class ListEx07 {

	public static void main(String[] args) {

		LinkedList myque = new LinkedList();
		myque.offer("1-java");
		myque.offer("2-oracle");
		myque.offer("3-jsp");
		
		while(myque.peek()!=null) {//큐가 비어있지않다면
			System.out.println(myque.poll());
			
		}
	}

}

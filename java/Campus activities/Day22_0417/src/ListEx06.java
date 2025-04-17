/* java.util 패키지의 컬렉션 클래스 Stack의 특징
 * 1. jdk 1.2에 추가됨 
 * 입구와 출구가 같기 때문에 가장 먼저 입력된 데이터가 가장 나중에 나오는 구조이다 
 * 가장 나중에 입력된 데이터가 가장 먼저 나오는 구조이다 
 * 
 */

import java.util.Stack;

public class ListEx06 {

	public static void main(String[] args) {

		Stack mystack = new Stack();
		
		mystack.push("1-java"); //push()메서드는 스택의 맨위에 원소값을 추가
		mystack.push("2-oracle");
		mystack.push("3-html");
		
		while(!mystack.isEmpty()) {//현재 스택이 비어 있지 않다면 
			System.out.println(mystack.pop()); //pop메서드는 스택의 맨위에서 값을 제거하면서 반환
		}
		
	}

}

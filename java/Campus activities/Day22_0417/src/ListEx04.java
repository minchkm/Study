/* java.util 패키지의 Iterator 인터페이스를 구현 상속한 인터페이스 특징
 * jdk1.2에서 추가 
 * Iterator를 상속받아서 기능을 추가한 것으로 컬렉션 원소값을 읽어올 떄 양방향 이동이 모두 가능하다 다만 ArrayList 또는 Linked 
 * List 컬렉션 클래스의 List 컬렉션 인터페이스를 구현 상속한 컬렉션에서만 사용가능하다.
 * 
 *
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListEx04 {

	public static void main(String[] args) {
      ArrayList list = new ArrayList(); 
       
      list.add("1"); list.add("2"); list.add("3");
      list.add("4"); list.add("5");
      
      ListIterator it = list.listIterator();
      
      while(it.hasNext()) {
    	  System.out.println(it.next());
    	  
      }
      System.out.println("==================");
      
      while(it.hasPrevious()) {
    	  System.out.println(it.previous());
      }
      
      
 	}

}

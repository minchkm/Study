/*java.util 패키지의 컬렉션 list 인터페이스를 구현한 Arrylist 컬렉션 클래스 특징
 * 저장되는 순서를 보장한다 
 * 중복 원소값을 허용한다 
 * jdk 1.2에서 추가됨
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx02 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("홍길동");
		list.add("홍길동");
		list.add(100.7);
		list.add(true);
		
		System.out.println(list.size());
		System.out.println(list);
		 
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i));
			
		}
	}

}

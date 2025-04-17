/* java.util 패키지의 Iterator 인터페이스 특징
 * 자바 즉 jdk1.2에서 추가
 * 컬렉션에 저장된 복수개의 데이터를 읽어오는 용도로 활용 저장되는 용도로는 사용하지않음
 * 한번읽어온 데이터는 다시 못읽어 온다 다시 읽어오기 위해서는 재 생성해야한다
 * 단 방향으로만 데이터를 읽어들인다
 * 주로 자바 1.2에서 추가된 컬렉션과 궁합이 잘 맞는다 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx03 {

	public static void main(String[] args) {

		List list= new ArrayList();
		list.add("aaa");
		list.add("asd");
		list.add(100);
		list.add("wew");
		list.add("222");
		
		Iterator elements = list.iterator();
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}

	}

}

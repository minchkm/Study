/* 클랙션에 제네릭을 지정함으로서 불필요한 업캐스팅과 다운캐스팅을 하지않아도 괜찮음
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx09 {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();
		
		nameList.add("hong gil dong");
		nameList.add("lee sun sin");
		nameList.add("shin sun");
		
		String result;
		for(int i=0; i<nameList.size(); i++) {
			result = nameList.get(i);
			System.out.println(result.toUpperCase());
		}
		System.out.println("==================");
		
		//컬렉션과 배열에 저장된 복수개의 원소값을 쉽게 읽어 오는 용도로만 사용하는 향상된 확장 for
		
		for(String name: nameList) {
			System.out.println(name.toUpperCase());
		}
		
		
	}

}

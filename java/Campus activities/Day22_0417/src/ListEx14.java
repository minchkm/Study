/*제네릭 타입간의 레퍼런스 형변환은 와일드 카드 문법을 사용하면 제한적으로 허용한다 
 * 
 *  
 */

import java.awt.List;
import java.util.ArrayList;

public class ListEx14 {

	public static void main(String[] args) {

		ArrayList<String> cityList = new ArrayList<>();
	  
		cityList.add("dsd");
		cityList.add("ewe");
		cityList.add("Sdw");
		
		ArrayList<? extends Object> objlist ;
		/* <? extends Object> 제네릭 타입간ㅇ 형변환 와일드 카드문법
		 * Object를 상속받은 자손은 제네렉 타입간의 형변환을 제한적 허용한다(상한 제한 와이들 카드)
		 */
		objlist =cityList;
		
		for(Object obj : objlist) {
			System.out.println(obj);
		}
		
	}

}

/* 컬렉션에서 제네릭이 나온 배경에 대해서 살펴 볼수 있는 예제)
 * 제네릭 타입은 참조 타입만 가능하고기본타입으로는 지정 못함 제네릭타입은 ㅈ자바 5버전에서 추가됨 
 * 제네릭 타입을 지정하면 지정한 자료형으로만 지정 가능하다 
 * 제네릭 타입을 지정하지 않으면 불필요한 레퍼런스간의 업캐스팅과 다운캐스팅을 해야 하는 불편함이 있다 그만큼 프로그램 실행속도가 떨어지고
 * 데이터 안정성도 떨어진다 
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx08 {

	public static void main(String[] args) {
   
		List cityList = new ArrayList();
		
		cityList.add("seoul");
		cityList.add("busan");
		cityList.add("daejun");
		
		String temp =null;
		
		for(int i=0; i<cityList.size(); i++) {
			if(cityList.get(i)instanceof String) {
				temp =(String)cityList.get(i);
				
			}
			System.out.println(temp.toUpperCase());
		}
	}

}

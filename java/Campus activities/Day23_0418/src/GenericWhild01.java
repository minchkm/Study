/* 제네릭 와이들 카드 3번째 문법 형식
 * <? super Integer> : Integer 타입의 조상(부모)만 제네릭 타입간의 형변환을 제한적 혀용한다(하한 제한 와일드카드) 
 * 
 */

import java.util.Arrays;
import java.util.List;

public class GenericWhild01 {
   static void addNumber(List<? super Integer>list) {
	   
	   for(int i=0; i<list.size(); i++) {//size 메서드는 컬렉션 원소개수를 반환
		   System.out.println(list.get(i)); //get() 메서드는 컬렉션 원소값을 가져온다
	   }
	   System.out.println("===================");
	   
	   
   }
	
	public static void main(String[] args) {

		Number[] arr = {10,20,30};
		Object[] arr2 = {100,200,300};
		List<Number> li = Arrays.asList(arr);//배열을 컬력션 List로 변환
		addNumber(li);
		List<Object> li02 = Arrays.asList(arr2);
		addNumber(li02);
		
		
	}

}

/* java.util 패키지의 map컬렉션 인터페이스를 구현한 상속한 Hashtable 컬렉션
 * 키,값 쌍으로 저장
 * 키를 통해서 값을 검색하기 때문에 검색 속도가 빠르다
 *  
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class ListEx10 {

	public static void main(String[] args) {
    
		 Hashtable<String,String> ht = new Hashtable<String, String>();
	
	      ht.put("apple", "null");
	      ht.put("appless", "nucdll");
	      ht.put("appleewe", "nuwedsll");
	      ht.put("applqsde", "nulqwl");
	      
	      String val = ht.get("apple");
	      if(val != null) {
	    	  System.out.println("apple "+val);
	    	  
	      }
	      Enumeration<String> enum2 = ht.keys();
	      while(enum2.hasMoreElements()) {
	    	  String k =enum2.nextElement();
	    	  String v =ht.get(k);
	    	  System.out.println(k+" "+v);
	      }
	
	}

}

/* 
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class ListEx11 {

	public static void main(String[] args) {

		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		String[] sample = {"to","be","or","not","to","be","is","a","problem"};
		
		for(String k : sample) {
			Integer freq =m.get(k);
			m.put(k, (freq==null)?1:freq+1);
		   
		
		
		 
		}
		System.out.println(m.size());
		System.out.println(m.containsKey("to"));
		System.out.println(m);
		
		
		
	}

}

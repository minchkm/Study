/*java.util 패키지의 Eumeration 인터페이스 특징)
 * 
 * 
 */

import java.util.Enumeration;
import java.util.Vector;

public class ListEx05 {

	public static void main(String[] args) {

		
		Vector vec = new Vector();
		
		for(int i=1; i<=5; i++) {
			vec.add(new Integer(i*10));
	          }
		
		Enumeration enu2 = vec.elements();
		while(enu2.hasMoreElements()) {
			System.out.println(enu2.nextElement());
		}
		
		
	}

}

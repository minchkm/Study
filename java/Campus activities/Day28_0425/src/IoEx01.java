/* java.io 패키지의 
 * 
 */

import java.io.IOException;
import java.io.InputStream;

public class IoEx01 {
	public static void main(String[] args) {

		int date =0;
		System.out.println("문자입력");
		
		try {
			InputStream myin = System.in;
			
		  while((date = myin.read()) != -1){
			  System.out.println((char)date);
		  }
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

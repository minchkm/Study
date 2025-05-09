/* java.io 입출력 패키지의 API인 InputStream를 활용해서 입력문자가 영문단일 소문자 x이거나 단일 대문자 X이면 
 * while 반복문 종료
 *  
 */

import java.io.InputStream;
import java.io.OutputStream;

public class IoEx03 {
	public static void main(String[] args) {
        int date =0;
        InputStream myin = System.in;
        OutputStream myOut = System.out;
        
        System.out.print("문자입력>>");
        
        try {
        	   while((date = myin.read()) != -1) {
        		   if(date =='x'|| date =='X') {
        			   break;
        		   }
        		   myOut.write((char)date);
        	   }
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

}

/* java.io 패키지의 FileOutputStream 특징
 *  생성자 인자값으로 주어진 file객체나 파일에 바이트 단위로 데이터를 기록하기 위한 클래스
 *  
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoEx06 {
	public static void main(String[] args) {

		int data;
		System.out.print("파일에 저장할 내용입력");
		
		try {
			 File f = new File("./src/result.txt");
			 FileOutputStream fos = new FileOutputStream(f);
			 
			 while((data = System.in.read()) != -1) {
				 fos.write((char)data);
			 }
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

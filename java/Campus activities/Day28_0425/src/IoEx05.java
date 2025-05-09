/* java.io 패키지의 FileInputStream 특징
 * 생성자 인자값으로 주어진 File 객체나 파일경로의 파일로 부터 바이트 단위로 데이터를 읽어들이기 위한 API이다
 * 
 */

import java.io.FileInputStream;
import java.io.IOException;

public class IoEx05 {
	public static void main(String[] args) {

		int date=0;
		String path = "./src/IoEx05.java";
		
		try {
			FileInputStream fils = new FileInputStream(path);
			
			while((date =fils.read()) !=-1) {
				System.out.println((char)date);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

/* 이미지 파일을 복사 
 * 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IoEx07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("원본 이미지 파일명(.src/image/flower.jpg)");
		String inputFileName = scan.nextLine();
		
		System.out.println("(.src/image/flowe_copy.jpg)");
		String OutputFileName = scan.nextLine();
		
		try {
			InputStream intputStream = new FileInputStream(inputFileName);
			OutputStream outputStream = new FileOutputStream(OutputFileName);
			
			
			 int c;
			 while((c =intputStream.read()) != -1 ) {
				 outputStream.write(c);
			 }
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

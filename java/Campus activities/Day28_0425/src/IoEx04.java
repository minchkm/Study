/* java.io 패키지의 File 클래스 특징
 *  일반 게시판에 파일 첨부기능이 들어간 자료실을 만들 수 있다 여기서는 이 클래스 하위의 내장메서드인 list를 활용ㅅ해서 디렉토리에 있는 파일 목록을 배열로 반환한다
 * 
 */

import java.io.File;

public class IoEx04 {
	public static void main(String[] args) {
 		File dirFile = new File("./src"); //STS개발툴에서 인식하는 현재경로
         String[] fileList = dirFile.list();	
	
         for (int i =0; i<fileList.length; i++) {
        	 System.out.println(fileList[i]);
         }
	
         System.out.println("============");
         
         for(String i : fileList) {
        	 System.out.println(i);
         }
         
	}

}

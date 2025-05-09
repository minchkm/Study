/* java 7버전에서 AUtoCloseable 인터페이스가추가 이 인터페이스를 구현 상속받은 자손 Api는 try내에서 객체를 생성하면 굳이
 * finally 문에서 명시적 코드로 close 닫지 않아도 자동을 닫힌다
 *  
 */

import java.io.PrintWriter;
import java.util.ArrayList;

public class TryCatch14 {

	public static void main(String[] args) throws Exception {
   
		 ArrayList<String> nameList = new ArrayList<>();
		 
		 
		 nameList.add("essee");
		 nameList.add("ewsdve");
		 nameList.add("weascdg");
		 
		 
		 //STS 나 이클립에서 기본 경로로 인식하는 것은 프로젝트 경로이다 
		 //java,io 패키지의 PrintWriter는 문자 출력 스트림 API이다
		 try(PrintWriter out = new PrintWriter ("./src/result.txt")){
			 
			 for(String name:nameList) {
				 out.println(name.toUpperCase()); //영문 대문자로 변경해서 resul.txt에 기록 
			 }
		 }
		 
		 
	}

}

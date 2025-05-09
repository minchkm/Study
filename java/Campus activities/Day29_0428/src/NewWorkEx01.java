/*
 *  www.naver.com 이라는 도매인을 가진 웹사이트 주소를 입력하면 이 주소에 대한 ip주소를  알아내는 소스
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NewWorkEx01 {
	public static void main(String[] args) throws Exception {

		BufferedReader reader;
		String url =null;
		InetAddress addr = null; //ip번호를 처리할때 사용하는 클래스
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		/* System.in 은 키보드 입력장치와 연결
		 * InputStreamReader 는 읽어드린 바이트 스트림을 문자스트림으로 변경
		 * BufferedReader는 읽어들인 문자를 임시메모리에 버퍼링 해서 한꺼번에 한줄 끝까지 문자열을 통으로 읽어들임 
		 * 
		 */
		System.out.print("사이트 주소 입력:");
		url = reader.readLine(); //한줄 끝까지 문자열로 읽어들임
		
		try {
			addr = InetAddress.getByName(url); //인자값으로 지정된 url에 대한 InetAddress객체를 반환 
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		    System.out.println("\n=====================\n");
		    
		    System.out.println(url+"에대한 ip주소="+addr.getHostAddress());
	}

}

/* 멀티 쓰레드 기능이 들어간 다중 사용자 접속을 받을 수 있는 네트워크 서버 프로그램
 * 
 */


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoSeverEx {
	ServerSocket server;
	static final int PORT = 7000;
	Socket child;
	
	public MultiEchoSeverEx() {
		try {
			server = new ServerSocket(PORT);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.exit(0);;
		}
		System.out.println("다음 사용자 접속을 기다리기 위한 멀티채팅 서버");
		System.out.println("멀티채팅서버는 사용자 접속을 항상기다림");
		
		while(true) {
			try {
				child = server.accept();
				
				EchoSeverThread childTread = new EchoSeverThread(child);
				Thread th = new Thread(childTread);
				th.start();
			}catch(Exception e) {

				e.printStackTrace();
                 System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
           new MultiEchoSeverEx();
	}

}

//멀티쓰레드: 네트워크 서버에서 다중 사용자 동시 접속을 받기위해 이 코드를 함
class EchoSeverThread implements Runnable{
	Socket child; //클라이언트와 통신하기 위한 소켓
     InputStream is;
     ObjectInputStream ois;//입력스트림
     
     OutputStream os;
     ObjectOutputStream oos; //출력 스트림
     
     String receiveData; //사용자로부터 전송받은 자료를 저장하기 위한 변수
	
     public EchoSeverThread(Socket child)
     {this.child =child;
     
     try {
    	   System.out.println(child.getInetAddress());//사용자 컴 ip 주소 반환
    	   
    	   is = child.getInputStream();
    	   ois =new  ObjectInputStream(is);
    	   
    	   os = child.getOutputStream();
    	   oos = new ObjectOutputStream(os);
     }catch(IOException e) {
    	 e.printStackTrace();
     }
    	 
    	 
     }
     
     @Override
	public void run() {
    	 
    	 try {
    		 while(true) {
    			 receiveData = (String)ois.readObject();
    			 System.out.println(child.getInetAddress());
    			 oos.writeObject(receiveData);
    			 oos.flush();
    		 }
    		 
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }finally {
    		 
    		 try {
    			 
    		
    		 if(oos !=null) oos.close();
    		 if(os !=null) os.close();
    		 if(is !=null) is.close();
    		 if(ois !=null) ois.close();
    		 if(child !=null) child.close();
    		 }catch(IOException ie){ie.printStackTrace();}
    	 }
	}
	
	
}
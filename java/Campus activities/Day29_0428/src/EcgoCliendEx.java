import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EcgoCliendEx {
	 Socket client = null;
	 String ip =null;
	 static final int PORT = 7000;
	 
	 Scanner scan = null;
	 
	 InputStream is;
	 ObjectInputStream ois;
	 OutputStream os;
	 ObjectOutputStream oos;
	 
	 String sendData;
	 String receiveData;
	 
	 
	 public EcgoCliendEx(String ip) {
		 this.ip =ip;
		 
		 try {
			 System.out.println("채팅 프로그램");
			 client = new Socket(ip,PORT);
			 
			 scan = new Scanner(System.in);
			 
			 os = client.getOutputStream();
			 oos = new ObjectOutputStream(os);
			 
			 is = client.getInputStream();
			 ois = new ObjectInputStream(is);
			 
			 System.out.println( "데이터 입력");
			 
			 while((sendData = scan.nextLine()) != null) {
				 oos.writeObject(sendData);
				 oos.flush();
				 
				 if(sendData.equals("exit")) {
					 break;
					 
				 }
				 receiveData = (String)ois.readObject();
				 System.out.println(client.getInputStream()+" "+receiveData);
				 System.out.print("입력");
			 }
			 
		 }catch(Exception e) {e.printStackTrace();  System.exit(0);
		 
		 }finally {
			 try {
				 if(is != null) is.close();
				 if(ois != null) ois.close();
				 if(os != null) os.close();
				 if(oos != null) oos.close();
				 if(client != null) client.close();
				 
			 }catch(Exception e) {e.printStackTrace();}
		 }
	 }
		 
	 
	 
	 
	 
	public static void main(String[] args) {
      new EcgoCliendEx("172.16.15.81");

		 
	}

}

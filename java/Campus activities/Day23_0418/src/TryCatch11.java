/* 예외가 발생하지 않았을떄 try~catch문 실행순서
 * 
 */
public class TryCatch11 {

	public static void main(String[] args) {
      System.out.println(1);
      
      try {
    	  System.out.println(2);
    	  System.out.println(3);
      }catch(Exception e) {
    	       System.out.println(4);
      }
      System.out.println(5);
	}

}

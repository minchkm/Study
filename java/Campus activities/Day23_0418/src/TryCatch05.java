/*  try~catch문에서 예외가 발생하든 발생하지 않든 무조건 마지막에 수행해야 하는 문장을 넣을때는 finally에 기술한다
 * 
 */
public class TryCatch05 {

	public static void main(String[] args) {

		int a=10, b01=0,b02=2, result =0;
		
		try {
			result = a/b02;
			System.out.println(result);
			
			result = a/b01;
			System.out.println("2"+result);
			
			result = a/b02;
			System.out.println("3"+result);
		}catch(ArithmeticException ae ) {
			ae.printStackTrace();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("예외와 상관없이 무조건 마지막에 실행");
		}
	
		
		
	}

}

/* try~catch 문으로 예외 처리 
 *  try{
 *   정상구문이 수행되다가 예외가 발생하면 아래문장을 수행하지 않고 예외 처리 catch블록문으로 이동해서 예외를 처리한다
 *   }catch(예외처리 클래스 매개변수){
 *      예외처리;
 *      }
 *      
 */
public class TryCatchEx02 {

	public static void main(String[] args) {

		int a =10, b01=0, b02=2, c=10;
		System.out.println("try구문 실행전"+c);
		
		try {
			c=a/b02;
			System.out.println(c);
			
			c= a/b01;
			System.out.println("(2)"+c);
			
			c= a/b02;
			System.out.println("3"+c);
		}catch(Exception e) {//EXception은 예외처리 부모 클래스
			System.out.println("예외발생"+e);
		}
		System.out.println("try구문 실행후 "+c);
	}

}

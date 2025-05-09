/* throw 인위적 예외를 발생시킬때 사용한다
 *  throw new 예외클래스 생성자;
 *  
 * throws 발생된 예외를 자신이 직접 처리하는 것이 아니라 자신을 홀출한 곳으로 떠 넘기면서 예외를 처리한다
 *  public 리턴타입 메서드명(매개변수..) throws 예외처리 클래스  
 */
public class Trycatch08 {
    static void exp(int a)throws NullPointerException{
    	if (a==0) {
    		throw new NullPointerException();
    		
    	}
    }
	public static void main(String[] args) {

		try {
			 System.out.println("예외발생전");
			 exp(0);
			 System.out.println("예오ㅓㅣ발생");
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}

}

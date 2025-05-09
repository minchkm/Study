/* 하나의 try문과 복수개의 cahch 블록문{}이 오는 경우는 catch블록문에 예외처리 자손클래스를 먼저 기술하고 
 *   예외처리 부모는 나중에 기술한다
 */
public class TryCatch04 {

	public static void main(String[] args) {
     
		int a=10, b01=0, b02 =2,  result=0;
		
		try {
			result = a/b02;
			System.out.println("1"+result);
			
			result = a/b01; //정수수자를 0으로 나누어서 예외발생
			System.out.println("2"+result); //문장수행안하고 해당 예외 처리 catch문으로 이동
			
			
		}catch(ArithmeticException e) {//보다 구체적인 자손클래스를 먼저 기술
			System.out.println("예외발생"+ e);
			
		}catch(Exception e) {//예외처리 부모 클래스는 나중에 기술
			e.printStackTrace(); // 예외 족적ㅇ르 남김
		}
	}

}
  
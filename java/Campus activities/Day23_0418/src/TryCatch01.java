/* 정수 숫자를 0으로 나누면 자바는 AirthmeticException 예외를 발생시킴 이 예외를 if esle 문으로 처리
 * 별로 권하지는 않는 방법임
 * 
 */
public class TryCatch01 {

	public static void main(String[] args) {
 int a =10 ,b01=0,b02=2, c=10;
 
 
    if(b02==0) {
    	System.out.println("예외발생");
    	
    }else {
    	c=a/b02;
    	System.out.println(c);
    }
 if(b01==0) {
	 System.out.println("예외 발생");
 }else {
	  c = a/b01;
	  System.out.println(c);
 }
	}

}

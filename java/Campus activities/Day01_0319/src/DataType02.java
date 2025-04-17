/*
 * 자바의 변수 선언법
 * 타입 변수명;		int a;
 * 변수 초기화 : 변수를 선언하고 최초값을 저장하는 것
 * 
 */
public class DataType02 {

	public static void main(String[] args) {
		
		int age;	// 4바이트 int 타입 변수 age 선언
		age = 25;	// age 변수에 25 값 저장 (변수 초기화)
		
		System.out.println("나이 : " + age);
		
		age = 30;
		System.out.println("나이 : " + age);
	}

}

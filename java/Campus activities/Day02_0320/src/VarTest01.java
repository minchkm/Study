// class 키워드로 Var01 클래스 정의
class Var01 {
	/*
	 * 자바10(JDK10) 부터는 로컬 지역변수를 위한 타입 추론이 가능한 var 키워드 사용 가능
	 * 지역 변수를 선언할 때 var 키워드를 사용해서 예약된 타입(자료형) 사용 가능
	 * 컴파일 시 컴파일러(javac)가 대입되는 값을 보고 추론하여 타입을 결정
	 * var name = "홍길동";  -->  컴파일러가 대입되는 문자열 값을 보고 참조타입 String으로 결정
	 * var은 생성자나 메소드 내의 중괄호 블록 내에서 지역변수 선언 용도로만 사용 가능
	 * 클래스나 인터페이스 내의 멤버변수 선언으로는 사용 불가능
	 * var로 선언된 변수의 타입이 결정되면 변경할 수 없음
	 */
	
	// var name = "홍길동";	// 에러 : 클래스의 멤버변수인 필드 선언으로 사용할 수 없음
	String name = "이순신";
	
	// 클래스명과 같은 생성자 정의
	public Var01() {
		var addr = "서울시";	// 대입되는 값을 보고 String 타입으로 결정
							// 생성자 블록 내에서 선언되었으므로 에러 X
							// addr = 10 과 같이 타입을 변경할 수 없음
	}
}
public class VarTest01 {

	public static void main(String[] args) {

	}

}

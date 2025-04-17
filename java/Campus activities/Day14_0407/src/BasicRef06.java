/*
 * 참조 변수를 선언만 하고 객체 주소를 대입하지 않으면 초기화가 되지 않아 해당 클래스 속성에 접근 못함(컴파일 에러)
 */

class Member06 {
	String id = "kkkkk";
	String name = "홍길동";
	String phone = "010-8888-8888";
}

public class BasicRef06 {

	public static void main(String[] args) {
		
		Member06 m;		// 참조변수 선언만 하고 객체 주소 대입 안 된 상태
//		System.out.println("아이디 : " + m.id + ", 회원 이름 : " + m.name + ", 전화번호 : " + m.phone);

	}

}

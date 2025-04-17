/*
 * 생성자의 특징
 * 		1. 생성자는 메소드의 일종이다.
 * 		2. 생성자도 오버로딩이 가능하다.
 */

class Member02 {
	// 3개의 클래스 소속 멤버변수(속성) 정의
	private String mem_id;
	private String mem_name;
	private String mem_addr;
	
	// 전달 인자가 없는 생성자를 기본 생성자라고 한다.
	// 기본 생성자는 default 생성자이다.
	// 생성자 오버로딩이 안 되어있을 경우 컴파일러가 기본 생성자를 묵시적으로 제공한다.
	public Member02() {		
		mem_id = "kkkkk";
		mem_name = "홍길동";
		mem_addr = "서울시 중랑구";
	}
	
	// 전달인자 개수가 다른 생성자 오버로딩
	public Member02(String new_id, String new_name, String new_addr) {
		// 생성자의 주기능 : 멤버 변수 초기화
		mem_id = new_id;
		mem_name = new_name;
		mem_addr = new_addr;
	}
	
	public void print() {
		System.out.println("회원 아이디 : " + mem_id + ", 회원 이름 : " + mem_name 
								+ ", 회원 주소 : " + mem_addr);
	}
}

public class ConstEx02 {

	public static void main(String[] args) {
		
		// 전달인자가 없는 기본 생성자 호출
		Member02 member = new Member02();	
		member.print();
		
		// 전달인자 3개의 오버로딩된 생성자 호출
		Member02 member2 = new Member02("aaaaa", "이순신", "서울시 동대문구");
		member2.print();		// member와 member2는 서로 다른 객체 주소를 가진다.

	}

}

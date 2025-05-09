/* 참조변수만 선언하고 null이 대입된 상태에서 해당 클래스 소속의 멤버변수 등을 사용하가조 할때는 완전한 객체주소가 주입된 것이 아니어서 
 * 예외 오류를 발생시킨다 이 예외 오류 잡기갖 가장 힘들다
 * 
 */
class Member06{
	String id = "aaaa";
	String name = "dse";
	String addr = "swec";
}
public class TryCatch06 {

	public static void main(String[] args) {

		Member06 m = null;
		
		try {
			System.out.println(m.id+" "+m.name+" "+m.addr);
		}catch(Exception e) {
			System.out.println(e);
			
			m= new Member06();
			System.out.println(m.id+" "+m.name+" "+m.addr);
		}
	}

}

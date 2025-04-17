// 클래스와 객체 관계인 객체지향 프로그래밍에 관한 예제

class Tv03 {
	String color;	// TV 색상
	boolean power;	// 전원 상태(on/off)
	int channel;	// 채널 번호
	
	/*
	 * 클래스 소속 멤버변수인 속성의 기본값)
	 * 		멤버변수만 선언하고 초기화를 하지 않으면 속성(멤버변수)은 자동으로 기본값으로 초기화됨
	 * 		int 타입 속성은 0으로 초기화
	 * 		boolean 타입 속성은 false로 초기화
	 * 		String 등 참조타입 변수를 선언만 하고 초기화하지 않으면 null로 초기화
	 * 		double 실수타입 속성은 0.0으로 초기화
	 */
	
	void power() {
		power = !power;		// 기본값 false에서 true로 변경
	}
	
	void channelUp() {
		++channel;		// 채널 선행증가
	}
	
	void channelDown() {
		--channel;		// 채널 선행감소
	}
}


public class ObjectEx03 {

	public static void main(String[] args) {
		
		Tv03 tv = new Tv03();
		
		tv.channel = 7;
		tv.channelDown();
		System.out.println("채널번호 = " + tv.channel);
		tv.power();
		System.out.println("tv on/off = " + tv.power);

	}

}

// new 키워드로 서로 다른 객체를 생성했지만 같은 객체주소를 가리키는 방법

class Tv05 {
	String color;	// TV 색상
	boolean power;	// 전원 상태(on/off)
	int channel;	// 채널 번호
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

public class ObjectEx05 {

	public static void main(String[] args) {
		
		Tv05 tv01 = new Tv05();
		Tv05 tv02 = new Tv05();		// tv01과 tv02는 서로 다른 객체 주소값을 가짐
		
		tv02 = tv01;	// tv01 객체 주소가 tv02에 대입되어 기존 tv02의 객체 주소를 잃어버림
						// 결국 tv01과 tv02는 같은 객체 주소를 가리키게 됨
		
		tv01.channel = 7;	// tv01의 채널번호를 7로 변경하면 tv02로 접근하는 채널번호도 같은 주소를 참조하기 때문에 7로 변경됨

		System.out.println("tv01 채널번호 = " + tv01.channel + ", tv02 채널번호 = " + tv02.channel);
	}

}

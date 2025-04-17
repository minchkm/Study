// new 키워드로 새롭게 생성된 객체는 서로 다른 객체 주소값을 가진다

class Tv04 {
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


public class ObjectEx04 {

	public static void main(String[] args) {
		
		Tv04 tv01 = new Tv04();
		Tv04 tv02 = new Tv04();	// tv01과 tv02는 서로 다른 객체 주소값을 가짐
		
		System.out.println("tv01.channel = " + tv01.channel + 
							", tv02.channel = " + tv02.channel);
		
		tv01.channel = 10;
		
		System.out.println("tv01.channel = " + tv01.channel + 
							", tv02.channel = " + tv02.channel);

	}

}

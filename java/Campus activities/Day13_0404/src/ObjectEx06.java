// 객체 배열

class Tv06 {
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

public class ObjectEx06 {

	public static void main(String[] args) {
		
		Tv06[] tvArr = new Tv06[3];	// 배열 크기가 3인 객체 배열 생성
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv06();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}

	}

}

/*
 * instanceof 형변환 유무 판단 연산자
 */

class HandPhone05 {
	protected String model;
	protected String number;
	
	public HandPhone05() {}	// 기본 생성자
	
	// 생성자 오버로딩
	public HandPhone05(String model, String number) {
		this.model = model;
		this.number = number;
	}
}

class DicaPhone05 extends HandPhone05 {
	protected String pixel;
	
	public DicaPhone05() {}
	
	public DicaPhone05(String model, String number, String pixel) {
		super(model, number);
		this.pixel = pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("폰모델명 : " + model + ", 폰번호 : " + number 
												+ ", 화소수 : " + pixel);
	}
}

public class RefCast05 {

	public static void main(String[] args) {
		
		DicaPhone05 dp = new DicaPhone05("갤럭시25", "010-9999-7777", "1024");
		dp.prnDicaPhone();
		
		// dp를 HandPhone05 부모 타입으로 업캐스팅이 가능한가? -> true
		if(dp instanceof HandPhone05) {
			HandPhone05 hp = dp;	// 업캐스팅
			System.out.println("업캐스팅이 가능합니다.");
		} else {
			System.out.println("업캐스팅이 불가능합니다.");
		}
		
		System.out.println("\n===================\n");
		
		HandPhone05 hp5 = new HandPhone05();	// 사전에 업캐스팅을 안함
		
		// 다운캐스팅이 가능한가? -> false
		if(hp5 instanceof DicaPhone05) {
			DicaPhone05 dp5 = (DicaPhone05)hp5;
			System.out.println("다운캐스팅이 가능합니다.");
		} else {
			System.out.println("사전에 업캐스팅을 안했기 때문에 다운캐스팅이 불가능합니다.");
		}

	}

}

class HandPhone {
	protected String model;
	protected String number;
	
	public HandPhone() {}
	
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getNumber() {
		return number;
	}
}

class DicaPhone extends HandPhone {
	protected String pixel;
	
	public DicaPhone() {}
	
	public DicaPhone(String model, String number, String pixel) {
		super(model, number);
		this.pixel = pixel;
	}
	
	public void prnDicaphone() {
		System.out.println("모델명 : " + getModel() + "\t번호 : " + getNumber() 
								+ "\t화소수 : " + pixel);
	}
}

public class Ex16_05 {

	public static void main(String[] args) {
		
		DicaPhone dp = new DicaPhone("갤럭시", "010", "1024");
		dp.prnDicaphone();

	}

}

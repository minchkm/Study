// 생성자를 이용한 인스턴스(객체) 복사

class Car10 {
	String color;
	String gearType;
	int door;
	
	/*
	 * 클래스 소속 멤버변수를 명시적 초기화를 하지 않으면 자바는 다음과 같은 기본값으로 초기화를 한다.
	 * 		참조타입  : null
	 * 		boolean : false
	 * 		long    : 0L
	 * 		float   : 0.0f
	 * 		double  : 0.0d or 0.0
	 * 		byte, short, int : 0
	 */
	
	Car10() {
		this("white", "auto", 4);
	}
	
	// 생성자를 이용한 인스턴스 복사
	Car10(Car10 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		
	}
	
	Car10(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void print() {
		System.out.println("색깔 : " + color + ", 기어타입 : " + gearType + 
								", 문 개수 : " + door + "개");
	}
}

public class ConstEx10 {

	public static void main(String[] args) {
		
		Car10 c01 = new Car10();
		Car10 c02 = new Car10(c01);
		c01.print();
		c01.door = 6;
		c01.print();
		c02.print();

	}

}

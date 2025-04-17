class Car09 {
	String color;
	String gearType;	// auto(자동), manual(수동)
	int door;
	
	Car09() {
		this("white", "auto", 4);
	}
	
	Car09(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void pr() {
		System.out.println("색깔 : " + color + ", 기어타입 : " + gearType + 
											", 문 개수 : " + door + "개");
	}
}
public class ConstEx09 {

	public static void main(String[] args) {
		
		Car09 c01 = new Car09();
		
		c01.pr();

	}
}
